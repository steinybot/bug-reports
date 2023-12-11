package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.anon.HashId
import web.typings.antd.esDatePickerGeneratePickerMod.PickerProps
import web.typings.dayjs.mod.Dayjs
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object DatePicker {
  
  def apply(p: PickerProps[Dayjs] with HashId): Default[tag.type, web.typings.antd.mod.DatePicker] = new Default[tag.type, web.typings.antd.mod.DatePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("antd", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DatePicker.type): Default[tag.type, web.typings.antd.mod.DatePicker] = new Default[tag.type, web.typings.antd.mod.DatePicker](js.Array(this.component, js.Dictionary.empty))()
}
