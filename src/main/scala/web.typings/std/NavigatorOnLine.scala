package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorOnLine extends StObject {
  
  /* standard dom */
  val onLine: scala.Boolean = js.native
}
object NavigatorOnLine {
  
  @scala.inline
  def apply(onLine: scala.Boolean): NavigatorOnLine = {
    val __obj = js.Dynamic.literal(onLine = onLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorOnLine]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: NavigatorOnLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnLine(value: scala.Boolean): Self = StObject.set(x, "onLine", value.asInstanceOf[js.Any])
  }
}
