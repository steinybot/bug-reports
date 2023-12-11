package web.typings.rcTreeSelect.components

import web.typings.rcTreeSelect.esInterfaceMod.Key
import web.typings.rcTreeSelect.esTreeNodeMod.TreeNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeNode {
  
  @scala.inline
  def apply(value: Key): SharedBuilder_TreeNodeProps_589594022 = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_TreeNodeProps_589594022(js.Array(this.component, __props.asInstanceOf[TreeNodeProps]))
  }
  
  @JSImport("rc-tree-select", "TreeNode")
  @js.native
  val component: js.Object = js.native
  
  type Props = TreeNodeProps
  
  def withProps(p: TreeNodeProps): SharedBuilder_TreeNodeProps_589594022 = new SharedBuilder_TreeNodeProps_589594022(js.Array(this.component, p.asInstanceOf[js.Any]))
}
