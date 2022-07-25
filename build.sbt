scalaVersion := "2.13.8"

enablePlugins(ScalaJSPlugin)

libraryDependencies += "io.estatico" %%% "newtype" % "0.4.4"

scalacOptions ++= Seq(
  "-feature",
  "-unchecked",
  "-language:implicitConversions",
  "-Ymacro-annotations",
  "-Werror"
)