import sbt.Keys._
import sbt.plugins.SemanticdbPlugin
import sbt.{Def, _}

object Scala2PlantUMLPlugin extends AutoPlugin {

  object autoImport {
    val scala2PlantUML = inputKey[Unit]("Generates a PlantUML class diagram from a base symbol.")
  }

  import autoImport._

  val baseSettings = Seq(
    scala2PlantUML := (),
    scala2PlantUML / sourceDirectories := allSourceDirectories.value
  )

  override def projectSettings: Seq[Def.Setting[_]] =
    inConfig(Compile)(baseSettings)

  private def allSourceDirectories =
    Def.setting {
      val _ = configuration.value
      Seq.empty
    }
}
