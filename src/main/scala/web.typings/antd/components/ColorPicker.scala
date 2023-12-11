package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.Components
import web.typings.antd.anon.KeepParent
import web.typings.antd.anon.PointAtCenter
import web.typings.antd.anon.Popup
import web.typings.antd.esColorPickerColorPickerMod.ColorPickerProps
import web.typings.antd.esColorPickerInterfaceMod.ColorFormat
import web.typings.antd.esColorPickerInterfaceMod.ColorValueType
import web.typings.antd.esColorPickerInterfaceMod.PresetsItem
import web.typings.antd.esColorPickerInterfaceMod.TriggerPlacement
import web.typings.antd.esColorPickerInterfaceMod.TriggerType
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esUtilPlacementsMod.AdjustOverflow
import web.typings.rcComponentColorPicker.esColorMod.Color
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPicker {
  
  @JSImport("antd", "ColorPicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrow(value: Boolean | PointAtCenter): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoAdjustOverflow(value: Boolean | AdjustOverflow): this.type = set("autoAdjustOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultFormat(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
    ): this.type = set("defaultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: ColorValueType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueNull: this.type = set("defaultValue", null)
    
    @scala.inline
    def destroyTooltipOnHide(value: Boolean | KeepParent): this.type = set("destroyTooltipOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledAlpha(value: Boolean): this.type = set("disabledAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
    ): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: (/* value */ web.typings.antd.esColorPickerColorMod.Color, /* hex */ String) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onChangeComplete(value: /* value */ web.typings.antd.esColorPickerColorMod.Color => Unit): this.type = set("onChangeComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClear(value: () => Unit): this.type = set("onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFormatChange(value: /* format */ ColorFormat => Unit): this.type = set("onFormatChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def panelRender(value: (/* panel */ ReactElement, /* extra */ Components) => ReactElement): this.type = set("panelRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def placement(value: TriggerPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def presets(value: js.Array[PresetsItem]): this.type = set("presets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def presetsVarargs(value: PresetsItem*): this.type = set("presets", js.Array(value :_*))
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showText(
      value: Boolean | (js.Function1[/* color */ web.typings.antd.esColorPickerColorMod.Color, ReactElement])
    ): this.type = set("showText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTextFunction1(value: /* color */ web.typings.antd.esColorPickerColorMod.Color => ReactElement): this.type = set("showText", js.Any.fromFunction1(value))
    
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: Popup): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trigger(value: TriggerType): this.type = set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: ColorValueType): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  type Props = ColorPickerProps
  
  implicit def make(companion: ColorPicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ColorPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
