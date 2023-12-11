package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.CancelBtn
import web.typings.antd.anon.FooterPropsPickModalProps
import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import web.typings.antd.esModalInterfaceMod.ModalFooterRender
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Footer {
  
  @JSImport("antd/es/modal/shared", "Footer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def cancelButtonProps(value: ButtonProps): this.type = set("cancelButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelText(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def confirmLoading(value: Boolean): this.type = set("confirmLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: ModalFooterRender | ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerFunction2(value: (/* originNode */ ReactElement, /* extra */ CancelBtn) => ReactElement): this.type = set("footer", js.Any.fromFunction2(value))
    
    @scala.inline
    def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okButtonProps(value: ButtonProps): this.type = set("okButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okText(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okType(value: LegacyButtonType): this.type = set("okType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCancel(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): this.type = set("onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOk(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
  }
  
  type Props = FooterPropsPickModalProps
  
  implicit def make(companion: Footer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FooterPropsPickModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
