import sbt.Keys._
import sbt.plugins.SemanticdbPlugin
import sbt.{Def, _}

object Scala2PlantUMLPlugin extends AutoPlugin {

  override def trigger  = allRequirements
  override def requires = SemanticdbPlugin

  object autoImport {
    val scala2PlantUML = inputKey[Unit]("Generates a PlantUML class diagram from a base symbol.")
  }

  import autoImport._

  val baseSettings = Seq(
    scala2PlantUML := (),
    scala2PlantUML / sourceDirectories := allSourceDirectories.value
  )

  override def projectSettings: Seq[Def.Setting[_]] =
    inConfig(Compile)(baseSettings) ++
      inConfig(Test)(baseSettings)

  private def allSourceDirectories =
    Def.setting {
      val c = configuration.value
      val dirs = sourceDirectories.all(ScopeFilter(inDependencies(ThisProject), inConfigurations(c))).value
      val base = (ThisBuild / baseDirectory).value
      dirs.flatten.flatMap(_.relativeTo(base))
    }
}
