package web.typings.antd

import web.typings.antd.esTableInterfaceMod.FilterSearchType
import web.typings.antd.esTableInterfaceMod.TableLocale
import web.typings.react.mod.ChangeEvent
import web.typings.react.mod.JSX.Element
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableHooksUseFilterFilterSearchMod {
  
  @JSImport("antd/es/table/hooks/useFilter/FilterSearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](param0: FilterSearchProps[RecordType]): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @js.native
  trait FilterSearchProps[RecordType] extends StObject {
    
    var filterSearch: FilterSearchType[RecordType] = js.native
    
    var locale: TableLocale = js.native
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    var tablePrefixCls: String = js.native
    
    var value: String = js.native
  }
  object FilterSearchProps {
    
    @scala.inline
    def apply[RecordType](
      filterSearch: FilterSearchType[RecordType],
      locale: TableLocale,
      onChange: ChangeEvent[HTMLInputElement] => Unit,
      tablePrefixCls: String,
      value: String
    ): FilterSearchProps[RecordType] = {
      val __obj = js.Dynamic.literal(filterSearch = filterSearch.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), tablePrefixCls = tablePrefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterSearchProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FilterSearchProps[_], RecordType] (val x: Self with FilterSearchProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setFilterSearch(value: FilterSearchType[RecordType]): Self = StObject.set(x, "filterSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterSearchFunction2(value: (/* input */ String, RecordType) => Boolean): Self = StObject.set(x, "filterSearch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTablePrefixCls(value: String): Self = StObject.set(x, "tablePrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
