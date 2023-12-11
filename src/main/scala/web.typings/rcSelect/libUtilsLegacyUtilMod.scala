package web.typings.rcSelect

import web.typings.rcSelect.libSelectMod.BaseOptionType
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsLegacyUtilMod {
  
  @JSImport("rc-select/lib/utils/legacyUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertChildrenToData[OptionType /* <: BaseOptionType */](nodes: ReactElement): js.Array[OptionType] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertChildrenToData")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[OptionType]]
  @scala.inline
  def convertChildrenToData[OptionType /* <: BaseOptionType */](nodes: ReactElement, optionOnly: Boolean): js.Array[OptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertChildrenToData")(nodes.asInstanceOf[js.Any], optionOnly.asInstanceOf[js.Any])).asInstanceOf[js.Array[OptionType]]
}
