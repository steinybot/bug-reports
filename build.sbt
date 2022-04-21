scalaVersion := "2.13.8"

enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
  "me.shadaj" %%% "slinky-core" % "0.7.2"
)

scalacOptions ++= Seq(
  "-Ymacro-annotations",
//  "-Ybrowse:typer",
//  "-Xprint:typer",
  "-Xlog-implicits"
)
