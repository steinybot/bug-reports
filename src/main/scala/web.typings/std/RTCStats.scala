package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCStats extends StObject {
  
  /* standard dom */
  var id: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var timestamp: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var `type`: js.UndefOr[org.scalajs.dom.RTCStatsType] = js.native
}
object RTCStats {
  
  @scala.inline
  def apply(): RTCStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCStats]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setType(value: org.scalajs.dom.RTCStatsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
