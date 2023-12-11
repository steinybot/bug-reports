package web.typings.rcTree.components

import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeNode {
  
  @JSImport("rc-tree", "TreeNode")
  @js.native
  val component: js.Object = js.native
  
  type Props = TreeNodeProps[DataNode]
  
  implicit def make(companion: TreeNode.type): SharedBuilder_TreeNodeProps_1817125884 = new SharedBuilder_TreeNodeProps_1817125884(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TreeNodeProps[DataNode]): SharedBuilder_TreeNodeProps_1817125884 = new SharedBuilder_TreeNodeProps_1817125884(js.Array(this.component, p.asInstanceOf[js.Any]))
}
