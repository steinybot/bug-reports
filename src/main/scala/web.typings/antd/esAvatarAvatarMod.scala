package web.typings.antd

import web.typings.antd.antdStrings._empty
import web.typings.antd.antdStrings.`use-credentials`
import web.typings.antd.antdStrings.anonymous
import web.typings.antd.antdStrings.circle
import web.typings.antd.antdStrings.square
import web.typings.antd.esAvatarAvatarContextMod.AvatarSize
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAvatarAvatarMod extends Shortcut {
  
  @JSImport("antd/es/avatar/avatar", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AvatarProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @js.native
  trait AvatarProps extends StObject {
    
    var alt: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var crossOrigin: js.UndefOr[_empty | anonymous | `use-credentials`] = js.native
    
    var draggable: js.UndefOr[Boolean] = js.native
    
    var gap: js.UndefOr[Double] = js.native
    
    /** Icon to be used in avatar */
    var icon: js.UndefOr[ReactElement] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], Unit]] = js.native
    
    var onError: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    /** Shape of avatar, options: `circle`, `square` */
    var shape: js.UndefOr[circle | square] = js.native
    
    var size: js.UndefOr[AvatarSize] = js.native
    
    /** Src of image avatar */
    var src: js.UndefOr[ReactElement] = js.native
    
    /** Srcset of image avatar */
    var srcSet: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object AvatarProps {
    
    @scala.inline
    def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AvatarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: _empty | anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnError(value: () => Boolean): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
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
      def setSize(value: AvatarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSrc(value: ReactElement): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AvatarProps with RefAttributes[HTMLSpanElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esAvatarAvatarMod.foo` */
  override def _to: ReactComponentClass[AvatarProps with RefAttributes[HTMLSpanElement]] = default
}
