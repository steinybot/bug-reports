package web.typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * For internal usage only.
  * Different release channels declare additional types of ReactNode this particular release channel accepts.
  * App or library types should never augment this interface.
  */
@js.native
trait DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES extends StObject {
  
  var promises: web.typings.react.experimentalMod.reactAugmentingMod.PromiseLikeOfReactNode = js.native
}
object DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES {
  
  @scala.inline
  def apply(promises: web.typings.react.experimentalMod.reactAugmentingMod.PromiseLikeOfReactNode): DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES = {
    val __obj = js.Dynamic.literal(promises = promises.asInstanceOf[js.Any])
    __obj.asInstanceOf[DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromises(value: web.typings.react.experimentalMod.reactAugmentingMod.PromiseLikeOfReactNode): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
  }
}
