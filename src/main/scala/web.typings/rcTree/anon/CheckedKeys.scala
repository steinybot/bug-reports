package web.typings.rcTree.anon

import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.rcTreeInts.`-1`
import web.typings.rcTree.rcTreeInts.`0`
import web.typings.rcTree.rcTreeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckedKeys[TreeDataType /* <: DataNode | BasicDataNode */] extends StObject {
  
  var checkedKeys: js.Array[web.typings.react.mod.Key] = js.native
  
  var dragOverNodeKey: web.typings.react.mod.Key = js.native
  
  var dropPosition: `0` | `1` | `-1` = js.native
  
  var expandedKeys: js.Array[web.typings.react.mod.Key] = js.native
  
  var halfCheckedKeys: js.Array[web.typings.react.mod.Key] = js.native
  
  var keyEntities: web.typings.rcTree.esInterfaceMod.KeyEntities[TreeDataType] = js.native
  
  var loadedKeys: js.Array[web.typings.react.mod.Key] = js.native
  
  var loadingKeys: js.Array[web.typings.react.mod.Key] = js.native
  
  var selectedKeys: js.Array[web.typings.react.mod.Key] = js.native
}
object CheckedKeys {
  
  @scala.inline
  def apply[TreeDataType /* <: DataNode | BasicDataNode */](
    checkedKeys: js.Array[web.typings.react.mod.Key],
    dragOverNodeKey: web.typings.react.mod.Key,
    dropPosition: `0` | `1` | `-1`,
    expandedKeys: js.Array[web.typings.react.mod.Key],
    halfCheckedKeys: js.Array[web.typings.react.mod.Key],
    keyEntities: web.typings.rcTree.esInterfaceMod.KeyEntities[TreeDataType],
    loadedKeys: js.Array[web.typings.react.mod.Key],
    loadingKeys: js.Array[web.typings.react.mod.Key],
    selectedKeys: js.Array[web.typings.react.mod.Key]
  ): CheckedKeys[TreeDataType] = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedKeys[TreeDataType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: CheckedKeys[_], TreeDataType /* <: DataNode | BasicDataNode */] (val x: Self with CheckedKeys[TreeDataType]) extends AnyVal {
    
    @scala.inline
    def setCheckedKeys(value: js.Array[web.typings.react.mod.Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedKeysVarargs(value: web.typings.react.mod.Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
    
    @scala.inline
    def setDragOverNodeKey(value: web.typings.react.mod.Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPosition(value: `0` | `1` | `-1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeys(value: js.Array[web.typings.react.mod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeysVarargs(value: web.typings.react.mod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[web.typings.react.mod.Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfCheckedKeysVarargs(value: web.typings.react.mod.Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
    
    @scala.inline
    def setKeyEntities(value: web.typings.rcTree.esInterfaceMod.KeyEntities[TreeDataType]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedKeys(value: js.Array[web.typings.react.mod.Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedKeysVarargs(value: web.typings.react.mod.Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
    
    @scala.inline
    def setLoadingKeys(value: js.Array[web.typings.react.mod.Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingKeysVarargs(value: web.typings.react.mod.Key*): Self = StObject.set(x, "loadingKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedKeys(value: js.Array[web.typings.react.mod.Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedKeysVarargs(value: web.typings.react.mod.Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
  }
}
