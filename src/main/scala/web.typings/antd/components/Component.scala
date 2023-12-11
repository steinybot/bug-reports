package web.typings.antd.components

import web.typings.antd.esCalendarGenerateCalendarMod.CalendarProps
import web.typings.dayjs.mod.Dayjs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  @JSImport("antd/es/calendar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = CalendarProps[Dayjs]
  
  implicit def make(companion: Component.type): SharedBuilder_CalendarProps_1526459521 = new SharedBuilder_CalendarProps_1526459521(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CalendarProps[Dayjs]): SharedBuilder_CalendarProps_1526459521 = new SharedBuilder_CalendarProps_1526459521(js.Array(this.component, p.asInstanceOf[js.Any]))
}
