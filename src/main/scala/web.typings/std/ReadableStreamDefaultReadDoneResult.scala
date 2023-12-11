package web.typings.std

import web.typings.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamDefaultReadDoneResult
  extends StObject
     with ReadableStreamDefaultReadResult[Any] {
  
  /* standard dom */
  var done: `true` = js.native
  
  /* standard dom */
  var value: Unit = js.native
}
object ReadableStreamDefaultReadDoneResult {
  
  @scala.inline
  def apply(value: Unit): ReadableStreamDefaultReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamDefaultReadDoneResult]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ReadableStreamDefaultReadDoneResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
