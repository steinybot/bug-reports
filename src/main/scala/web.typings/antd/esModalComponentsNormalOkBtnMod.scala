package web.typings.antd

import web.typings.antd.antdBooleans.`true`
import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalComponentsNormalOkBtnMod extends Shortcut {
  
  @JSImport("antd/es/modal/components/NormalOkBtn", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Object] = js.native
  
  /* Inlined parent std.Pick<antd.antd/es/modal/interface.ModalProps, 'confirmLoading' | 'okType' | 'okButtonProps' | 'onOk'> */
  @js.native
  trait NormalOkBtnProps extends StObject {
    
    var confirmLoading: js.UndefOr[Boolean] = js.native
    
    var okButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var okTextLocale: js.UndefOr[String | Double | `true` | ReactElement | js.Iterable[ReactElement]] = js.native
    
    var okType: js.UndefOr[LegacyButtonType] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.native
  }
  object NormalOkBtnProps {
    
    @scala.inline
    def apply(): NormalOkBtnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalOkBtnProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NormalOkBtnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirmLoading(value: Boolean): Self = StObject.set(x, "confirmLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmLoadingUndefined: Self = StObject.set(x, "confirmLoading", js.undefined)
      
      @scala.inline
      def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      @scala.inline
      def setOkTextLocale(value: String | Double | `true` | ReactElement | js.Iterable[ReactElement]): Self = StObject.set(x, "okTextLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextLocaleReactElement(value: ReactElement): Self = StObject.set(x, "okTextLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextLocaleUndefined: Self = StObject.set(x, "okTextLocale", js.undefined)
      
      @scala.inline
      def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* e */ SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `esModalComponentsNormalOkBtnMod.foo` */
  override def _to: ReactComponentClass[js.Object] = default
}
