enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
scalaVersion := "2.13.10"
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1"
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "extra" % "2.1.1"
scalaJSUseMainModuleInitializer := true
Compile / npmDependencies ++= Seq(
  "react" -> "18.2.0",
  "react-dom" -> "18.2.0",
  "html-webpack-plugin" -> "webpack-4"
)
webpackCliVersion := "4.10.0"
webpackDevServerPort := 8081
webpackConfigFile := Some(baseDirectory.value / "webpack.config.js")

