scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true
scalaJSLinkerConfig ~= { _.withPrettyPrint(true) }
