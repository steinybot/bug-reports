package web.typings.antd

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDescriptionsItemMod extends Shortcut {
  
  @JSImport("antd/es/descriptions/Item", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DescriptionsItemProps] = js.native
  
  @js.native
  trait DescriptionsItemProps extends StObject {
    
    var children: ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var contentStyle: js.UndefOr[CSSProperties] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var labelStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var span: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object DescriptionsItemProps {
    
    @scala.inline
    def apply(children: ReactElement): DescriptionsItemProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptionsItemProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DescriptionsItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DescriptionsItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `esDescriptionsItemMod.foo` */
  override def _to: ReactComponentClass[DescriptionsItemProps] = default
}
