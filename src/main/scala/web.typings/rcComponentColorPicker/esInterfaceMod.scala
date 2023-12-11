package web.typings.rcComponentColorPicker

import web.typings.rcComponentColorPicker.esColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  @js.native
  trait BaseColorPickerProps extends StObject {
    
    var color: js.UndefOr[Color] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[js.Function2[/* color */ Color, /* type */ js.UndefOr[HsbaColorType], Unit]] = js.native
    
    var onChangeComplete: js.UndefOr[js.Function2[/* value */ Color, /* type */ js.UndefOr[HsbaColorType], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object BaseColorPickerProps {
    
    @scala.inline
    def apply(): BaseColorPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseColorPickerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BaseColorPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* color */ Color, /* type */ js.UndefOr[HsbaColorType]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeComplete(value: (/* value */ Color, /* type */ js.UndefOr[HsbaColorType]) => Unit): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - `web.typings`.rcComponentColorPicker.esInterfaceMod.RGB
    - `web.typings`.rcComponentColorPicker.esInterfaceMod.RGBA
    - `web.typings`.rcComponentColorPicker.esInterfaceMod.HSB
    - `web.typings`.rcComponentColorPicker.esInterfaceMod.HSBA
    - T
  */
  type ColorGenInput[T] = _ColorGenInput[T] | String | Double | T
  
  @js.native
  trait HSB
    extends StObject
       with _ColorGenInput[Any] {
    
    var b: Double | String = js.native
    
    var h: Double | String = js.native
    
    var s: Double | String = js.native
  }
  object HSB {
    
    @scala.inline
    def apply(b: Double | String, h: Double | String, s: Double | String): HSB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSB]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HSB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double | String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: Double | String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double | String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `web.typings`.rcComponentColorPicker.esInterfaceMod._ColorGenInput because Already inherited */ @js.native
  trait HSBA
    extends StObject
       with HSB {
    
    var a: Double = js.native
  }
  object HSBA {
    
    @scala.inline
    def apply(a: Double, b: Double | String, h: Double | String, s: Double | String): HSBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSBA]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HSBA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcComponentColorPicker.rcComponentColorPickerStrings.hue
    - `web.typings`.rcComponentColorPicker.rcComponentColorPickerStrings.alpha
  */
  trait HsbaColorType extends StObject
  object HsbaColorType {
    
    @scala.inline
    def alpha: web.typings.rcComponentColorPicker.rcComponentColorPickerStrings.alpha = "alpha".asInstanceOf[web.typings.rcComponentColorPicker.rcComponentColorPickerStrings.alpha]
    
    @scala.inline
    def hue: web.typings.rcComponentColorPicker.rcComponentColorPickerStrings.hue = "hue".asInstanceOf[web.typings.rcComponentColorPicker.rcComponentColorPickerStrings.hue]
  }
  
  @js.native
  trait RGB
    extends StObject
       with _ColorGenInput[Any] {
    
    var b: Double | String = js.native
    
    var g: Double | String = js.native
    
    var r: Double | String = js.native
  }
  object RGB {
    
    @scala.inline
    def apply(b: Double | String, g: Double | String, r: Double | String): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double | String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double | String): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `web.typings`.rcComponentColorPicker.esInterfaceMod._ColorGenInput because Already inherited */ @js.native
  trait RGBA
    extends StObject
       with RGB {
    
    var a: Double = js.native
  }
  object RGBA {
    
    @scala.inline
    def apply(a: Double, b: Double | String, g: Double | String, r: Double | String): RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RGBA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransformOffset extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object TransformOffset {
    
    @scala.inline
    def apply(x: Double, y: Double): TransformOffset = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformOffset]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TransformOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ColorGenInput[T] extends StObject
  object _ColorGenInput {
    
    @scala.inline
    def HSB(b: Double | String, h: Double | String, s: Double | String): web.typings.rcComponentColorPicker.esInterfaceMod.HSB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.rcComponentColorPicker.esInterfaceMod.HSB]
    }
    
    @scala.inline
    def HSBA(a: Double, b: Double | String, h: Double | String, s: Double | String): web.typings.rcComponentColorPicker.esInterfaceMod.HSBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.rcComponentColorPicker.esInterfaceMod.HSBA]
    }
    
    @scala.inline
    def RGB(b: Double | String, g: Double | String, r: Double | String): web.typings.rcComponentColorPicker.esInterfaceMod.RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.rcComponentColorPicker.esInterfaceMod.RGB]
    }
    
    @scala.inline
    def RGBA(a: Double, b: Double | String, g: Double | String, r: Double | String): web.typings.rcComponentColorPicker.esInterfaceMod.RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.rcComponentColorPicker.esInterfaceMod.RGBA]
    }
  }
}
