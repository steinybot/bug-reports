package web.typings.rcComponentColorPicker.components

import web.typings.StBuildingComponent
import web.typings.rcComponentColorPicker.esColorMod.Color
import web.typings.rcComponentColorPicker.esColorPickerMod.ColorPickerProps
import web.typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import web.typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPicker {
  
  @JSImport("@rc-component/color-picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: ColorGenInput[Color]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledAlpha(value: Boolean): this.type = set("disabledAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* color */ Color, /* type */ js.UndefOr[HsbaColorType]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onChangeComplete(value: (/* value */ Color, /* type */ js.UndefOr[HsbaColorType]) => Unit): this.type = set("onChangeComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def panelRender(value: /* panel */ ReactElement => ReactElement): this.type = set("panelRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: ColorGenInput[Color]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  type Props = ColorPickerProps with RefAttributes[HTMLDivElement]
  
  implicit def make(companion: ColorPicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ColorPickerProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
