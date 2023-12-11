package web.typings.antd.components

import web.typings.antd.esTagCheckableTagMod.CheckableTagProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckableTag {
  
  @scala.inline
  def apply(checked: Boolean): SharedBuilder_CheckableTagPropsRefAttributes_1849265448[HTMLSpanElement] = {
    val __props = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    new SharedBuilder_CheckableTagPropsRefAttributes_1849265448[HTMLSpanElement](js.Array(this.component, __props.asInstanceOf[CheckableTagProps with RefAttributes[HTMLSpanElement]]))
  }
  
  @JSImport("antd/es/tag/CheckableTag", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = CheckableTagProps with RefAttributes[HTMLSpanElement]
  
  def withProps(p: CheckableTagProps with RefAttributes[HTMLSpanElement]): SharedBuilder_CheckableTagPropsRefAttributes_1849265448[HTMLSpanElement] = new SharedBuilder_CheckableTagPropsRefAttributes_1849265448[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
