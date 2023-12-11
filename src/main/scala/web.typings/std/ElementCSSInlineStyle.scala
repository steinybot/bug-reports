package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementCSSInlineStyle extends StObject {
  
  /* standard dom */
  val style: org.scalajs.dom.CSSStyleDeclaration = js.native
}
object ElementCSSInlineStyle {
  
  @scala.inline
  def apply(style: org.scalajs.dom.CSSStyleDeclaration): ElementCSSInlineStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCSSInlineStyle]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ElementCSSInlineStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: org.scalajs.dom.CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
