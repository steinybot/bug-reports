package web.typings.rcTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends StObject {
  
  var Column: FnCall_ = js.native
  
  var ColumnGroup: Fn0 = js.native
  
  var INTERNAL_HOOKS: /* "rc-table-internal-hook" */ String = js.native
  
  var Summary: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Summary */ Any = js.native
}
object Column {
  
  @scala.inline
  def apply(
    Column: FnCall_,
    ColumnGroup: Fn0,
    INTERNAL_HOOKS: /* "rc-table-internal-hook" */ String,
    Summary: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Summary */ Any
  ): Column = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], ColumnGroup = ColumnGroup.asInstanceOf[js.Any], INTERNAL_HOOKS = INTERNAL_HOOKS.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: FnCall_): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGroup(value: Fn0): Self = StObject.set(x, "ColumnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINTERNAL_HOOKS(value: /* "rc-table-internal-hook" */ String): Self = StObject.set(x, "INTERNAL_HOOKS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Summary */ Any): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
  }
}
