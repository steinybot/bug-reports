sourceDirectories := allSourceDirectories.value

lazy val allSourceDirectories: Def.Initialize[Seq[File]] = Def.setting {
  val c = configuration.value
  val _ = sourceDirectories.all(ScopeFilter(configurations = inConfigurations(c))).value
  Seq.empty
}
