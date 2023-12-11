package web.typings.antd.anon

import web.typings.antd.esThemeInterfaceMod.GlobalToken
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName extends StObject {
  
  var className: String = js.native
  
  var component: js.UndefOr[String] = js.native
  
  var event: MouseEvent = js.native
  
  var hashId: String = js.native
  
  var token: GlobalToken = js.native
}
object ClassName {
  
  @scala.inline
  def apply(className: String, event: MouseEvent, hashId: String, token: GlobalToken): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], hashId = hashId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: GlobalToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
