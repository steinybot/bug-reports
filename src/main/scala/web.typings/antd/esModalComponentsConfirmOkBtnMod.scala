package web.typings.antd

import web.typings.antd.antdBooleans.`false`
import web.typings.antd.antdBooleans.`true`
import web.typings.antd.antdStrings.cancel
import web.typings.antd.antdStrings.ok
import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalComponentsConfirmOkBtnMod extends Shortcut {
  
  @JSImport("antd/es/modal/components/ConfirmOkBtn", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Object] = js.native
  
  /* Inlined parent std.Pick<antd.antd/es/modal/ConfirmDialog.ConfirmDialogProps, 'close' | 'isSilent' | 'okType' | 'okButtonProps' | 'rootPrefixCls' | 'onConfirm' | 'onOk'> */
  @js.native
  trait ConfirmOkBtnProps extends StObject {
    
    var autoFocusButton: js.UndefOr[`false` | ok | cancel | Null] = js.native
    
    var close: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    var isSilent: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var okButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var okTextLocale: js.UndefOr[String | Double | `true` | ReactElement | js.Iterable[ReactElement]] = js.native
    
    var okType: js.UndefOr[LegacyButtonType] = js.native
    
    var onConfirm: js.UndefOr[js.Function1[/* confirmed */ Boolean, Unit]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.native
    
    var rootPrefixCls: js.UndefOr[String] = js.native
  }
  object ConfirmOkBtnProps {
    
    @scala.inline
    def apply(): ConfirmOkBtnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmOkBtnProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ConfirmOkBtnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocusButton(value: `false` | ok | cancel): Self = StObject.set(x, "autoFocusButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusButtonNull: Self = StObject.set(x, "autoFocusButton", null)
      
      @scala.inline
      def setAutoFocusButtonUndefined: Self = StObject.set(x, "autoFocusButton", js.undefined)
      
      @scala.inline
      def setClose(value: /* repeated */ Any => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setIsSilent(value: () => Boolean): Self = StObject.set(x, "isSilent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSilentUndefined: Self = StObject.set(x, "isSilent", js.undefined)
      
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
      def setOnConfirm(value: /* confirmed */ Boolean => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* repeated */ Any => Any): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPrefixClsUndefined: Self = StObject.set(x, "rootPrefixCls", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `esModalComponentsConfirmOkBtnMod.foo` */
  override def _to: ReactComponentClass[js.Object] = default
}
