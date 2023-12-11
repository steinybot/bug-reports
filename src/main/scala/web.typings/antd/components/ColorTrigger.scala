package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esColorPickerColorMod.Color
import web.typings.antd.esColorPickerComponentsColorTriggerMod.colorTriggerProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import web.typings.std.Exclude
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorTrigger {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[colorTriggerProps with RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("antd/es/color-picker/components/ColorTrigger", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: Exclude[js.UndefOr[Color], Unit]): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorCleared(value: Boolean): this.type = set("colorCleared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
    ): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showText(value: Boolean | (js.Function1[/* color */ Color, ReactElement])): this.type = set("showText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTextFunction1(value: /* color */ Color => ReactElement): this.type = set("showText", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = colorTriggerProps with RefAttributes[HTMLDivElement]
  
  def withProps(p: colorTriggerProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
