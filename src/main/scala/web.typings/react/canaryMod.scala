package web.typings.react

import web.typings.react.mod.ConsumerProps
import web.typings.react.mod.ProviderProps
import web.typings.react.reactStrings.fulfilled
import web.typings.react.reactStrings.pending
import web.typings.react.reactStrings.rejected
import web.typings.std.PromiseLike
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canaryMod {
  
  /* augmented module */
  object reactAugmentingMod {
    
    @JSImport("react", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def cache[CachedFunction /* <: js.Function */](fn: CachedFunction): CachedFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(fn.asInstanceOf[js.Any]).asInstanceOf[CachedFunction]
    
    @scala.inline
    def createServerContext[T /* <: ServerContextJSONValue */](globalName: String, defaultValue: T): ServerContext[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[ServerContext[T]]
    
    @scala.inline
    def unstableUseCacheRefresh(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useCacheRefresh")().asInstanceOf[js.Function0[Unit]]
    
    @scala.inline
    def use[T](usable: Usable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(usable.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @js.native
    trait FulfilledThenable[T]
      extends StObject
         with ThenableImpl[T]
         with web.typings.react.mod.Thenable[T]
         with Thenable[T] {
      
      var status: fulfilled = js.native
      
      var value: T = js.native
    }
    object FulfilledThenable {
      
      @scala.inline
      def apply[T](
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any],
        value: T
      ): FulfilledThenable[T] = {
        val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[FulfilledThenable[T]]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: FulfilledThenable[_], T] (val x: Self with FulfilledThenable[T]) extends AnyVal {
        
        @scala.inline
        def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait PendingThenable[T]
      extends StObject
         with ThenableImpl[T]
         with web.typings.react.mod.Thenable[T]
         with Thenable[T] {
      
      var status: pending = js.native
    }
    object PendingThenable {
      
      @scala.inline
      def apply[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): PendingThenable[T] = {
        val __obj = js.Dynamic.literal(status = "pending")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[PendingThenable[T]]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: PendingThenable[_], T] (val x: Self with PendingThenable[T]) extends AnyVal {
        
        @scala.inline
        def setStatus(value: pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait RejectedThenable[T]
      extends StObject
         with ThenableImpl[T]
         with web.typings.react.mod.Thenable[T]
         with Thenable[T] {
      
      var reason: Any = js.native
      
      var status: rejected = js.native
    }
    object RejectedThenable {
      
      @scala.inline
      def apply[T](
        reason: Any,
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
      ): RejectedThenable[T] = {
        val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[RejectedThenable[T]]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: RejectedThenable[_], T] (val x: Self with RejectedThenable[T]) extends AnyVal {
        
        @scala.inline
        def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ServerContext[T /* <: ServerContextJSONValue */] extends StObject {
      
      var Provider: ReactComponentClass[ProviderProps[T]] = js.native
    }
    object ServerContext {
      
      @scala.inline
      def apply[T /* <: ServerContextJSONValue */](Provider: ReactComponentClass[ProviderProps[T]]): ServerContext[T] = {
        val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServerContext[T]]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: ServerContext[_], T /* <: ServerContextJSONValue */] (val x: Self with ServerContext[T]) extends AnyVal {
        
        @scala.inline
        def setProvider(value: ReactComponentClass[ProviderProps[T]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
      }
    }
    
    type ServerContextJSONArray = js.Array[ServerContextJSONValue]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type ServerContextJSONValue = string | boolean | number | null | react.react/canary.react.ServerContextJSONArray | {[key: string] : react.react/canary.react.ServerContextJSONValue}
    }}}
    to avoid circular code involving: 
    - react.react.ServerContextJSONArray
    - react.react.ServerContextJSONValue
    - react.react/canary.react.ServerContextJSONArray
    - react.react/canary.react.ServerContextJSONValue
    */
    type ServerContextJSONValue = String | Boolean | Double | Null | Any | StringDictionary[Any]
    
    /* Rewritten from type alias, can be one of: 
      - `web.typings`.react.canaryMod.reactAugmentingMod.UntrackedThenable[T]
      - `web.typings`.react.canaryMod.reactAugmentingMod.PendingThenable[T]
      - `web.typings`.react.canaryMod.reactAugmentingMod.FulfilledThenable[T]
      - `web.typings`.react.canaryMod.reactAugmentingMod.RejectedThenable[T]
    */
    trait Thenable[T]
      extends StObject
         with web.typings.react.mod.Usable[T]
         with Usable[T]
    object Thenable {
      
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
    
    @js.native
    trait ThenableImpl[T] extends StObject {
      
      def `then`(onFulfill: js.Function1[/* value */ T, Any], onReject: js.Function1[/* error */ Any, Any]): Unit | PromiseLike[Any] = js.native
    }
    object ThenableImpl {
      
      @scala.inline
      def apply[T](
        `then`: (js.Function1[/* value */ T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
      ): ThenableImpl[T] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[ThenableImpl[T]]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: ThenableImpl[_], T] (val x: Self with ThenableImpl[T]) extends AnyVal {
        
        @scala.inline
        def setThen(
          value: (js.Function1[/* value */ T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
        ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait UntrackedThenable[T]
      extends StObject
         with ThenableImpl[T]
         with web.typings.react.mod.Thenable[T]
         with Thenable[T] {
      
      var status: js.UndefOr[Unit] = js.native
    }
    object UntrackedThenable {
      
      @scala.inline
      def apply[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): UntrackedThenable[T] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[UntrackedThenable[T]]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: UntrackedThenable[_], T] (val x: Self with UntrackedThenable[T]) extends AnyVal {
        
        @scala.inline
        def setStatus(value: Unit): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
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
  }
}
