package web.typings.rcTable

import web.typings.rcTable.libInterfaceMod.GetRowKey
import web.typings.rcTable.libInterfaceMod.Key
import web.typings.rcTable.libInterfaceMod.RenderExpandIconProps
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsExpandUtilMod {
  
  @JSImport("rc-table/lib/utils/expandUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findAllChildrenKeys[RecordType](data: js.Array[RecordType], getRowKey: GetRowKey[RecordType], childrenColumnName: String): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllChildrenKeys")(data.asInstanceOf[js.Any], getRowKey.asInstanceOf[js.Any], childrenColumnName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  @scala.inline
  def renderExpandIcon[RecordType](param0: RenderExpandIconProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderExpandIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
