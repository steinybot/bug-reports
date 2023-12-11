package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioWorkletNodeOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var numberOfInputs: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var numberOfOutputs: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var outputChannelCount: js.UndefOr[js.Array[Double]] = js.native
  
  /* standard dom */
  var parameterData: js.UndefOr[Record[java.lang.String, Double]] = js.native
  
  /* standard dom */
  var processorOptions: js.UndefOr[Any] = js.native
}
object AudioWorkletNodeOptions {
  
  @scala.inline
  def apply(): AudioWorkletNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioWorkletNodeOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AudioWorkletNodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfInputs(value: Double): Self = StObject.set(x, "numberOfInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfInputsUndefined: Self = StObject.set(x, "numberOfInputs", js.undefined)
    
    @scala.inline
    def setNumberOfOutputs(value: Double): Self = StObject.set(x, "numberOfOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfOutputsUndefined: Self = StObject.set(x, "numberOfOutputs", js.undefined)
    
    @scala.inline
    def setOutputChannelCount(value: js.Array[Double]): Self = StObject.set(x, "outputChannelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputChannelCountUndefined: Self = StObject.set(x, "outputChannelCount", js.undefined)
    
    @scala.inline
    def setOutputChannelCountVarargs(value: Double*): Self = StObject.set(x, "outputChannelCount", js.Array(value :_*))
    
    @scala.inline
    def setParameterData(value: Record[java.lang.String, Double]): Self = StObject.set(x, "parameterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterDataUndefined: Self = StObject.set(x, "parameterData", js.undefined)
    
    @scala.inline
    def setProcessorOptions(value: Any): Self = StObject.set(x, "processorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorOptionsUndefined: Self = StObject.set(x, "processorOptions", js.undefined)
  }
}
