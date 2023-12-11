package web.typings.antd.esTableInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableCurrentDataSource[RecordType] extends StObject {
  
  var action: TableAction = js.native
  
  var currentDataSource: js.Array[RecordType] = js.native
}
object TableCurrentDataSource {
  
  @scala.inline
  def apply[RecordType](action: TableAction, currentDataSource: js.Array[RecordType]): TableCurrentDataSource[RecordType] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], currentDataSource = currentDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCurrentDataSource[RecordType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: TableCurrentDataSource[_], RecordType] (val x: Self with TableCurrentDataSource[RecordType]) extends AnyVal {
    
    @scala.inline
    def setAction(value: TableAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "currentDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "currentDataSource", js.Array(value :_*))
  }
}
