package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdStrings._empty
import web.typings.antd.antdStrings.`use-credentials`
import web.typings.antd.antdStrings.anonymous
import web.typings.antd.antdStrings.bottom
import web.typings.antd.antdStrings.circle
import web.typings.antd.antdStrings.click
import web.typings.antd.antdStrings.focus
import web.typings.antd.antdStrings.hover
import web.typings.antd.antdStrings.square
import web.typings.antd.antdStrings.top
import web.typings.antd.esAvatarAvatarContextMod.AvatarSize
import web.typings.antd.esAvatarAvatarMod.AvatarProps
import web.typings.antd.esAvatarGroupMod.GroupProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Avatar {
  
  object Group {
    
    @JSImport("antd", "Avatar.Group")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxCount(value: Double): this.type = set("maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxPopoverPlacement(value: top | bottom): this.type = set("maxPopoverPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxPopoverTrigger(value: hover | focus | click): this.type = set("maxPopoverTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxStyle(value: CSSProperties): this.type = set("maxStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def shape(value: circle | square): this.type = set("shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: AvatarSize): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    type Props = GroupProps
    
    implicit def make(companion: Group.type): web.typings.antd.components.Avatar.Group.Builder = new web.typings.antd.components.Avatar.Group.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: GroupProps): web.typings.antd.components.Avatar.Group.Builder = new web.typings.antd.components.Avatar.Group.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Avatar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.span.tag.type, HTMLSpanElement] {
    
    @scala.inline
    def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def crossOrigin(value: _empty | anonymous | `use-credentials`): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gap(value: Double): this.type = set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onError(value: () => Boolean): this.type = set("onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shape(value: circle | square): this.type = set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: AvatarSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def src(value: ReactElement): this.type = set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def srcSet(value: String): this.type = set("srcSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = AvatarProps with RefAttributes[HTMLSpanElement]
  
  implicit def make(companion: Avatar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AvatarProps with RefAttributes[HTMLSpanElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
