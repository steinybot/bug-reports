package web.typings.antd

import web.typings.antd.esColorPickerColorMod.Color
import web.typings.antd.esColorPickerInterfaceMod.PresetsItem
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerComponentsPanelPresetsMod extends Shortcut {
  
  @JSImport("antd/es/color-picker/components/PanelPresets", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Object] = js.native
  
  /* Inlined parent std.Pick<antd.antd/es/color-picker/interface.ColorPickerBaseProps, 'prefixCls' | 'presets'> */
  @js.native
  trait PanelPresetsProps extends StObject {
    
    var onChange: js.UndefOr[js.Function1[/* value */ Color, Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var presets: js.UndefOr[js.Array[PresetsItem]] = js.native
    
    var value: js.UndefOr[Color] = js.native
  }
  object PanelPresetsProps {
    
    @scala.inline
    def apply(prefixCls: String): PanelPresetsProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelPresetsProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PanelPresetsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChange(value: /* value */ Color => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresets(value: js.Array[PresetsItem]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPresetsVarargs(value: PresetsItem*): Self = StObject.set(x, "presets", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: Color): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `esColorPickerComponentsPanelPresetsMod.foo` */
  override def _to: ReactComponentClass[js.Object] = default
}
