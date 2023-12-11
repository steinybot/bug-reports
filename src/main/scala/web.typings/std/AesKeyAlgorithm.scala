package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AesKeyAlgorithm
  extends StObject
     with KeyAlgorithm {
  
  /* standard dom */
  var length: Double = js.native
}
object AesKeyAlgorithm {
  
  @scala.inline
  def apply(length: Double, name: java.lang.String): AesKeyAlgorithm = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesKeyAlgorithm]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AesKeyAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
