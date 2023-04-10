ThisBuild / scalaVersion := "2.13.10"

lazy val root = project
  .aggregate(app, lib)

lazy val app = project
  // This should be ScalablyTypedConverterPlugin but there is a key conflict.
  .enablePlugins(ScalaJSPlugin, ScalablyTypedConverterPlugin)
  .settings(
    scalaJSUseMainModuleInitializer := true
  )

lazy val lib = project
  .enablePlugins(ScalaJSPlugin, ScalablyTypedConverterGenSourcePlugin)
  .settings(
    stFlavour := Flavour.Slinky,
    stOutputPackage := "com.example"
  )
