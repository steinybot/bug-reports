package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unit extends StObject {
  
  var unit: js.UndefOr[Boolean] = js.native
}
object Unit {
  
  @scala.inline
  def apply(): Unit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Unit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: Boolean): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
