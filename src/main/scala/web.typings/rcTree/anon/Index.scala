package web.typings.rcTree.anon

import web.typings.rcTree.esInterfaceMod.DataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index extends StObject {
  
  var index: Double = js.native
  
  var key: web.typings.rcTree.esInterfaceMod.Key = js.native
  
  var level: Double = js.native
  
  var node: DataNode = js.native
  
  var nodes: js.Array[DataNode] = js.native
  
  var parentPos: String | Double = js.native
  
  var pos: String = js.native
}
object Index {
  
  @scala.inline
  def apply(
    index: Double,
    key: web.typings.rcTree.esInterfaceMod.Key,
    level: Double,
    node: DataNode,
    nodes: js.Array[DataNode],
    parentPos: String | Double,
    pos: String
  ): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], parentPos = parentPos.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: DataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: js.Array[DataNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: DataNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setParentPos(value: String | Double): Self = StObject.set(x, "parentPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
