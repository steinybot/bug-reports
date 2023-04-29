import scala.annotation.{MacroAnnotation, experimental, tailrec}
import scala.collection.immutable.{AbstractSeq, LinearSeq}
import scala.compiletime.*
import scala.deriving.Mirror
import scala.quoted.*

transparent inline def data[T](source: T) =
  ${ dataImpl[T]('source) }

private final val MaximumTypeParameters = 1
private final val MaximumParameterLists = 1
private final val MaximumParameters = 1

@experimental
private def dataImpl[T: Type](source: Expr[T])(using Quotes): Expr[Any] =
  val quotesTyped: Quotes = quotes
  import quotesTyped.reflect.*
//  import quotes.reflect.*

//  implicit val context = dotty.tools.dotc.core.Contexts.ContextBase().initialCtx
//  context.initialize()
  val quotes2: scala.quoted.runtime.impl.QuotesImpl = quotes.asInstanceOf[scala.quoted.runtime.impl.QuotesImpl]
  implicit val context = quotes2.ctx

  inline def valDefToExpr(valDef: ValDef): Expr[Unit] =
    val ValDef(name, tpt, rhs) = valDef
    // TODO: Is there an easier way to extract the type?
    tpt.tpe.asType match {
      case '[t] =>
        rhs match {
          case Some(term) =>
            '{ val $name: t = ${term.asExprOf[t]} }
          case None =>
            // FIXME
            '{ val $name: t = ??? }
        }
    }

  def classDefToExpr(classDef: ClassDef): Expr[Unit] =
    scala.quoted.runtime.impl.ExprImpl(
      // TODO: Do we need to convert the ClassDef to a TypeDef?
      Block(stats = List(classDef), expr = Literal(UnitConstant())).asInstanceOf[dotty.tools.dotc.ast.tpd.Tree],
      scala.quoted.runtime.impl.SpliceScope.getCurrent
    ).asInstanceOf[Expr[Unit]]

  def classDefToExpr2(classDef: ClassDef): Expr[Unit] =
    // TODO: Finish this.
    val ClassDef(name, constructor, parents, self, body) = classDef
    val clsName = Expr(name)
    // TODO: Can rhs be Some?
    val DefDef(_, paramss, _, _) = constructor
    // TODO: Can there be more than one type param clause? No right?
    // I don't think these can be empty but filter it out just in case.
    val maybeTypeParams = paramss.collectFirst {
      case clause: TypeParamClause => clause
    }.filter(_.params.nonEmpty)
    val termParamss = paramss.collect {
      case clause: TermParamClause => clause
    }

    println("XXXX")

    // HINT: Take a look at dotty.tools.dotc.typer.QuotesAndSplices

//    import dotty.tools.dotc.core.Contexts._
//    implicit val context = dotty.tools.dotc.core.Contexts.ContextBase().initialCtx
//    context.initialize()
    val bob = '{ class Bob }
////    val bobTree = dotty.tools.dotc.quoted.PickledQuotes.quotedExprToTree(bob)
//    val bobTree = bob.asInstanceOf[scala.quoted.runtime.impl.ExprImpl].tree
////    dotty.tools.dotc.core.Definitions.init()
//    println("XXXXX2")
//    val pickled = dotty.tools.dotc.quoted.PickledQuotes.pickleQuote(bobTree)
//    println(pickled)
//    val unpickled = quotes.asInstanceOf[runtime.QuoteUnpickler].unpickleExprV2[T](
//      pickled = pickled,
//      types = Seq.empty,
//      termHole = (idx: Int, args: Seq[Any], quotes: Quotes) => ???
//    )
//    println(unpickled)

    maybeTypeParams match {
      case None =>
        termParamss match {
          // TODO: Support more param lists.
          case Nil =>
            '{ class $clsName }
          case clause :: Nil => clause.params match {
            case Nil =>
              '{ class $clsName() }
            case a :: Nil =>
              // FIXME
              val aExpr = valDefToExpr(a)
              println(aExpr.show)
              '{ class $clsName() }
            case params =>
              // TODO: Add position.
              report.errorAndAbort(s"Too many parameters. Currently able to support $MaximumParameters parameters but found ${params.length}. Please submit an issue to support more.")
          }
          case _ =>
            // TODO: Add position.
            report.errorAndAbort(s"Too many parameter lists. Currently able to support $MaximumParameterLists parameter lists but found ${paramss.length}. Please submit an issue to support more.")
        }
      case Some(typeParams) => typeParams.params match {
        // FIXME: This kinda sucks. How can we support an arbitrary number of type parameters and splice their names?
        case _ :: Nil =>
          // TODO: Add terms
          '{ class $clsName[A]() }
        case tparams =>
          // TODO: Add position.
          report.errorAndAbort(s"Too many type parameters. Currently able to support $MaximumTypeParameters type parameters but found ${tparams.length}. Please submit an issue to support more.")
      }
    }

  type Fields = List[(String, TypeRepr)]

  def productFields[Labels <: Tuple: Type, Types <: Tuple: Type]: Fields =
    @tailrec
    def loop[Labels2 <: Tuple: Type, Types2 <: Tuple: Type](result: Fields): Fields =
      Type.of[Labels2] match {
        case '[EmptyTuple] => result
        case '[tLabel *: tLabelTail] =>
          Type.of[Types2] match {
            case '[EmptyTuple] => result
            case '[tpe *: tpeTail] =>
              val label: String = Type.valueOfConstant[tLabel].get.toString
              val tpeRepr = TypeRepr.of[tpe]
              loop[tLabelTail, tpeTail](label -> tpeRepr :: result)
          }
      }
    loop[Labels, Types](Nil).reverse
  end productFields

  def dataRefinementType(fields: Fields): TypeRepr =
    fields.foldLeft(RecursiveType(_ => TypeRepr.of[Any])) {
      case (result, (label, tpeRepr)) =>
        val resultWithField = Refinement(result, label, tpeRepr)
        // FIXME: What type to use? Can we get rid of the recursive thing?
        //val withResultType = result.recThis
        val withResultType = TypeRepr.of[Any]
        val withMethodType = MethodType(List("value"))(_ => List(tpeRepr), _ => withResultType)
        val resultWithMethod = Refinement(resultWithField, s"with${label.capitalize}", withMethodType)
        RecursiveType(_ => resultWithMethod)
    }
  end dataRefinementType

  def dataCaseClass(fields: Fields): (Symbol, ClassDef) =
    val name = Symbol.freshName("Data")
    // TODO: Copy the parents including the source type itself (if applicable).
    val parents = List(TypeTree.of[Object])
    def decls(cls: Symbol) =
      List.empty[Symbol]
    val cls = Symbol.newClass(Symbol.spliceOwner, name, parents.map(_.tpe), decls, selfType = None)
//    val ctor = DefDef(cls.primaryConstructor)
//    val dataFields = fields.foldLeft(List.empty[Statement]) {
//      case (result, (label, tpeRepr)) =>
//        // TODO: Copy the flags from the source.
//        val fieldSym = Symbol.newVal(cls, label, tpeRepr, Flags.EmptyFlags)
//        ValDef(fieldSym)
//    }
    val body = List.empty[Statement]
    cls -> ClassDef(cls, parents, body)
  end dataCaseClass

  // TODO: Remove the get
  // TODO: Add fallback cases everywhere
  Expr.summon[Mirror.ProductOf[T]].get match
    case '{
      type mels <: Tuple
      type mets <: Tuple
      $m: Mirror.ProductOf[T] {
        type MirroredElemLabels = `mels`
        type MirroredElemTypes = `mets`
      }
    } =>
      val x = '{ class Bob }
      val fields = productFields[mels, mets]
      val tpe = dataRefinementType(fields).asType
      val (cls, clsDef) = dataCaseClass(fields)
      val newCls = Apply(Select(New(TypeIdent(cls)), cls.primaryConstructor), Nil)
      tpe match {
        case '[data] =>
//          val dataSymbol = Symbol.newClass()
//          val data = ClassDef()
//          println(x)
//          println(x.show)
          '{
              ${classDefToExpr(clsDef)}
//            ${Expr(ValDef(Symbol.newVal(Symbol.spliceOwner, "foo", TypeRepr.of[String], Flags.EmptyFlags, Symbol.noSymbol), None))}
//            ${newCls.asExpr}
//            case class Data(name: String) {
//              def withName(value: String) = copy(name = value)
//            }
//            PersonData(source.name): data
          }
      }

//
//      Type.of[mels] match
//        case '[mel *: melTail] =>
//          val label = Type.valueOfConstant[mel].get.toString
//
//          Refinement(TypeRepr.of[Data], label, TypeRepr.of[String]).asType match
//            case '[tpe] =>
//              val res = '{
//                val p = Data()
//                p.asInstanceOf[tpe]
//              }
//              println(res.show)
//              res

end dataImpl
