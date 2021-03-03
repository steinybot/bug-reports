sourceDirectories := allSourceDirectories.value

lazy val allSourceDirectories = Def.setting {
  val c = configuration.value
  val dirs = sourceDirectories.all(ScopeFilter(inDependencies(ThisProject), inConfigurations(c))).value
  val base = (ThisBuild / baseDirectory).value
  dirs.flatten.flatMap(_.relativeTo(base))
}
