package web.typings.rcDialog.components

import web.typings.StBuildingComponent
import web.typings.rcDialog.anon.X
import web.typings.rcDialog.esIdialogproptypesMod.ModalClassNames
import web.typings.rcDialog.esIdialogproptypesMod.ModalStyles
import web.typings.rcDialog.rcDialogBooleans.`false`
import web.typings.rcUtil.esPortalWrapperMod.GetContainer
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Ref
import web.typings.std.Record
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_IDialogPropTypes_1773458495 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def afterClose(value: () => Any): this.type = set("afterClose", js.Any.fromFunction0(value))
  
  @scala.inline
  def afterOpenChange(value: /* open */ Boolean => Unit): this.type = set("afterOpenChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def animation(value: Any): this.type = set("animation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def bodyProps(value: Any): this.type = set("bodyProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def bodyStyle(value: Record[String, Any]): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def classNames(value: ModalClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
  
  @scala.inline
  def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def closeIcon(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def destroyOnClose(value: Boolean): this.type = set("destroyOnClose", value.asInstanceOf[js.Any])
  
  @scala.inline
  def focusTriggerAfterClose(value: Boolean): this.type = set("focusTriggerAfterClose", value.asInstanceOf[js.Any])
  
  @scala.inline
  def footer(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
  
  @scala.inline
  def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getContainer(value: GetContainer | `false`): this.type = set("getContainer", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getContainerFunction0(value: () => HTMLElement): this.type = set("getContainer", js.Any.fromFunction0(value))
  
  @scala.inline
  def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  @scala.inline
  def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskAnimation(value: Any): this.type = set("maskAnimation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskProps(value: Any): this.type = set("maskProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskStyle(value: Record[String, Any]): this.type = set("maskStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskTransitionName(value: String): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def modalRender(value: /* node */ ReactElement => ReactElement): this.type = set("modalRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def mousePosition(value: X): this.type = set("mousePosition", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mousePositionNull: this.type = set("mousePosition", null)
  
  @scala.inline
  def onClose(value: /* e */ SyntheticEvent[Event, Element] => Any): this.type = set("onClose", js.Any.fromFunction1(value))
  
  @scala.inline
  def panelRef(value: Ref[HTMLDivElement]): this.type = set("panelRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def panelRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): this.type = set("panelRef", js.Any.fromFunction1(value))
  
  @scala.inline
  def panelRefNull: this.type = set("panelRef", null)
  
  @scala.inline
  def panelRefReactRef(value: ReactRef[HTMLDivElement]): this.type = set("panelRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def styles(value: ModalStyles): this.type = set("styles", value.asInstanceOf[js.Any])
  
  @scala.inline
  def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  
  @scala.inline
  def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  
  @scala.inline
  def wrapClassName(value: String): this.type = set("wrapClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def wrapProps(value: Any): this.type = set("wrapProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def wrapStyle(value: Record[String, Any]): this.type = set("wrapStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
}
