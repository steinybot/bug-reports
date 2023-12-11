package web.typings.rcSlider.components

import web.typings.StBuildingComponent
import web.typings.rcSlider.libInterfaceMod.AriaValueFormat
import web.typings.rcSlider.libInterfaceMod.SliderClassNames
import web.typings.rcSlider.libInterfaceMod.SliderStyles
import web.typings.rcSlider.libMarksMod.MarkObj
import web.typings.react.mod.CSSProperties
import web.typings.std.Record
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_SliderPropsRefAttributes_1844665825[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def activeDotStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): this.type = set("activeDotStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def activeDotStyleFunction1(value: /* dotValue */ Double => CSSProperties): this.type = set("activeDotStyle", js.Any.fromFunction1(value))
  
  @scala.inline
  def allowCross(value: Boolean): this.type = set("allowCross", value.asInstanceOf[js.Any])
  
  @scala.inline
  def ariaLabelForHandle(value: String | js.Array[String]): this.type = set("ariaLabelForHandle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def ariaLabelForHandleVarargs(value: String*): this.type = set("ariaLabelForHandle", js.Array(value :_*))
  
  @scala.inline
  def ariaLabelledByForHandle(value: String | js.Array[String]): this.type = set("ariaLabelledByForHandle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def ariaLabelledByForHandleVarargs(value: String*): this.type = set("ariaLabelledByForHandle", js.Array(value :_*))
  
  @scala.inline
  def ariaValueTextFormatterForHandle(value: AriaValueFormat | js.Array[AriaValueFormat]): this.type = set("ariaValueTextFormatterForHandle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def ariaValueTextFormatterForHandleFunction1(value: /* value */ Double => String): this.type = set("ariaValueTextFormatterForHandle", js.Any.fromFunction1(value))
  
  @scala.inline
  def ariaValueTextFormatterForHandleVarargs(value: AriaValueFormat*): this.type = set("ariaValueTextFormatterForHandle", js.Array(value :_*))
  
  @scala.inline
  def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def classNames(value: SliderClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
  
  @scala.inline
  def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValue(value: Double | js.Array[Double]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValueVarargs(value: Double*): this.type = set("defaultValue", js.Array(value :_*))
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dotStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): this.type = set("dotStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dotStyleFunction1(value: /* dotValue */ Double => CSSProperties): this.type = set("dotStyle", js.Any.fromFunction1(value))
  
  @scala.inline
  def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
  
  @scala.inline
  def draggableTrack(value: Boolean): this.type = set("draggableTrack", value.asInstanceOf[js.Any])
  
  @scala.inline
  def handleRender(
    value: /* import warning: importer.ImportType#apply Failed type conversion: rc-slider.rc-slider/lib/Handles/Handle.HandleProps['render'] */ js.Any
  ): this.type = set("handleRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def handleStyle(value: CSSProperties | js.Array[CSSProperties]): this.type = set("handleStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def handleStyleVarargs(value: CSSProperties*): this.type = set("handleStyle", js.Array(value :_*))
  
  @scala.inline
  def included(value: Boolean): this.type = set("included", value.asInstanceOf[js.Any])
  
  @scala.inline
  def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
  
  @scala.inline
  def marks(value: Record[String | Double, ReactElement | MarkObj]): this.type = set("marks", value.asInstanceOf[js.Any])
  
  @scala.inline
  def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
  
  @scala.inline
  def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onAfterChange(value: Double | js.Array[Double] => Unit): this.type = set("onAfterChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onBeforeChange(value: Double | js.Array[Double] => Unit): this.type = set("onBeforeChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  
  @scala.inline
  def onChange(value: Double | js.Array[Double] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onChangeComplete(value: Double | js.Array[Double] => Unit): this.type = set("onChangeComplete", js.Any.fromFunction1(value))
  
  @scala.inline
  def onFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def pushable(value: Boolean | Double): this.type = set("pushable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def railStyle(value: CSSProperties): this.type = set("railStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def range(value: Boolean): this.type = set("range", value.asInstanceOf[js.Any])
  
  @scala.inline
  def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
  
  @scala.inline
  def startPoint(value: Double): this.type = set("startPoint", value.asInstanceOf[js.Any])
  
  @scala.inline
  def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stepNull: this.type = set("step", null)
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def styles(value: SliderStyles): this.type = set("styles", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabIndex(value: Double | js.Array[Double]): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabIndexVarargs(value: Double*): this.type = set("tabIndex", js.Array(value :_*))
  
  @scala.inline
  def trackStyle(value: CSSProperties | js.Array[CSSProperties]): this.type = set("trackStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def trackStyleVarargs(value: CSSProperties*): this.type = set("trackStyle", js.Array(value :_*))
  
  @scala.inline
  def value(value: Double | js.Array[Double]): this.type = set("value", value.asInstanceOf[js.Any])
  
  @scala.inline
  def valueVarargs(value: Double*): this.type = set("value", js.Array(value :_*))
  
  @scala.inline
  def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
}
