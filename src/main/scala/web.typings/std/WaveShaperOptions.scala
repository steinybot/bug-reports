package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaveShaperOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var curve: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array] = js.native
  
  /* standard dom */
  var oversample: js.UndefOr[OverSampleType] = js.native
}
object WaveShaperOptions {
  
  @scala.inline
  def apply(): WaveShaperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaveShaperOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: WaveShaperOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurve(value: js.Array[Double] | js.typedarray.Float32Array): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    @scala.inline
    def setCurveVarargs(value: Double*): Self = StObject.set(x, "curve", js.Array(value :_*))
    
    @scala.inline
    def setOversample(value: OverSampleType): Self = StObject.set(x, "oversample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOversampleUndefined: Self = StObject.set(x, "oversample", js.undefined)
  }
}
