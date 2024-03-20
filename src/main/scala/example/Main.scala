package example

import scala.scalajs.js

object Main extends App {

  trait Config extends js.Object {
    def title(): String
  }

  val config = {
    // Inlining this fixes the problem.
    // Moving it out of the current block scope also fixes the problem.
    // It is getting stored as a private symbol on the config object.
    val routeTitle = "My page"
    val config = new Config {
      override def title(): String = routeTitle
    }
    // This causes the private symbols to be lost.
    // It is a js.Object though so JavaScript semantics should apply.
    js.Object.assign(js.Object(), config).asInstanceOf[Config]
  }

  println(config.title())
}
