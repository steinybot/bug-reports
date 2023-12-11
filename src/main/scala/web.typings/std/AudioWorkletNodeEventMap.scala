package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioWorkletNodeEventMap extends StObject {
  
  /* standard dom */
  var processorerror: org.scalajs.dom.Event = js.native
}
object AudioWorkletNodeEventMap {
  
  @scala.inline
  def apply(processorerror: org.scalajs.dom.Event): AudioWorkletNodeEventMap = {
    val __obj = js.Dynamic.literal(processorerror = processorerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioWorkletNodeEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AudioWorkletNodeEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessorerror(value: org.scalajs.dom.Event): Self = StObject.set(x, "processorerror", value.asInstanceOf[js.Any])
  }
}
