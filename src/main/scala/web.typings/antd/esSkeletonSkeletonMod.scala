package web.typings.antd

import web.typings.antd.antdStrings.circle
import web.typings.antd.antdStrings.large
import web.typings.antd.antdStrings.small
import web.typings.antd.antdStrings.square
import web.typings.antd.esSkeletonAvatarMod.AvatarProps
import web.typings.antd.esSkeletonButtonMod.SkeletonButtonProps
import web.typings.antd.esSkeletonImageMod.SkeletonImageProps
import web.typings.antd.esSkeletonInputMod.SkeletonInputProps
import web.typings.antd.esSkeletonNodeMod.SkeletonNodeProps
import web.typings.antd.esSkeletonParagraphMod.SkeletonParagraphProps
import web.typings.antd.esSkeletonTitleMod.SkeletonTitleProps
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSkeletonSkeletonMod extends Shortcut {
  
  @JSImport("antd/es/skeleton/Skeleton", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SkeletonProps] with CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent extends StObject {
    
    var Avatar: ReactComponentClass[AvatarProps] = js.native
    
    var Button: ReactComponentClass[SkeletonButtonProps] = js.native
    
    var Image: ReactComponentClass[SkeletonImageProps] = js.native
    
    var Input: ReactComponentClass[SkeletonInputProps] = js.native
    
    var Node: ReactComponentClass[SkeletonNodeProps] = js.native
  }
  object CompoundedComponent {
    
    @scala.inline
    def apply(
      Avatar: ReactComponentClass[AvatarProps],
      Button: ReactComponentClass[SkeletonButtonProps],
      Image: ReactComponentClass[SkeletonImageProps],
      Input: ReactComponentClass[SkeletonInputProps],
      Node: ReactComponentClass[SkeletonNodeProps]
    ): CompoundedComponent = {
      val __obj = js.Dynamic.literal(Avatar = Avatar.asInstanceOf[js.Any], Button = Button.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompoundedComponent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CompoundedComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar(value: ReactComponentClass[AvatarProps]): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: ReactComponentClass[SkeletonButtonProps]): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: ReactComponentClass[SkeletonImageProps]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: ReactComponentClass[SkeletonInputProps]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ReactComponentClass[SkeletonNodeProps]): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<antd.antd/es/skeleton/Avatar.AvatarProps, 'active'> */
  @js.native
  trait SkeletonAvatarProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var shape: js.UndefOr[circle | square] = js.native
    
    var size: js.UndefOr[large | small | web.typings.antd.antdStrings.default | Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object SkeletonAvatarProps {
    
    @scala.inline
    def apply(): SkeletonAvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonAvatarProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SkeletonAvatarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setShape(value: circle | square): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: large | small | web.typings.antd.antdStrings.default | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait SkeletonProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var avatar: js.UndefOr[SkeletonAvatarProps | Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var paragraph: js.UndefOr[SkeletonParagraphProps | Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var round: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[SkeletonTitleProps | Boolean] = js.native
  }
  object SkeletonProps {
    
    @scala.inline
    def apply(): SkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SkeletonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAvatar(value: SkeletonAvatarProps | Boolean): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setParagraph(value: SkeletonParagraphProps | Boolean): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: SkeletonTitleProps | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SkeletonProps] with CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esSkeletonSkeletonMod.foo` */
  override def _to: ReactComponentClass[SkeletonProps] with CompoundedComponent = default
}
