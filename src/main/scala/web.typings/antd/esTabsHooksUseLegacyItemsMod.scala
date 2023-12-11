package web.typings.antd

import web.typings.rcTabs.esInterfaceMod.Tab
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabsHooksUseLegacyItemsMod {
  
  @JSImport("antd/es/tabs/hooks/useLegacyItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Array[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[Tab]]
  @scala.inline
  def default(items: js.UndefOr[js.Array[Tab]]): js.Array[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[Tab]]
  @scala.inline
  def default(items: js.UndefOr[js.Array[Tab]], children: ReactElement): js.Array[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tab]]
  @scala.inline
  def default(items: Unit, children: ReactElement): js.Array[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tab]]
}
