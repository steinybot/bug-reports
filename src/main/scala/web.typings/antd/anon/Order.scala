package web.typings.antd.anon

import web.typings.antd.esTableInterfaceMod.ColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order[RecordType] extends StObject {
  
  var column: ColumnType[RecordType] = js.native
  
  var order: web.typings.antd.esTableInterfaceMod.SortOrder = js.native
}
object Order {
  
  @scala.inline
  def apply[RecordType](column: ColumnType[RecordType]): Order[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], order = null)
    __obj.asInstanceOf[Order[RecordType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Order[_], RecordType] (val x: Self with Order[RecordType]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: web.typings.antd.esTableInterfaceMod.SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderNull: Self = StObject.set(x, "order", null)
  }
}
