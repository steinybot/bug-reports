package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var colno: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var error: js.UndefOr[Any] = js.native
  
  /* standard dom */
  var filename: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var lineno: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var message: js.UndefOr[java.lang.String] = js.native
}
object ErrorEventInit {
  
  @scala.inline
  def apply(): ErrorEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ErrorEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColno(value: Double): Self = StObject.set(x, "colno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColnoUndefined: Self = StObject.set(x, "colno", js.undefined)
    
    @scala.inline
    def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFilename(value: java.lang.String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinenoUndefined: Self = StObject.set(x, "lineno", js.undefined)
    
    @scala.inline
    def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
