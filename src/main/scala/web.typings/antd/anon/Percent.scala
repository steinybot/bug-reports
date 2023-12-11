package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Percent extends StObject {
  
  var percent: Double = js.native
}
object Percent {
  
  @scala.inline
  def apply(percent: Double): Percent = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Percent]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Percent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
