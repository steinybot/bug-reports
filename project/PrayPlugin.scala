import sbt._
import HammerPlugin.autoImport._

object PrayPlugin extends AutoPlugin {

  override def requires: Plugins = HammerPlugin

  override def buildSettings: Seq[Def.Setting[_]] = Seq(
    cantTouchThis in LocalProject("mc") := "This doesn't work either."
  )
}
