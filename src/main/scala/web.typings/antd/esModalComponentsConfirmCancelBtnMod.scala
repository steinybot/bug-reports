package web.typings.antd

import web.typings.antd.antdBooleans.`false`
import web.typings.antd.antdBooleans.`true`
import web.typings.antd.antdStrings.cancel
import web.typings.antd.antdStrings.ok
import web.typings.antd.esButtonButtonMod.ButtonProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalComponentsConfirmCancelBtnMod extends Shortcut {
  
  @JSImport("antd/es/modal/components/ConfirmCancelBtn", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Object] = js.native
  
  /* Inlined parent std.Pick<antd.antd/es/modal/ConfirmDialog.ConfirmDialogProps, 'cancelButtonProps' | 'isSilent' | 'rootPrefixCls' | 'close' | 'onConfirm' | 'onCancel'> */
  @js.native
  trait ConfirmCancelBtnProps extends StObject {
    
    var autoFocusButton: js.UndefOr[`false` | ok | cancel | Null] = js.native
    
    var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var cancelTextLocale: js.UndefOr[String | Double | `true` | ReactElement | js.Iterable[ReactElement]] = js.native
    
    var close: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    var isSilent: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var mergedOkCancel: js.UndefOr[Boolean] = js.native
    
    var onCancel: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.native
    
    var onConfirm: js.UndefOr[js.Function1[/* confirmed */ Boolean, Unit]] = js.native
    
    var rootPrefixCls: js.UndefOr[String] = js.native
  }
  object ConfirmCancelBtnProps {
    
    @scala.inline
    def apply(): ConfirmCancelBtnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmCancelBtnProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ConfirmCancelBtnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocusButton(value: `false` | ok | cancel): Self = StObject.set(x, "autoFocusButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusButtonNull: Self = StObject.set(x, "autoFocusButton", null)
      
      @scala.inline
      def setAutoFocusButtonUndefined: Self = StObject.set(x, "autoFocusButton", js.undefined)
      
      @scala.inline
      def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      @scala.inline
      def setCancelTextLocale(value: String | Double | `true` | ReactElement | js.Iterable[ReactElement]): Self = StObject.set(x, "cancelTextLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextLocaleReactElement(value: ReactElement): Self = StObject.set(x, "cancelTextLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextLocaleUndefined: Self = StObject.set(x, "cancelTextLocale", js.undefined)
      
      @scala.inline
      def setClose(value: /* repeated */ Any => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setIsSilent(value: () => Boolean): Self = StObject.set(x, "isSilent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSilentUndefined: Self = StObject.set(x, "isSilent", js.undefined)
      
      @scala.inline
      def setMergedOkCancel(value: Boolean): Self = StObject.set(x, "mergedOkCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergedOkCancelUndefined: Self = StObject.set(x, "mergedOkCancel", js.undefined)
      
      @scala.inline
      def setOnCancel(value: /* repeated */ Any => Any): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: /* confirmed */ Boolean => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      @scala.inline
      def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPrefixClsUndefined: Self = StObject.set(x, "rootPrefixCls", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `esModalComponentsConfirmCancelBtnMod.foo` */
  override def _to: ReactComponentClass[js.Object] = default
}
