package web.typings.antd

import web.typings.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypographyHooksUseUpdatedEffectMod {
  
  @JSImport("antd/es/typography/hooks/useUpdatedEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Similar with `useEffect` but only trigger after mounted */
  @scala.inline
  def default(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def default(callback: js.Function0[Unit], conditions: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
