package web.typings.rcComponentColorPicker

import web.typings.rcComponentColorPicker.esColorMod.Color
import web.typings.rcComponentColorPicker.esInterfaceMod.BaseColorPickerProps
import web.typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerMod extends Shortcut {
  
  @JSImport("@rc-component/color-picker/es/ColorPicker", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ColorPickerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait ColorPickerProps
    extends StObject
       with BaseColorPickerProps {
    
    var className: js.UndefOr[String] = js.native
    
    var defaultValue: js.UndefOr[ColorGenInput[Color]] = js.native
    
    /** Disabled alpha selection */
    var disabledAlpha: js.UndefOr[Boolean] = js.native
    
    /** Get panel element  */
    var panelRender: js.UndefOr[js.Function1[/* panel */ ReactElement, ReactElement]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var value: js.UndefOr[ColorGenInput[Color]] = js.native
  }
  object ColorPickerProps {
    
    @scala.inline
    def apply(): ColorPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPickerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColorPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: ColorGenInput[Color]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabledAlpha(value: Boolean): Self = StObject.set(x, "disabledAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledAlphaUndefined: Self = StObject.set(x, "disabledAlpha", js.undefined)
      
      @scala.inline
      def setPanelRender(value: /* panel */ ReactElement => ReactElement): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: ColorGenInput[Color]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ColorPickerProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esColorPickerMod.foo` */
  override def _to: ReactComponentClass[ColorPickerProps with RefAttributes[HTMLDivElement]] = default
}
