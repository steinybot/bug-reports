scalaVersion := "2.13.8"

addCompilerPlugin("io.tryp" % "splain" % "1.0.0" cross CrossVersion.patch)

scalacOptions ++= Seq(
//  "-Ybrowse:typer",
//  "-Xprint:typer",

  "-Xlog-implicits",
  "-Vtype-diffs",
  "-Vimplicits",
  "-Vimplicits-verbose-tree",
  "-P:splain:Vimplicits-diverging"
)
