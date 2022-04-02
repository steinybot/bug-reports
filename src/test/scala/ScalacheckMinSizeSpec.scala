import org.scalacheck.Shrink
import org.scalactic.anyvals.{PosInt, PosZInt}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers._
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class ScalacheckMinSizeSpec extends AnyFlatSpec with ScalaCheckPropertyChecks with must.Matchers {

  override implicit val generatorDrivenConfig: PropertyCheckConfiguration =
    PropertyCheckConfiguration(minSize = PosZInt(100))

  private implicit val noShrink: Shrink[List[Int]] = Shrink[List[Int]](_ => Stream.empty)

  behavior of "minSize"

  it should "always generate values larger than the minSize" in {
    forAll { (numbers: List[Int]) =>
      assert(numbers.size >= generatorDrivenConfig.minSize.value)
    }
  }
}
