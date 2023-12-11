package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRTPStreamStats
  extends StObject
     with RTCStats {
  
  /* standard dom */
  var associateStatsId: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var codecId: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var firCount: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var isRemote: js.UndefOr[scala.Boolean] = js.native
  
  /* standard dom */
  var mediaTrackId: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var mediaType: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var nackCount: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var pliCount: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var sliCount: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var ssrc: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var transportId: js.UndefOr[java.lang.String] = js.native
}
object RTCRTPStreamStats {
  
  @scala.inline
  def apply(): RTCRTPStreamStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRTPStreamStats]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RTCRTPStreamStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociateStatsId(value: java.lang.String): Self = StObject.set(x, "associateStatsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociateStatsIdUndefined: Self = StObject.set(x, "associateStatsId", js.undefined)
    
    @scala.inline
    def setCodecId(value: java.lang.String): Self = StObject.set(x, "codecId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecIdUndefined: Self = StObject.set(x, "codecId", js.undefined)
    
    @scala.inline
    def setFirCount(value: Double): Self = StObject.set(x, "firCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirCountUndefined: Self = StObject.set(x, "firCount", js.undefined)
    
    @scala.inline
    def setIsRemote(value: scala.Boolean): Self = StObject.set(x, "isRemote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRemoteUndefined: Self = StObject.set(x, "isRemote", js.undefined)
    
    @scala.inline
    def setMediaTrackId(value: java.lang.String): Self = StObject.set(x, "mediaTrackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTrackIdUndefined: Self = StObject.set(x, "mediaTrackId", js.undefined)
    
    @scala.inline
    def setMediaType(value: java.lang.String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    @scala.inline
    def setNackCount(value: Double): Self = StObject.set(x, "nackCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNackCountUndefined: Self = StObject.set(x, "nackCount", js.undefined)
    
    @scala.inline
    def setPliCount(value: Double): Self = StObject.set(x, "pliCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPliCountUndefined: Self = StObject.set(x, "pliCount", js.undefined)
    
    @scala.inline
    def setSliCount(value: Double): Self = StObject.set(x, "sliCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliCountUndefined: Self = StObject.set(x, "sliCount", js.undefined)
    
    @scala.inline
    def setSsrc(value: java.lang.String): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrcUndefined: Self = StObject.set(x, "ssrc", js.undefined)
    
    @scala.inline
    def setTransportId(value: java.lang.String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportIdUndefined: Self = StObject.set(x, "transportId", js.undefined)
  }
}
