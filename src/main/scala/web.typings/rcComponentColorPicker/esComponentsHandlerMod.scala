package web.typings.rcComponentColorPicker

import web.typings.rcComponentColorPicker.anon.Color
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsHandlerMod extends Shortcut {
  
  @JSImport("@rc-component/color-picker/es/components/Handler", JSImport.Default)
  @js.native
  val default: ReactComponentClass[Color] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcComponentColorPicker.rcComponentColorPickerStrings.default
    - `web.typings`.rcComponentColorPicker.rcComponentColorPickerStrings.small
  */
  trait HandlerSize extends StObject
  object HandlerSize {
    
    @scala.inline
    def default: web.typings.rcComponentColorPicker.rcComponentColorPickerStrings.default = "default".asInstanceOf[web.typings.rcComponentColorPicker.rcComponentColorPickerStrings.default]
    
    @scala.inline
    def small: web.typings.rcComponentColorPicker.rcComponentColorPickerStrings.small = "small".asInstanceOf[web.typings.rcComponentColorPicker.rcComponentColorPickerStrings.small]
  }
  
  type _To = ReactComponentClass[Color]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsHandlerMod.foo` */
  override def _to: ReactComponentClass[Color] = default
}
