package web.typings.antd

import web.typings.antd.anon.EndKey
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeUtilsDictUtilMod {
  
  @JSImport("antd/es/tree/utils/dictUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def calcRangeKeys(param0: EndKey): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("calcRangeKeys")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  
  @scala.inline
  def convertDirectoryKeysToNodes(treeData: js.Array[DataNode], keys: js.Array[Key]): js.Array[DataNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDirectoryKeysToNodes")(treeData.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[DataNode]]
  @scala.inline
  def convertDirectoryKeysToNodes(treeData: js.Array[DataNode], keys: js.Array[Key], fieldNames: FieldNames): js.Array[DataNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDirectoryKeysToNodes")(treeData.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[DataNode]]
  
  type FieldNames = js.UndefOr[web.typings.rcTree.esInterfaceMod.FieldNames]
}
