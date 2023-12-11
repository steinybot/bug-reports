package web.typings.rcFieldForm.components

import web.typings.StBuildingComponent
import web.typings.rcFieldForm.esFormContextMod.FormChangeInfo
import web.typings.rcFieldForm.esFormContextMod.FormFinishInfo
import web.typings.rcFieldForm.esInterfaceMod.ValidateMessages
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_FormProviderProps_1047307747 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def onFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Unit): this.type = set("onFormChange", js.Any.fromFunction2(value))
  
  @scala.inline
  def onFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Unit): this.type = set("onFormFinish", js.Any.fromFunction2(value))
  
  @scala.inline
  def validateMessages(value: ValidateMessages): this.type = set("validateMessages", value.asInstanceOf[js.Any])
}
