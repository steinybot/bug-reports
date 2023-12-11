package web.typings.antd.components

import web.typings.antd.esTypographyTextMod.TextProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSImport("antd/es/typography/Text", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = TextProps with RefAttributes[HTMLSpanElement]
  
  implicit def make(companion: Text.type): SharedBuilder_TextPropsRefAttributes1061540711[HTMLSpanElement] = new SharedBuilder_TextPropsRefAttributes1061540711[HTMLSpanElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextProps with RefAttributes[HTMLSpanElement]): SharedBuilder_TextPropsRefAttributes1061540711[HTMLSpanElement] = new SharedBuilder_TextPropsRefAttributes1061540711[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
