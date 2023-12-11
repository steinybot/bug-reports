package web.typings.antd

import web.typings.antd.esTimelineTimelineItemMod.TimelineItemProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTimelineUseItemsMod {
  
  @JSImport("antd/es/timeline/useItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Array[TimelineItemProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[TimelineItemProps]]
  @scala.inline
  def default(items: js.Array[TimelineItemProps]): js.Array[TimelineItemProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[TimelineItemProps]]
  @scala.inline
  def default(items: js.Array[TimelineItemProps], children: ReactElement): js.Array[TimelineItemProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Array[TimelineItemProps]]
  @scala.inline
  def default(items: Unit, children: ReactElement): js.Array[TimelineItemProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Array[TimelineItemProps]]
}
