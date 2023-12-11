package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCPeerConnectionIceErrorEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var address: js.UndefOr[java.lang.String | Null] = js.native
  
  /* standard dom */
  var errorCode: Double = js.native
  
  /* standard dom */
  var port: js.UndefOr[Double | Null] = js.native
  
  /* standard dom */
  var statusText: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var url: js.UndefOr[java.lang.String] = js.native
}
object RTCPeerConnectionIceErrorEventInit {
  
  @scala.inline
  def apply(errorCode: Double): RTCPeerConnectionIceErrorEventInit = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionIceErrorEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCPeerConnectionIceErrorEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: java.lang.String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNull: Self = StObject.set(x, "port", null)
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setStatusText(value: java.lang.String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
