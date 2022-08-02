scalaVersion := "2.13.8"

enablePlugins(ScalaJSPlugin, ScalablyTypedConverterPlugin)

scalaJSUseMainModuleInitializer := true

Compile / npmDependencies ++= Seq(
  "rc-tree" -> "5.6.6"
)