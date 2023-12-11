package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicsCompressorOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var attack: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var knee: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var ratio: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var release: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var threshold: js.UndefOr[Double] = js.native
}
object DynamicsCompressorOptions {
  
  @scala.inline
  def apply(): DynamicsCompressorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicsCompressorOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DynamicsCompressorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttack(value: Double): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackUndefined: Self = StObject.set(x, "attack", js.undefined)
    
    @scala.inline
    def setKnee(value: Double): Self = StObject.set(x, "knee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKneeUndefined: Self = StObject.set(x, "knee", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    @scala.inline
    def setRelease(value: Double): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
