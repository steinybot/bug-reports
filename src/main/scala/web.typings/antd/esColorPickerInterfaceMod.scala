package web.typings.antd

import web.typings.antd.anon.Components
import web.typings.antd.esColorPickerColorMod.Color
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerInterfaceMod {
  
  @js.native
  sealed trait ColorFormat extends StObject
  @JSImport("antd/es/color-picker/interface", "ColorFormat")
  @js.native
  object ColorFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ColorFormat with String] = js.native
    
    @js.native
    sealed trait hex
      extends StObject
         with ColorFormat
    /* "hex" */ val hex: web.typings.antd.esColorPickerInterfaceMod.ColorFormat.hex with String = js.native
    
    @js.native
    sealed trait hsb
      extends StObject
         with ColorFormat
    /* "hsb" */ val hsb: web.typings.antd.esColorPickerInterfaceMod.ColorFormat.hsb with String = js.native
    
    @js.native
    sealed trait rgb
      extends StObject
         with ColorFormat
    /* "rgb" */ val rgb: web.typings.antd.esColorPickerInterfaceMod.ColorFormat.rgb with String = js.native
  }
  
  @js.native
  trait ColorPickerBaseProps extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[Color] = js.native
    
    var colorCleared: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledAlpha: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
      ] = js.native
    
    var onChangeComplete: js.UndefOr[js.Function1[/* value */ Color, Unit]] = js.native
    
    var onFormatChange: js.UndefOr[js.Function1[/* format */ ColorFormat, Unit]] = js.native
    
    var panelRender: js.UndefOr[js.Function2[/* panel */ ReactElement, /* extra */ Components, ReactElement]] = js.native
    
    var prefixCls: String = js.native
    
    var presets: js.UndefOr[js.Array[PresetsItem]] = js.native
  }
  object ColorPickerBaseProps {
    
    @scala.inline
    def apply(prefixCls: String): ColorPickerBaseProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorPickerBaseProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColorPickerBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorCleared(value: Boolean): Self = StObject.set(x, "colorCleared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorClearedUndefined: Self = StObject.set(x, "colorCleared", js.undefined)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledAlpha(value: Boolean): Self = StObject.set(x, "disabledAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledAlphaUndefined: Self = StObject.set(x, "disabledAlpha", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFormat(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOnChangeComplete(value: /* value */ Color => Unit): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      @scala.inline
      def setOnFormatChange(value: /* format */ ColorFormat => Unit): Self = StObject.set(x, "onFormatChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFormatChangeUndefined: Self = StObject.set(x, "onFormatChange", js.undefined)
      
      @scala.inline
      def setPanelRender(value: (/* panel */ ReactElement, /* extra */ Components) => ReactElement): Self = StObject.set(x, "panelRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresets(value: js.Array[PresetsItem]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPresetsVarargs(value: PresetsItem*): Self = StObject.set(x, "presets", js.Array(value :_*))
    }
  }
  
  type ColorValueType = Color | String | Null
  
  @js.native
  trait PresetsItem extends StObject {
    
    var colors: js.Array[String | Color] = js.native
    
    /**
      * Whether the initial state is collapsed
      * @since 5.11.0
      * @default true
      */
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    var label: ReactElement = js.native
  }
  object PresetsItem {
    
    @scala.inline
    def apply(colors: js.Array[String | Color], label: ReactElement): PresetsItem = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresetsItem]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PresetsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[String | Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: (String | Color)*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.top
    - `web.typings`.antd.antdStrings.topLeft
    - `web.typings`.antd.antdStrings.topRight
    - `web.typings`.antd.antdStrings.bottom
    - `web.typings`.antd.antdStrings.bottomLeft
    - `web.typings`.antd.antdStrings.bottomRight
  */
  trait TriggerPlacement extends StObject
  object TriggerPlacement {
    
    @scala.inline
    def bottom: web.typings.antd.antdStrings.bottom = "bottom".asInstanceOf[web.typings.antd.antdStrings.bottom]
    
    @scala.inline
    def bottomLeft: web.typings.antd.antdStrings.bottomLeft = "bottomLeft".asInstanceOf[web.typings.antd.antdStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: web.typings.antd.antdStrings.bottomRight = "bottomRight".asInstanceOf[web.typings.antd.antdStrings.bottomRight]
    
    @scala.inline
    def top: web.typings.antd.antdStrings.top = "top".asInstanceOf[web.typings.antd.antdStrings.top]
    
    @scala.inline
    def topLeft: web.typings.antd.antdStrings.topLeft = "topLeft".asInstanceOf[web.typings.antd.antdStrings.topLeft]
    
    @scala.inline
    def topRight: web.typings.antd.antdStrings.topRight = "topRight".asInstanceOf[web.typings.antd.antdStrings.topRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.click
    - `web.typings`.antd.antdStrings.hover
  */
  trait TriggerType extends StObject
  object TriggerType {
    
    @scala.inline
    def click: web.typings.antd.antdStrings.click = "click".asInstanceOf[web.typings.antd.antdStrings.click]
    
    @scala.inline
    def hover: web.typings.antd.antdStrings.hover = "hover".asInstanceOf[web.typings.antd.antdStrings.hover]
  }
}
