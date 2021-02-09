package tutorial.webapp

import org.scalajs.dom
import org.scalajs.dom.document
import scalatags.JsDom.all._

object TutorialApp {
  def main(args: Array[String]): Unit = {
    appendPar(document.body, "Hello World")
  }
  def appendPar(targetNode: dom.Node, text: String): Unit = {
    targetNode.appendChild(p(cls := "", text).render)
  }
}
