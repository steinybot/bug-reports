package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.Components
import web.typings.antd.esColorPickerColorMod.Color
import web.typings.antd.esColorPickerColorPickerPanelMod.ColorPickerPanelProps
import web.typings.antd.esColorPickerInterfaceMod.ColorFormat
import web.typings.antd.esColorPickerInterfaceMod.PresetsItem
import web.typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPickerPanel {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColorPickerPanelProps]))
  }
  
  @JSImport("antd/es/color-picker/ColorPickerPanel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorCleared(value: Boolean): this.type = set("colorCleared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledAlpha(value: Boolean): this.type = set("disabledAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
    ): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* value */ js.UndefOr[Color], /* type */ js.UndefOr[HsbaColorType], /* pickColor */ js.UndefOr[Boolean]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def onChangeComplete(value: /* value */ Color => Unit): this.type = set("onChangeComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClear(value: () => Unit): this.type = set("onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFormatChange(value: /* format */ ColorFormat => Unit): this.type = set("onFormatChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def panelRender(value: (/* panel */ ReactElement, /* extra */ Components) => ReactElement): this.type = set("panelRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def presets(value: js.Array[PresetsItem]): this.type = set("presets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def presetsVarargs(value: PresetsItem*): this.type = set("presets", js.Array(value :_*))
  }
  
  type Props = ColorPickerPanelProps
  
  def withProps(p: ColorPickerPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
