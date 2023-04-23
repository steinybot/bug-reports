import scala.annotation.{MacroAnnotation, experimental, tailrec}
import scala.collection.immutable.{AbstractSeq, LinearSeq}
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

  private sealed trait Result

  private case class TypeResult(tpe: String, subs: Vector[(String, Result)] = Vector.empty) extends Result:
    def addSubResult(key: String, result: String*): TypeResult = {
      if (result.isEmpty) this
      else if (result.length == 1) copy(subs = subs :+ key -> StringResult(result.head))
      else copy(subs = subs :+ key -> MultiResult(result.map(StringResult.apply).toList))
    }
    def addSubResult(key: String, result: Result): TypeResult = copy(subs = subs :+ key -> result)
    def addSubResult(key: String, result: List[Result]): TypeResult = copy(subs = subs :+ key -> MultiResult(result))
    def addSubResult(key: String, result: Option[Result]): TypeResult = result.fold(this)(addSubResult(key, _))

  private case class StringResult(value: String) extends Result

  private case class MultiResult(results: List[Result]) extends Result

  def transform(using Quotes)(tree: quotes.reflect.Definition): List[quotes.reflect.Definition] =
//    val quotesTyped: Quotes = quotes
//    import quotesTyped.reflect.*
    import quotes.reflect.*

