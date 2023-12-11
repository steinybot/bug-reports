package web.typings.antd.anon

import web.typings.antd.esInputNumberMod.InputNumberProps
import web.typings.rcComponentMiniDecimal.esInterfaceMod.ValueType
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayNameInternalPanelDoNotUseOrYouWillBeFired extends StObject {
  
  var _InternalPanelDoNotUseOrYouWillBeFired: ReactComponentClass[InputNumberProps[ValueType]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
}
object DisplayNameInternalPanelDoNotUseOrYouWillBeFired {
  
  @scala.inline
  def apply(_InternalPanelDoNotUseOrYouWillBeFired: ReactComponentClass[InputNumberProps[ValueType]]): DisplayNameInternalPanelDoNotUseOrYouWillBeFired = {
    val __obj = js.Dynamic.literal(_InternalPanelDoNotUseOrYouWillBeFired = _InternalPanelDoNotUseOrYouWillBeFired.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNameInternalPanelDoNotUseOrYouWillBeFired]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DisplayNameInternalPanelDoNotUseOrYouWillBeFired] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def set_InternalPanelDoNotUseOrYouWillBeFired(value: ReactComponentClass[InputNumberProps[ValueType]]): Self = StObject.set(x, "_InternalPanelDoNotUseOrYouWillBeFired", value.asInstanceOf[js.Any])
  }
}
