import hedgehog.runner._
import hedgehog._
import hedgehog.core.Result.Success
import hedgehog.core.{CoverPercentage, LabelName, Seed, SuccessCount}

object Main extends Properties {

  override def tests: List[Test] = List(
    property("frequency handles large weights", oops)
      .config(c => c.copy(testLimit = SuccessCount(100000))),
  )

  private def oops: Property = {
    for {
      size <- Gen.int(Range.constant(0, Size.max)).forAll
      seed <- Gen.long(Range.constant(Long.MinValue, Long.MaxValue)).forAll
    } yield {
      val result = Gen.frequency1(
        (Int.MaxValue, Gen.constant(true)),
        (Int.MaxValue, Gen.constant(false))
      ).run(Size(size), Seed.fromLong(seed))
      result.value._2 ==== Some(true)
    }
  }.cover(CoverPercentage(0.25), LabelName("This should fail some of the time."), {
    case Success => false
    case _ => true
  })
}
