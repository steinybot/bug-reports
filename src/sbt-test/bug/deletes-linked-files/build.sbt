import sys.process._

val srcDir = sys.props.get("src.dir") match {
  case Some(dir) => dir
  case _ => sys.error("""|The system property 'src.dir' is not defined.
                         |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
}

lazy val demo = taskKey[Unit]("demo")

demo := {
  Seq("ln", "-s", srcDir, "src").!
}
