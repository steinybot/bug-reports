package web.typings.react.mod

import web.typings.std.PromiseLike
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - `web.typings`.react.canaryMod.reactAugmentingMod.Thenable[T]
  - `web.typings`.react.mod.Context[T]
*/
trait Usable[T] extends StObject
object Usable {
  
  @scala.inline
  def Context[T](Consumer: ReactComponentClass[ConsumerProps[T]], Provider: ReactComponentClass[ProviderProps[T]]): web.typings.react.mod.Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[web.typings.react.mod.Context[T]]
  }
  
  @scala.inline
  def FulfilledThenable[T](
    `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any],
    value: T
  ): web.typings.react.canaryMod.reactAugmentingMod.FulfilledThenable[T] = {
    val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[web.typings.react.canaryMod.reactAugmentingMod.FulfilledThenable[T]]
  }
  
  @scala.inline
  def PendingThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): web.typings.react.canaryMod.reactAugmentingMod.PendingThenable[T] = {
    val __obj = js.Dynamic.literal(status = "pending")
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[web.typings.react.canaryMod.reactAugmentingMod.PendingThenable[T]]
  }
  
  @scala.inline
  def RejectedThenable[T](
    reason: Any,
    `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
  ): web.typings.react.canaryMod.reactAugmentingMod.RejectedThenable[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[web.typings.react.canaryMod.reactAugmentingMod.RejectedThenable[T]]
  }
  
  @scala.inline
  def UntrackedThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): web.typings.react.canaryMod.reactAugmentingMod.UntrackedThenable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[web.typings.react.canaryMod.reactAugmentingMod.UntrackedThenable[T]]
  }
}
