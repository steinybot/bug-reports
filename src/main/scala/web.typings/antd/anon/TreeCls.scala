package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeCls extends StObject {
  
  var treeCls: String = js.native
  
  var treeNodeCls: String = js.native
  
  var treeNodePadding: Double | String = js.native
}
object TreeCls {
  
  @scala.inline
  def apply(treeCls: String, treeNodeCls: String, treeNodePadding: Double | String): TreeCls = {
    val __obj = js.Dynamic.literal(treeCls = treeCls.asInstanceOf[js.Any], treeNodeCls = treeNodeCls.asInstanceOf[js.Any], treeNodePadding = treeNodePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeCls]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: TreeCls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTreeCls(value: String): Self = StObject.set(x, "treeCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeNodeCls(value: String): Self = StObject.set(x, "treeNodeCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeNodePadding(value: Double | String): Self = StObject.set(x, "treeNodePadding", value.asInstanceOf[js.Any])
  }
}
