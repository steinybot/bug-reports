package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esTimelineTimelineItemMod.Color
import web.typings.antd.esUtilTypeMod.LiteralUnion
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TimelineItemProps1061131858 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def color(value: LiteralUnion[Color]): this.type = set("color", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dot(value: ReactElement): this.type = set("dot", value.asInstanceOf[js.Any])
  
  @scala.inline
  def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
  
  @scala.inline
  def pending(value: Boolean): this.type = set("pending", value.asInstanceOf[js.Any])
  
  @scala.inline
  def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
