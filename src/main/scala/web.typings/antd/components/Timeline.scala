package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdStrings.alternate
import web.typings.antd.antdStrings.left
import web.typings.antd.antdStrings.right
import web.typings.antd.esTimelineTimelineItemMod.TimelineItemProps
import web.typings.antd.esTimelineTimelineMod.TimelineProps
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Timeline {
  
  object Item {
    
    @JSImport("antd", "Timeline.Item")
    @js.native
    val component: js.Object = js.native
    
    type Props = TimelineItemProps
    
    implicit def make(companion: Item.type): SharedBuilder_TimelineItemProps1061131858 = new SharedBuilder_TimelineItemProps1061131858(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TimelineItemProps): SharedBuilder_TimelineItemProps1061131858 = new SharedBuilder_TimelineItemProps1061131858(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Timeline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
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
  
  type Props = TimelineProps
  
  implicit def make(companion: Timeline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimelineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
