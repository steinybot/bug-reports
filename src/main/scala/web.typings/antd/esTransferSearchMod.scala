package web.typings.antd

import web.typings.react.mod.FormEvent
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTransferSearchMod extends Shortcut {
  
  @JSImport("antd/es/transfer/search", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TransferSearchProps] = js.native
  
  @js.native
  trait TransferSearchProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var handleClear: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ FormEvent[HTMLElement], Unit]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object TransferSearchProps {
    
    @scala.inline
    def apply(): TransferSearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferSearchProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TransferSearchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHandleClear(value: () => Unit): Self = StObject.set(x, "handleClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleClearUndefined: Self = StObject.set(x, "handleClear", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ FormEvent[HTMLElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TransferSearchProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTransferSearchMod.foo` */
  override def _to: ReactComponentClass[TransferSearchProps] = default
}
