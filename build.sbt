import org.scalajs.jsenv.Input

scalaVersion := "2.13.8"

enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true

Compile / jsEnvInput := {
  val foo = Input.Script(((Compile / sourceDirectory).value / "js" / "foo.js").toPath)
  foo +: (Compile / jsEnvInput).value
}
