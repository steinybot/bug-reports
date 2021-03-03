scalaVersion := "2.13.1"

lazy val foo = inputKey[String]("Foo")

lazy val baseSettings = Seq(
  sourceDirectories := allSourceDirectories.value
)

lazy val allSourceDirectories = Def.setting {
  val _ = configuration.value
  Seq.empty
}

inConfig(Compile)(baseSettings)
