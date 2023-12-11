package web.typings.rcTree

import web.typings.rcTree.anon.ChildrenPropName
import web.typings.rcTree.anon.DragOver
import web.typings.rcTree.anon.Index
import web.typings.rcTree.anon.KeyEntities
import web.typings.rcTree.anon.RequiredFieldNames
import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.DataEntity
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.EventDataNode
import web.typings.rcTree.esInterfaceMod.FieldNames
import web.typings.rcTree.esInterfaceMod.FlattenNode
import web.typings.rcTree.esInterfaceMod.GetKey
import web.typings.rcTree.esInterfaceMod.Key
import web.typings.rcTree.esInterfaceMod.NodeElement
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import web.typings.rcTree.rcTreeBooleans.`true`
import web.typings.std.Record
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsTreeUtilMod {
  
  @JSImport("rc-tree/es/utils/treeUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertDataToEntities(dataNodes: js.Array[DataNode]): KeyEntities = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any]).asInstanceOf[KeyEntities]
  @scala.inline
  def convertDataToEntities(dataNodes: js.Array[DataNode], param1: ChildrenPropName): KeyEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[KeyEntities]
  @scala.inline
  def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    param1: ChildrenPropName,
    /** @deprecated Use `config.externalGetKey` instead */
  legacyExternalGetKey: ExternalGetKey
  ): KeyEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], legacyExternalGetKey.asInstanceOf[js.Any])).asInstanceOf[KeyEntities]
  @scala.inline
  def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    param1: Unit,
    /** @deprecated Use `config.externalGetKey` instead */
  legacyExternalGetKey: ExternalGetKey
  ): KeyEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], legacyExternalGetKey.asInstanceOf[js.Any])).asInstanceOf[KeyEntities]
  
  @scala.inline
  def convertNodePropsToEventData[TreeDataType /* <: BasicDataNode */](props: TreeNodeProps[TreeDataType]): EventDataNode[TreeDataType] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertNodePropsToEventData")(props.asInstanceOf[js.Any]).asInstanceOf[EventDataNode[TreeDataType]]
  
  @scala.inline
  def convertTreeToData(rootNodes: ReactElement): js.Array[DataNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertTreeToData")(rootNodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[DataNode]]
  
  @scala.inline
  def fillFieldNames(): RequiredFieldNames = ^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")().asInstanceOf[RequiredFieldNames]
  @scala.inline
  def fillFieldNames(fieldNames: FieldNames): RequiredFieldNames = ^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")(fieldNames.asInstanceOf[js.Any]).asInstanceOf[RequiredFieldNames]
  
  @scala.inline
  def flattenTreeData[TreeDataType /* <: BasicDataNode */](treeNodeList: js.Array[TreeDataType], expandedKeys: js.Array[Key], fieldNames: FieldNames): js.Array[FlattenNode[TreeDataType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTreeData")(treeNodeList.asInstanceOf[js.Any], expandedKeys.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenNode[TreeDataType]]]
  
  @scala.inline
  def flattenTreeData_true[TreeDataType /* <: BasicDataNode */](treeNodeList: js.Array[TreeDataType], expandedKeys: `true`, fieldNames: FieldNames): js.Array[FlattenNode[TreeDataType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTreeData")(treeNodeList.asInstanceOf[js.Any], expandedKeys.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenNode[TreeDataType]]]
  
  @scala.inline
  def getKey(key: Key, pos: String): web.typings.react.mod.Key = (^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(key.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[web.typings.react.mod.Key]
  
  @scala.inline
  def getPosition(level: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(level.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getPosition(level: Double, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(level.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getTreeNodeProps[TreeDataType /* <: BasicDataNode */](key: Key, param1: TreeNodeRequiredProps[TreeDataType]): DragOver = (^.asInstanceOf[js.Dynamic].applyDynamic("getTreeNodeProps")(key.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[DragOver]
  
  @scala.inline
  def isTreeNode(node: NodeElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTreeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def traverseDataNodes(dataNodes: js.Array[DataNode], callback: js.Function1[/* data */ Index, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDataNodes")(dataNodes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def traverseDataNodes(
    dataNodes: js.Array[DataNode],
    callback: js.Function1[/* data */ Index, Unit],
    config: TraverseDataNodesConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDataNodes")(dataNodes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def traverseDataNodes(dataNodes: js.Array[DataNode], callback: js.Function1[/* data */ Index, Unit], config: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDataNodes")(dataNodes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def warningWithoutKey(treeData: js.Array[DataNode], fieldNames: FieldNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warningWithoutKey")(treeData.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ExternalGetKey = GetKey[DataNode] | String
  
  @js.native
  trait TraverseDataNodesConfig extends StObject {
    
    var childrenPropName: js.UndefOr[String] = js.native
    
    var externalGetKey: js.UndefOr[ExternalGetKey] = js.native
    
    var fieldNames: js.UndefOr[FieldNames] = js.native
  }
  object TraverseDataNodesConfig {
    
    @scala.inline
    def apply(): TraverseDataNodesConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraverseDataNodesConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TraverseDataNodesConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildrenPropName(value: String): Self = StObject.set(x, "childrenPropName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenPropNameUndefined: Self = StObject.set(x, "childrenPropName", js.undefined)
      
      @scala.inline
      def setExternalGetKey(value: ExternalGetKey): Self = StObject.set(x, "externalGetKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalGetKeyFunction2(value: (DataNode, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "externalGetKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExternalGetKeyUndefined: Self = StObject.set(x, "externalGetKey", js.undefined)
      
      @scala.inline
      def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    }
  }
  
  @js.native
  trait TreeNodeRequiredProps[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var checkedKeys: js.Array[Key] = js.native
    
    var dragOverNodeKey: Key = js.native
    
    var dropPosition: Double = js.native
    
    var expandedKeys: js.Array[Key] = js.native
    
    var halfCheckedKeys: js.Array[Key] = js.native
    
    var keyEntities: web.typings.rcTree.esInterfaceMod.KeyEntities[TreeDataType] = js.native
    
    var loadedKeys: js.Array[Key] = js.native
    
    var loadingKeys: js.Array[Key] = js.native
    
    var selectedKeys: js.Array[Key] = js.native
  }
  object TreeNodeRequiredProps {
    
    @scala.inline
    def apply[TreeDataType /* <: BasicDataNode */](
      checkedKeys: js.Array[Key],
      dragOverNodeKey: Key,
      dropPosition: Double,
      expandedKeys: js.Array[Key],
      halfCheckedKeys: js.Array[Key],
      keyEntities: web.typings.rcTree.esInterfaceMod.KeyEntities[TreeDataType],
      loadedKeys: js.Array[Key],
      loadingKeys: js.Array[Key],
      selectedKeys: js.Array[Key]
    ): TreeNodeRequiredProps[TreeDataType] = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeRequiredProps[TreeDataType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TreeNodeRequiredProps[_], TreeDataType /* <: BasicDataNode */] (val x: Self with TreeNodeRequiredProps[TreeDataType]) extends AnyVal {
      
      @scala.inline
      def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDragOverNodeKey(value: Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setKeyEntities(value: web.typings.rcTree.esInterfaceMod.KeyEntities[TreeDataType]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
      
      @scala.inline
      def setLoadingKeys(value: js.Array[Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingKeysVarargs(value: Key*): Self = StObject.set(x, "loadingKeys", js.Array(value :_*))
      
      @scala.inline
      def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Wrapper extends StObject {
    
    var keyEntities: web.typings.rcTree.esInterfaceMod.KeyEntities[Any] = js.native
    
    var posEntities: Record[String, DataEntity[DataNode]] = js.native
  }
  object Wrapper {
    
    @scala.inline
    def apply(
      keyEntities: web.typings.rcTree.esInterfaceMod.KeyEntities[Any],
      posEntities: Record[String, DataEntity[DataNode]]
    ): Wrapper = {
      val __obj = js.Dynamic.literal(keyEntities = keyEntities.asInstanceOf[js.Any], posEntities = posEntities.asInstanceOf[js.Any])
      __obj.asInstanceOf[Wrapper]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Wrapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyEntities(value: web.typings.rcTree.esInterfaceMod.KeyEntities[Any]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosEntities(value: Record[String, DataEntity[DataNode]]): Self = StObject.set(x, "posEntities", value.asInstanceOf[js.Any])
    }
  }
}
