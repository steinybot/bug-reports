package web.typings.antd

import web.typings.antd.anon.NumberifyHSBA
import web.typings.antd.anon.NumberifyRGBA
import web.typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerColorMod {
  
  @JSImport("antd/es/color-picker/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/es/color-picker/color", "ColorFactory")
  @js.native
  class ColorFactory protected () extends StObject {
    def this(color: ColorGenInput[Color]) = this()
    
    /** Original Color object */
    /* private */ var metaColor: Any = js.native
    
    def toHex(): String = js.native
    
    def toHexString(): String = js.native
    
    def toHsb(): NumberifyHSBA = js.native
    
    def toHsbString(): String = js.native
    
    def toRgb(): NumberifyRGBA = js.native
    
    def toRgbString(): String = js.native
  }
  
  @scala.inline
  def getHex(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHex")().asInstanceOf[String]
  @scala.inline
  def getHex(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHex")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getHex(value: String, alpha: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHex")(value.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getHex(value: Unit, alpha: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHex")(value.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toHexFormat(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHexFormat")().asInstanceOf[String]
  @scala.inline
  def toHexFormat(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHexFormat")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toHexFormat(value: String, alpha: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHexFormat")(value.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toHexFormat(value: Unit, alpha: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHexFormat")(value.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Inlined parent std.Pick<@rc-component/color-picker.@rc-component/color-picker.Color, 'toHsb' | 'toHsbString' | 'toHex' | 'toHexString' | 'toRgb' | 'toRgbString'> */
  @js.native
  trait Color extends StObject {
    
    var toHex: js.Function0[String] = js.native
    
    var toHexString: js.Function0[String] = js.native
    
    var toHsb: js.Function0[web.typings.rcComponentColorPicker.anon.NumberifyHSBA] = js.native
    
    var toHsbString: js.Function0[String] = js.native
    
    var toRgb: js.Function0[web.typings.ctrlTinycolor.anon.NumberifyRGBA] = js.native
    
    var toRgbString: js.Function0[String] = js.native
  }
  object Color {
    
    @scala.inline
    def apply(
      toHex: () => String,
      toHexString: () => String,
      toHsb: () => web.typings.rcComponentColorPicker.anon.NumberifyHSBA,
      toHsbString: () => String,
      toRgb: () => web.typings.ctrlTinycolor.anon.NumberifyRGBA,
      toRgbString: () => String
    ): Color = {
      val __obj = js.Dynamic.literal(toHex = js.Any.fromFunction0(toHex), toHexString = js.Any.fromFunction0(toHexString), toHsb = js.Any.fromFunction0(toHsb), toHsbString = js.Any.fromFunction0(toHsbString), toRgb = js.Any.fromFunction0(toRgb), toRgbString = js.Any.fromFunction0(toRgbString))
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToHex(value: () => String): Self = StObject.set(x, "toHex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToHsb(value: () => web.typings.rcComponentColorPicker.anon.NumberifyHSBA): Self = StObject.set(x, "toHsb", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToHsbString(value: () => String): Self = StObject.set(x, "toHsbString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToRgb(value: () => web.typings.ctrlTinycolor.anon.NumberifyRGBA): Self = StObject.set(x, "toRgb", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToRgbString(value: () => String): Self = StObject.set(x, "toRgbString", js.Any.fromFunction0(value))
    }
  }
}
