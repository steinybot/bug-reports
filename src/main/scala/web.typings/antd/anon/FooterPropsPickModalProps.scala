package web.typings.antd.anon

import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import web.typings.antd.esModalInterfaceMod.ModalFooterRender
import web.typings.react.mod.MouseEventHandler
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/es/modal/shared.FooterProps & std.Pick<antd.antd/es/modal/interface.ModalProps, 'footer' | 'okText' | 'okType' | 'cancelText' | 'confirmLoading' | 'okButtonProps' | 'cancelButtonProps'> */
@js.native
trait FooterPropsPickModalProps extends StObject {
  
  var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
  
  var cancelText: js.UndefOr[ReactElement] = js.native
  
  var confirmLoading: js.UndefOr[Boolean] = js.native
  
  var footer: js.UndefOr[ModalFooterRender | ReactElement] = js.native
  
  var okButtonProps: js.UndefOr[ButtonProps] = js.native
  
  var okText: js.UndefOr[ReactElement] = js.native
  
  var okType: js.UndefOr[LegacyButtonType] = js.native
  
  var onCancel: js.UndefOr[MouseEventHandler[HTMLButtonElement | HTMLAnchorElement]] = js.native
  
  var onOk: js.UndefOr[MouseEventHandler[HTMLButtonElement | HTMLAnchorElement]] = js.native
}
object FooterPropsPickModalProps {
  
  @scala.inline
  def apply(): FooterPropsPickModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterPropsPickModalProps]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FooterPropsPickModalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
    
    @scala.inline
    def setCancelText(value: ReactElement): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    @scala.inline
    def setConfirmLoading(value: Boolean): Self = StObject.set(x, "confirmLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmLoadingUndefined: Self = StObject.set(x, "confirmLoading", js.undefined)
    
    @scala.inline
    def setFooter(value: ModalFooterRender | ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterFunction2(value: (/* originNode */ ReactElement, /* extra */ CancelBtn) => ReactElement): Self = StObject.set(x, "footer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFooterReactElement(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
    
    @scala.inline
    def setOkText(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
    
    @scala.inline
    def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
    
    @scala.inline
    def setOnCancel(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => scala.Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    @scala.inline
    def setOnOk(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => scala.Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
  }
}
