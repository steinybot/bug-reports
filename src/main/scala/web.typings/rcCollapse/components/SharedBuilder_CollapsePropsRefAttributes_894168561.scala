package web.typings.rcCollapse.components

import web.typings.StBuildingComponent
import web.typings.rcCollapse.esInterfaceMod.CollapsibleType
import web.typings.rcCollapse.esInterfaceMod.ItemType
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.Key
import slinky.core.facade.ReactElement
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_CollapsePropsRefAttributes_894168561[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def accordion(value: Boolean): this.type = set("accordion", value.asInstanceOf[js.Any])
  
  @scala.inline
  def activeKey(value: Key | js.Array[Key]): this.type = set("activeKey", value.asInstanceOf[js.Any])
  
  @scala.inline
  def activeKeyVarargs(value: Key*): this.type = set("activeKey", js.Array(value :_*))
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def collapsible(value: CollapsibleType): this.type = set("collapsible", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultActiveKey(value: Key | js.Array[Key]): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultActiveKeyVarargs(value: Key*): this.type = set("defaultActiveKey", js.Array(value :_*))
  
  @scala.inline
  def destroyInactivePanel(value: Boolean): this.type = set("destroyInactivePanel", value.asInstanceOf[js.Any])
  
  @scala.inline
  def expandIcon(value: /* props */ js.Object => ReactElement): this.type = set("expandIcon", js.Any.fromFunction1(value))
  
  @scala.inline
  def items(value: js.Array[ItemType]): this.type = set("items", value.asInstanceOf[js.Any])
  
  @scala.inline
  def itemsVarargs(value: ItemType*): this.type = set("items", js.Array(value :_*))
  
  @scala.inline
  def onChange(value: /* key */ Key | js.Array[Key] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def openMotion(value: CSSMotionProps): this.type = set("openMotion", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
}
