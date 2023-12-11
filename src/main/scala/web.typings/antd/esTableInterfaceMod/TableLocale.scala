package web.typings.antd.esTableInterfaceMod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableLocale extends StObject {
  
  var cancelSort: js.UndefOr[String] = js.native
  
  var collapse: js.UndefOr[String] = js.native
  
  var emptyText: js.UndefOr[ReactElement | js.Function0[ReactElement]] = js.native
  
  var expand: js.UndefOr[String] = js.native
  
  var filterCheckall: js.UndefOr[ReactElement] = js.native
  
  var filterConfirm: js.UndefOr[ReactElement] = js.native
  
  var filterEmptyText: js.UndefOr[ReactElement] = js.native
  
  var filterReset: js.UndefOr[ReactElement] = js.native
  
  var filterSearchPlaceholder: js.UndefOr[String] = js.native
  
  var filterTitle: js.UndefOr[String] = js.native
  
  var selectAll: js.UndefOr[ReactElement] = js.native
  
  var selectInvert: js.UndefOr[ReactElement] = js.native
  
  var selectNone: js.UndefOr[ReactElement] = js.native
  
  var selectionAll: js.UndefOr[ReactElement] = js.native
  
  var sortTitle: js.UndefOr[String] = js.native
  
  var triggerAsc: js.UndefOr[String] = js.native
  
  var triggerDesc: js.UndefOr[String] = js.native
}
object TableLocale {
  
  @scala.inline
  def apply(): TableLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableLocale]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: TableLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelSort(value: String): Self = StObject.set(x, "cancelSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelSortUndefined: Self = StObject.set(x, "cancelSort", js.undefined)
    
    @scala.inline
    def setCollapse(value: String): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setEmptyText(value: ReactElement | js.Function0[ReactElement]): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyTextFunction0(value: () => ReactElement): Self = StObject.set(x, "emptyText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmptyTextReactElement(value: ReactElement): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
    
    @scala.inline
    def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setFilterCheckall(value: ReactElement): Self = StObject.set(x, "filterCheckall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterCheckallUndefined: Self = StObject.set(x, "filterCheckall", js.undefined)
    
    @scala.inline
    def setFilterConfirm(value: ReactElement): Self = StObject.set(x, "filterConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterConfirmUndefined: Self = StObject.set(x, "filterConfirm", js.undefined)
    
    @scala.inline
    def setFilterEmptyText(value: ReactElement): Self = StObject.set(x, "filterEmptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterEmptyTextUndefined: Self = StObject.set(x, "filterEmptyText", js.undefined)
    
    @scala.inline
    def setFilterReset(value: ReactElement): Self = StObject.set(x, "filterReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterResetUndefined: Self = StObject.set(x, "filterReset", js.undefined)
    
    @scala.inline
    def setFilterSearchPlaceholder(value: String): Self = StObject.set(x, "filterSearchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSearchPlaceholderUndefined: Self = StObject.set(x, "filterSearchPlaceholder", js.undefined)
    
    @scala.inline
    def setFilterTitle(value: String): Self = StObject.set(x, "filterTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTitleUndefined: Self = StObject.set(x, "filterTitle", js.undefined)
    
    @scala.inline
    def setSelectAll(value: ReactElement): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    @scala.inline
    def setSelectInvert(value: ReactElement): Self = StObject.set(x, "selectInvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectInvertUndefined: Self = StObject.set(x, "selectInvert", js.undefined)
    
    @scala.inline
    def setSelectNone(value: ReactElement): Self = StObject.set(x, "selectNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectNoneUndefined: Self = StObject.set(x, "selectNone", js.undefined)
    
    @scala.inline
    def setSelectionAll(value: ReactElement): Self = StObject.set(x, "selectionAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionAllUndefined: Self = StObject.set(x, "selectionAll", js.undefined)
    
    @scala.inline
    def setSortTitle(value: String): Self = StObject.set(x, "sortTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortTitleUndefined: Self = StObject.set(x, "sortTitle", js.undefined)
    
    @scala.inline
    def setTriggerAsc(value: String): Self = StObject.set(x, "triggerAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerAscUndefined: Self = StObject.set(x, "triggerAsc", js.undefined)
    
    @scala.inline
    def setTriggerDesc(value: String): Self = StObject.set(x, "triggerDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerDescUndefined: Self = StObject.set(x, "triggerDesc", js.undefined)
  }
}
