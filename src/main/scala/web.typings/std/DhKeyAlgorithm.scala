package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DhKeyAlgorithm
  extends StObject
     with KeyAlgorithm {
  
  /* standard dom */
  var generator: js.typedarray.Uint8Array = js.native
  
  /* standard dom */
  var prime: js.typedarray.Uint8Array = js.native
}
object DhKeyAlgorithm {
  
  @scala.inline
  def apply(generator: js.typedarray.Uint8Array, name: java.lang.String, prime: js.typedarray.Uint8Array): DhKeyAlgorithm = {
    val __obj = js.Dynamic.literal(generator = generator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DhKeyAlgorithm]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DhKeyAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerator(value: js.typedarray.Uint8Array): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrime(value: js.typedarray.Uint8Array): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
  }
}
