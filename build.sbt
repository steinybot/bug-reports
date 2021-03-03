sourceDirectories := allSourceDirectories.value

lazy val allSourceDirectories: Def.Initialize[Seq[File]] = Def.setting {
  val c = configuration.value
  val dirs = sourceDirectories.all(ScopeFilter(inDependencies(ThisProject), inConfigurations(c))).value
  Seq.empty
}
