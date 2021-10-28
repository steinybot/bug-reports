import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SetSpec extends AnyFlatSpec with Matchers {

  "inOrder" should "work with duplicates" in {
    List(5, 2, 5) should contain inOrder (5, 2)
  }
}
