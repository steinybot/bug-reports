import scala.annotation.{MacroAnnotation, experimental, tailrec}
import scala.collection.immutable.{AbstractSeq, LinearSeq}
import scala.compiletime.*
import scala.deriving.Mirror
import scala.quoted.*

transparent inline def data[T](source: T) =
  ${ dataImpl[T]('source) }

private final val MaximumTypeParameters = 1

@experimental
private def dataImpl[T: Type](source: Expr[T])(using Quotes): Expr[Any] =
  val quotesTyped: Quotes = quotes
  import quotesTyped.reflect.*
//  import quotes.reflect.*

  def classDefToExpr(classDef: ClassDef): Expr[Unit] =
    // TODO: Finish this.
    val ClassDef(name, constructor, parents, self, body) = classDef
    val clsName = Expr(name)
    // TODO: Can rhs be Some?
    val DefDef(_, paramss, _, _) = constructor
    // TODO: Can there be more than one type param clause? No right?
    val maybeTypeParamClause = paramss.collectFirst {
      case clause: TypeParamClause => clause
    }
    val test1: Expr[Int] = '{ 1 }
    val test2: Expr[Expr[Int]] = '{ Expr(1) }
    maybeTypeParamClause match {
      case None =>
        '{
          class $clsName()
        }
      case Some(typeParamClause) => typeParamClause.params match {
        // FIXME: This kinda sucks. How can we support an arbitrary number of type parameters and splice their names?
        case _ :: Nil => '{ class $clsName[A]() }
        // TODO: Add position.
        case params => report.errorAndAbort(s"Too many type parameters. Currently able to support $MaximumTypeParameters type parameters but found ${params.length}. Please submit a Pull Request to handle more type parameters.")
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
      val fields = productFields[mels, mets]
      val tpe = dataRefinementType(fields).asType
      val (cls, clsDef) = dataCaseClass(fields)
      val newCls = Apply(Select(New(TypeIdent(cls)), cls.primaryConstructor), Nil)
      tpe match {
        case '[data] =>
//          val dataSymbol = Symbol.newClass()
//          val data = ClassDef()
          val x = '{ class $clsName }
          println(x)
          println(x.show)
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
