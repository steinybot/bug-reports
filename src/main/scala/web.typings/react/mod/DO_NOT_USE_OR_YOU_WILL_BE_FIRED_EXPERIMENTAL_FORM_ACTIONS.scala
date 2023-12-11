package web.typings.react.mod

import org.scalajs.dom.FormData
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
trait DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_FORM_ACTIONS extends StObject {
  
  def functions(formData: FormData): Unit = js.native
}
object DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_FORM_ACTIONS {
  
  @scala.inline
  def apply(functions: FormData => Unit): DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_FORM_ACTIONS = {
    val __obj = js.Dynamic.literal(functions = js.Any.fromFunction1(functions))
    __obj.asInstanceOf[DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_FORM_ACTIONS]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_FORM_ACTIONS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctions(value: FormData => Unit): Self = StObject.set(x, "functions", js.Any.fromFunction1(value))
  }
}
