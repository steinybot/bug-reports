package web.typings.rcCascader

import web.typings.rcCascader.esCascaderMod.DefaultOptionType
import web.typings.rcCascader.esCascaderMod.InternalFieldNames
import web.typings.rcCascader.esCascaderMod.SingleValueType
import web.typings.rcCascader.rcCascaderStrings.click
import web.typings.rcCascader.rcCascaderStrings.hover
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod extends Shortcut {
  
  @JSImport("rc-cascader/es/context", JSImport.Default)
  @js.native
  val default: Context[CascaderContextProps] = js.native
  
  @js.native
  trait CascaderContextProps extends StObject {
    
    var changeOnSelect: js.UndefOr[Boolean] = js.native
    
    var checkable: js.UndefOr[Boolean | ReactElement] = js.native
    
    var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.native
    
    var dropdownPrefixCls: js.UndefOr[String] = js.native
    
    var expandIcon: js.UndefOr[ReactElement] = js.native
    
    var expandTrigger: js.UndefOr[hover | click] = js.native
    
    var fieldNames: InternalFieldNames = js.native
    
    var halfValues: js.Array[SingleValueType] = js.native
    
    var loadData: js.UndefOr[js.Function1[/* selectOptions */ js.Array[DefaultOptionType], Unit]] = js.native
    
    var loadingIcon: js.UndefOr[ReactElement] = js.native
    
    def onSelect(valuePath: SingleValueType): Unit = js.native
    
    var options: js.UndefOr[js.Array[DefaultOptionType]] = js.native
    
    var searchOptions: js.Array[DefaultOptionType] = js.native
    
    var values: js.Array[SingleValueType] = js.native
  }
  object CascaderContextProps {
    
    @scala.inline
    def apply(
      fieldNames: InternalFieldNames,
      halfValues: js.Array[SingleValueType],
      onSelect: SingleValueType => Unit,
      searchOptions: js.Array[DefaultOptionType],
      values: js.Array[SingleValueType]
    ): CascaderContextProps = {
      val __obj = js.Dynamic.literal(fieldNames = fieldNames.asInstanceOf[js.Any], halfValues = halfValues.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), searchOptions = searchOptions.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[CascaderContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CascaderContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeOnSelect(value: Boolean): Self = StObject.set(x, "changeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOnSelectUndefined: Self = StObject.set(x, "changeOnSelect", js.undefined)
      
      @scala.inline
      def setCheckable(value: Boolean | ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableReactElement(value: ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setDropdownMenuColumnStyle(value: CSSProperties): Self = StObject.set(x, "dropdownMenuColumnStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMenuColumnStyleUndefined: Self = StObject.set(x, "dropdownMenuColumnStyle", js.undefined)
      
      @scala.inline
      def setDropdownPrefixCls(value: String): Self = StObject.set(x, "dropdownPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPrefixClsUndefined: Self = StObject.set(x, "dropdownPrefixCls", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: ReactElement): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setExpandTrigger(value: hover | click): Self = StObject.set(x, "expandTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandTriggerUndefined: Self = StObject.set(x, "expandTrigger", js.undefined)
      
      @scala.inline
      def setFieldNames(value: InternalFieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfValues(value: js.Array[SingleValueType]): Self = StObject.set(x, "halfValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfValuesVarargs(value: SingleValueType*): Self = StObject.set(x, "halfValues", js.Array(value :_*))
      
      @scala.inline
      def setLoadData(value: /* selectOptions */ js.Array[DefaultOptionType] => Unit): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      @scala.inline
      def setLoadingIcon(value: ReactElement): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SingleValueType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: DefaultOptionType*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSearchOptions(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "searchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchOptionsVarargs(value: DefaultOptionType*): Self = StObject.set(x, "searchOptions", js.Array(value :_*))
      
      @scala.inline
      def setValues(value: js.Array[SingleValueType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: SingleValueType*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  type _To = Context[CascaderContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esContextMod.foo` */
  override def _to: Context[CascaderContextProps] = default
}
