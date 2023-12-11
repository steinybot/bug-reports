package web.typings.antd

import web.typings.antd.anon.Color
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esWatermarkMod extends Shortcut {
  
  @JSImport("antd/es/watermark", JSImport.Default)
  @js.native
  val default: ReactComponentClass[WatermarkProps] = js.native
  
  @js.native
  trait WatermarkProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[String | js.Array[String]] = js.native
    
    var font: js.UndefOr[Color] = js.native
    
    var gap: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var image: js.UndefOr[String] = js.native
    
    var inherit: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var rotate: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object WatermarkProps {
    
    @scala.inline
    def apply(): WatermarkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatermarkProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: WatermarkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: String | js.Array[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContentVarargs(value: String*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setFont(value: Color): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setGap(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[WatermarkProps]
  
  /* This means you don't have to write `default`, but can instead just say `esWatermarkMod.foo` */
  override def _to: ReactComponentClass[WatermarkProps] = default
}
