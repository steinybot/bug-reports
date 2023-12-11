package web.typings.antd

import web.typings.antd.esColorPickerColorMod.Color
import web.typings.antd.esColorPickerInterfaceMod.ColorFormat
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerComponentsColorInputMod extends Shortcut {
  
  @JSImport("antd/es/color-picker/components/ColorInput", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ColorInputProps] = js.native
  
  /* Inlined parent std.Pick<antd.antd/es/color-picker/interface.ColorPickerBaseProps, 'prefixCls' | 'format' | 'onFormatChange' | 'disabledAlpha'> */
  @js.native
  trait ColorInputProps extends StObject {
    
    var disabledAlpha: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
      ] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ Color, Unit]] = js.native
    
    var onFormatChange: js.UndefOr[js.Function1[/* format */ ColorFormat, Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var value: js.UndefOr[Color] = js.native
  }
  object ColorInputProps {
    
    @scala.inline
    def apply(prefixCls: String): ColorInputProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorInputProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColorInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabledAlpha(value: Boolean): Self = StObject.set(x, "disabledAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledAlphaUndefined: Self = StObject.set(x, "disabledAlpha", js.undefined)
      
      @scala.inline
      def setFormat(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Color => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFormatChange(value: /* format */ ColorFormat => Unit): Self = StObject.set(x, "onFormatChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFormatChangeUndefined: Self = StObject.set(x, "onFormatChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Color): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ColorInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `esColorPickerComponentsColorInputMod.foo` */
  override def _to: ReactComponentClass[ColorInputProps] = default
}
