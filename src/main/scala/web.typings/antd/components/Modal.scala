package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.CancelBtn
import web.typings.antd.antdBooleans.`false`
import web.typings.antd.antdStrings.wrapper
import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import web.typings.antd.esModalInterfaceMod.ModalFooterRender
import web.typings.antd.esModalInterfaceMod.ModalProps
import web.typings.antd.esModalInterfaceMod.MousePosition
import web.typings.antd.esModalInterfaceMod.getContainerFunc
import web.typings.rcDialog.esIdialogproptypesMod.ModalClassNames
import web.typings.rcDialog.esIdialogproptypesMod.ModalStyles
import web.typings.react.mod.CSSProperties
import web.typings.std.NonNullable
import web.typings.std.Omit
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  @JSImport("antd", "Modal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def afterClose(value: () => Unit): this.type = set("afterClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def afterOpenChange(value: /* open */ Boolean => Unit): this.type = set("afterOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelButtonProps(value: ButtonProps): this.type = set("cancelButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelText(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNames(value: Omit[NonNullable[js.UndefOr[ModalClassNames]], wrapper]): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIcon(value: Boolean | ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIconReactElement(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def confirmLoading(value: Boolean): this.type = set("confirmLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def destroyOnClose(value: Boolean): this.type = set("destroyOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusTriggerAfterClose(value: Boolean): this.type = set("focusTriggerAfterClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: ModalFooterRender | ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerFunction2(value: (/* originNode */ ReactElement, /* extra */ CancelBtn) => ReactElement): this.type = set("footer", js.Any.fromFunction2(value))
    
    @scala.inline
    def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainer(value: String | HTMLElement | getContainerFunc | `false`): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainerFunction0(value: () => HTMLElement): this.type = set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskStyle(value: CSSProperties): this.type = set("maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskTransitionName(value: String): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modalRender(value: /* node */ ReactElement => ReactElement): this.type = set("modalRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def mousePosition(value: MousePosition): this.type = set("mousePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mousePositionNull: this.type = set("mousePosition", null)
    
    @scala.inline
    def okButtonProps(value: ButtonProps): this.type = set("okButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okText(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okType(value: LegacyButtonType): this.type = set("okType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCancel(value: /* e */ SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOk(value: /* e */ SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: Omit[NonNullable[js.UndefOr[ModalStyles]], wrapper]): this.type = set("styles", value.asInstanceOf[js.Any])
    
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
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  type Props = ModalProps
  
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
