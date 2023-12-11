package web.typings.antd

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSkeletonNodeMod extends Shortcut {
  
  @JSImport("antd/es/skeleton/Node", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SkeletonNodeProps] = js.native
  
  /* Inlined parent std.Omit<antd.antd/es/skeleton/Element.SkeletonElementProps, 'size' | 'shape'> */
  @js.native
  trait SkeletonNodeProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var fullSize: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object SkeletonNodeProps {
    
    @scala.inline
    def apply(): SkeletonNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonNodeProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SkeletonNodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFullSize(value: Boolean): Self = StObject.set(x, "fullSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullSizeUndefined: Self = StObject.set(x, "fullSize", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SkeletonNodeProps]
  
  /* This means you don't have to write `default`, but can instead just say `esSkeletonNodeMod.foo` */
  override def _to: ReactComponentClass[SkeletonNodeProps] = default
}
