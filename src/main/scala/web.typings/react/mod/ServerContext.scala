package web.typings.react.mod

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerContext[T /* <: web.typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue */] extends StObject {
  
  var Provider: ReactComponentClass[ProviderProps[T]] = js.native
}
object ServerContext {
  
  @scala.inline
  def apply[T /* <: web.typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue */](Provider: ReactComponentClass[ProviderProps[T]]): ServerContext[T] = {
    val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerContext[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ServerContext[_], T /* <: web.typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue */] (val x: Self with ServerContext[T]) extends AnyVal {
    
    @scala.inline
    def setProvider(value: ReactComponentClass[ProviderProps[T]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
  }
}
