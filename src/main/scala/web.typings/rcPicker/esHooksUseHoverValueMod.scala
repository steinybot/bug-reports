package web.typings.rcPicker

import web.typings.rcPicker.esHooksUseValueTextsMod.ValueTextConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseHoverValueMod {
  
  @JSImport("rc-picker/es/hooks/useHoverValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](valueText: String, param1: ValueTextConfig[DateType]): js.Tuple3[
    String, 
    js.Function1[/* date */ DateType, Unit], 
    js.Function1[/* immediately */ js.UndefOr[Boolean], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(valueText.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    String, 
    js.Function1[/* date */ DateType, Unit], 
    js.Function1[/* immediately */ js.UndefOr[Boolean], Unit]
  ]]
}
