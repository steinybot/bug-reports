scalaVersion := "2.13.8"

libraryDependencies += "io.estatico" %% "newtype" % "0.4.4"

scalacOptions ++= Seq(
  "-Ymacro-annotations",
  "-Werror"
)