package web.typings.antd

import web.typings.antd.anon.PartialRecordBreakpointnu
import web.typings.antd.anon.keyinBreakpointnumber
import web.typings.antd.antdStrings.horizontal
import web.typings.antd.antdStrings.middle
import web.typings.antd.antdStrings.small
import web.typings.antd.antdStrings.vertical
import web.typings.antd.esDescriptionsDescriptionsContextMod.DescriptionsContextProps
import web.typings.antd.esDescriptionsItemMod.DescriptionsItemProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Context
import web.typings.react.mod.Key
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDescriptionsMod extends Shortcut {
  
  @JSImport("antd/es/descriptions", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DescriptionsProps] with CompoundedComponent = js.native
  
  @JSImport("antd/es/descriptions", "DescriptionsContext")
  @js.native
  val DescriptionsContext: Context[DescriptionsContextProps] = js.native
  
  @js.native
  trait CompoundedComponent extends StObject {
    
    var Item: ReactComponentClass[DescriptionsItemProps] = js.native
  }
  object CompoundedComponent {
    
    @scala.inline
    def apply(Item: ReactComponentClass[DescriptionsItemProps]): CompoundedComponent = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompoundedComponent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CompoundedComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: ReactComponentClass[DescriptionsItemProps]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<antd.antd/es/descriptions.InternalDescriptionsItemType, 'span'> */
  @js.native
  trait DescriptionsItemType extends StObject {
    
    var children: ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var contentStyle: js.UndefOr[CSSProperties] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var labelStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var span: js.UndefOr[Double | keyinBreakpointnumber] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object DescriptionsItemType {
    
    @scala.inline
    def apply(children: ReactElement): DescriptionsItemType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptionsItemType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DescriptionsItemType] (val x: Self) extends AnyVal {
      
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
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
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
      def setSpan(value: Double | keyinBreakpointnumber): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait DescriptionsProps extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    /**
      * @deprecated use `items` instead
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colon: js.UndefOr[Boolean] = js.native
    
    var column: js.UndefOr[Double | PartialRecordBreakpointnu] = js.native
    
    var contentStyle: js.UndefOr[CSSProperties] = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var items: js.UndefOr[js.Array[DescriptionsItemType]] = js.native
    
    var labelStyle: js.UndefOr[CSSProperties] = js.native
    
    var layout: js.UndefOr[horizontal | vertical] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[middle | small | web.typings.antd.antdStrings.default] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object DescriptionsProps {
    
    @scala.inline
    def apply(): DescriptionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescriptionsProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DescriptionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
      
      @scala.inline
      def setColumn(value: Double | PartialRecordBreakpointnu): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[DescriptionsItemType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: DescriptionsItemType*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      @scala.inline
      def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setSize(value: middle | small | web.typings.antd.antdStrings.default): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait InternalDescriptionsItemType
    extends StObject
       with DescriptionsItemProps {
    
    var key: js.UndefOr[Key] = js.native
  }
  object InternalDescriptionsItemType {
    
    @scala.inline
    def apply(children: ReactElement): InternalDescriptionsItemType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalDescriptionsItemType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InternalDescriptionsItemType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DescriptionsProps] with CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esDescriptionsMod.foo` */
  override def _to: ReactComponentClass[DescriptionsProps] with CompoundedComponent = default
}
