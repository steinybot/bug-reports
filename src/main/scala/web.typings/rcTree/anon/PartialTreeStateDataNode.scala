package web.typings.rcTree.anon

import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.FieldNames
import web.typings.rcTree.esInterfaceMod.FlattenNode
import web.typings.rcTree.esTreeMod.TreeProps
import web.typings.rcTree.rcTreeInts.`-1`
import web.typings.rcTree.rcTreeInts.`0`
import web.typings.rcTree.rcTreeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rc-tree.rc-tree/es/Tree.TreeState<rc-tree.rc-tree/es/interface.DataNode>> */
@js.native
trait PartialTreeStateDataNode extends StObject {
  
  var activeKey: js.UndefOr[web.typings.rcTree.esInterfaceMod.Key | Null] = js.native
  
  var checkedKeys: js.UndefOr[js.Array[web.typings.rcTree.esInterfaceMod.Key]] = js.native
  
  var dragChildrenKeys: js.UndefOr[js.Array[web.typings.rcTree.esInterfaceMod.Key]] = js.native
  
  var dragOverNodeKey: js.UndefOr[web.typings.rcTree.esInterfaceMod.Key | Null] = js.native
  
  var draggingNodeKey: js.UndefOr[web.typings.rcTree.esInterfaceMod.Key] = js.native
  
  var dropAllowed: js.UndefOr[Boolean] = js.native
  
  var dropContainerKey: js.UndefOr[web.typings.rcTree.esInterfaceMod.Key | Null] = js.native
  
  var dropLevelOffset: js.UndefOr[Double | Null] = js.native
  
  var dropPosition: js.UndefOr[`-1` | `0` | `1` | Null] = js.native
  
  var dropTargetKey: js.UndefOr[web.typings.rcTree.esInterfaceMod.Key | Null] = js.native
  
  var dropTargetPos: js.UndefOr[String | Null] = js.native
  
  var expandedKeys: js.UndefOr[js.Array[web.typings.rcTree.esInterfaceMod.Key]] = js.native
  
  var fieldNames: js.UndefOr[FieldNames] = js.native
  
  var flattenNodes: js.UndefOr[js.Array[FlattenNode[DataNode]]] = js.native
  
  var focused: js.UndefOr[Boolean] = js.native
  
  var halfCheckedKeys: js.UndefOr[js.Array[web.typings.rcTree.esInterfaceMod.Key]] = js.native
  
  var indent: js.UndefOr[Double | Null] = js.native
  
  var keyEntities: js.UndefOr[web.typings.rcTree.esInterfaceMod.KeyEntities[DataNode]] = js.native
  
  var listChanging: js.UndefOr[Boolean] = js.native
  
  var loadedKeys: js.UndefOr[js.Array[web.typings.rcTree.esInterfaceMod.Key]] = js.native
  
  var loadingKeys: js.UndefOr[js.Array[web.typings.rcTree.esInterfaceMod.Key]] = js.native
  
  var prevProps: js.UndefOr[TreeProps[DataNode]] = js.native
  
  var selectedKeys: js.UndefOr[js.Array[web.typings.rcTree.esInterfaceMod.Key]] = js.native
  
  var treeData: js.UndefOr[js.Array[DataNode]] = js.native
}
object PartialTreeStateDataNode {
  
