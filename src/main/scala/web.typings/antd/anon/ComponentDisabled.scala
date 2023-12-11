package web.typings.antd.anon

import web.typings.antd.esConfigProviderDisabledContextMod.DisabledType
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDisabled extends StObject {
  
  var componentDisabled: DisabledType = js.native
  
  var componentSize: SizeType = js.native
}
object ComponentDisabled {
  
  @scala.inline
  def apply(): ComponentDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentDisabled]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ComponentDisabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentDisabled(value: DisabledType): Self = StObject.set(x, "componentDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentDisabledUndefined: Self = StObject.set(x, "componentDisabled", js.undefined)
    
    @scala.inline
    def setComponentSize(value: SizeType): Self = StObject.set(x, "componentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentSizeUndefined: Self = StObject.set(x, "componentSize", js.undefined)
  }
}
