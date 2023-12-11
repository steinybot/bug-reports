package web.typings.antd

import web.typings.antd.antdStrings.auto
import web.typings.antd.antdStrings.none
import web.typings.antd.esUtilTypeMod.LiteralUnion
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGridColMod extends Shortcut {
  
  @JSImport("antd/es/grid/col", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ColProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait ColProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var flex: js.UndefOr[FlexType] = js.native
    
    var lg: js.UndefOr[ColSpanType | ColSize] = js.native
    
    var md: js.UndefOr[ColSpanType | ColSize] = js.native
    
    var offset: js.UndefOr[ColSpanType] = js.native
    
    var order: js.UndefOr[ColSpanType] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var pull: js.UndefOr[ColSpanType] = js.native
    
    var push: js.UndefOr[ColSpanType] = js.native
    
    var sm: js.UndefOr[ColSpanType | ColSize] = js.native
    
    var span: js.UndefOr[ColSpanType] = js.native
    
    var xl: js.UndefOr[ColSpanType | ColSize] = js.native
    
    var xs: js.UndefOr[ColSpanType | ColSize] = js.native
    
    var xxl: js.UndefOr[ColSpanType | ColSize] = js.native
  }
  object ColProps {
    
    @scala.inline
    def apply(): ColProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlex(value: FlexType): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setLg(value: ColSpanType | ColSize): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: ColSpanType | ColSize): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setOffset(value: ColSpanType): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrder(value: ColSpanType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPull(value: ColSpanType): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      @scala.inline
      def setPush(value: ColSpanType): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      @scala.inline
      def setSm(value: ColSpanType | ColSize): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setSpan(value: ColSpanType): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setXl(value: ColSpanType | ColSize): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: ColSpanType | ColSize): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      @scala.inline
      def setXxl(value: ColSpanType | ColSize): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  @js.native
  trait ColSize extends StObject {
    
    var flex: js.UndefOr[FlexType] = js.native
    
    var offset: js.UndefOr[ColSpanType] = js.native
    
    var order: js.UndefOr[ColSpanType] = js.native
    
    var pull: js.UndefOr[ColSpanType] = js.native
    
    var push: js.UndefOr[ColSpanType] = js.native
    
    var span: js.UndefOr[ColSpanType] = js.native
  }
  object ColSize {
    
    @scala.inline
    def apply(): ColSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColSize]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlex(value: FlexType): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setOffset(value: ColSpanType): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrder(value: ColSpanType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setPull(value: ColSpanType): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      @scala.inline
      def setPush(value: ColSpanType): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      @scala.inline
      def setSpan(value: ColSpanType): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    }
  }
  
  type ColSpanType = Double | String
  
  type FlexType = Double | (LiteralUnion[none | auto])
  
  type _To = ReactComponentClass[ColProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esGridColMod.foo` */
  override def _to: ReactComponentClass[ColProps with RefAttributes[HTMLDivElement]] = default
}
