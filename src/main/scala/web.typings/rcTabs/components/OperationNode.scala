package web.typings.rcTabs.components

import web.typings.StBuildingComponent
import web.typings.rcTabs.esInterfaceMod.EditableConfig
import web.typings.rcTabs.esInterfaceMod.Tab
import web.typings.rcTabs.esInterfaceMod.TabsLocale
import web.typings.rcTabs.esTabNavListOperationNodeMod.OperationNodeProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OperationNode {
  
  @scala.inline
  def apply(
    activeKey: String,
    id: String,
    mobile: Boolean,
    onTabClick: (String, SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element]) => Unit,
    prefixCls: String,
    rtl: Boolean,
    tabs: js.Array[Tab]
  ): Builder = {
    val __props = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], onTabClick = js.Any.fromFunction2(onTabClick), prefixCls = prefixCls.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OperationNodeProps with RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-tabs/es/TabNavList/OperationNode", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editable(value: EditableConfig): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def locale(value: TabsLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moreIcon(value: ReactElement): this.type = set("moreIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moreTransitionName(value: String): this.type = set("moreTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeAriaLabel(value: String): this.type = set("removeAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarGutter(value: Double): this.type = set("tabBarGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabMoving(value: Boolean): this.type = set("tabMoving", value.asInstanceOf[js.Any])
  }
  
  type Props = OperationNodeProps with RefAttributes[HTMLDivElement]
  
  def withProps(p: OperationNodeProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