//    println(tree)

    def traverseParams(params: ParamClause): Result = params match {
      case TermParamClause(params) =>
        TypeResult("TermParamClause")
          .addSubResult("params", params.map(traverse))
      case TypeParamClause(params) =>
        TypeResult("TypeParamClause")
          .addSubResult("params", params.map(traverse))
    }

    def traverseTypeRepr(typeRepr: TypeRepr): Result = typeRepr match {
      // Not sure about the names here.
      case TermRef(qualifier, name) =>
        TypeResult("TermRef")
          .addSubResult("qualifier", traverseTypeRepr(qualifier))
          .addSubResult("name", name)
      case TypeRef(translucentSuperType, name) =>
        TypeResult("TypeRef")
          .addSubResult("translucentSuperType", traverseTypeRepr(translucentSuperType))
          .addSubResult("name", name)
      case namedType: NamedType =>
        TypeResult("NamedType")
          .addSubResult("qualifier", traverseTypeRepr(namedType.qualifier))
          .addSubResult("name", namedType.name)
      case ConstantType(constant) =>
        TypeResult("ConstantType")
          .addSubResult("constant", traverseConstant(constant))
      case SuperType(thistpe, supertpe) =>
        TypeResult("SuperType")
          .addSubResult("thistpe", traverseTypeRepr(thistpe))
          .addSubResult("supertpe", traverseTypeRepr(supertpe))
      case Refinement(parent, name, info) =>
        TypeResult("Refinement")
          .addSubResult("parent", traverseTypeRepr(parent))
          .addSubResult("name", name)
          .addSubResult("info", traverseTypeRepr(info))
      case AppliedType(tycon, args) =>
        TypeResult("AppliedType")
          .addSubResult("tycon", traverseTypeRepr(tycon))
          .addSubResult("args", args.map(traverseTypeRepr))
      case AnnotatedType(underlying, annotation) =>
        TypeResult("AnnotatedType")
          .addSubResult("underlying", traverseTypeRepr(underlying))
          .addSubResult("annotation", traverse(annotation))
      case AndType(lhs, rhs) =>
        TypeResult("AndType")
          .addSubResult("lhs", traverseTypeRepr(lhs))
          .addSubResult("rhs", traverseTypeRepr(rhs))
      case OrType(lhs, rhs) =>
        TypeResult("OrType")
          .addSubResult("lhs", traverseTypeRepr(lhs))
          .addSubResult("rhs", traverseTypeRepr(rhs))
      case andOrType: AndOrType =>
        TypeResult("AndOrType")
          .addSubResult("left", traverseTypeRepr(andOrType.left))
          .addSubResult("right", traverseTypeRepr(andOrType.right))
      case MatchType(bound, scrutinee, cases) =>
        TypeResult("MatchType")
          .addSubResult("bound", traverseTypeRepr(bound))
          .addSubResult("scrutinee", traverseTypeRepr(scrutinee))
          .addSubResult("cases", cases.map(traverseTypeRepr))
      case ByNameType(underlying) =>
        TypeResult("ByNameType")
          .addSubResult("underlying", traverseTypeRepr(underlying))
      case ParamRef(binder, paramNum) =>
        TypeResult("ParamRef")
          .addSubResult("binder", traverseTypeRepr(binder))
          .addSubResult("paramNum", paramNum.toString)
      case ThisType(tref) =>
        TypeResult("ThisType")
          .addSubResult("tref", traverseTypeRepr(tref))
      case RecursiveThis(binder) =>
        TypeResult("RecursiveThis")
          .addSubResult("binder", traverseTypeRepr(binder))
      case RecursiveType(underlying) =>
        TypeResult("RecursiveType")
          .addSubResult("underlying", traverseTypeRepr(underlying))
      case MethodType(paramNames, paramInfos, resultType) =>
        TypeResult("MethodType")
          .addSubResult("paramNames", paramNames: _*)
          .addSubResult("paramInfos", paramInfos.map(traverseTypeRepr))
          .addSubResult("resultType", traverseTypeRepr(resultType))
      case PolyType(paramNames, paramBounds, resultType) =>
        TypeResult("PolyType")
          .addSubResult("paramNames", paramNames: _*)
          .addSubResult("paramBounds", paramBounds.map(traverseTypeRepr))
          .addSubResult("resultType", traverseTypeRepr(resultType))
      case TypeLambda(paramNames, bounds, body) =>
        TypeResult("TypeLambda")
          .addSubResult("paramNames", paramNames: _*)
          .addSubResult("bounds", bounds.map(traverseTypeRepr))
          .addSubResult("body", traverseTypeRepr(body))
      case lambdaType: LambdaType =>
        TypeResult("LambdaType")
          .addSubResult("paramNames", lambdaType.paramNames: _*)
          .addSubResult("paramTypes", lambdaType.paramTypes.map(traverseTypeRepr))
          .addSubResult("resType", traverseTypeRepr(lambdaType.resType))
      case MatchCase(pattern, rhs) =>
        TypeResult("MatchCase")
          .addSubResult("pattern", traverseTypeRepr(pattern))
          .addSubResult("rhs", traverseTypeRepr(rhs))
      case TypeBounds(low, hi) =>
        TypeResult("TypeBounds")
          .addSubResult("low", traverseTypeRepr(low))
          .addSubResult("hi", traverseTypeRepr(hi))
      case _: NoPrefix =>
        TypeResult("NoPrefix")
    }

    def traverseSelector(selector: Selector): Result = selector match {
      case SimpleSelector(name) =>
        TypeResult("SimpleSelector")
          .addSubResult("name", name)
      case RenameSelector(fromName, toName) =>
        TypeResult("RenameSelector")
          .addSubResult("fromName", fromName)
          .addSubResult("toName", toName)
      case OmitSelector(name) =>
        TypeResult("OmitSelector")
          .addSubResult("name", name)
      case GivenSelector(bound) =>
        TypeResult("GivenSelector")
          .addSubResult("bound", bound.map(traverse))
    }

    def traverseConstant(constant: Constant): Result = constant match {
      case BooleanConstant(value) =>
        TypeResult("BooleanConstant")
          .addSubResult("value", value.toString)
      case ByteConstant(value) =>
        TypeResult("ByteConstant")
          .addSubResult("value", value.toString)
      case ShortConstant(value) =>
        TypeResult("ShortConstant")
          .addSubResult("value", value.toString)
      case IntConstant(value) =>
        TypeResult("IntConstant")
          .addSubResult("value", value.toString)
      case LongConstant(value) =>
        TypeResult("LongConstant")
          .addSubResult("value", value.toString)
      case FloatConstant(value) =>
        TypeResult("FloatConstant")
          .addSubResult("value", value.toString)
      case DoubleConstant(value) =>
        TypeResult("DoubleConstant")
          .addSubResult("value", value.toString)
      case CharConstant(value) =>
        TypeResult("CharConstant")
          .addSubResult("value", value.toString)
      case StringConstant(value) =>
        TypeResult("StringConstant")
          .addSubResult("value", value)
      case _: UnitConstant =>
        TypeResult("UnitConstant")
          .addSubResult("value", "()")
      case _: NullConstant =>
        TypeResult("NullConstant")
          .addSubResult("value", "null")
      case ClassOfConstant(value) =>
        TypeResult("ClassOfConstant")
          .addSubResult("value", traverseTypeRepr(value))
    }

    def traverse(tree: Tree): Result =
      tree match
        case PackageClause(pid, stats) =>
          TypeResult("PackageClause")
            .addSubResult("pid", traverse(pid))
            .addSubResult("stats", stats.map(traverse))
        case Import(expr, selectors) =>
          TypeResult("Import")
            .addSubResult("expr", traverse(expr))
            .addSubResult("selectors", selectors.map(traverseSelector))

        // Statement - Definition
        case ClassDef(name, constructor, parents, self, body) =>
          TypeResult("ClassDef")
            .addSubResult("name", name)
            .addSubResult("constructor", traverse(constructor))
            .addSubResult("parents", parents.map(traverse))
            .addSubResult("self", self.map(traverse))
            .addSubResult("body", body.map(traverse))
        case TypeDef(name, rhs) =>
          TypeResult("TypeDef")
            .addSubResult("name", name)
            .addSubResult("rhs", traverse(rhs))
        case DefDef(name, paramss, returnTpt, rhs) =>
          TypeResult("DefDef")
            .addSubResult("name", name)
            .addSubResult("paramss", paramss.map(traverseParams))
            .addSubResult("returnTpt", traverse(returnTpt))
            .addSubResult("rhs", rhs.map(traverse))
        case ValDef(name, tpt, rhs) =>
          TypeResult("ValDef")
            .addSubResult("name", name)
            .addSubResult("tpt", traverse(tpt))
            .addSubResult("rhs", rhs.map(traverse))
        case definition: Definition =>
          TypeResult("Definition")
            .addSubResult("name", definition.name)

        // Statement - Term - Ref
        case _: Wildcard =>
          TypeResult("Wildcard")
        case Ident(name) =>
          TypeResult("Ident")
            .addSubResult("name", name)
        case Select(qualifier, name) =>
          TypeResult("Select")
            .addSubResult("qualifier", traverse(qualifier))
            .addSubResult("name", name)

        // Statement - Term
        case Literal(constant) =>
          TypeResult("Literal")
            .addSubResult("constant", traverseConstant(constant))
        case This(id) =>
          TypeResult("This")
            .addSubResult("id", id.toSeq: _*)
        case New(tpt) =>
          TypeResult("New")
            .addSubResult("tpt", traverse(tpt))
        case NamedArg(name, value) =>
          TypeResult("NamedArg")
            .addSubResult("name", name)
            .addSubResult("value", traverse(value))
        case Apply(fun, args) =>
          TypeResult("Apply")
            .addSubResult("fun", traverse(fun))
            .addSubResult("args", args.map(traverse))
        case TypeApply(fun, args) =>
          TypeResult("TypeApply")
            .addSubResult("fun", traverse(fun))
            .addSubResult("args", args.map(traverse))
        case Super(qualifier, id) =>
          TypeResult("Super")
            .addSubResult("qualifier", traverse(qualifier))
            .addSubResult("id", id.toSeq: _*)
        case Assign(lhs, rhs) =>
          TypeResult("Assign")
            .addSubResult("lhs", traverse(lhs))
            .addSubResult("rhs", traverse(rhs))
        case Block(statements, expr) =>
          TypeResult("Block")
            .addSubResult("statements", statements.map(traverse))
            .addSubResult("expr", traverse(expr))
        case Closure(meth, tpeOpt) =>
          TypeResult("Closure")
            .addSubResult("meth", traverse(meth))
            .addSubResult("tpeOpt", tpeOpt.map(traverseTypeRepr))
        case If(cond, thenp, elsep) =>
          TypeResult("If")
            .addSubResult("cond", traverse(cond))
            .addSubResult("thenp", traverse(thenp))
            .addSubResult("elsep", traverse(elsep))
        case Match(scrutinee, cases) =>
          TypeResult("Match")
            .addSubResult("scrutinee", traverse(scrutinee))
            .addSubResult("cases", cases.map(traverse))
        case SummonFrom(cases) =>
          TypeResult("SummonFrom")
            .addSubResult("cases", cases.map(traverse))
        case Try(body, cases, finalizer) =>
          TypeResult("Try")
            .addSubResult("body", traverse(body))
            .addSubResult("cases", cases.map(traverse))
            .addSubResult("finalizer", finalizer.map(traverse))
        case Return(expr, from) =>
          TypeResult("Return")
            .addSubResult("expr", traverse(expr))
            .addSubResult("from", from.name)
        case Repeated(elems, elemtpt) =>
          TypeResult("Repeated")
            .addSubResult("elems", elems.map(traverse))
            .addSubResult("elemtpt", traverse(elemtpt))
        case Inlined(call, bindings, body) =>
          TypeResult("Inlined")
            .addSubResult("call", call.map(traverse))
            .addSubResult("bindings", bindings.map(traverse))
            .addSubResult("body", traverse(body))
        case SelectOuter(qualifier, name, level) =>
          TypeResult("SelectOuter")
            .addSubResult("qualifier", traverse(qualifier))
            .addSubResult("name", name)
            .addSubResult("level", level.toString)
        case While(cond, body) =>
          TypeResult("While")
            .addSubResult("cond", traverse(cond))
            .addSubResult("body", traverse(body))
        case Typed(expr, tpt) =>
          TypeResult("Typed")
            .addSubResult("expr", traverse(expr))
            .addSubResult("tpt", traverse(tpt))

        case TypedOrTest(tree, tpt) =>
          TypeResult("TypedOrTest")
            .addSubResult("tree", traverse(tree))
            .addSubResult("tpt", traverse(tpt))
        case Bind(name, pattern) =>
          TypeResult("Bind")
            .addSubResult("name", name)
            .addSubResult("pattern", traverse(pattern))
        case Unapply(fun, implicits, patterns) =>
          TypeResult("Unapply")
            .addSubResult("fun", traverse(fun))
            .addSubResult("implicits", implicits.map(traverse))
            .addSubResult("patterns", patterns.map(traverse))
        case Alternatives(patterns) =>
          TypeResult("Alternatives")
            .addSubResult("patterns", patterns.map(traverse))

        case CaseDef(pattern, guard, rhs) =>
          TypeResult("CaseDef")
            .addSubResult("pattern", traverse(pattern))
            .addSubResult("guard", guard.map(traverse))
            .addSubResult("rhs", traverse(rhs))
        case TypeCaseDef(pattern, rhs) =>
          TypeResult("TypeCaseDef")
            .addSubResult("pattern", traverse(pattern))
            .addSubResult("rhs", traverse(rhs))

        // TypeTree
        case _: Inferred =>
          TypeResult("Inferred")
        case TypeIdent(name) =>
          TypeResult("TypeIdent")
            .addSubResult("name", name)
        case TypeSelect(qualifier, name) =>
          TypeResult("TypeSelect")
            .addSubResult("qualifier", traverse(qualifier))
            .addSubResult("name", name)
        case TypeProjection(qualifier, name) =>
          TypeResult("TypeProjection")
            .addSubResult("qualifier", traverse(qualifier))
            .addSubResult("name", name)
        case Singleton(ref) =>
          TypeResult("Singleton")
            .addSubResult("ref", traverse(ref))
        case Refined(tpt, refinements) =>
          TypeResult("Refined")
            .addSubResult("tpt", traverse(tpt))
            .addSubResult("refinements", refinements.map(traverse))
        case Applied(tpt, args) =>
          TypeResult("Applied")
            .addSubResult("tpt", traverse(tpt))
            .addSubResult("args", args.map(traverse))
        case Annotated(arg, annotation) =>
          TypeResult("Annotated")
            .addSubResult("arg", traverse(arg))
            .addSubResult("annotation", traverse(annotation))
        case MatchTypeTree(bound, selector, cases) =>
          TypeResult("MatchTypeTree")
            .addSubResult("bound", bound.map(traverse))
            .addSubResult("selector", traverse(selector))
            .addSubResult("cases", cases.map(traverse))
        case ByName(result) =>
          TypeResult("ByName")
            .addSubResult("result", traverse(result))
        case LambdaTypeTree(tparams, body) =>
          TypeResult("LambdaTypeTree")
            .addSubResult("tparams", tparams.map(traverse))
            .addSubResult("body", traverse(body))
        case TypeBind(name, body) =>
          TypeResult("TypeBind")
            .addSubResult("name", name)
            .addSubResult("body", traverse(body))
        case TypeBlock(aliases, tpt) =>
          TypeResult("TypeBlock")
            .addSubResult("aliases", aliases.map(traverse))
            .addSubResult("tpt", traverse(tpt))
        case typeTree: TypeTree =>
          TypeResult("TypeTree")
            .addSubResult("tpe", traverseTypeRepr(typeTree.tpe))

        case TypeBoundsTree(low, hi) =>
          TypeResult("TypeBoundsTree")
            .addSubResult("low", traverse(low))
            .addSubResult("hi", traverse(hi))
        case wildcard: WildcardTypeTree =>
          TypeResult("WildcardTypeTree")
            .addSubResult("tpe", traverseTypeRepr(wildcard.tpe))

    val result = traverse(tree)

    def display(result: Result, level: Int): Unit =
      val indent = " " * (2 * (level + 1))
      val outdent = " " * (2 * level)
      result match
        case TypeResult(tpe, members) if members.isEmpty =>
          println(s"$tpe()")
        case TypeResult(tpe, members) =>
          println(s"$tpe(")
          members.foreach { (key, value) =>
            Predef.print(s"$indent$key = ")
            display(value, level + 1)
          }
          println(s"$outdent)")
        case StringResult(value) =>
          println(s""""$value"""")
        case MultiResult(results) if results.isEmpty =>
          println("[]")
        case MultiResult(results) =>
          println("[")
          results.foreach { result =>
            Predef.print(indent)
            display(result, level + 1)
          }
          println(s"$outdent]")

    display(result, 0)

    List(tree)
