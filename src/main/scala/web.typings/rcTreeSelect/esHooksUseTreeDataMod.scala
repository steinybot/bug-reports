package web.typings.rcTreeSelect

import web.typings.rcTreeSelect.esInterfaceMod.DataNode
import web.typings.rcTreeSelect.esInterfaceMod.SimpleModeConfig
import web.typings.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseTreeDataMod {
  
  @JSImport("rc-tree-select/es/hooks/useTreeData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(treeData: js.Array[DataNode], children: ReactElement, simpleMode: SimpleModeConfig): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(treeData.asInstanceOf[js.Any], children.asInstanceOf[js.Any], simpleMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
  @scala.inline
  def default(treeData: js.Array[DataNode], children: ReactElement, simpleMode: Boolean): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(treeData.asInstanceOf[js.Any], children.asInstanceOf[js.Any], simpleMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
}
