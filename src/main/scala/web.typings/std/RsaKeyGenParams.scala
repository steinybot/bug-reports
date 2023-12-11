package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaKeyGenParams
  extends StObject
     with Algorithm {
  
  /* standard dom */
  var modulusLength: Double = js.native
  
  /* standard dom */
  var publicExponent: js.typedarray.Uint8Array = js.native
}
object RsaKeyGenParams {
  
  @scala.inline
  def apply(modulusLength: Double, name: java.lang.String, publicExponent: js.typedarray.Uint8Array): RsaKeyGenParams = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaKeyGenParams]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RsaKeyGenParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicExponent(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
  }
}
