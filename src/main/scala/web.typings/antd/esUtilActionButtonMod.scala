package web.typings.antd

import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import web.typings.std.PromiseLike
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilActionButtonMod extends Shortcut {
  
  @JSImport("antd/es/_util/ActionButton", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ActionButtonProps] = js.native
  
  @js.native
  trait ActionButtonProps extends StObject {
    
    var actionFn: js.UndefOr[js.Function1[/* repeated */ Any, Any | PromiseLike[Any]]] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var buttonProps: js.UndefOr[ButtonProps] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var close: js.UndefOr[js.Function] = js.native
    
    var emitEvent: js.UndefOr[Boolean] = js.native
    
    /**
      * Do not throw if is await mode
      */
    var isSilent: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var prefixCls: String = js.native
    
    var quitOnNullishReturnValue: js.UndefOr[Boolean] = js.native
    
    var `type`: js.UndefOr[LegacyButtonType] = js.native
  }
  object ActionButtonProps {
    
    @scala.inline
    def apply(prefixCls: String): ActionButtonProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionButtonProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ActionButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionFn(value: /* repeated */ Any => Any | PromiseLike[Any]): Self = StObject.set(x, "actionFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionFnUndefined: Self = StObject.set(x, "actionFn", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setButtonProps(value: ButtonProps): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setEmitEvent(value: Boolean): Self = StObject.set(x, "emitEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitEventUndefined: Self = StObject.set(x, "emitEvent", js.undefined)
      
      @scala.inline
      def setIsSilent(value: () => Boolean): Self = StObject.set(x, "isSilent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSilentUndefined: Self = StObject.set(x, "isSilent", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuitOnNullishReturnValue(value: Boolean): Self = StObject.set(x, "quitOnNullishReturnValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuitOnNullishReturnValueUndefined: Self = StObject.set(x, "quitOnNullishReturnValue", js.undefined)
      
      @scala.inline
      def setType(value: LegacyButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ActionButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `esUtilActionButtonMod.foo` */
  override def _to: ReactComponentClass[ActionButtonProps] = default
}
