package web.typings.rcFieldForm.esInterfaceMod

import web.typings.rcFieldForm.rcFieldFormStrings.external
import web.typings.rcFieldForm.rcFieldFormStrings.internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - `web.typings`.rcFieldForm.esInterfaceMod.ValueUpdateInfo
  - `web.typings`.rcFieldForm.esInterfaceMod.ValidateFinishInfo
  - `web.typings`.rcFieldForm.esInterfaceMod.ResetInfo
  - `web.typings`.rcFieldForm.esInterfaceMod.RemoveInfo
  - `web.typings`.rcFieldForm.esInterfaceMod.SetFieldInfo
  - `web.typings`.rcFieldForm.esInterfaceMod.DependenciesUpdateInfo
*/
trait NotifyInfo extends StObject
object NotifyInfo {
  
  @scala.inline
  def DependenciesUpdateInfo(relatedFields: js.Array[InternalNamePath]): web.typings.rcFieldForm.esInterfaceMod.DependenciesUpdateInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dependenciesUpdate")
    __obj.asInstanceOf[web.typings.rcFieldForm.esInterfaceMod.DependenciesUpdateInfo]
  }
  
  @scala.inline
  def RemoveInfo(): web.typings.rcFieldForm.esInterfaceMod.RemoveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("remove")
    __obj.asInstanceOf[web.typings.rcFieldForm.esInterfaceMod.RemoveInfo]
  }
  
  @scala.inline
  def ResetInfo(): web.typings.rcFieldForm.esInterfaceMod.ResetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("reset")
    __obj.asInstanceOf[web.typings.rcFieldForm.esInterfaceMod.ResetInfo]
  }
  
  @scala.inline
  def SetFieldInfo(data: FieldData): web.typings.rcFieldForm.esInterfaceMod.SetFieldInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setField")
    __obj.asInstanceOf[web.typings.rcFieldForm.esInterfaceMod.SetFieldInfo]
  }
  
  @scala.inline
  def ValidateFinishInfo(): web.typings.rcFieldForm.esInterfaceMod.ValidateFinishInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("validateFinish")
    __obj.asInstanceOf[web.typings.rcFieldForm.esInterfaceMod.ValidateFinishInfo]
  }
  
  @scala.inline
  def ValueUpdateInfo(source: internal | external): web.typings.rcFieldForm.esInterfaceMod.ValueUpdateInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("valueUpdate")
    __obj.asInstanceOf[web.typings.rcFieldForm.esInterfaceMod.ValueUpdateInfo]
  }
}
