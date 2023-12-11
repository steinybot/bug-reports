package web.typings.rcComponentColorPicker

import web.typings.rcComponentColorPicker.esColorPickerMod.ColorPickerProps
import web.typings.rcComponentColorPicker.esComponentsColorBlockMod.ColorBlockProps
import web.typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@rc-component/color-picker", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ColorPickerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@rc-component/color-picker", "Color")
  @js.native
  class Color protected ()
    extends web.typings.rcComponentColorPicker.esColorMod.Color {
    def this(color: ColorGenInput[web.typings.rcComponentColorPicker.esColorMod.Color]) = this()
  }
  
  @JSImport("@rc-component/color-picker", "ColorBlock")
  @js.native
  val ColorBlock: ReactComponentClass[ColorBlockProps] = js.native
  
  type _To = ReactComponentClass[ColorPickerProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[ColorPickerProps with RefAttributes[HTMLDivElement]] = default
}
