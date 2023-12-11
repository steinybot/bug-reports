package web.typings.rcTable

import web.typings.rcTable.anon.ColumnsKey
import web.typings.rcTable.anon.PickTableContextPropsanyp
import web.typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseRowInfoMod {
  
  @JSImport("rc-table/lib/hooks/useRowInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](record: RecordType, rowKey: Key, recordIndex: Double, indent: Double): PickTableContextPropsanyp with ColumnsKey[RecordType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], rowKey.asInstanceOf[js.Any], recordIndex.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[PickTableContextPropsanyp with ColumnsKey[RecordType]]
}
