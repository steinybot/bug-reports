package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allowed ArrayBuffer types for the buffer of an ArrayBufferView and related Typed Arrays.
  */
@js.native
trait ArrayBufferTypes extends StObject {
  
  /* standard es5 */
  var ArrayBuffer: js.typedarray.ArrayBuffer = js.native
}
object ArrayBufferTypes {
  
  @scala.inline
  def apply(ArrayBuffer: js.typedarray.ArrayBuffer): ArrayBufferTypes = {
    val __obj = js.Dynamic.literal(ArrayBuffer = ArrayBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferTypes]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ArrayBufferTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "ArrayBuffer", value.asInstanceOf[js.Any])
  }
}
