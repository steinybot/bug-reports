lazy val scala2PlantUML = inputKey[String]("Generates a PlantUML class diagram from a base symbol.")

val baseSettings = Seq(
  scala2PlantUML := "foo",
  scala2PlantUML / sourceDirectories := allSourceDirectories.value
)

inConfig(Compile)(baseSettings)

def allSourceDirectories =
  Def.setting {
    val c = configuration.value
    val dirs = sourceDirectories.all(ScopeFilter(inDependencies(ThisProject), inConfigurations(c))).value
    val base = (ThisBuild / baseDirectory).value
    dirs.flatten.flatMap(_.relativeTo(base))
  }
