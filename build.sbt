ThisBuild / scalaVersion := "3.3.0-RC4"

lazy val root = project.in(file("."))
  .aggregate(app, macros)
  .settings(run := (app / Compile / run).evaluated)

lazy val app = project
  .dependsOn(macros)
  .settings( //
    scalacOptions += "-with-compiler"
  )

lazy val macros = project
  .settings(//
    scalacOptions ++= Seq("-with-compiler", "-feature")
  )
