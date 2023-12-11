package web.typings.scheduler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cancel extends StObject {
    
    def cancel(): Unit = js.native
  }
  object Cancel {
    
    @scala.inline
    def apply(cancel: () => Unit): Cancel = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Delay extends StObject {
    
    var delay: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Delay {
    
    @scala.inline
    def apply(): Delay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
