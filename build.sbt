ThisBuild / scalaVersion := "3.3.0-RC4"
ThisBuild / scalacOptions ++= Seq("-explain", "-feature", "-language:implicitConversions")

lazy val root = project.in(file("."))
  .aggregate(app, macros)
  .settings(run := (app / Compile / run).evaluated)

lazy val app = project
  .dependsOn(macros)

lazy val macros = project
  .settings(//
    libraryDependencies += "org.scala-lang" %% "scala3-compiler" % scalaVersion.value % Provided
  )
