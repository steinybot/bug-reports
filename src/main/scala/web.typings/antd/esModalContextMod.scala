package web.typings.antd

import web.typings.antd.antdBooleans.`false`
import web.typings.antd.antdStrings.cancel
import web.typings.antd.antdStrings.ok
import web.typings.antd.esModalComponentsNormalCancelBtnMod.NormalCancelBtnProps
import web.typings.antd.esModalComponentsNormalOkBtnMod.NormalOkBtnProps
import web.typings.react.mod.Context
import web.typings.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalContextMod {
  
  @JSImport("antd/es/modal/context", "ModalContext")
  @js.native
  val ModalContext: Context[ModalContextProps] = js.native
  
  @JSImport("antd/es/modal/context", "ModalContextProvider")
  @js.native
  val ModalContextProvider: Provider[ModalContextProps] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `web.typings`.antd.esModalComponentsConfirmCancelBtnMod.ConfirmCancelBtnProps because var conflicts: autoFocusButton, cancelButtonProps, cancelTextLocale, close, isSilent, onCancel, onConfirm, rootPrefixCls. Inlined mergedOkCancel
  - `web.typings`.antd.esModalComponentsConfirmOkBtnMod.ConfirmOkBtnProps because var conflicts: okButtonProps, okTextLocale, okType, onOk. Inlined autoFocusButton, onConfirm, isSilent, rootPrefixCls, close */ @js.native
  trait ModalContextProps
    extends StObject
       with NormalCancelBtnProps
       with NormalOkBtnProps {
    
    var autoFocusButton: js.UndefOr[`false` | ok | cancel | Null] = js.native
    
    var close: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    var isSilent: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var mergedOkCancel: js.UndefOr[Boolean] = js.native
    
    var onConfirm: js.UndefOr[js.Function1[/* confirmed */ Boolean, Unit]] = js.native
    
    var rootPrefixCls: js.UndefOr[String] = js.native
  }
  object ModalContextProps {
    
    @scala.inline
    def apply(): ModalContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ModalContextProps] (val x: Self) extends AnyVal {
      
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
      def setMergedOkCancel(value: Boolean): Self = StObject.set(x, "mergedOkCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergedOkCancelUndefined: Self = StObject.set(x, "mergedOkCancel", js.undefined)
      
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
}
