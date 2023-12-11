package web.typings.rcTextarea.components

import web.typings.rcTextarea.anon.OmitHTMLTextareaPropsvaluAbout
import web.typings.rcTextarea.esInterfaceMod.TextAreaRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextArea {
  
  @JSImport("rc-textarea/es/TextArea", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = OmitHTMLTextareaPropsvaluAbout
  
  implicit def make(companion: TextArea.type): SharedBuilder_OmitHTMLTextareaPropsvaluAbout_1374936960[TextAreaRef] = new SharedBuilder_OmitHTMLTextareaPropsvaluAbout_1374936960[TextAreaRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OmitHTMLTextareaPropsvaluAbout): SharedBuilder_OmitHTMLTextareaPropsvaluAbout_1374936960[TextAreaRef] = new SharedBuilder_OmitHTMLTextareaPropsvaluAbout_1374936960[TextAreaRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
