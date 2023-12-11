package web.typings.rcMotion

import web.typings.react.mod.DependencyList
import web.typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseIsomorphicLayoutEffectMod {
  
  @JSImport("rc-motion/es/hooks/useIsomorphicLayoutEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://react.dev/reference/react/useEffect
    */
  /* was `typeof useEffect` */
  @scala.inline
  def default(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /* was `typeof useEffect` */
  @scala.inline
  def default(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
