ThisBuild / scalaVersion := "2.13.11"

enablePlugins(ScalaJSPlugin, ScalablyTypedConverterGenSourcePlugin)

organization := "com.example"
stOutputPackage := "web.typings"
stFlavour := Flavour.Slinky
stIgnore ++= List(
  // Ignore this otherwise it fails with: anon is already defined as package anon
  "@ant-design/cssinjs",
  // For whatever reason when we ignore this we get three additional properties:
  // linkDecoration, linkFocusDecoration, and linkHoverDecoration.
  "csstype"
)
Compile / npmDependencies ++= Seq(
  "antd" -> "5.12.1"
)
Compile / npmDevDependencies ++= Seq(
  // Ignore this otherwise it fails with: anon is already defined as package anon
  // For some reason...
  "@types/react" -> "18.2.13"
)
stSourceGenMode := SourceGenMode.Manual(
  (Compile / sourceDirectory).value / "scala"
)
