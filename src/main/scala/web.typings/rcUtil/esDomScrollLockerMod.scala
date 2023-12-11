package web.typings.rcUtil

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDomScrollLockerMod {
  
  @JSImport("rc-util/es/Dom/scrollLocker", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ScrollLocker {
    def this(options: scrollLockOptions) = this()
  }
  
  @js.native
  trait ScrollLocker extends StObject {
    
    def getContainer(): js.UndefOr[HTMLElement] = js.native
    
    def lock(): Unit = js.native
    
    /* private */ var lockTarget: Any = js.native
    
    /* private */ var options: Any = js.native
    
    def reLock(): Unit = js.native
    def reLock(options: scrollLockOptions): Unit = js.native
    
    def unLock(): Unit = js.native
  }
  
  @js.native
  trait scrollLockOptions extends StObject {
    
    var container: HTMLElement = js.native
  }
  object scrollLockOptions {
    
    @scala.inline
    def apply(container: HTMLElement): scrollLockOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[scrollLockOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: scrollLockOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
}
