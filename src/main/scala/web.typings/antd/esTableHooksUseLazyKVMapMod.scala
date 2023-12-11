package web.typings.antd

import web.typings.antd.esTableInterfaceMod.Key
import web.typings.rcTable.libInterfaceMod.GetRowKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableHooksUseLazyKVMapMod {
  
  @JSImport("antd/es/table/hooks/useLazyKVMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](data: js.Array[RecordType], childrenColumnName: String, getRowKey: GetRowKey[RecordType]): js.Array[js.Function1[/* key */ Key, RecordType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], childrenColumnName.asInstanceOf[js.Any], getRowKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function1[/* key */ Key, RecordType]]]
}
