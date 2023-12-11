package web.typings.antd.anon

import web.typings.antd.esTreeUtilsDictUtilMod.FieldNames
import web.typings.rcTree.esInterfaceMod.DataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndKey extends StObject {
  
  var endKey: js.UndefOr[web.typings.rcTree.esInterfaceMod.Key] = js.native
  
  var expandedKeys: js.Array[web.typings.rcTree.esInterfaceMod.Key] = js.native
  
  var fieldNames: js.UndefOr[FieldNames] = js.native
  
  var startKey: js.UndefOr[web.typings.rcTree.esInterfaceMod.Key] = js.native
  
  var treeData: js.Array[DataNode] = js.native
}
object EndKey {
  
  @scala.inline
  def apply(expandedKeys: js.Array[web.typings.rcTree.esInterfaceMod.Key], treeData: js.Array[DataNode]): EndKey = {
    val __obj = js.Dynamic.literal(expandedKeys = expandedKeys.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndKey]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: EndKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndKeyUndefined: Self = StObject.set(x, "endKey", js.undefined)
    
    @scala.inline
    def setExpandedKeys(value: js.Array[web.typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeysVarargs(value: web.typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    
    @scala.inline
    def setStartKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartKeyUndefined: Self = StObject.set(x, "startKey", js.undefined)
    
    @scala.inline
    def setTreeData(value: js.Array[DataNode]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: DataNode*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
