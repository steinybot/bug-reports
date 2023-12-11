package web.typings.rcPicker

import web.typings.rcPicker.anon.Disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseRangeDisabledMod {
  
  @JSImport("rc-picker/es/hooks/useRangeDisabled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](param0: Disabled[DateType], firstTimeOpen: Boolean): js.Array[js.Function1[/* date */ DateType, Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any], firstTimeOpen.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function1[/* date */ DateType, Boolean]]]
}
