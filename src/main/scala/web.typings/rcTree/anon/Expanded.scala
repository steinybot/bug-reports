package web.typings.rcTree.anon

import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.EventDataNode
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expanded[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var expanded: Boolean = js.native
  
  var nativeEvent: MouseEvent = js.native
  
  var node: EventDataNode[TreeDataType] = js.native
}
object Expanded {
  
  @scala.inline
  def apply[TreeDataType /* <: BasicDataNode */](expanded: Boolean, nativeEvent: MouseEvent, node: EventDataNode[TreeDataType]): Expanded[TreeDataType] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expanded[TreeDataType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Expanded[_], TreeDataType /* <: BasicDataNode */] (val x: Self with Expanded[TreeDataType]) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
