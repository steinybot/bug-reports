package web.typings.rcCascader

import web.typings.rcCascader.esCascaderMod.ShowCheckedStrategy
import web.typings.rcCascader.esCascaderMod.SingleValueType
import web.typings.rcCascader.esCascaderMod.ValueType
import web.typings.rcCascader.esHooksUseEntitiesMod.GetEntities
import web.typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseSelectMod {
  
  @JSImport("rc-cascader/es/hooks/useSelect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    multiple: Boolean,
    triggerChange: js.Function1[/* nextValues */ ValueType, Unit],
    checkedValues: js.Array[SingleValueType],
    halfCheckedValues: js.Array[SingleValueType],
    missingCheckedValues: js.Array[SingleValueType],
    getPathKeyEntities: GetEntities,
    getValueByKeyPath: js.Function1[/* pathKeys */ js.Array[Key], js.Array[SingleValueType]],
    showCheckedStrategy: ShowCheckedStrategy
  ): js.Function1[/* valuePath */ SingleValueType, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(multiple.asInstanceOf[js.Any], triggerChange.asInstanceOf[js.Any], checkedValues.asInstanceOf[js.Any], halfCheckedValues.asInstanceOf[js.Any], missingCheckedValues.asInstanceOf[js.Any], getPathKeyEntities.asInstanceOf[js.Any], getValueByKeyPath.asInstanceOf[js.Any], showCheckedStrategy.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* valuePath */ SingleValueType, Unit]]
}
