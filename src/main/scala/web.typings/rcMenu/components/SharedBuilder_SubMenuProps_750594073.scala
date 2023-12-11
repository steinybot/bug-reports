package web.typings.rcMenu.components

import web.typings.StBuildingComponent
import web.typings.rcMenu.anon.DomEvent
import web.typings.rcMenu.esInterfaceMod.MenuInfo
import web.typings.rcMenu.esInterfaceMod.MenuTitleInfo
import web.typings.rcMenu.esInterfaceMod.RenderIconInfo
import web.typings.rcMenu.esInterfaceMod.RenderIconType
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_SubMenuProps_750594073 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def eventKey(value: String): this.type = set("eventKey", value.asInstanceOf[js.Any])
  
  @scala.inline
  def expandIcon(value: RenderIconType): this.type = set("expandIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def expandIconFunction1(value: /* props */ RenderIconInfo => ReactElement): this.type = set("expandIcon", js.Any.fromFunction1(value))
  
  @scala.inline
  def expandIconReactElement(value: ReactElement): this.type = set("expandIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def internalPopupClose(value: Boolean): this.type = set("internalPopupClose", value.asInstanceOf[js.Any])
  
  @scala.inline
  def itemIcon(value: RenderIconType): this.type = set("itemIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def itemIconFunction1(value: /* props */ RenderIconInfo => ReactElement): this.type = set("itemIcon", js.Any.fromFunction1(value))
  
  @scala.inline
  def itemIconReactElement(value: ReactElement): this.type = set("itemIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: /* info */ MenuInfo => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseEnter(value: /* info */ DomEvent => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: /* info */ DomEvent => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTitleClick(value: /* info */ MenuTitleInfo => Unit): this.type = set("onTitleClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTitleMouseEnter(value: /* info */ DomEvent => Unit): this.type = set("onTitleMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTitleMouseLeave(value: /* info */ DomEvent => Unit): this.type = set("onTitleMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def popupOffset(value: js.Array[Double]): this.type = set("popupOffset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def popupOffsetVarargs(value: Double*): this.type = set("popupOffset", js.Array(value :_*))
  
  @scala.inline
  def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def warnKey(value: Boolean): this.type = set("warnKey", value.asInstanceOf[js.Any])
}
