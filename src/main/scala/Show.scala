import scala.annotation.implicitNotFound

@implicitNotFound(
  "Could not find an implicit Show for type ${T}, predicate ${P} and result ${R}. " +
    "You may want to define it as an implicit function that is polymorphic function over R."
)
trait Show[T, P, R] {

  val longString = "Could not find an implicit Show for type ${T}, predicate ${P} and result ${R}. " +
    "You may want to define it as an implicit function that is polymorphic function over R."
}
