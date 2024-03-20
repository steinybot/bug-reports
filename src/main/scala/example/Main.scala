package example

import scala.scalajs.js

trait TitleHandle extends js.Object {
  def title(): String
}

object Main extends App {

  val handle = {
    // Inlining this fixes the problem.
    // Moving it out of the current block scope also fixes the problem.
    val routeTitle = "My page"
    val handle = new TitleHandle {
      override def title(): String = routeTitle
    }
    // This causes the private symbols to be lost. It is a js.Object though so JavaScript semantics should apply.
    js.Object.assign(js.Object(), handle).asInstanceOf[TitleHandle]
  }

  println(handle.title())
}
