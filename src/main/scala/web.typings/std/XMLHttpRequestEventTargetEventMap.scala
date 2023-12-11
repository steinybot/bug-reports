package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLHttpRequestEventTargetEventMap extends StObject {
  
  /* standard dom */
  var abort: org.scalajs.dom.ProgressEvent = js.native
  
  /* standard dom */
  var error: org.scalajs.dom.ProgressEvent = js.native
  
  /* standard dom */
  var load: org.scalajs.dom.ProgressEvent = js.native
  
  /* standard dom */
  var loadend: org.scalajs.dom.ProgressEvent = js.native
  
  /* standard dom */
  var loadstart: org.scalajs.dom.ProgressEvent = js.native
  
  /* standard dom */
  var progress: org.scalajs.dom.ProgressEvent = js.native
  
  /* standard dom */
  var timeout: org.scalajs.dom.ProgressEvent = js.native
}
object XMLHttpRequestEventTargetEventMap {
  
  @scala.inline
  def apply(
    abort: org.scalajs.dom.ProgressEvent,
    error: org.scalajs.dom.ProgressEvent,
    load: org.scalajs.dom.ProgressEvent,
    loadend: org.scalajs.dom.ProgressEvent,
    loadstart: org.scalajs.dom.ProgressEvent,
    progress: org.scalajs.dom.ProgressEvent,
    timeout: org.scalajs.dom.ProgressEvent
  ): XMLHttpRequestEventTargetEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: XMLHttpRequestEventTargetEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadend(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "loadend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadstart(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: org.scalajs.dom.ProgressEvent): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
