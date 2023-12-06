scalaVersion := "2.13.12"

enablePlugins(ScalablyTypedConverterPlugin)

Compile / npmDependencies ++= Seq(
  "antd" -> "5.12.1"
)
