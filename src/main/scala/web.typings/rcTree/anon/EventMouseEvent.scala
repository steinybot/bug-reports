package web.typings.rcTree.anon

import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.EventDataNode
import org.scalajs.dom.Element
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMouseEvent[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var event: SyntheticMouseEvent[Element] = js.native
  
  var node: EventDataNode[TreeDataType] = js.native
}
object EventMouseEvent {
  
  @scala.inline
  def apply[TreeDataType /* <: BasicDataNode */](event: SyntheticMouseEvent[Element], node: EventDataNode[TreeDataType]): EventMouseEvent[TreeDataType] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMouseEvent[TreeDataType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: EventMouseEvent[_], TreeDataType /* <: BasicDataNode */] (val x: Self with EventMouseEvent[TreeDataType]) extends AnyVal {
    
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
