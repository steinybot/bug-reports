package hello.world

import org.scalajs.dom.console
import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Hooks.{useEffect, useState}
import slinky.web.html._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("resources/App.css", JSImport.Default)
@js.native
object AppCSS extends js.Object

@JSImport("resources/logo.svg", JSImport.Default)
@js.native
object ReactLogo extends js.Object

@react object App {
  type Props = Unit

  private val css = AppCSS

  val component = FunctionalComponent[Props] { _ =>
    console.log("Rendering")
    val (count, setCount) = useState(0)
    useEffect(() => {
      console.log("Count changed")
    }, List(count))
    useEffect(() => {
      console.log("setCount changed")
    }, List(setCount))
    div(className:="App")(
      p(s"Count: $count"),
      button(onClick:=(() => setCount(c => c + 1)))("Increment")
    )
  }
}
