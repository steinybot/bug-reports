package web.typings.rcDrawer.components

import web.typings.StBuildingComponent
import web.typings.rcComponentPortal.esPortalMod.ContainerType
import web.typings.rcComponentPortal.esPortalMod.GetContainer
import web.typings.rcDrawer.esDrawerPopupMod.Placement
import web.typings.rcDrawer.esDrawerPopupMod.PushConfig
import web.typings.rcDrawer.esInterMod.DrawerClassNames
import web.typings.rcDrawer.esInterMod.DrawerStyles
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Ref
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_DrawerProps2040562614 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def afterOpenChange(value: /* open */ Boolean => Unit): this.type = set("afterOpenChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def classNames(value: DrawerClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentWrapperStyle(value: CSSProperties): this.type = set("contentWrapperStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def destroyOnClose(value: Boolean): this.type = set("destroyOnClose", value.asInstanceOf[js.Any])
  
  @scala.inline
  def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getContainer(value: GetContainer): this.type = set("getContainer", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getContainerFunction0(value: () => ContainerType): this.type = set("getContainer", js.Any.fromFunction0(value))
  
  @scala.inline
  def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
  
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  @scala.inline
  def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskClassName(value: String): this.type = set("maskClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskMotion(value: CSSMotionProps): this.type = set("maskMotion", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskStyle(value: CSSProperties): this.type = set("maskStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def motion(value: CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])): this.type = set("motion", value.asInstanceOf[js.Any])
  
  @scala.inline
  def motionFunction1(value: /* placement */ Placement => CSSMotionProps): this.type = set("motion", js.Any.fromFunction1(value))
  
  @scala.inline
  def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onClose(value: /* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
  
  @scala.inline
  def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  @scala.inline
  def panelRef(value: Ref[HTMLDivElement]): this.type = set("panelRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def panelRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): this.type = set("panelRef", js.Any.fromFunction1(value))
  
  @scala.inline
  def panelRefNull: this.type = set("panelRef", null)
  
  @scala.inline
  def panelRefReactRef(value: ReactRef[HTMLDivElement]): this.type = set("panelRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def push(value: Boolean | PushConfig): this.type = set("push", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootStyle(value: CSSProperties): this.type = set("rootStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def styles(value: DrawerStyles): this.type = set("styles", value.asInstanceOf[js.Any])
  
  @scala.inline
  def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  
  @scala.inline
  def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
}
