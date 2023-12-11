package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSInputMethodContextEventMap extends StObject {
  
  /* standard dom */
  var MSCandidateWindowHide: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var MSCandidateWindowShow: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var MSCandidateWindowUpdate: org.scalajs.dom.Event = js.native
}
object MSInputMethodContextEventMap {
  
  @scala.inline
  def apply(
    MSCandidateWindowHide: org.scalajs.dom.Event,
    MSCandidateWindowShow: org.scalajs.dom.Event,
    MSCandidateWindowUpdate: org.scalajs.dom.Event
  ): MSInputMethodContextEventMap = {
    val __obj = js.Dynamic.literal(MSCandidateWindowHide = MSCandidateWindowHide.asInstanceOf[js.Any], MSCandidateWindowShow = MSCandidateWindowShow.asInstanceOf[js.Any], MSCandidateWindowUpdate = MSCandidateWindowUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSInputMethodContextEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MSInputMethodContextEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSCandidateWindowHide(value: org.scalajs.dom.Event): Self = StObject.set(x, "MSCandidateWindowHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSCandidateWindowShow(value: org.scalajs.dom.Event): Self = StObject.set(x, "MSCandidateWindowShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSCandidateWindowUpdate(value: org.scalajs.dom.Event): Self = StObject.set(x, "MSCandidateWindowUpdate", value.asInstanceOf[js.Any])
  }
}
