package web.typings.antd.anon

import web.typings.rcSelect.libOptionMod.OptionFC
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayName extends StObject {
  
  var Option: OptionFC = js.native
  
  var _InternalPanelDoNotUseOrYouWillBeFired: js.Function1[/* props */ Any, Element] = js.native
  
  var displayName: js.UndefOr[String] = js.native
}
object DisplayName {
  
  @scala.inline
  def apply(Option: OptionFC, _InternalPanelDoNotUseOrYouWillBeFired: /* props */ Any => Element): DisplayName = {
    val __obj = js.Dynamic.literal(Option = Option.asInstanceOf[js.Any], _InternalPanelDoNotUseOrYouWillBeFired = js.Any.fromFunction1(_InternalPanelDoNotUseOrYouWillBeFired))
    __obj.asInstanceOf[DisplayName]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setOption(value: OptionFC): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_InternalPanelDoNotUseOrYouWillBeFired(value: /* props */ Any => Element): Self = StObject.set(x, "_InternalPanelDoNotUseOrYouWillBeFired", js.Any.fromFunction1(value))
  }
}
