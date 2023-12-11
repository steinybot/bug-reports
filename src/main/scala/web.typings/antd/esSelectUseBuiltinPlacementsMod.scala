package web.typings.antd

import web.typings.antd.esConfigProviderContextMod.PopupOverflow
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSelectUseBuiltinPlacementsMod {
  
  @JSImport("antd/es/select/useBuiltinPlacements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Record[String, AlignType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Record[String, AlignType]]
  @scala.inline
  def default(buildInPlacements: BuildInPlacements): Record[String, AlignType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(buildInPlacements.asInstanceOf[js.Any]).asInstanceOf[Record[String, AlignType]]
  @scala.inline
  def default(buildInPlacements: BuildInPlacements, popupOverflow: PopupOverflow): Record[String, AlignType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buildInPlacements.asInstanceOf[js.Any], popupOverflow.asInstanceOf[js.Any])).asInstanceOf[Record[String, AlignType]]
  @scala.inline
  def default(buildInPlacements: Unit, popupOverflow: PopupOverflow): Record[String, AlignType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buildInPlacements.asInstanceOf[js.Any], popupOverflow.asInstanceOf[js.Any])).asInstanceOf[Record[String, AlignType]]
}
