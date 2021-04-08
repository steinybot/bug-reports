import scala.util.{Success, Try}

TaskKey[Unit]("runIt") := {
  (Compile / run / runner).value.run("foo", Seq.empty, Seq.empty, state.value.log)
}

Compile / run / runner := new Run(_ => getClass.getClassLoader, false) {

  override def run(mainClass: String, classpath: Seq[File], options: Seq[String], log: Logger): Try[Unit] = {
    println("Gotcha!")
    Success(())
  }
}

configs(IntegrationTest)
Defaults.itSettings
