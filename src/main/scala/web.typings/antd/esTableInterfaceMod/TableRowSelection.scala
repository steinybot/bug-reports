package web.typings.antd.esTableInterfaceMod

import web.typings.antd.anon.PartialOmitCheckboxPropsc
import web.typings.antd.anon.Type
import web.typings.antd.esTableHooksUseSelectionMod.INTERNAL_SELECTION_ITEM
import web.typings.rcTable.libInterfaceMod.FixedType
import web.typings.rcTable.libInterfaceMod.GetComponentProps
import web.typings.rcTable.libInterfaceMod.RenderedCell
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.TdHTMLAttributes
import org.scalajs.dom.Event
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRowSelection[T] extends StObject {
  
  var checkStrictly: js.UndefOr[Boolean] = js.native
  
  var columnTitle: js.UndefOr[ReactElement | (js.Function1[/* checkboxNode */ ReactElement, ReactElement])] = js.native
  
  var columnWidth: js.UndefOr[String | Double] = js.native
  
  var defaultSelectedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  
  var fixed: js.UndefOr[FixedType] = js.native
  
  var getCheckboxProps: js.UndefOr[js.Function1[/* record */ T, PartialOmitCheckboxPropsc]] = js.native
  
  var hideSelectAll: js.UndefOr[Boolean] = js.native
  
  var onCell: js.UndefOr[GetComponentProps[T]] = js.native
  
  var onChange: js.UndefOr[
    js.Function3[
      /* selectedRowKeys */ js.Array[Key], 
      /* selectedRows */ js.Array[T], 
      /* info */ Type, 
      Unit
    ]
  ] = js.native
  
  var onSelect: js.UndefOr[SelectionSelectFn[T]] = js.native
  
  /** @deprecated This function is deprecated and should use `onChange` instead */
  var onSelectAll: js.UndefOr[
    js.Function3[
      /* selected */ Boolean, 
      /* selectedRows */ js.Array[T], 
      /* changeRows */ js.Array[T], 
      Unit
    ]
  ] = js.native
  
  /** @deprecated This function is deprecated and should use `onChange` instead */
  var onSelectInvert: js.UndefOr[js.Function1[/* selectedRowKeys */ js.Array[Key], Unit]] = js.native
  
  /** @deprecated This function is deprecated and should use `onChange` instead */
  var onSelectMultiple: js.UndefOr[
    js.Function3[
      /* selected */ Boolean, 
      /* selectedRows */ js.Array[T], 
      /* changeRows */ js.Array[T], 
      Unit
    ]
  ] = js.native
  
  /** @deprecated This function is deprecated and should use `onChange` instead */
  var onSelectNone: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Keep the selection keys in list even the key not exist in `dataSource` anymore */
  var preserveSelectedRowKeys: js.UndefOr[Boolean] = js.native
  
  var renderCell: js.UndefOr[
    js.Function4[
      /* value */ Boolean, 
      /* record */ T, 
      /* index */ Double, 
      /* originNode */ ReactElement, 
      ReactElement | RenderedCell[T]
    ]
  ] = js.native
  
  var selectedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  
  var selections: js.UndefOr[js.Array[INTERNAL_SELECTION_ITEM] | Boolean] = js.native
  
  var `type`: js.UndefOr[RowSelectionType] = js.native
}
object TableRowSelection {
  
  @scala.inline
  def apply[T](): TableRowSelection[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowSelection[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: TableRowSelection[_], T] (val x: Self with TableRowSelection[T]) extends AnyVal {
    
    @scala.inline
    def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckStrictlyUndefined: Self = StObject.set(x, "checkStrictly", js.undefined)
    
    @scala.inline
    def setColumnTitle(value: ReactElement | (js.Function1[/* checkboxNode */ ReactElement, ReactElement])): Self = StObject.set(x, "columnTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnTitleFunction1(value: /* checkboxNode */ ReactElement => ReactElement): Self = StObject.set(x, "columnTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnTitleReactElement(value: ReactElement): Self = StObject.set(x, "columnTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnTitleUndefined: Self = StObject.set(x, "columnTitle", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: String | Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    @scala.inline
    def setDefaultSelectedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultSelectedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSelectedRowKeysUndefined: Self = StObject.set(x, "defaultSelectedRowKeys", js.undefined)
    
    @scala.inline
    def setDefaultSelectedRowKeysVarargs(value: Key*): Self = StObject.set(x, "defaultSelectedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setGetCheckboxProps(value: /* record */ T => PartialOmitCheckboxPropsc): Self = StObject.set(x, "getCheckboxProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCheckboxPropsUndefined: Self = StObject.set(x, "getCheckboxProps", js.undefined)
    
    @scala.inline
    def setHideSelectAll(value: Boolean): Self = StObject.set(x, "hideSelectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSelectAllUndefined: Self = StObject.set(x, "hideSelectAll", js.undefined)
    
    @scala.inline
    def setOnCell(value: (T, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]): Self = StObject.set(x, "onCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCellUndefined: Self = StObject.set(x, "onCell", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* selectedRowKeys */ js.Array[Key], /* selectedRows */ js.Array[T], /* info */ Type) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnSelect(
      value: (T, /* selected */ Boolean, /* selectedRows */ js.Array[T], /* nativeEvent */ Event) => Unit
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnSelectAll(
      value: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Unit
    ): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
    
    @scala.inline
    def setOnSelectInvert(value: /* selectedRowKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onSelectInvert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectInvertUndefined: Self = StObject.set(x, "onSelectInvert", js.undefined)
    
    @scala.inline
    def setOnSelectMultiple(
      value: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Unit
    ): Self = StObject.set(x, "onSelectMultiple", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSelectMultipleUndefined: Self = StObject.set(x, "onSelectMultiple", js.undefined)
    
    @scala.inline
    def setOnSelectNone(value: () => Unit): Self = StObject.set(x, "onSelectNone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSelectNoneUndefined: Self = StObject.set(x, "onSelectNone", js.undefined)
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setPreserveSelectedRowKeys(value: Boolean): Self = StObject.set(x, "preserveSelectedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveSelectedRowKeysUndefined: Self = StObject.set(x, "preserveSelectedRowKeys", js.undefined)
    
    @scala.inline
    def setRenderCell(
      value: (/* value */ Boolean, /* record */ T, /* index */ Double, /* originNode */ ReactElement) => ReactElement | RenderedCell[T]
    ): Self = StObject.set(x, "renderCell", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRenderCellUndefined: Self = StObject.set(x, "renderCell", js.undefined)
    
    @scala.inline
    def setSelectedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRowKeysUndefined: Self = StObject.set(x, "selectedRowKeys", js.undefined)
    
    @scala.inline
    def setSelectedRowKeysVarargs(value: Key*): Self = StObject.set(x, "selectedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelections(value: js.Array[INTERNAL_SELECTION_ITEM] | Boolean): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsUndefined: Self = StObject.set(x, "selections", js.undefined)
    
    @scala.inline
    def setSelectionsVarargs(value: INTERNAL_SELECTION_ITEM*): Self = StObject.set(x, "selections", js.Array(value :_*))
    
    @scala.inline
    def setType(value: RowSelectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
