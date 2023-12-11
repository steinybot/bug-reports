package web.typings.rcComponentTrigger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AdjustX extends StObject {
    
    var adjustX: js.UndefOr[Boolean | Double] = js.native
    
    var adjustY: js.UndefOr[Boolean | Double] = js.native
    
    var shiftX: js.UndefOr[Boolean | Double] = js.native
    
    var shiftY: js.UndefOr[Boolean | Double] = js.native
  }
  object AdjustX {
    
    @scala.inline
    def apply(): AdjustX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdjustX]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AdjustX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustX(value: Boolean | Double): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustXUndefined: Self = StObject.set(x, "adjustX", js.undefined)
      
      @scala.inline
      def setAdjustY(value: Boolean | Double): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustYUndefined: Self = StObject.set(x, "adjustY", js.undefined)
      
      @scala.inline
      def setShiftX(value: Boolean | Double): Self = StObject.set(x, "shiftX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftXUndefined: Self = StObject.set(x, "shiftX", js.undefined)
      
      @scala.inline
      def setShiftY(value: Boolean | Double): Self = StObject.set(x, "shiftY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftYUndefined: Self = StObject.set(x, "shiftY", js.undefined)
    }
  }
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
