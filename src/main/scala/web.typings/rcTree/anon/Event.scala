package web.typings.rcTree.anon

import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.EventDataNode
import web.typings.rcTree.rcTreeStrings.select
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var event: select = js.native
  
  var nativeEvent: MouseEvent = js.native
  
  var node: EventDataNode[TreeDataType] = js.native
  
  var selected: Boolean = js.native
  
  var selectedNodes: js.Array[TreeDataType] = js.native
}
object Event {
  
  @scala.inline
  def apply[TreeDataType /* <: BasicDataNode */](
    nativeEvent: MouseEvent,
    node: EventDataNode[TreeDataType],
    selected: Boolean,
    selectedNodes: js.Array[TreeDataType]
  ): Event[TreeDataType] = {
    val __obj = js.Dynamic.literal(event = "select", nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedNodes = selectedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[TreeDataType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Event[_], TreeDataType /* <: BasicDataNode */] (val x: Self with Event[TreeDataType]) extends AnyVal {
    
    @scala.inline
    def setEvent(value: select): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedNodes(value: js.Array[TreeDataType]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedNodesVarargs(value: TreeDataType*): Self = StObject.set(x, "selectedNodes", js.Array(value :_*))
  }
}
