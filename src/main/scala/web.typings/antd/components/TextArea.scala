package web.typings.antd.components

import web.typings.antd.esInputTextAreaMod.TextAreaProps
import web.typings.antd.esInputTextAreaMod.TextAreaRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextArea {
  
  @JSImport("antd/es/input/TextArea", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = TextAreaProps with RefAttributes[TextAreaRef]
  
  implicit def make(companion: TextArea.type): SharedBuilder_TextAreaPropsRefAttributes_1617326895[TextAreaRef] = new SharedBuilder_TextAreaPropsRefAttributes_1617326895[TextAreaRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextAreaProps with RefAttributes[TextAreaRef]): SharedBuilder_TextAreaPropsRefAttributes_1617326895[TextAreaRef] = new SharedBuilder_TextAreaPropsRefAttributes_1617326895[TextAreaRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
