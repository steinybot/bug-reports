scalaVersion := "2.13.1"

sourceDirectories := allSourceDirectories.value

lazy val allSourceDirectories = Def.setting {
  val _ = configuration.value
  Seq.empty
}
