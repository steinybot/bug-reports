package web.typings.rcTree.anon

import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.EventDataNode
import web.typings.rcTree.rcTreeStrings.load
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventNode[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var event: load = js.native
  
  var node: EventDataNode[TreeDataType] = js.native
}
object EventNode {
  
  @scala.inline
  def apply[TreeDataType /* <: BasicDataNode */](node: EventDataNode[TreeDataType]): EventNode[TreeDataType] = {
    val __obj = js.Dynamic.literal(event = "load", node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventNode[TreeDataType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: EventNode[_], TreeDataType /* <: BasicDataNode */] (val x: Self with EventNode[TreeDataType]) extends AnyVal {
    
    @scala.inline
    def setEvent(value: load): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
