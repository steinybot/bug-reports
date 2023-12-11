package web.typings.antd

import web.typings.antd.esColorPickerColorMod.Color
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerComponentsColorRgbInputMod extends Shortcut {
  
  @JSImport("antd/es/color-picker/components/ColorRgbInput", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ColorRgbInputProps] = js.native
  
  /* Inlined parent std.Pick<antd.antd/es/color-picker/interface.ColorPickerBaseProps, 'prefixCls'> */
  @js.native
  trait ColorRgbInputProps extends StObject {
    
    var onChange: js.UndefOr[js.Function1[/* value */ Color, Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var value: js.UndefOr[Color] = js.native
  }
  object ColorRgbInputProps {
    
    @scala.inline
    def apply(prefixCls: String): ColorRgbInputProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorRgbInputProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColorRgbInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChange(value: /* value */ Color => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Color): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ColorRgbInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `esColorPickerComponentsColorRgbInputMod.foo` */
  override def _to: ReactComponentClass[ColorRgbInputProps] = default
}
