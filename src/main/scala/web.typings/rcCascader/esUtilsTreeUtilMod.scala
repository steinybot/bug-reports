package web.typings.rcCascader

import web.typings.rcCascader.anon.Index
import web.typings.rcCascader.esCascaderMod.DefaultOptionType
import web.typings.rcCascader.esCascaderMod.InternalFieldNames
import web.typings.rcCascader.esCascaderMod.ShowCheckedStrategy
import web.typings.rcCascader.esCascaderMod.SingleValueType
import web.typings.rcCascader.esHooksUseEntitiesMod.GetEntities
import web.typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsTreeUtilMod {
  
  @JSImport("rc-cascader/es/utils/treeUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatStrategyValues(pathKeys: js.Array[Key], getKeyPathEntities: GetEntities, showCheckedStrategy: ShowCheckedStrategy): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatStrategyValues")(pathKeys.asInstanceOf[js.Any], getKeyPathEntities.asInstanceOf[js.Any], showCheckedStrategy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  @scala.inline
  def toPathOptions(valueCells: SingleValueType, options: js.Array[DefaultOptionType], fieldNames: InternalFieldNames): js.Array[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathOptions")(valueCells.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[Index]]
  @scala.inline
  def toPathOptions(
    valueCells: SingleValueType,
    options: js.Array[DefaultOptionType],
    fieldNames: InternalFieldNames,
    stringMode: Boolean
  ): js.Array[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathOptions")(valueCells.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], stringMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Index]]
}
