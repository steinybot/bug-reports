package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delay extends StObject {
  
  var delay: js.UndefOr[Double] = js.native
}
object Delay {
  
  @scala.inline
  def apply(): Delay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
