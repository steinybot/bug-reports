package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A controller object that allows you to abort one or more DOM requests as and when desired. */
@js.native
trait AbortController extends StObject {
  
  /**
    * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
    */
  /* standard dom */
  def abort(): Unit = js.native
  
  /**
    * Returns the AbortSignal object associated with this object.
    */
  /* standard dom */
  val signal: org.scalajs.dom.AbortSignal = js.native
}
object AbortController {
  
  @scala.inline
  def apply(abort: () => Unit, signal: org.scalajs.dom.AbortSignal): AbortController = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortController]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AbortController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSignal(value: org.scalajs.dom.AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
