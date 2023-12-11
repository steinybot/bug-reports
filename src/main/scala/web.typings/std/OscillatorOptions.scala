package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OscillatorOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var detune: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var frequency: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var periodicWave: js.UndefOr[org.scalajs.dom.PeriodicWave] = js.native
  
  /* standard dom */
  var `type`: js.UndefOr[OscillatorType] = js.native
}
object OscillatorOptions {
  
  @scala.inline
  def apply(): OscillatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OscillatorOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OscillatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetune(value: Double): Self = StObject.set(x, "detune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetuneUndefined: Self = StObject.set(x, "detune", js.undefined)
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    @scala.inline
    def setPeriodicWave(value: org.scalajs.dom.PeriodicWave): Self = StObject.set(x, "periodicWave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodicWaveUndefined: Self = StObject.set(x, "periodicWave", js.undefined)
    
    @scala.inline
    def setType(value: OscillatorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
