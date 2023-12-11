package web.typings.rcInput.components

import web.typings.rcInput.esInterfaceMod.InputProps
import web.typings.rcInput.esInterfaceMod.InputRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  @JSImport("rc-input/es/Input", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = InputProps with RefAttributes[InputRef]
  
  implicit def make(companion: Input.type): SharedBuilder_InputPropsRefAttributes498402693[InputRef] = new SharedBuilder_InputPropsRefAttributes498402693[InputRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InputProps with RefAttributes[InputRef]): SharedBuilder_InputPropsRefAttributes498402693[InputRef] = new SharedBuilder_InputPropsRefAttributes498402693[InputRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
