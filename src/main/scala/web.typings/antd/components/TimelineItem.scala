package web.typings.antd.components

import web.typings.antd.esTimelineTimelineItemMod.TimelineItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimelineItem {
  
  @JSImport("antd/es/timeline/TimelineItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = TimelineItemProps
  
  implicit def make(companion: TimelineItem.type): SharedBuilder_TimelineItemProps1061131858 = new SharedBuilder_TimelineItemProps1061131858(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimelineItemProps): SharedBuilder_TimelineItemProps1061131858 = new SharedBuilder_TimelineItemProps1061131858(js.Array(this.component, p.asInstanceOf[js.Any]))
}
