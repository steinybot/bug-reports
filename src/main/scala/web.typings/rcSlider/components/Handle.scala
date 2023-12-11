package web.typings.rcSlider.components

import web.typings.StBuildingComponent
import web.typings.rcSlider.libHandlesHandleMod.HandleProps
import web.typings.rcSlider.libHandlesHandleMod.RenderProps
import web.typings.rcSlider.rcSliderStrings.max
import web.typings.rcSlider.rcSliderStrings.min
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Handle {
  
  @scala.inline
  def apply(
    dragging: Boolean,
    onOffsetChange: (Double | max | min, Double) => Unit,
    onStartMove: (/* e */ SyntheticMouseEvent[Element] | SyntheticTouchEvent[Element], /* valueIndex */ Double, /* startValues */ js.UndefOr[js.Array[Double]]) => Unit,
    prefixCls: String,
    value: Double,
    valueIndex: Double
  ): Builder = {
    val __props = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], onOffsetChange = js.Any.fromFunction2(onOffsetChange), onStartMove = js.Any.fromFunction3(onStartMove), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueIndex = valueIndex.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HandleProps with RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-slider/lib/Handles/Handle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def onBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChangeComplete(value: () => Unit): this.type = set("onChangeComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def render(value: (/* origin */ ReactElement, /* props */ RenderProps) => ReactElement): this.type = set("render", js.Any.fromFunction2(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = HandleProps with RefAttributes[HTMLDivElement]
  
  def withProps(p: HandleProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
