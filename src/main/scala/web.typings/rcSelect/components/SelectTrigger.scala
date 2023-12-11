package web.typings.rcSelect.components

import web.typings.StBuildingComponent
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.rcSelect.libInterfaceMod.Placement
import web.typings.rcSelect.libSelectTriggerMod.RefTriggerProps
import web.typings.rcSelect.libSelectTriggerMod.SelectTriggerProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectTrigger {
  
  @scala.inline
  def apply(
    direction: String,
    disabled: Boolean,
    dropdownAlign: AlignType,
    dropdownClassName: String,
    dropdownStyle: CSSProperties,
    empty: Boolean,
    getTriggerDOMNode: () => HTMLElement,
    onPopupMouseEnter: () => Unit,
    popupElement: ReactElement,
    prefixCls: String,
    visible: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropdownAlign = dropdownAlign.asInstanceOf[js.Any], dropdownClassName = dropdownClassName.asInstanceOf[js.Any], dropdownStyle = dropdownStyle.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], getTriggerDOMNode = js.Any.fromFunction0(getTriggerDOMNode), onPopupMouseEnter = js.Any.fromFunction0(onPopupMouseEnter), popupElement = popupElement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectTriggerProps with RefAttributes[RefTriggerProps]]))
  }
  
  @JSImport("rc-select/lib/SelectTrigger", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, RefTriggerProps] {
    
    @scala.inline
    def animation(value: String): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def builtinPlacements(value: BuildInPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownMatchSelectWidth(value: Boolean | Double): this.type = set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownRender(value: /* menu */ ReactElement => ReactElement): this.type = set("dropdownRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def getPopupContainer(value: /* props */ Any => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPopupVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onPopupVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  }
  
  type Props = SelectTriggerProps with RefAttributes[RefTriggerProps]
  
  def withProps(p: SelectTriggerProps with RefAttributes[RefTriggerProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
