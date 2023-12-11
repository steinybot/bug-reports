package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaKeySystemConfiguration extends StObject {
  
  /* standard dom */
  var audioCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.native
  
  /* standard dom */
  var distinctiveIdentifier: js.UndefOr[MediaKeysRequirement] = js.native
  
  /* standard dom */
  var initDataTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  /* standard dom */
  var label: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var persistentState: js.UndefOr[MediaKeysRequirement] = js.native
  
  /* standard dom */
  var sessionTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  /* standard dom */
  var videoCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.native
}
object MediaKeySystemConfiguration {
  
  @scala.inline
  def apply(): MediaKeySystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaKeySystemConfiguration]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MediaKeySystemConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioCapabilities(value: js.Array[MediaKeySystemMediaCapability]): Self = StObject.set(x, "audioCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioCapabilitiesUndefined: Self = StObject.set(x, "audioCapabilities", js.undefined)
    
    @scala.inline
    def setAudioCapabilitiesVarargs(value: MediaKeySystemMediaCapability*): Self = StObject.set(x, "audioCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setDistinctiveIdentifier(value: MediaKeysRequirement): Self = StObject.set(x, "distinctiveIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinctiveIdentifierUndefined: Self = StObject.set(x, "distinctiveIdentifier", js.undefined)
    
    @scala.inline
    def setInitDataTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "initDataTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitDataTypesUndefined: Self = StObject.set(x, "initDataTypes", js.undefined)
    
    @scala.inline
    def setInitDataTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "initDataTypes", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: java.lang.String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setPersistentState(value: MediaKeysRequirement): Self = StObject.set(x, "persistentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentStateUndefined: Self = StObject.set(x, "persistentState", js.undefined)
    
    @scala.inline
    def setSessionTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "sessionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTypesUndefined: Self = StObject.set(x, "sessionTypes", js.undefined)
    
    @scala.inline
    def setSessionTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "sessionTypes", js.Array(value :_*))
    
    @scala.inline
    def setVideoCapabilities(value: js.Array[MediaKeySystemMediaCapability]): Self = StObject.set(x, "videoCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCapabilitiesUndefined: Self = StObject.set(x, "videoCapabilities", js.undefined)
    
    @scala.inline
    def setVideoCapabilitiesVarargs(value: MediaKeySystemMediaCapability*): Self = StObject.set(x, "videoCapabilities", js.Array(value :_*))
  }
}
