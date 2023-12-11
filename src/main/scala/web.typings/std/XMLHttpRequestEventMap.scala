package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLHttpRequestEventMap
  extends StObject
     with XMLHttpRequestEventTargetEventMap {
  
  /* standard dom */
  var readystatechange: org.scalajs.dom.Event = js.native
}
object XMLHttpRequestEventMap {
  
  @scala.inline
  def apply(
    abort: org.scalajs.dom.ProgressEvent,
    error: org.scalajs.dom.ProgressEvent,
    load: org.scalajs.dom.ProgressEvent,
    loadend: org.scalajs.dom.ProgressEvent,
    loadstart: org.scalajs.dom.ProgressEvent,
    progress: org.scalajs.dom.ProgressEvent,
    readystatechange: org.scalajs.dom.Event,
    timeout: org.scalajs.dom.ProgressEvent
  ): XMLHttpRequestEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], readystatechange = readystatechange.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: XMLHttpRequestEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadystatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "readystatechange", value.asInstanceOf[js.Any])
  }
}
