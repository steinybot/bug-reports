package web.typings.rcTree.anon

import web.typings.rcTree.esInterfaceMod.BasicDataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var node: TreeDataType = js.native
  
  var pos: String = js.native
}
object Node {
  
  @scala.inline
  def apply[TreeDataType /* <: BasicDataNode */](node: TreeDataType, pos: String): Node[TreeDataType] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[TreeDataType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Node[_], TreeDataType /* <: BasicDataNode */] (val x: Self with Node[TreeDataType]) extends AnyVal {
    
    @scala.inline
    def setNode(value: TreeDataType): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
