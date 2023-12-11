package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSStream extends StObject {
  
  /* standard dom */
  def msClose(): Unit = js.native
  
  /* standard dom */
  def msDetachStream(): Any = js.native
  
  /* standard dom */
  val `type`: java.lang.String = js.native
}
object MSStream {
  
  @scala.inline
  def apply(msClose: () => Unit, msDetachStream: () => Any, `type`: java.lang.String): MSStream = {
    val __obj = js.Dynamic.literal(msClose = js.Any.fromFunction0(msClose), msDetachStream = js.Any.fromFunction0(msDetachStream))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSStream]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MSStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMsClose(value: () => Unit): Self = StObject.set(x, "msClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMsDetachStream(value: () => Any): Self = StObject.set(x, "msDetachStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
