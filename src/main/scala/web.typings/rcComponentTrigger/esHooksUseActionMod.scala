package web.typings.rcComponentTrigger

import web.typings.rcComponentTrigger.esInterfaceMod.ActionType
import web.typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseActionMod {
  
  @JSImport("@rc-component/trigger/es/hooks/useAction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(mobile: Boolean, action: ActionTypes): js.Tuple2[/* showAction */ Set[ActionType], /* hideAction */ Set[ActionType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mobile.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[/* showAction */ Set[ActionType], /* hideAction */ Set[ActionType]]]
  @scala.inline
  def default(mobile: Boolean, action: ActionTypes, showAction: ActionTypes): js.Tuple2[/* showAction */ Set[ActionType], /* hideAction */ Set[ActionType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mobile.asInstanceOf[js.Any], action.asInstanceOf[js.Any], showAction.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[/* showAction */ Set[ActionType], /* hideAction */ Set[ActionType]]]
  @scala.inline
  def default(mobile: Boolean, action: ActionTypes, showAction: ActionTypes, hideAction: ActionTypes): js.Tuple2[/* showAction */ Set[ActionType], /* hideAction */ Set[ActionType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mobile.asInstanceOf[js.Any], action.asInstanceOf[js.Any], showAction.asInstanceOf[js.Any], hideAction.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[/* showAction */ Set[ActionType], /* hideAction */ Set[ActionType]]]
  @scala.inline
  def default(mobile: Boolean, action: ActionTypes, showAction: Unit, hideAction: ActionTypes): js.Tuple2[/* showAction */ Set[ActionType], /* hideAction */ Set[ActionType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mobile.asInstanceOf[js.Any], action.asInstanceOf[js.Any], showAction.asInstanceOf[js.Any], hideAction.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[/* showAction */ Set[ActionType], /* hideAction */ Set[ActionType]]]
  
  type ActionTypes = ActionType | js.Array[ActionType]
}
