ThisBuild / scalaVersion := "3.3.1"

lazy val root = project.in(file(".")).aggregate(react)

lazy val react = project.enablePlugins(ScalaJSPlugin)
