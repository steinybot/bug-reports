package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCErrorInit extends StObject {
  
  /* standard dom */
  var errorDetail: RTCErrorDetailType = js.native
  
  /* standard dom */
  var receivedAlert: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var sctpCauseCode: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var sdpLineNumber: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var sentAlert: js.UndefOr[Double] = js.native
}
object RTCErrorInit {
  
  @scala.inline
  def apply(errorDetail: RTCErrorDetailType): RTCErrorInit = {
    val __obj = js.Dynamic.literal(errorDetail = errorDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCErrorInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCErrorInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetail(value: RTCErrorDetailType): Self = StObject.set(x, "errorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedAlert(value: Double): Self = StObject.set(x, "receivedAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedAlertUndefined: Self = StObject.set(x, "receivedAlert", js.undefined)
    
    @scala.inline
    def setSctpCauseCode(value: Double): Self = StObject.set(x, "sctpCauseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSctpCauseCodeUndefined: Self = StObject.set(x, "sctpCauseCode", js.undefined)
    
    @scala.inline
    def setSdpLineNumber(value: Double): Self = StObject.set(x, "sdpLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpLineNumberUndefined: Self = StObject.set(x, "sdpLineNumber", js.undefined)
    
    @scala.inline
    def setSentAlert(value: Double): Self = StObject.set(x, "sentAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentAlertUndefined: Self = StObject.set(x, "sentAlert", js.undefined)
  }
}
