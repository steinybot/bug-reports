package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLSpanElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.span.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_CheckableTagPropsRefAttributes_1849265448[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: /* checked */ Boolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onClick(value: /* e */ SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
