package web.typings.antd

import web.typings.antd.antdStrings.circle
import web.typings.antd.antdStrings.large
import web.typings.antd.antdStrings.round
import web.typings.antd.antdStrings.small
import web.typings.antd.antdStrings.square
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSkeletonButtonMod extends Shortcut {
  
  @JSImport("antd/es/skeleton/Button", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SkeletonButtonProps] = js.native
  
  /* Inlined parent std.Omit<antd.antd/es/skeleton/Element.SkeletonElementProps, 'size'> */
  @js.native
  trait SkeletonButtonProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var block: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var shape: js.UndefOr[circle | square | round | web.typings.antd.antdStrings.default] = js.native
    
    var size: js.UndefOr[large | small | web.typings.antd.antdStrings.default] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object SkeletonButtonProps {
    
    @scala.inline
    def apply(): SkeletonButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonButtonProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SkeletonButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
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
      def setShape(value: circle | square | round | web.typings.antd.antdStrings.default): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: large | small | web.typings.antd.antdStrings.default): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SkeletonButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `esSkeletonButtonMod.foo` */
  override def _to: ReactComponentClass[SkeletonButtonProps] = default
}
