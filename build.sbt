import org.scalajs.linker.interface.ModuleSplitStyle

enablePlugins(ScalaJSPlugin)

scalaVersion := "2.13.13"

scalacOptions += "-Ymacro-annotations"

scalaJSUseMainModuleInitializer := true

// Configure Scala.js to emit modules in the optimal way to connect to Vite's incremental reload.
// - emit ECMAScript modules
// - emit as many small modules as possible for classes in the "livechart" package
// - emit as few (large) modules as possible for all other classes (in particular, for the standard library)
scalaJSLinkerConfig ~= {
  _.withModuleKind(ModuleKind.ESModule)
    .withModuleSplitStyle(
      ModuleSplitStyle.SmallModulesFor(List("example")))
}

libraryDependencies ++= Seq(
  "me.shadaj" %%% "slinky-core" % "0.7.4",
  "org.scala-js" %%% "scalajs-dom" % "2.4.0"
)