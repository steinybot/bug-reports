package web.typings.antd.anon

import web.typings.antd.antdStrings.SELECT_ALL
import web.typings.antd.antdStrings.SELECT_INVERT
import web.typings.antd.antdStrings.SELECT_NONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends StObject {
  
  var Column: FnCall_ = js.native
  
  var ColumnGroup: Fn2 = js.native
  
  var EXPAND_COLUMN: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EXPAND_COLUMN */ Any = js.native
  
  var SELECTION_ALL: SELECT_ALL = js.native
  
  var SELECTION_INVERT: SELECT_INVERT = js.native
  
  var SELECTION_NONE: SELECT_NONE = js.native
  
  var Summary: TypeofSummary = js.native
  
  var displayName: js.UndefOr[String] = js.native
}
object Column {
  
  @scala.inline
  def apply(
    Column: FnCall_,
    ColumnGroup: Fn2,
    EXPAND_COLUMN: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EXPAND_COLUMN */ Any,
    Summary: TypeofSummary
  ): Column = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], ColumnGroup = ColumnGroup.asInstanceOf[js.Any], EXPAND_COLUMN = EXPAND_COLUMN.asInstanceOf[js.Any], SELECTION_ALL = "SELECT_ALL", SELECTION_INVERT = "SELECT_INVERT", SELECTION_NONE = "SELECT_NONE", Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: FnCall_): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGroup(value: Fn2): Self = StObject.set(x, "ColumnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEXPAND_COLUMN(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EXPAND_COLUMN */ Any): Self = StObject.set(x, "EXPAND_COLUMN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELECTION_ALL(value: SELECT_ALL): Self = StObject.set(x, "SELECTION_ALL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELECTION_INVERT(value: SELECT_INVERT): Self = StObject.set(x, "SELECTION_INVERT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELECTION_NONE(value: SELECT_NONE): Self = StObject.set(x, "SELECTION_NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: TypeofSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
  }
}
