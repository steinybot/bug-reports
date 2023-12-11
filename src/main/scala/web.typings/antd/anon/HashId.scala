package web.typings.antd.anon

import web.typings.antd.antdStrings._empty
import web.typings.antd.antdStrings.error
import web.typings.antd.antdStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashId extends StObject {
  
  var hashId: js.UndefOr[String] = js.native
  
  var popupClassName: js.UndefOr[String] = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[_empty | error | warning] = js.native
}
object HashId {
  
  @scala.inline
  def apply(): HashId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashId]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: HashId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashIdUndefined: Self = StObject.set(x, "hashId", js.undefined)
    
    @scala.inline
    def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
    
    @scala.inline
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    @scala.inline
    def setStatus(value: _empty | error | warning): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
