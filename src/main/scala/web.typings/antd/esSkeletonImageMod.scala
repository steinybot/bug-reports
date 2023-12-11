package web.typings.antd

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSkeletonImageMod extends Shortcut {
  
  @JSImport("antd/es/skeleton/Image", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SkeletonImageProps] = js.native
  
  /* Inlined parent std.Omit<antd.antd/es/skeleton/Element.SkeletonElementProps, 'size' | 'shape'> */
  @js.native
  trait SkeletonImageProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object SkeletonImageProps {
    
    @scala.inline
    def apply(): SkeletonImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonImageProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SkeletonImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
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
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SkeletonImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `esSkeletonImageMod.foo` */
  override def _to: ReactComponentClass[SkeletonImageProps] = default
}
