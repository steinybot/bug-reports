package web.typings.antd.anon

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemCSSProperties extends StObject {
  
  var item: CSSProperties = js.native
}
object ItemCSSProperties {
  
  @scala.inline
  def apply(item: CSSProperties): ItemCSSProperties = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCSSProperties]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ItemCSSProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: CSSProperties): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
