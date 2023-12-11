package web.typings.ctrlTinycolor

import web.typings.ctrlTinycolor.anon.NumberifyHSL
import web.typings.ctrlTinycolor.anon.NumberifyHSV
import web.typings.ctrlTinycolor.anon.NumberifyRGB
import web.typings.ctrlTinycolor.distInterfacesMod.RGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConversionMod {
  
  @JSImport("@ctrl/tinycolor/dist/conversion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertDecimalToHex(d: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDecimalToHex")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def convertDecimalToHex(d: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDecimalToHex")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def convertHexToDecimal(h: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertHexToDecimal")(h.asInstanceOf[js.Any]).asInstanceOf[Double]
  
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
  def numberInputToObject(color: Double): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("numberInputToObject")(color.asInstanceOf[js.Any]).asInstanceOf[RGB]
  
  @scala.inline
  def parseIntFromHex(`val`: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIntFromHex")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
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
}
