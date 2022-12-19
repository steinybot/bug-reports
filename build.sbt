enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
scalaVersion := "2.13.10"
libraryDependencies += "me.shadaj" %%% "slinky-core" % "0.7.3"
scalaJSUseMainModuleInitializer := true
Compile / npmDependencies ++= Seq(
  "react" -> "18.2.0"
)
webpackCliVersion := "4.10.0"
webpackDevServerPort := 8081
