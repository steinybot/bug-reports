package web.typings.antd

import web.typings.antd.esDescriptionsMod.DescriptionsItemType
import web.typings.antd.esDescriptionsMod.InternalDescriptionsItemType
import web.typings.antd.esUtilResponsiveObserverMod.ScreenMap
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDescriptionsHooksUseItemsMod {
  
  @JSImport("antd/es/descriptions/hooks/useItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(screens: ScreenMap): js.Array[InternalDescriptionsItemType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(screens.asInstanceOf[js.Any]).asInstanceOf[js.Array[InternalDescriptionsItemType]]
  @scala.inline
  def default(screens: ScreenMap, items: js.Array[DescriptionsItemType]): js.Array[InternalDescriptionsItemType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(screens.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[InternalDescriptionsItemType]]
  @scala.inline
  def default(screens: ScreenMap, items: js.Array[DescriptionsItemType], children: ReactElement): js.Array[InternalDescriptionsItemType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(screens.asInstanceOf[js.Any], items.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Array[InternalDescriptionsItemType]]
  @scala.inline
  def default(screens: ScreenMap, items: Unit, children: ReactElement): js.Array[InternalDescriptionsItemType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(screens.asInstanceOf[js.Any], items.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Array[InternalDescriptionsItemType]]
}
