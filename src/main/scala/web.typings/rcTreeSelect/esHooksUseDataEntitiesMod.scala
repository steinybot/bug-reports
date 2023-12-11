package web.typings.rcTreeSelect

import web.typings.rcTreeSelect.anon.KeyEntities
import web.typings.rcTreeSelect.esTreeSelectMod.FieldNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseDataEntitiesMod {
  
  @JSImport("rc-tree-select/es/hooks/useDataEntities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(treeData: Any, fieldNames: FieldNames): KeyEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(treeData.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[KeyEntities]
}
