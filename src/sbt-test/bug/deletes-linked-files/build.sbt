import sys.process._

val srcDir = sys.props("src.dir")

lazy val demo = Def.task {
  Seq("ln", "-s", srcDir, "src").!
}
