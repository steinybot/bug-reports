package web.typings.react.mod

import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassAttributes[T]
  extends StObject
     with Attributes {
  
  /**
    * Allows getting a ref to the component instance.
    * Once the component unmounts, React will set `ref.current` to `null` (or call the ref with `null` if you passed a callback ref).
    * @see https://react.dev/learn/referencing-values-with-refs#refs-and-the-dom
    */
  var ref: js.UndefOr[LegacyRef[T]] = js.native
}
object ClassAttributes {
  
  @scala.inline
  def apply[T](): ClassAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassAttributes[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ClassAttributes[_], T] (val x: Self with ClassAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefReactRef(value: ReactRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
