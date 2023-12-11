package web.typings.ctrlTinycolor

import web.typings.ctrlTinycolor.anon.A
import web.typings.ctrlTinycolor.distInterfacesMod.HSL
import web.typings.ctrlTinycolor.distInterfacesMod.HSLA
import web.typings.ctrlTinycolor.distInterfacesMod.HSV
import web.typings.ctrlTinycolor.distInterfacesMod.HSVA
import web.typings.ctrlTinycolor.distInterfacesMod.RGB
import web.typings.ctrlTinycolor.distInterfacesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormatInputMod {
  
  @JSImport("@ctrl/tinycolor/dist/format-input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  def isValidCSSUnit(color: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCSSUnit")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isValidCSSUnit(color: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCSSUnit")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def stringInputToObject(color: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringInputToObject")(color.asInstanceOf[js.Any]).asInstanceOf[Any]
}
