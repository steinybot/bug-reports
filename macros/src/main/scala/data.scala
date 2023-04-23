import scala.annotation.{MacroAnnotation, experimental, tailrec}
import scala.compiletime.*
import scala.deriving.Mirror
import scala.quoted.*

transparent inline def data[T](source: T) =
  ${ dataImpl[T]('source) }

@experimental
private def dataImpl[T: Type](source: Expr[T])(using Quotes): Expr[Any] =
  val quotesTyped: Quotes = quotes
  import quotesTyped.reflect.*

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

  def dataCaseClass(fields: Fields): ClassDef =
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
    ClassDef(cls, parents, body)
  end dataCaseClass

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
      tpe match {
        case '[data] =>
//          val dataSymbol = Symbol.newClass()
//          val data = ClassDef()
          '{
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

@experimental
class inspect extends MacroAnnotation:
  def transform(using Quotes)(tree: quotes.reflect.Definition): List[quotes.reflect.Definition] =
    val quotesTyped: Quotes = quotes
    import quotesTyped.reflect.*

//    println(tree)

    def pp(tree: Tree, level: Int): Unit =
      val indent = " " * (level * 2)
      val nextIndent = " " * ((level + 1) * 2)
      def printType(tpe: String): Unit = println(s"$indent$tpe")
      def printMemberString(key: String, value: String): Unit =
        Predef.print(s"$nextIndent$key = $value")
      def printMemberTree(key: String, value: Tree): Unit =
        Predef.print(s"$nextIndent$key = ")
        pp(value, level + 1)
      def printMemberTrees(key: String, values: List[Tree]): Unit =
        println(s"$nextIndent$key = [")
        values.foreach(value => pp(value, level + 1))
        println(s"$nextIndent]")
      def printMemberOptionTree(key: String, maybeValue: Option[Tree]): Unit =
        maybeValue.foreach { value =>
          printMemberTree(key, value)
        }
      // This is stupid. There is no type test for ParamClause and the individual param clause type tests are too
      // specific so it has to be handled separately.
      def printParamss(key: String, paramss: List[ParamClause]): Unit =
        Predef.print(s"$key = ")
        paramss.foreach {
          case TermParamClause(params) =>
            printType("TermParamClause")
            printMemberTrees("params", params)
          case TypeParamClause(params) =>
            printType("TypeParamClause")
            printMemberTrees("params", params)
        }
      tree match
        case ClassDef(name, constructor, parents, self, body) =>
          printType("ClassDef")
          printMemberString("name", name)
          printMemberTree("constructor", constructor)
          printMemberTrees("parents", parents)
          printMemberOptionTree("self", self)
          printMemberTrees("body", body)
        case TypeDef(name, rhs) =>
          printType("TypeDef")
          printMemberString("name", name)
          printMemberTree("rhs", rhs)
        case DefDef(name, paramss, returnTpt, rhs) =>
          printType("DefDef")
          printMemberString("name", name)
          printParamss(paramss)
        case _ =>
          report.errorAndAbort(s"Unknown tree: ${tree.getClass}\n${tree.show}")

    val level = 0
    val indent = ""
    val nextIndent = "  "
    tree match
      case ClassDef(name, constructor, parents, self, body) =>
        println(s"${indent}ClassDef")
        println(s"${nextIndent}name = $name")
        Predef.print(s"${nextIndent}constructor = ")
        pp(constructor, level + 1)
        println(s"${nextIndent}parents = [")
        parents.foreach(pp(_, level + 1))
        println(s"$nextIndent]")
        self.foreach { s =>
          Predef.print(s"${nextIndent}self = ")
          pp(s, level + 1)
        }
        println(s"${nextIndent}body = [")
        body.foreach(pp(_, level + 1))
        println(s"$nextIndent]")
      case TypeDef(name, rhs) =>
        println(s"${indent}TypeDef")
        println(s"${nextIndent}name = $name")
        Predef.print(s"${nextIndent}rhs = ")
        pp(rhs, 1)

    List(tree)
