package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdStrings.circle
import web.typings.antd.antdStrings.default
import web.typings.antd.antdStrings.large
import web.typings.antd.antdStrings.round
import web.typings.antd.antdStrings.small
import web.typings.antd.antdStrings.square
import web.typings.antd.esSkeletonAvatarMod.AvatarProps
import web.typings.antd.esSkeletonButtonMod.SkeletonButtonProps
import web.typings.antd.esSkeletonImageMod.SkeletonImageProps
import web.typings.antd.esSkeletonInputMod.SkeletonInputProps
import web.typings.antd.esSkeletonNodeMod.SkeletonNodeProps
import web.typings.antd.esSkeletonParagraphMod.SkeletonParagraphProps
import web.typings.antd.esSkeletonSkeletonMod.SkeletonAvatarProps
import web.typings.antd.esSkeletonSkeletonMod.SkeletonProps
import web.typings.antd.esSkeletonTitleMod.SkeletonTitleProps
import web.typings.react.mod.CSSProperties
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Skeleton {
  
  object Avatar {
    
    @JSImport("antd", "Skeleton.Avatar")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def shape(value: circle | square): this.type = set("shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: large | small | default | Double): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    type Props = AvatarProps
    
    implicit def make(companion: Avatar.type): web.typings.antd.components.Skeleton.Avatar.Builder = new web.typings.antd.components.Skeleton.Avatar.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: AvatarProps): web.typings.antd.components.Skeleton.Avatar.Builder = new web.typings.antd.components.Skeleton.Avatar.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Button {
    
    @JSImport("antd", "Skeleton.Button")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def block(value: Boolean): this.type = set("block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def shape(value: circle | square | round | default): this.type = set("shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: large | small | default): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    type Props = SkeletonButtonProps
    
    implicit def make(companion: Button.type): web.typings.antd.components.Skeleton.Button.Builder = new web.typings.antd.components.Skeleton.Button.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SkeletonButtonProps): web.typings.antd.components.Skeleton.Button.Builder = new web.typings.antd.components.Skeleton.Button.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Image {
    
    @JSImport("antd", "Skeleton.Image")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    type Props = SkeletonImageProps
    
    implicit def make(companion: Image.type): web.typings.antd.components.Skeleton.Image.Builder = new web.typings.antd.components.Skeleton.Image.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SkeletonImageProps): web.typings.antd.components.Skeleton.Image.Builder = new web.typings.antd.components.Skeleton.Image.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Input {
    
    @JSImport("antd", "Skeleton.Input")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def block(value: Boolean): this.type = set("block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: large | small | default): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    type Props = SkeletonInputProps
    
    implicit def make(companion: Input.type): web.typings.antd.components.Skeleton.Input.Builder = new web.typings.antd.components.Skeleton.Input.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SkeletonInputProps): web.typings.antd.components.Skeleton.Input.Builder = new web.typings.antd.components.Skeleton.Input.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Node {
    
    @JSImport("antd", "Skeleton.Node")
    @js.native
    val component: js.Object = js.native
    
    type Props = SkeletonNodeProps
    
    implicit def make(companion: Node.type): SharedBuilder_SkeletonNodeProps667483374 = new SharedBuilder_SkeletonNodeProps667483374(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SkeletonNodeProps): SharedBuilder_SkeletonNodeProps667483374 = new SharedBuilder_SkeletonNodeProps667483374(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Skeleton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def avatar(value: SkeletonAvatarProps | Boolean): this.type = set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paragraph(value: SkeletonParagraphProps | Boolean): this.type = set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def round(value: Boolean): this.type = set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: SkeletonTitleProps | Boolean): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  type Props = SkeletonProps
  
  implicit def make(companion: Skeleton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SkeletonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
