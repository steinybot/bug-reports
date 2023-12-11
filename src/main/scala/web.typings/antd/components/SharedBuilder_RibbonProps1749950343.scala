package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esBadgeRibbonMod.RibbonPlacement
import web.typings.antd.esUtilColorsMod.PresetColorType
import web.typings.antd.esUtilTypeMod.LiteralUnion
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_RibbonProps1749950343 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def color(value: LiteralUnion[PresetColorType]): this.type = set("color", value.asInstanceOf[js.Any])
  
  @scala.inline
  def placement(value: RibbonPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def text(value: ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
}
