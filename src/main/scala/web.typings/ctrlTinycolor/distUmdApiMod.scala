package web.typings.ctrlTinycolor

import web.typings.ctrlTinycolor.anon.A
import web.typings.ctrlTinycolor.anon.FnCall
import web.typings.ctrlTinycolor.anon.PartialTinyColorOptions
import web.typings.ctrlTinycolor.distFromRatioMod.RatioInput
import web.typings.ctrlTinycolor.distInterfacesMod.HSL
import web.typings.ctrlTinycolor.distInterfacesMod.HSLA
import web.typings.ctrlTinycolor.distInterfacesMod.HSV
import web.typings.ctrlTinycolor.distInterfacesMod.HSVA
import web.typings.ctrlTinycolor.distInterfacesMod.RGB
import web.typings.ctrlTinycolor.distInterfacesMod.RGBA
import web.typings.ctrlTinycolor.distMod.ColorInput
import web.typings.ctrlTinycolor.distMod.TinyColor_
import web.typings.ctrlTinycolor.distRandomMod.RandomCountOptions
import web.typings.ctrlTinycolor.distRandomMod.RandomOptions
import web.typings.ctrlTinycolor.distReadabilityMod.WCAG2FallbackParms
import web.typings.std.Record
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUmdApiMod {
  
  object default extends Shortcut {
    
    @JSImport("@ctrl/tinycolor/dist/umd_api", JSImport.Default)
    @js.native
    val ^ : TinyColorUMD = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@ctrl/tinycolor/dist/umd_api", "default.TinyColor")
    @js.native
    class TinyColor () extends TinyColor_ {
      def this(color: ColorInput) = this()
      def this(color: ColorInput, opts: PartialTinyColorOptions) = this()
      def this(color: Unit, opts: PartialTinyColorOptions) = this()
    }
    
    type _To = TinyColorUMD
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: TinyColorUMD = ^
  }
  
  @js.native
  trait TinyColorUMD extends StObject {
    
    def apply(): TinyColor_ = js.native
    
    var TinyColor: Instantiable2[
        /* color */ js.UndefOr[ColorInput], 
        /* opts */ js.UndefOr[PartialTinyColorOptions], 
        TinyColor_
      ] = js.native
    
    def fromRatio(ratio: RatioInput): TinyColor_ = js.native
    def fromRatio(ratio: RatioInput, opts: Any): TinyColor_ = js.native
    @JSName("fromRatio")
    var fromRatio_Original: js.Function2[/* ratio */ RatioInput, /* opts */ js.UndefOr[Any], TinyColor_] = js.native
    
    def inputToRGB(color: HSL): A = js.native
    def inputToRGB(color: HSLA): A = js.native
    def inputToRGB(color: HSV): A = js.native
    def inputToRGB(color: HSVA): A = js.native
    def inputToRGB(color: RGB): A = js.native
    def inputToRGB(color: RGBA): A = js.native
    def inputToRGB(color: String): A = js.native
    def inputToRGB(color: Any): A = js.native
    @JSName("inputToRGB")
    var inputToRGB_Original: js.Function1[/* color */ String | RGB | RGBA | HSL | HSLA | HSV | HSVA | Any, A] = js.native
    
    def isValidCSSUnit(color: String): Boolean = js.native
    def isValidCSSUnit(color: Double): Boolean = js.native
    @JSName("isValidCSSUnit")
    var isValidCSSUnit_Original: js.Function1[/* color */ String | Double, Boolean] = js.native
    
    def legacyRandom(): TinyColor_ = js.native
    @JSName("legacyRandom")
    var legacyRandom_Original: js.Function0[TinyColor_] = js.native
    
    def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput]): TinyColor_ | Null = js.native
    def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput], args: WCAG2FallbackParms): TinyColor_ | Null = js.native
    @JSName("mostReadable")
    var mostReadable_Original: js.Function3[
        /* baseColor */ ColorInput, 
        /* colorList */ js.Array[ColorInput], 
        /* args */ js.UndefOr[WCAG2FallbackParms], 
        TinyColor_ | Null
      ] = js.native
    
    var names: Record[String, String] = js.native
    
    def random(): js.Array[TinyColor_] = js.native
    def random(options: RandomCountOptions): js.Array[TinyColor_] = js.native
    def random(options: RandomOptions): TinyColor_ = js.native
    @JSName("random")
    var random_Original: FnCall = js.native
    @JSName("random")
    def random_TinyColor_(): TinyColor_ = js.native
    
    def readability(color1: ColorInput, color2: ColorInput): Double = js.native
    @JSName("readability")
    var readability_Original: js.Function2[/* color1 */ ColorInput, /* color2 */ ColorInput, Double] = js.native
    
    def stringInputToObject(color: String): Any = js.native
    @JSName("stringInputToObject")
    var stringInputToObject_Original: js.Function1[/* color */ String, Any] = js.native
    
    def toMsFilter(firstColor: ColorInput): String = js.native
    def toMsFilter(firstColor: ColorInput, secondColor: ColorInput): String = js.native
    @JSName("toMsFilter")
    var toMsFilter_Original: js.Function2[/* firstColor */ ColorInput, /* secondColor */ js.UndefOr[ColorInput], String] = js.native
  }
}
