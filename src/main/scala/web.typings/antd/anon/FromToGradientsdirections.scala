package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/es/progress/progress.FromToGradients & {  direction :string | undefined} */
@js.native
trait FromToGradientsdirections extends StObject {
  
  var direction: js.UndefOr[String] = js.native
  
  var from: String = js.native
  
  var to: String = js.native
}
object FromToGradientsdirections {
  
  @scala.inline
  def apply(from: String, to: String): FromToGradientsdirections = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromToGradientsdirections]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FromToGradientsdirections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
