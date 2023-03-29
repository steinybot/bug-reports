scalaVersion := "2.13.10"
scalacOptions ++= Seq(
  "-Wnonunit-statement",
  "-Xfatal-warnings",
  "-Ymacro-annotations",
  "-Ymacro-debug-verbose"
)

enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true

libraryDependencies += "me.shadaj" %%% "slinky-core" % "0.7.3"