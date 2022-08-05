import scala.sys.process.Process
import java.io.File

Process("bash -ci 'node --version'", new File(System.getProperty("user.dir"))).run()
