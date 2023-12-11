package web.typings.ctrlTinycolor

import web.typings.ctrlTinycolor.anon.A
import web.typings.ctrlTinycolor.anon.NumberifyHSL
import web.typings.ctrlTinycolor.anon.NumberifyHSV
import web.typings.ctrlTinycolor.anon.NumberifyRGB
import web.typings.ctrlTinycolor.anon.PartialTinyColorOptions
import web.typings.ctrlTinycolor.distFromRatioMod.RatioInput
import web.typings.ctrlTinycolor.distInterfacesMod.HSL
import web.typings.ctrlTinycolor.distInterfacesMod.HSLA
import web.typings.ctrlTinycolor.distInterfacesMod.HSV
import web.typings.ctrlTinycolor.distInterfacesMod.HSVA
import web.typings.ctrlTinycolor.distInterfacesMod.RGB
import web.typings.ctrlTinycolor.distInterfacesMod.RGBA
import web.typings.ctrlTinycolor.distMod.ColorInput
import web.typings.ctrlTinycolor.distRandomMod.ColorBound
import web.typings.ctrlTinycolor.distRandomMod.RandomCountOptions
import web.typings.ctrlTinycolor.distRandomMod.RandomOptions
import web.typings.ctrlTinycolor.distReadabilityMod.WCAG2FallbackParms
import web.typings.ctrlTinycolor.distReadabilityMod.WCAG2Parms
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ctrl/tinycolor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): web.typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  @scala.inline
  def default(color: ColorInput): web.typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  @scala.inline
  def default(color: ColorInput, opts: PartialTinyColorOptions): web.typings.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  @scala.inline
  def default(color: Unit, opts: PartialTinyColorOptions): web.typings.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  
  @JSImport("@ctrl/tinycolor", "TinyColor")
  @js.native
  class TinyColor_ ()
    extends web.typings.ctrlTinycolor.distMod.TinyColor_ {
    def this(color: ColorInput) = this()
    def this(color: ColorInput, opts: PartialTinyColorOptions) = this()
    def this(color: Unit, opts: PartialTinyColorOptions) = this()
  }
  
  @JSImport("@ctrl/tinycolor", "bounds")
  @js.native
  val bounds: js.Array[ColorBound] = js.native
  
  @scala.inline
  def convertDecimalToHex(d: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDecimalToHex")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def convertDecimalToHex(d: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDecimalToHex")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def convertHexToDecimal(h: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertHexToDecimal")(h.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def fromRatio(ratio: RatioInput): web.typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRatio")(ratio.asInstanceOf[js.Any]).asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  @scala.inline
  def fromRatio(ratio: RatioInput, opts: Any): web.typings.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRatio")(ratio.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  
  @scala.inline
  def hslToRgb(h: String, s: String, l: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hslToRgb(h: String, s: String, l: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hslToRgb(h: String, s: Double, l: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hslToRgb(h: String, s: Double, l: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hslToRgb(h: Double, s: String, l: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hslToRgb(h: Double, s: String, l: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hslToRgb(h: Double, s: Double, l: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hslToRgb(h: Double, s: Double, l: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  
  @scala.inline
  def hsvToRgb(h: String, s: String, v: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hsvToRgb(h: String, s: String, v: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hsvToRgb(h: String, s: Double, v: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hsvToRgb(h: String, s: Double, v: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hsvToRgb(h: Double, s: String, v: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hsvToRgb(h: Double, s: String, v: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hsvToRgb(h: Double, s: Double, v: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def hsvToRgb(h: Double, s: Double, v: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  
  @scala.inline
  def inputToRGB(color: HSL): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  @scala.inline
  def inputToRGB(color: HSLA): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  @scala.inline
  def inputToRGB(color: HSV): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  @scala.inline
  def inputToRGB(color: HSVA): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  @scala.inline
  def inputToRGB(color: RGB): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  @scala.inline
  def inputToRGB(color: RGBA): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  @scala.inline
  def inputToRGB(color: String): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  @scala.inline
  def inputToRGB(color: Any): A = ^.asInstanceOf[js.Dynamic].applyDynamic("inputToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def isReadable(color1: ColorInput, color2: ColorInput): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isReadable(color1: ColorInput, color2: ColorInput, wcag2: WCAG2Parms): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], wcag2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidCSSUnit(color: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCSSUnit")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isValidCSSUnit(color: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCSSUnit")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def legacyRandom(): web.typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("legacyRandom")().asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  
  @scala.inline
  def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput]): web.typings.ctrlTinycolor.distMod.TinyColor_ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mostReadable")(baseColor.asInstanceOf[js.Any], colorList.asInstanceOf[js.Any])).asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_ | Null]
  @scala.inline
  def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput], args: WCAG2FallbackParms): web.typings.ctrlTinycolor.distMod.TinyColor_ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mostReadable")(baseColor.asInstanceOf[js.Any], colorList.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_ | Null]
  
  @JSImport("@ctrl/tinycolor", "names")
  @js.native
  val names: Record[String, String] = js.native
  
  @scala.inline
  def numberInputToObject(color: Double): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("numberInputToObject")(color.asInstanceOf[js.Any]).asInstanceOf[RGB]
  
  @scala.inline
  def parseIntFromHex(`val`: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIntFromHex")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def random(): js.Array[web.typings.ctrlTinycolor.distMod.TinyColor_] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[js.Array[web.typings.ctrlTinycolor.distMod.TinyColor_]]
  @scala.inline
  def random(options: RandomCountOptions): js.Array[web.typings.ctrlTinycolor.distMod.TinyColor_] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[web.typings.ctrlTinycolor.distMod.TinyColor_]]
  @scala.inline
  def random(options: RandomOptions): web.typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(options.asInstanceOf[js.Any]).asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  
  @scala.inline
  def random_TinyColor_(): web.typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  
  @scala.inline
  def readability(color1: ColorInput, color2: ColorInput): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readability")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def rgbToHex(r: Double, g: Double, b: Double, allow3Char: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], allow3Char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def rgbToHsl(r: Double, g: Double, b: Double): NumberifyHSL = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHsl")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyHSL]
  
  @scala.inline
  def rgbToHsv(r: Double, g: Double, b: Double): NumberifyHSV = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHsv")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyHSV]
  
  @scala.inline
  def rgbToRgb(r: String, g: String, b: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def rgbToRgb(r: String, g: String, b: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def rgbToRgb(r: String, g: Double, b: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def rgbToRgb(r: String, g: Double, b: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def rgbToRgb(r: Double, g: String, b: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def rgbToRgb(r: Double, g: String, b: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def rgbToRgb(r: Double, g: Double, b: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  @scala.inline
  def rgbToRgb(r: Double, g: Double, b: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  
  @scala.inline
  def rgbaToArgbHex(r: Double, g: Double, b: Double, a: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbaToArgbHex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def rgbaToHex(r: Double, g: Double, b: Double, a: Double, allow4Char: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbaToHex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any], allow4Char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def stringInputToObject(color: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringInputToObject")(color.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def tinycolor(): web.typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")().asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  @scala.inline
  def tinycolor(color: ColorInput): web.typings.ctrlTinycolor.distMod.TinyColor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")(color.asInstanceOf[js.Any]).asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  @scala.inline
  def tinycolor(color: ColorInput, opts: PartialTinyColorOptions): web.typings.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  @scala.inline
  def tinycolor(color: Unit, opts: PartialTinyColorOptions): web.typings.ctrlTinycolor.distMod.TinyColor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tinycolor")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[web.typings.ctrlTinycolor.distMod.TinyColor_]
  
  @scala.inline
  def toMsFilter(firstColor: ColorInput): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMsFilter")(firstColor.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toMsFilter(firstColor: ColorInput, secondColor: ColorInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMsFilter")(firstColor.asInstanceOf[js.Any], secondColor.asInstanceOf[js.Any])).asInstanceOf[String]
}
