package web.typings.antd

import web.typings.antd.esColorPickerColorMod.Color
import web.typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerComponentsPanelPickerMod extends Shortcut {
  
  @JSImport("antd/es/color-picker/components/PanelPicker", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Object] = js.native
  
  /* Inlined parent std.Pick<antd.antd/es/color-picker/interface.ColorPickerBaseProps, 'prefixCls' | 'colorCleared' | 'allowClear' | 'disabledAlpha' | 'onChangeComplete'> */
  @js.native
  trait PanelPickerProps extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.native
    
    var colorCleared: js.UndefOr[Boolean] = js.native
    
    var disabledAlpha: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[
        js.Function3[
          /* value */ js.UndefOr[Color], 
          /* type */ js.UndefOr[HsbaColorType], 
          /* pickColor */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.native
    
    var onChangeComplete: js.UndefOr[js.Function1[/* value */ Color, Unit]] = js.native
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var value: js.UndefOr[Color] = js.native
  }
  object PanelPickerProps {
    
    @scala.inline
    def apply(prefixCls: String): PanelPickerProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelPickerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PanelPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setColorCleared(value: Boolean): Self = StObject.set(x, "colorCleared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorClearedUndefined: Self = StObject.set(x, "colorCleared", js.undefined)
      
      @scala.inline
      def setDisabledAlpha(value: Boolean): Self = StObject.set(x, "disabledAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledAlphaUndefined: Self = StObject.set(x, "disabledAlpha", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* value */ js.UndefOr[Color], /* type */ js.UndefOr[HsbaColorType], /* pickColor */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeComplete(value: /* value */ Color => Unit): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Color): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `esColorPickerComponentsPanelPickerMod.foo` */
  override def _to: ReactComponentClass[js.Object] = default
}
