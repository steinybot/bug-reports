package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDtlsFingerprint extends StObject {
  
  /* standard dom */
  var algorithm: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var value: js.UndefOr[java.lang.String] = js.native
}
object RTCDtlsFingerprint {
  
  @scala.inline
  def apply(): RTCDtlsFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDtlsFingerprint]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCDtlsFingerprint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: java.lang.String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setValue(value: java.lang.String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
