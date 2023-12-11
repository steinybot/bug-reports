package web.typings.antd

import web.typings.antd.esColorPickerColorMod.Color
import web.typings.antd.esColorPickerInterfaceMod.ColorPickerBaseProps
import web.typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerColorPickerPanelMod extends Shortcut {
  
  @JSImport("antd/es/color-picker/ColorPickerPanel", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ColorPickerPanelProps] = js.native
  
  @js.native
  trait ColorPickerPanelProps
    extends StObject
       with ColorPickerBaseProps {
    
    var onChange: js.UndefOr[
        js.Function3[
          /* value */ js.UndefOr[Color], 
          /* type */ js.UndefOr[HsbaColorType], 
          /* pickColor */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.native
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object ColorPickerPanelProps {
    
    @scala.inline
    def apply(prefixCls: String): ColorPickerPanelProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorPickerPanelProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColorPickerPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChange(
        value: (/* value */ js.UndefOr[Color], /* type */ js.UndefOr[HsbaColorType], /* pickColor */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ColorPickerPanelProps]
  
  /* This means you don't have to write `default`, but can instead just say `esColorPickerColorPickerPanelMod.foo` */
  override def _to: ReactComponentClass[ColorPickerPanelProps] = default
}
