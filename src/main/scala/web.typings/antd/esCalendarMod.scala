package web.typings.antd

import web.typings.antd.anon.FnCallGenerateConfig
import web.typings.antd.esCalendarGenerateCalendarMod.CalendarProps
import web.typings.dayjs.mod.Dayjs
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCalendarMod extends Shortcut {
  
  @JSImport("antd/es/calendar", JSImport.Default)
  @js.native
  val default: CalendarType = js.native
  
  @js.native
  trait CalendarType extends StObject {
    
    def apply(props: CalendarProps[Dayjs]): ReactElement = js.native
    
    var displayName: String = js.native
    
    var generateCalendar: FnCallGenerateConfig = js.native
  }
  
  type _To = CalendarType
  
  /* This means you don't have to write `default`, but can instead just say `esCalendarMod.foo` */
  override def _to: CalendarType = default
}
