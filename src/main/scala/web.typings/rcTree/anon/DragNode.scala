package web.typings.rcTree.anon

import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.EventDataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragNode[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var dragNode: EventDataNode[TreeDataType] = js.native
  
  var dragNodesKeys: js.Array[web.typings.rcTree.esInterfaceMod.Key] = js.native
  
  var dropPosition: Double = js.native
  
  var dropToGap: Boolean = js.native
}
object DragNode {
  
  @scala.inline
  def apply[TreeDataType /* <: BasicDataNode */](
    dragNode: EventDataNode[TreeDataType],
    dragNodesKeys: js.Array[web.typings.rcTree.esInterfaceMod.Key],
    dropPosition: Double,
    dropToGap: Boolean
  ): DragNode[TreeDataType] = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], dropToGap = dropToGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragNode[TreeDataType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DragNode[_], TreeDataType /* <: BasicDataNode */] (val x: Self with DragNode[TreeDataType]) extends AnyVal {
    
    @scala.inline
    def setDragNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "dragNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragNodesKeys(value: js.Array[web.typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "dragNodesKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragNodesKeysVarargs(value: web.typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "dragNodesKeys", js.Array(value :_*))
    
    @scala.inline
    def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropToGap(value: Boolean): Self = StObject.set(x, "dropToGap", value.asInstanceOf[js.Any])
  }
}
