package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HmacKeyAlgorithm
  extends StObject
     with KeyAlgorithm {
  
  /* standard dom */
  var hash: org.scalajs.dom.KeyAlgorithm = js.native
  
  /* standard dom */
  var length: Double = js.native
}
object HmacKeyAlgorithm {
  
  @scala.inline
  def apply(hash: org.scalajs.dom.KeyAlgorithm, length: Double, name: java.lang.String): HmacKeyAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacKeyAlgorithm]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: HmacKeyAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: org.scalajs.dom.KeyAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
