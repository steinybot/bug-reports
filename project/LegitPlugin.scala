import HammerPlugin.autoImport._
import sbt._

object LegitPlugin extends AutoPlugin {

  override def trigger = allRequirements

  override def projectSettings: Seq[Def.Setting[_]] = Seq(
    cantTouchThis := "Time to quit."
  )
}
