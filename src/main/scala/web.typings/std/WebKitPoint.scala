package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebKitPoint extends StObject {
  
  /* standard dom */
  var x: Double = js.native
  
  /* standard dom */
  var y: Double = js.native
}
object WebKitPoint {
  
  @scala.inline
  def apply(x: Double, y: Double): WebKitPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebKitPoint]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: WebKitPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
