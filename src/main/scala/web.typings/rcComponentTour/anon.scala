package web.typings.rcComponentTour

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Color extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object Color {
    
    @scala.inline
    def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait Placeholder extends StObject {
    
    var placeholder: Boolean = js.native
  }
  object Placeholder {
    
    @scala.inline
    def apply(placeholder: Boolean): Placeholder = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Placeholder]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Placeholder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaceholder(value: Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PointAtCenter extends StObject {
    
    var pointAtCenter: Boolean = js.native
  }
  object PointAtCenter {
    
    @scala.inline
    def apply(pointAtCenter: Boolean): PointAtCenter = {
      val __obj = js.Dynamic.literal(pointAtCenter = pointAtCenter.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointAtCenter]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PointAtCenter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPointAtCenter(value: Boolean): Self = StObject.set(x, "pointAtCenter", value.asInstanceOf[js.Any])
    }
  }
}
