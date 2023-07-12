import sys.process._

val srcDir = sys.props("src.dir")

lazy val demo = taskKey[Unit]("demo")

demo := {
  Seq("ln", "-s", srcDir, "src").!
}
