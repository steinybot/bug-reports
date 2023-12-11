package web.typings.rcTreeSelect

import web.typings.rcTreeSelect.esInterfaceMod.ChangeEventExtra
import web.typings.rcTreeSelect.esInterfaceMod.DataNode
import web.typings.rcTreeSelect.esInterfaceMod.RawValueType
import web.typings.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import web.typings.rcTreeSelect.esTreeSelectMod.FieldNames
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsLegacyUtilMod {
  
  @JSImport("rc-tree-select/es/utils/legacyUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertChildrenToData(nodes: ReactElement): js.Array[DataNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertChildrenToData")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[DataNode]]
  
  @scala.inline
  def fillAdditionalInfo(
    extra: ChangeEventExtra,
    triggerValue: RawValueType,
    checkedValues: js.Array[RawValueType],
    treeData: js.Array[DefaultOptionType],
    showPosition: Boolean,
    fieldNames: FieldNames
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillAdditionalInfo")(extra.asInstanceOf[js.Any], triggerValue.asInstanceOf[js.Any], checkedValues.asInstanceOf[js.Any], treeData.asInstanceOf[js.Any], showPosition.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fillLegacyProps(dataNode: DataNode): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fillLegacyProps")(dataNode.asInstanceOf[js.Any]).asInstanceOf[Any]
}
