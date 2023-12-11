package web.typings.react.mod

import web.typings.react.reactStrings._empty
import web.typings.react.reactStrings.`use-credentials`
import web.typings.react.reactStrings.anonymous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var async: js.UndefOr[Boolean] = js.native
  
  /** @deprecated */
  var charSet: js.UndefOr[String] = js.native
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
  
  var defer: js.UndefOr[Boolean] = js.native
  
  var integrity: js.UndefOr[String] = js.native
  
  var noModule: js.UndefOr[Boolean] = js.native
  
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ScriptHTMLAttributes {
  
  @scala.inline
  def apply[T](): ScriptHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ScriptHTMLAttributes[_], T] (val x: Self with ScriptHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    @scala.inline
    def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    @scala.inline
    def setNoModule(value: Boolean): Self = StObject.set(x, "noModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoModuleUndefined: Self = StObject.set(x, "noModule", js.undefined)
    
    @scala.inline
    def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
