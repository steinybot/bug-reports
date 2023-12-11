package web.typings.antd.anon

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconCSSProperties extends StObject {
  
  var icon: CSSProperties = js.native
}
object IconCSSProperties {
  
  @scala.inline
  def apply(icon: CSSProperties): IconCSSProperties = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconCSSProperties]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: IconCSSProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: CSSProperties): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
