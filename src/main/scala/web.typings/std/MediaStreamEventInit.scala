package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var stream: js.UndefOr[org.scalajs.dom.MediaStream] = js.native
}
object MediaStreamEventInit {
  
  @scala.inline
  def apply(): MediaStreamEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MediaStreamEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: org.scalajs.dom.MediaStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
