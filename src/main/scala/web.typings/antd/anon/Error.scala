package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  var error: scala.Unit = js.native
  
  var info: ComponentStackString = js.native
}
object Error {
  
  @scala.inline
  def apply(error: scala.Unit, info: ComponentStackString): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: scala.Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: ComponentStackString): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
