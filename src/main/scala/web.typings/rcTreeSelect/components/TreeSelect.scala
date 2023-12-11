package web.typings.rcTreeSelect.components

import web.typings.rcSelect.libBaseSelectMod.BaseSelectRef
import web.typings.rcTreeSelect.anon.Children
import web.typings.rcTreeSelect.esInterfaceMod.Key
import web.typings.rcTreeSelect.esTreeNodeMod.TreeNodeProps
import web.typings.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import web.typings.rcTreeSelect.esTreeSelectMod.TreeSelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeSelect {
  
  object TreeNode {
    
    @scala.inline
    def apply(value: Key): SharedBuilder_TreeNodeProps_589594022 = {
      val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      new SharedBuilder_TreeNodeProps_589594022(js.Array(this.component, __props.asInstanceOf[TreeNodeProps]))
    }
    
    @JSImport("rc-tree-select/es/TreeSelect", "default.TreeNode")
    @js.native
    val component: js.Object = js.native
    
    type Props = TreeNodeProps
    
    def withProps(p: TreeNodeProps): SharedBuilder_TreeNodeProps_589594022 = new SharedBuilder_TreeNodeProps_589594022(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-tree-select/es/TreeSelect", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = /* props */ Children with (TreeSelectProps[Any, DefaultOptionType])
  
  implicit def make(companion: TreeSelect.type): SharedBuilder_ChildrenTreeSelectProps1034538622[BaseSelectRef] = new SharedBuilder_ChildrenTreeSelectProps1034538622[BaseSelectRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ Children with (TreeSelectProps[Any, DefaultOptionType])): SharedBuilder_ChildrenTreeSelectProps1034538622[BaseSelectRef] = new SharedBuilder_ChildrenTreeSelectProps1034538622[BaseSelectRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
