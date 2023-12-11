package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechRecognitionEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var resultIndex: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var results: SpeechRecognitionResultList = js.native
}
object SpeechRecognitionEventInit {
  
  @scala.inline
  def apply(results: SpeechRecognitionResultList): SpeechRecognitionEventInit = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SpeechRecognitionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultIndex(value: Double): Self = StObject.set(x, "resultIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultIndexUndefined: Self = StObject.set(x, "resultIndex", js.undefined)
    
    @scala.inline
    def setResults(value: SpeechRecognitionResultList): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
