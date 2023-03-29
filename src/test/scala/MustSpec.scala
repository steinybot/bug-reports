import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class MustSpec extends AnyFlatSpec with Matchers {

  behavior of "Foo"

  it must "do foo" in {
    123.mustBe(an[Int]): Unit
    123.mustBe(an[Int])
  }
}
