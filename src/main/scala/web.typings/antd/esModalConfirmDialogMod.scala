package web.typings.antd

import web.typings.antd.anon.ConfirmDialogPropsconfirm
import web.typings.antd.esConfigProviderContextMod.ThemeConfig
import web.typings.antd.esModalInterfaceMod.ModalFuncProps
import web.typings.antd.esModalInterfaceMod.ModalLocale
import web.typings.react.mod.JSX.Element
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalConfirmDialogMod {
  
  @JSImport("antd/es/modal/ConfirmDialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/es/modal/ConfirmDialog", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ConfirmDialogProps] = js.native
  
  @scala.inline
  def ConfirmContent(props: ConfirmDialogPropsconfirm): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ConfirmContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait ConfirmDialogProps
    extends StObject
       with ModalFuncProps {
    
    var close: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.native
    
    var iconPrefixCls: js.UndefOr[String] = js.native
    
    /**
      * Do not throw if is await mode
      */
    var isSilent: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** @private Internal Usage. Do not override this */
    var locale: js.UndefOr[ModalLocale] = js.native
    
    /**
      * `close` prop support `...args` that pass to the developer
      * that we can not break this.
      * Provider `onClose` for internal usage
      */
    var onConfirm: js.UndefOr[js.Function1[/* confirmed */ Boolean, Unit]] = js.native
    
    @JSName("prefixCls")
    var prefixCls_ConfirmDialogProps: String = js.native
    
    var rootPrefixCls: js.UndefOr[String] = js.native
    
    /**
      * Only passed by static method
      */
    var theme: js.UndefOr[ThemeConfig] = js.native
  }
  object ConfirmDialogProps {
    
    @scala.inline
    def apply(prefixCls: String): ConfirmDialogProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmDialogProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ConfirmDialogProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: /* repeated */ Any => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setIconPrefixCls(value: String): Self = StObject.set(x, "iconPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPrefixClsUndefined: Self = StObject.set(x, "iconPrefixCls", js.undefined)
      
      @scala.inline
      def setIsSilent(value: () => Boolean): Self = StObject.set(x, "isSilent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSilentUndefined: Self = StObject.set(x, "isSilent", js.undefined)
      
      @scala.inline
      def setLocale(value: ModalLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: /* confirmed */ Boolean => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPrefixClsUndefined: Self = StObject.set(x, "rootPrefixCls", js.undefined)
      
      @scala.inline
      def setTheme(value: ThemeConfig): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
