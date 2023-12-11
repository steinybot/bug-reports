package web.typings.rcTable

import web.typings.rcTable.libInterfaceMod.GetRowKey
import web.typings.rcTable.libInterfaceMod.Key
import web.typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseFlattenRecordsMod {
  
  @JSImport("rc-table/lib/hooks/useFlattenRecords", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](data: js.Array[T], childrenColumnName: String, expandedKeys: Set[Key], getRowKey: GetRowKey[T]): js.Array[FlattenData[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], childrenColumnName.asInstanceOf[js.Any], expandedKeys.asInstanceOf[js.Any], getRowKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenData[T]]]
  
  @js.native
  trait FlattenData[RecordType] extends StObject {
    
    var indent: Double = js.native
    
    var index: Double = js.native
    
    var record: RecordType = js.native
  }
  object FlattenData {
    
    @scala.inline
    def apply[RecordType](indent: Double, index: Double, record: RecordType): FlattenData[RecordType] = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenData[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FlattenData[_], RecordType] (val x: Self with FlattenData[RecordType]) extends AnyVal {
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    }
  }
}
