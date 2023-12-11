package web.typings.rcTree

import web.typings.rcTree.anon.Checked
import web.typings.rcTree.anon.DragOverNodeKey
import web.typings.rcTree.anon.ProcessProps
import web.typings.rcTree.anon.X
import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.DataEntity
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.Direction
import web.typings.rcTree.esInterfaceMod.FlattenNode
import web.typings.rcTree.esInterfaceMod.Key
import web.typings.rcTree.esInterfaceMod.KeyEntities
import web.typings.rcTree.esInterfaceMod.NodeElement
import web.typings.rcTree.esInterfaceMod.NodeInstance
import web.typings.rcTree.esTreeMod.AllowDrop
import web.typings.rcTree.esTreeMod.TreeProps
import org.scalajs.dom.Element
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMod {
  
  @JSImport("rc-tree/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrAdd(list: js.Array[Key], value: Key): js.Array[web.typings.react.mod.Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrAdd")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[web.typings.react.mod.Key]]
  
  @scala.inline
  def arrDel(list: js.Array[Key], value: Key): js.Array[web.typings.react.mod.Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrDel")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[web.typings.react.mod.Key]]
  
  @scala.inline
  def calcDropPosition[TreeDataType /* <: BasicDataNode */](
    event: SyntheticMouseEvent[Element],
    dragNode: NodeInstance[TreeDataType],
    targetNode: NodeInstance[TreeDataType],
    indent: Double,
    startMousePosition: X,
    allowDrop: AllowDrop[TreeDataType],
    flattenedNodes: js.Array[FlattenNode[TreeDataType]],
    keyEntities: KeyEntities[TreeDataType],
    expandKeys: js.Array[Key],
    direction: Direction
  ): DragOverNodeKey = (^.asInstanceOf[js.Dynamic].applyDynamic("calcDropPosition")(event.asInstanceOf[js.Any], dragNode.asInstanceOf[js.Any], targetNode.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], startMousePosition.asInstanceOf[js.Any], allowDrop.asInstanceOf[js.Any], flattenedNodes.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any], expandKeys.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[DragOverNodeKey]
  
  @scala.inline
  def calcSelectedKeys(selectedKeys: js.Array[Key], props: TreeProps[DataNode]): js.Array[web.typings.react.mod.Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcSelectedKeys")(selectedKeys.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[web.typings.react.mod.Key]]
  
  @scala.inline
  def conductExpandParent(keyList: js.Array[Key], keyEntities: KeyEntities[Any]): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("conductExpandParent")(keyList.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  @scala.inline
  def convertDataToTree(treeData: js.Array[DataNode]): js.Array[NodeElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToTree")(treeData.asInstanceOf[js.Any]).asInstanceOf[js.Array[NodeElement]]
  @scala.inline
  def convertDataToTree(treeData: js.Array[DataNode], processor: ProcessProps): js.Array[NodeElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToTree")(treeData.asInstanceOf[js.Any], processor.asInstanceOf[js.Any])).asInstanceOf[js.Array[NodeElement]]
  
  @scala.inline
  def getDragChildrenKeys[TreeDataType /* <: BasicDataNode */](dragNodeKey: Key, keyEntities: KeyEntities[TreeDataType]): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDragChildrenKeys")(dragNodeKey.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  @scala.inline
  def getPosition(level: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(level.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getPosition(level: Double, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(level.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isFirstChild[TreeDataType /* <: BasicDataNode */](treeNodeEntity: DataEntity[TreeDataType]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstChild")(treeNodeEntity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isLastChild[TreeDataType /* <: BasicDataNode */](treeNodeEntity: DataEntity[TreeDataType]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLastChild")(treeNodeEntity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isTreeNode(node: NodeElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTreeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def parseCheckedKeys(keys: Checked): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCheckedKeys")(keys.asInstanceOf[js.Any]).asInstanceOf[Any]
  @scala.inline
  def parseCheckedKeys(keys: js.Array[Key]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCheckedKeys")(keys.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def posToArr(pos: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("posToArr")(pos.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
