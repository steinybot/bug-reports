package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.Items
import web.typings.antd.antdStrings.items
import web.typings.antd.esBreadcrumbBreadcrumbItemMod.MenuType
import web.typings.antd.esDropdownDropdownMod.DropdownProps
import web.typings.antd.esDropdownDropdownMod.OverlayFunc
import web.typings.std.Omit
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.span.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_BreadcrumbItemProps21342310 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dropdownProps(value: DropdownProps): this.type = set("dropdownProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
  
  @scala.inline
  def menu(value: (Omit[MenuType, items]) with Items): this.type = set("menu", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: SyntheticMouseEvent[HTMLAnchorElement | HTMLSpanElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def overlay(value: ReactElement | OverlayFunc): this.type = set("overlay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayFunction0(value: () => ReactElement): this.type = set("overlay", js.Any.fromFunction0(value))
  
  @scala.inline
  def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def separator(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
}
