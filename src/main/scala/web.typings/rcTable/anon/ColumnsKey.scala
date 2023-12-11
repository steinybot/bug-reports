package web.typings.rcTable.anon

import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.Key
import web.typings.react.mod.TdHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnsKey[RecordType] extends StObject {
  
  var columnsKey: js.Array[Key] = js.native
  
  var expandable: Boolean = js.native
  
  var expanded: Boolean = js.native
  
  var hasNestChildren: Boolean = js.native
  
  var nestExpandable: Boolean = js.native
  
  var record: RecordType = js.native
  
  var rowProps: HTMLAttributes[Any] with TdHTMLAttributes[Any] = js.native
  
  var rowSupportExpand: Boolean = js.native
}
object ColumnsKey {
  
  @scala.inline
  def apply[RecordType](
    columnsKey: js.Array[Key],
    expandable: Boolean,
    expanded: Boolean,
    hasNestChildren: Boolean,
    nestExpandable: Boolean,
    record: RecordType,
    rowProps: HTMLAttributes[Any] with TdHTMLAttributes[Any],
    rowSupportExpand: Boolean
  ): ColumnsKey[RecordType] = {
    val __obj = js.Dynamic.literal(columnsKey = columnsKey.asInstanceOf[js.Any], expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hasNestChildren = hasNestChildren.asInstanceOf[js.Any], nestExpandable = nestExpandable.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], rowProps = rowProps.asInstanceOf[js.Any], rowSupportExpand = rowSupportExpand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsKey[RecordType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ColumnsKey[_], RecordType] (val x: Self with ColumnsKey[RecordType]) extends AnyVal {
    
    @scala.inline
    def setColumnsKey(value: js.Array[Key]): Self = StObject.set(x, "columnsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsKeyVarargs(value: Key*): Self = StObject.set(x, "columnsKey", js.Array(value :_*))
    
    @scala.inline
    def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasNestChildren(value: Boolean): Self = StObject.set(x, "hasNestChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestExpandable(value: Boolean): Self = StObject.set(x, "nestExpandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowProps(value: HTMLAttributes[Any] with TdHTMLAttributes[Any]): Self = StObject.set(x, "rowProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSupportExpand(value: Boolean): Self = StObject.set(x, "rowSupportExpand", value.asInstanceOf[js.Any])
  }
}
