package web.typings.rcTree.components

import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import web.typings.rcTree.esTreeMod.TreeProps
import web.typings.rcTree.esTreeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tree {
  
  @scala.inline
  def apply[TreeDataType /* <: DataNode | BasicDataNode */](prefixCls: String): SharedBuilder_TreeProps509957983[default[TreeDataType], TreeDataType] = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new SharedBuilder_TreeProps509957983[default[TreeDataType], TreeDataType](js.Array(this.component, __props.asInstanceOf[TreeProps[TreeDataType]]))
  }
  
  object TreeNode {
    
    @JSImport("rc-tree/es/Tree", "default.TreeNode")
    @js.native
    val component: js.Object = js.native
    
    type Props = TreeNodeProps[DataNode]
    
    implicit def make(companion: TreeNode.type): SharedBuilder_TreeNodeProps_1817125884 = new SharedBuilder_TreeNodeProps_1817125884(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TreeNodeProps[DataNode]): SharedBuilder_TreeNodeProps_1817125884 = new SharedBuilder_TreeNodeProps_1817125884(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-tree/es/Tree", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props[TreeDataType /* <: DataNode | BasicDataNode */] = TreeProps[TreeDataType]
  
  def withProps[TreeDataType /* <: DataNode | BasicDataNode */](p: TreeProps[TreeDataType]): SharedBuilder_TreeProps509957983[default[TreeDataType], TreeDataType] = new SharedBuilder_TreeProps509957983[default[TreeDataType], TreeDataType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
