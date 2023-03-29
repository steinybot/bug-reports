import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShouldSpec extends AnyFlatSpec with Matchers {

  behavior of "Foo"

  it must "do foo" in {
    123.shouldBe(an[Int]): Unit
    123.shouldBe(an[Int])
  }
}
