package web.typings.rcUtil

import web.typings.react.mod.DependencyList
import web.typings.react.mod.EffectCallback
import web.typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseLayoutEffectMod {
  
  @JSImport("rc-util/es/hooks/useLayoutEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(callback: js.Function1[/* mount */ Boolean, Unit | VoidFunction]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def default(callback: js.Function1[/* mount */ Boolean, Unit | VoidFunction], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useLayoutUpdateEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutUpdateEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def useLayoutUpdateEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutUpdateEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
