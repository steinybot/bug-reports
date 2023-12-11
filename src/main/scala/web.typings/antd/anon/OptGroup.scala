package web.typings.antd.anon

import web.typings.rcSelect.libOptGroupMod.OptionGroupFC
import web.typings.rcSelect.libOptionMod.OptionFC
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptGroup extends StObject {
  
  var OptGroup: OptionGroupFC = js.native
  
  var Option: OptionFC = js.native
  
  var SECRET_COMBOBOX_MODE_DO_NOT_USE: String = js.native
  
  var _InternalPanelDoNotUseOrYouWillBeFired: js.Function1[/* props */ Any, Element] = js.native
  
  var displayName: js.UndefOr[String] = js.native
}
object OptGroup {
  
  @scala.inline
  def apply(
    OptGroup: OptionGroupFC,
    Option: OptionFC,
    SECRET_COMBOBOX_MODE_DO_NOT_USE: String,
    _InternalPanelDoNotUseOrYouWillBeFired: /* props */ Any => Element
  ): OptGroup = {
    val __obj = js.Dynamic.literal(OptGroup = OptGroup.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], SECRET_COMBOBOX_MODE_DO_NOT_USE = SECRET_COMBOBOX_MODE_DO_NOT_USE.asInstanceOf[js.Any], _InternalPanelDoNotUseOrYouWillBeFired = js.Any.fromFunction1(_InternalPanelDoNotUseOrYouWillBeFired))
    __obj.asInstanceOf[OptGroup]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OptGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setOptGroup(value: OptionGroupFC): Self = StObject.set(x, "OptGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOption(value: OptionFC): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSECRET_COMBOBOX_MODE_DO_NOT_USE(value: String): Self = StObject.set(x, "SECRET_COMBOBOX_MODE_DO_NOT_USE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_InternalPanelDoNotUseOrYouWillBeFired(value: /* props */ Any => Element): Self = StObject.set(x, "_InternalPanelDoNotUseOrYouWillBeFired", js.Any.fromFunction1(value))
  }
}
