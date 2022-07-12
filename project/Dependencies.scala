import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt.Keys._
import sbt._

object Dependencies {

  implicit class ModuleIDOps(val id: ModuleID) extends AnyVal {

    def crossPlatform: Def.Initialize[ModuleID] =
      Def.setting(id.cross(platformDepsCrossVersion.value))
  }

  def deps = Seq(
    libraryDependencies ++= Seq.empty[ModuleID].map(_.crossPlatform.value)
  )
}