  @scala.inline
  def apply(): PartialTreeStateDataNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTreeStateDataNode]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PartialTreeStateDataNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveKeyNull: Self = StObject.set(x, "activeKey", null)
    
    @scala.inline
    def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    @scala.inline
    def setCheckedKeys(value: js.Array[web.typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedKeysUndefined: Self = StObject.set(x, "checkedKeys", js.undefined)
    
    @scala.inline
    def setCheckedKeysVarargs(value: web.typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
    
    @scala.inline
    def setDragChildrenKeys(value: js.Array[web.typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "dragChildrenKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragChildrenKeysUndefined: Self = StObject.set(x, "dragChildrenKeys", js.undefined)
    
    @scala.inline
    def setDragChildrenKeysVarargs(value: web.typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "dragChildrenKeys", js.Array(value :_*))
    
    @scala.inline
    def setDragOverNodeKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOverNodeKeyNull: Self = StObject.set(x, "dragOverNodeKey", null)
    
    @scala.inline
    def setDragOverNodeKeyUndefined: Self = StObject.set(x, "dragOverNodeKey", js.undefined)
    
    @scala.inline
    def setDraggingNodeKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "draggingNodeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggingNodeKeyUndefined: Self = StObject.set(x, "draggingNodeKey", js.undefined)
    
    @scala.inline
    def setDropAllowed(value: Boolean): Self = StObject.set(x, "dropAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropAllowedUndefined: Self = StObject.set(x, "dropAllowed", js.undefined)
    
    @scala.inline
    def setDropContainerKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dropContainerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropContainerKeyNull: Self = StObject.set(x, "dropContainerKey", null)
    
    @scala.inline
    def setDropContainerKeyUndefined: Self = StObject.set(x, "dropContainerKey", js.undefined)
    
    @scala.inline
    def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropLevelOffsetNull: Self = StObject.set(x, "dropLevelOffset", null)
    
    @scala.inline
    def setDropLevelOffsetUndefined: Self = StObject.set(x, "dropLevelOffset", js.undefined)
    
    @scala.inline
    def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPositionNull: Self = StObject.set(x, "dropPosition", null)
    
    @scala.inline
    def setDropPositionUndefined: Self = StObject.set(x, "dropPosition", js.undefined)
    
    @scala.inline
    def setDropTargetKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dropTargetKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTargetKeyNull: Self = StObject.set(x, "dropTargetKey", null)
    
    @scala.inline
    def setDropTargetKeyUndefined: Self = StObject.set(x, "dropTargetKey", js.undefined)
    
    @scala.inline
    def setDropTargetPos(value: String): Self = StObject.set(x, "dropTargetPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTargetPosNull: Self = StObject.set(x, "dropTargetPos", null)
    
    @scala.inline
    def setDropTargetPosUndefined: Self = StObject.set(x, "dropTargetPos", js.undefined)
    
    @scala.inline
    def setExpandedKeys(value: js.Array[web.typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
    
    @scala.inline
    def setExpandedKeysVarargs(value: web.typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    
    @scala.inline
    def setFlattenNodes(value: js.Array[FlattenNode[DataNode]]): Self = StObject.set(x, "flattenNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenNodesUndefined: Self = StObject.set(x, "flattenNodes", js.undefined)
    
    @scala.inline
    def setFlattenNodesVarargs(value: FlattenNode[DataNode]*): Self = StObject.set(x, "flattenNodes", js.Array(value :_*))
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[web.typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfCheckedKeysUndefined: Self = StObject.set(x, "halfCheckedKeys", js.undefined)
    
    @scala.inline
    def setHalfCheckedKeysVarargs(value: web.typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentNull: Self = StObject.set(x, "indent", null)
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setKeyEntities(value: web.typings.rcTree.esInterfaceMod.KeyEntities[DataNode]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyEntitiesUndefined: Self = StObject.set(x, "keyEntities", js.undefined)
    
    @scala.inline
    def setListChanging(value: Boolean): Self = StObject.set(x, "listChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListChangingUndefined: Self = StObject.set(x, "listChanging", js.undefined)
    
    @scala.inline
    def setLoadedKeys(value: js.Array[web.typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedKeysUndefined: Self = StObject.set(x, "loadedKeys", js.undefined)
    
    @scala.inline
    def setLoadedKeysVarargs(value: web.typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
    
    @scala.inline
    def setLoadingKeys(value: js.Array[web.typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingKeysUndefined: Self = StObject.set(x, "loadingKeys", js.undefined)
    
    @scala.inline
    def setLoadingKeysVarargs(value: web.typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "loadingKeys", js.Array(value :_*))
    
    @scala.inline
    def setPrevProps(value: TreeProps[DataNode]): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
    
    @scala.inline
    def setSelectedKeys(value: js.Array[web.typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
    
    @scala.inline
    def setSelectedKeysVarargs(value: web.typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setTreeData(value: js.Array[DataNode]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
    
    @scala.inline
    def setTreeDataVarargs(value: DataNode*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
