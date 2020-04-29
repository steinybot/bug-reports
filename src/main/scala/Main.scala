import org.scalacheck.Arbitrary
import org.scalacheck.Arbitrary._
import org.scalacheck.Prop.forAll

object Main extends App {

  case class Foo(foo: Int)

  MyGen.r(Some(Foo(-5))).copy(s = _.foo >= 0).retrieve

  implicit val arbFoo: Arbitrary[Foo] = Arbitrary {
    arbitrary[Int].map(Foo).filter(_.foo >= 0)
  }

  val checkFoo = forAll { foo: Foo =>
    foo.foo > 0
  }

  checkFoo.check
}
