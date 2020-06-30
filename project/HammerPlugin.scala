import sbt._

object HammerPlugin extends AutoPlugin {

  object autoImport {

    val cantTouchThis = settingKey[String]("Override this if you can.")
  }

  import autoImport._

  private val mcProject = Project("mc", file("."))
    .configure(p => p.in(file("target") / "dynamic-projects" / p.id))
    .settings(cantTouchThis := "Can't touch this!")

  override def extraProjects: Seq[Project] = Seq(mcProject)
}
