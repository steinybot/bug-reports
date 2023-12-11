package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.Source
import web.typings.antd.antdStrings.click
import web.typings.antd.antdStrings.contextMenu
import web.typings.antd.antdStrings.hover
import web.typings.antd.esDropdownDropdownMod.DropdownArrowOptions
import web.typings.antd.esDropdownDropdownMod.OverlayFunc
import web.typings.antd.esMenuMenuMod.MenuProps
import web.typings.antd.esUtilPlacementsMod.AdjustOverflow
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_DropdownProps_1577630435 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
  
  @scala.inline
  def arrow(value: Boolean | DropdownArrowOptions): this.type = set("arrow", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoAdjustOverflow(value: Boolean | AdjustOverflow): this.type = set("autoAdjustOverflow", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def destroyPopupOnHide(value: Boolean): this.type = set("destroyPopupOnHide", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dropdownRender(value: /* originNode */ ReactElement => ReactElement): this.type = set("dropdownRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  
  @scala.inline
  def menu(value: MenuProps): this.type = set("menu", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onOpenChange(value: (/* open */ Boolean, /* info */ Source) => Unit): this.type = set("onOpenChange", js.Any.fromFunction2(value))
  
  @scala.inline
  def onVisibleChange(value: /* open */ Boolean => Unit): this.type = set("onVisibleChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  @scala.inline
  def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlay(value: ReactElement | OverlayFunc): this.type = set("overlay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayFunction0(value: () => ReactElement): this.type = set("overlay", js.Any.fromFunction0(value))
  
  @scala.inline
  def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def placement(value: web.typings.antd.esDropdownDropdownMod.Placement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def trigger(value: js.Array[click | hover | contextMenu]): this.type = set("trigger", value.asInstanceOf[js.Any])
  
  @scala.inline
  def triggerVarargs(value: (click | hover | contextMenu)*): this.type = set("trigger", js.Array(value :_*))
  
  @scala.inline
  def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}
