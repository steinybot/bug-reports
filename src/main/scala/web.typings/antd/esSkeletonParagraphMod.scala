package web.typings.antd

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSkeletonParagraphMod extends Shortcut {
  
  @JSImport("antd/es/skeleton/Paragraph", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SkeletonParagraphProps] = js.native
  
  @js.native
  trait SkeletonParagraphProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var width: js.UndefOr[widthUnit | js.Array[widthUnit]] = js.native
  }
  object SkeletonParagraphProps {
    
    @scala.inline
    def apply(): SkeletonParagraphProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonParagraphProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SkeletonParagraphProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWidth(value: widthUnit | js.Array[widthUnit]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWidthVarargs(value: widthUnit*): Self = StObject.set(x, "width", js.Array(value :_*))
    }
  }
  
  type _To = ReactComponentClass[SkeletonParagraphProps]
  
  /* This means you don't have to write `default`, but can instead just say `esSkeletonParagraphMod.foo` */
  override def _to: ReactComponentClass[SkeletonParagraphProps] = default
  
  type widthUnit = Double | String
}
