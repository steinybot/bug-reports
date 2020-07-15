scalaVersion := "2.12.12"

lazy val root = (project in file("."))
  .aggregate(a, b)

lazy val a = (project in file("a"))
  .settings(libraryDependencies += "com.typesafe.play" %% "play" % "2.8.1")

lazy val b = (project in file("b"))
  .settings(libraryDependencies += "com.typesafe.play" %% "play" % "2.8.2")
