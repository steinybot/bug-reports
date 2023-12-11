package web.typings.antd

import web.typings.antd.esModalInterfaceMod.ModalFuncProps
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalUseModalHookModalMod extends Shortcut {
  
  @JSImport("antd/es/modal/useModal/HookModal", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HookModalProps with RefAttributes[HookModalRef]] = js.native
  
  @js.native
  trait HookModalProps extends StObject {
    
    def afterClose(): Unit = js.native
    
    var config: ModalFuncProps = js.native
    
    /**
      * Do not throw if is await mode
      */
    var isSilent: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var onConfirm: js.UndefOr[js.Function1[/* confirmed */ Boolean, Unit]] = js.native
  }
  object HookModalProps {
    
    @scala.inline
    def apply(afterClose: () => Unit, config: ModalFuncProps): HookModalProps = {
      val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookModalProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HookModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConfig(value: ModalFuncProps): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSilent(value: () => Boolean): Self = StObject.set(x, "isSilent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSilentUndefined: Self = StObject.set(x, "isSilent", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: /* confirmed */ Boolean => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    }
  }
  
  @js.native
  trait HookModalRef extends StObject {
    
    def destroy(): Unit = js.native
    
    def update(config: ModalFuncProps): Unit = js.native
  }
  object HookModalRef {
    
    @scala.inline
    def apply(destroy: () => Unit, update: ModalFuncProps => Unit): HookModalRef = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[HookModalRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HookModalRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: ModalFuncProps => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ReactComponentClass[HookModalProps with RefAttributes[HookModalRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esModalUseModalHookModalMod.foo` */
  override def _to: ReactComponentClass[HookModalProps with RefAttributes[HookModalRef]] = default
}
