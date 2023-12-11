package web.typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseMemoMod {
  
  @JSImport("rc-util/es/hooks/useMemo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Value, Condition](
    getValue: js.Function0[Value],
    condition: Condition,
    shouldUpdate: js.Function2[/* prev */ Condition, /* next */ Condition, Boolean]
  ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getValue.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], shouldUpdate.asInstanceOf[js.Any])).asInstanceOf[Value]
}
