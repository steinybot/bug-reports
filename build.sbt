ThisBuild / scalaVersion := "2.13.7"

lazy val root =
  project
    .in(file("."))
    .aggregate(client)

lazy val client = project
  .enablePlugins(ScalaJSPlugin)
  .settings(
    addCompilerPlugin("org.augustjune" %% "context-applied" % "0.1.4"),
    libraryDependencies += "me.shadaj" %%% "slinky-core" % "0.6.8",
    scalacOptions ++= Seq("-Werror", "-Xlint:unused", "-Ymacro-annotations", "-Ymacro-debug-lite")
  )
