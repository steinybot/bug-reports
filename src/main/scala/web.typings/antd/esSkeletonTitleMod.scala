package web.typings.antd

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSkeletonTitleMod extends Shortcut {
  
  @JSImport("antd/es/skeleton/Title", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SkeletonTitleProps] = js.native
  
  @js.native
  trait SkeletonTitleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
  }
  object SkeletonTitleProps {
    
    @scala.inline
    def apply(): SkeletonTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonTitleProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SkeletonTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SkeletonTitleProps]
  
  /* This means you don't have to write `default`, but can instead just say `esSkeletonTitleMod.foo` */
  override def _to: ReactComponentClass[SkeletonTitleProps] = default
}
