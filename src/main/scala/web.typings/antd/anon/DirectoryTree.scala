package web.typings.antd.anon

import web.typings.antd.esTreeDirectoryTreeMod.DirectoryTreeCompoundedComponent
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryTree extends StObject {
  
  var DirectoryTree: DirectoryTreeCompoundedComponent = js.native
  
  var TreeNode: ReactComponentClass[TreeNodeProps[DataNode]] = js.native
}
object DirectoryTree {
  
  @scala.inline
  def apply(
    DirectoryTree: DirectoryTreeCompoundedComponent,
    TreeNode: ReactComponentClass[TreeNodeProps[DataNode]]
  ): DirectoryTree = {
    val __obj = js.Dynamic.literal(DirectoryTree = DirectoryTree.asInstanceOf[js.Any], TreeNode = TreeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryTree]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DirectoryTree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryTree(value: DirectoryTreeCompoundedComponent): Self = StObject.set(x, "DirectoryTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeNode(value: ReactComponentClass[TreeNodeProps[DataNode]]): Self = StObject.set(x, "TreeNode", value.asInstanceOf[js.Any])
  }
}
