package web.typings.antd.anon

import web.typings.antd.antdStrings.SHOW_CHILD
import web.typings.antd.esCascaderPanelMod.CascaderPanelProps
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalPanelDoNotUseOrYouWillBeFired extends StObject {
  
  var Panel: js.Function1[/* props */ CascaderPanelProps, ReactElement] = js.native
  
  var SHOW_CHILD: web.typings.antd.antdStrings.SHOW_CHILD = js.native
  
  var SHOW_PARENT: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SHOW_PARENT */ Any = js.native
  
  var _InternalPanelDoNotUseOrYouWillBeFired: js.Function1[/* props */ Any, Element] = js.native
  
  var displayName: String = js.native
}
object InternalPanelDoNotUseOrYouWillBeFired {
  
  @scala.inline
  def apply(
    Panel: /* props */ CascaderPanelProps => ReactElement,
    SHOW_PARENT: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SHOW_PARENT */ Any,
    _InternalPanelDoNotUseOrYouWillBeFired: /* props */ Any => Element,
    displayName: String
  ): InternalPanelDoNotUseOrYouWillBeFired = {
    val __obj = js.Dynamic.literal(Panel = js.Any.fromFunction1(Panel), SHOW_CHILD = "SHOW_CHILD", SHOW_PARENT = SHOW_PARENT.asInstanceOf[js.Any], _InternalPanelDoNotUseOrYouWillBeFired = js.Any.fromFunction1(_InternalPanelDoNotUseOrYouWillBeFired), displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalPanelDoNotUseOrYouWillBeFired]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: InternalPanelDoNotUseOrYouWillBeFired] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanel(value: /* props */ CascaderPanelProps => ReactElement): Self = StObject.set(x, "Panel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSHOW_CHILD(value: SHOW_CHILD): Self = StObject.set(x, "SHOW_CHILD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHOW_PARENT(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SHOW_PARENT */ Any): Self = StObject.set(x, "SHOW_PARENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_InternalPanelDoNotUseOrYouWillBeFired(value: /* props */ Any => Element): Self = StObject.set(x, "_InternalPanelDoNotUseOrYouWillBeFired", js.Any.fromFunction1(value))
  }
}
