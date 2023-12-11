package web.typings.rcRate.components

import web.typings.StBuildingComponent
import web.typings.rcRate.esStarMod.StarProps
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLUListElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.ul.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_RatePropsRefAttributes66151370[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
  
  @scala.inline
  def allowHalf(value: Boolean): this.type = set("allowHalf", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def character(value: ReactElement | (js.Function1[/* props */ StarProps, ReactElement])): this.type = set("character", value.asInstanceOf[js.Any])
  
  @scala.inline
  def characterFunction1(value: /* props */ StarProps => ReactElement): this.type = set("character", js.Any.fromFunction1(value))
  
  @scala.inline
  def characterReactElement(value: ReactElement): this.type = set("character", value.asInstanceOf[js.Any])
  
  @scala.inline
  def characterRender(value: (/* origin */ ReactElement, /* props */ StarProps) => ReactElement): this.type = set("characterRender", js.Any.fromFunction2(value))
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onBlur(value: () => Unit): this.type = set("onBlur", js.Any.fromFunction0(value))
  
  @scala.inline
  def onChange(value: /* value */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onFocus(value: () => Unit): this.type = set("onFocus", js.Any.fromFunction0(value))
  
  @scala.inline
  def onHoverChange(value: /* value */ Double => Unit): this.type = set("onHoverChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyDown(value: SyntheticKeyboardEvent[HTMLUListElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseEnter(value: SyntheticMouseEvent[HTMLUListElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: SyntheticMouseEvent[HTMLUListElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
}
