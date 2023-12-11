package web.typings.rcSlider.components

import web.typings.StBuildingComponent
import web.typings.rcSlider.libHandlesHandleMod.RenderProps
import web.typings.rcSlider.libHandlesMod.HandlesProps
import web.typings.rcSlider.libHandlesMod.HandlesRef
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

object Handles {
  
  @scala.inline
  def apply(
    draggingIndex: Double,
    onOffsetChange: (Double | max | min, Double) => Unit,
    onStartMove: (/* e */ SyntheticMouseEvent[Element] | SyntheticTouchEvent[Element], /* valueIndex */ Double, /* startValues */ js.UndefOr[js.Array[Double]]) => Unit,
    prefixCls: String,
    values: js.Array[Double]
  ): Builder = {
    val __props = js.Dynamic.literal(draggingIndex = draggingIndex.asInstanceOf[js.Any], onOffsetChange = js.Any.fromFunction2(onOffsetChange), onStartMove = js.Any.fromFunction3(onStartMove), prefixCls = prefixCls.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HandlesProps with RefAttributes[HandlesRef]]))
  }
  
  @JSImport("rc-slider/lib/Handles", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HandlesRef] {
    
    @scala.inline
    def handleRender(value: (/* origin */ ReactElement, /* props */ RenderProps) => ReactElement): this.type = set("handleRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def onBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChangeComplete(value: () => Unit): this.type = set("onChangeComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties | js.Array[CSSProperties]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleVarargs(value: CSSProperties*): this.type = set("style", js.Array(value :_*))
  }
  
  type Props = HandlesProps with RefAttributes[HandlesRef]
  
  def withProps(p: HandlesProps with RefAttributes[HandlesRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
