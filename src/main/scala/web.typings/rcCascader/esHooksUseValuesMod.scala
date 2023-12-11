package web.typings.rcCascader

import web.typings.rcCascader.esCascaderMod.SingleValueType
import web.typings.rcCascader.esHooksUseMissingValuesMod.GetMissValues
import web.typings.rcTree.esInterfaceMod.DataEntity
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.react.mod.Key
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseValuesMod {
  
  @JSImport("rc-cascader/es/hooks/useValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    multiple: Boolean,
    rawValues: js.Array[SingleValueType],
    getPathKeyEntities: js.Function0[Record[String, DataEntity[DataNode]]],
    getValueByKeyPath: js.Function1[/* pathKeys */ js.Array[Key], js.Array[SingleValueType]],
    getMissingValues: GetMissValues
  ): js.Tuple3[
    /* checkedValues */ js.Array[SingleValueType], 
    /* halfCheckedValues */ js.Array[SingleValueType], 
    /* missingCheckedValues */ js.Array[SingleValueType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(multiple.asInstanceOf[js.Any], rawValues.asInstanceOf[js.Any], getPathKeyEntities.asInstanceOf[js.Any], getValueByKeyPath.asInstanceOf[js.Any], getMissingValues.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    /* checkedValues */ js.Array[SingleValueType], 
    /* halfCheckedValues */ js.Array[SingleValueType], 
    /* missingCheckedValues */ js.Array[SingleValueType]
  ]]
}
