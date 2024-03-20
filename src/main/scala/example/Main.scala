package example

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait TitleHandle extends js.Object {
  def title(): UndefOr[String]
}

object Page {
  val title: UndefOr[String] = "File a claim"

  def handle: Any = {
    // Inlining this fixes the problem.
    val routeTitle = title
    val handle = new TitleHandle {
      override def title(): UndefOr[String] = routeTitle
    }
    // This causes the private symbols to be lost. It is a js.Object though so JavaScript semantics should apply.
    js.Object.assign(js.Object(), handle)
  }
}

object Main extends App {

  //  val titleHandle = new TitleHandle {
  //    override def title(m: UIMatch[Any, Any]): UndefOr[String] = "My Title"
  //  }
  //  val freshchatHandle = FreshchatHandle(js.Array("claims-page"))
  //  val combination =  combineObjects[js.Object, FreshchatHandle](titleHandle.asInstanceOf[js.Object], freshchatHandle)
  //  TitleHandle.fromAny(combination).foreach(h => println(h.title(null)))

  val handle = Page.handle
  val titleHandle = handle.asInstanceOf[TitleHandle]
  println(titleHandle.title())
}
