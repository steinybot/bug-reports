sourceDirectories := allSourceDirectories.value

lazy val allSourceDirectories = Def.setting {
  Def.unit(name.value)
  Seq.empty
}
