package web.typings.rcDrawer

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterMod {
  
  @js.native
  trait DrawerClassNames extends StObject {
    
    var content: js.UndefOr[String] = js.native
    
    var mask: js.UndefOr[String] = js.native
    
    var wrapper: js.UndefOr[String] = js.native
  }
  object DrawerClassNames {
    
    @scala.inline
    def apply(): DrawerClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerClassNames]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DrawerClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  @js.native
  trait DrawerStyles extends StObject {
    
    var content: js.UndefOr[CSSProperties] = js.native
    
    var mask: js.UndefOr[CSSProperties] = js.native
    
    var wrapper: js.UndefOr[CSSProperties] = js.native
  }
  object DrawerStyles {
    
    @scala.inline
    def apply(): DrawerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerStyles]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DrawerStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: CSSProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setMask(value: CSSProperties): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setWrapper(value: CSSProperties): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
}
