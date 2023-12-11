package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.TimelinePropshashIdstring
import web.typings.antd.antdStrings.alternate
import web.typings.antd.antdStrings.left
import web.typings.antd.antdStrings.right
import web.typings.antd.esTimelineTimelineItemMod.TimelineItemProps
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimelineItemList {
  
  @scala.inline
  def apply(hashId: String): Builder = {
    val __props = js.Dynamic.literal(hashId = hashId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TimelinePropshashIdstring]))
  }
  
  @JSImport("antd/es/timeline/TimelineItemList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def items(value: js.Array[TimelineItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsVarargs(value: TimelineItemProps*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def mode(value: left | alternate | right): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pending(value: ReactElement): this.type = set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pendingDot(value: ReactElement): this.type = set("pendingDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = TimelinePropshashIdstring
  
  def withProps(p: TimelinePropshashIdstring): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
