package web.typings.rcSelect.anon

import web.typings.rcSelect.rcSelectStrings.blur
import web.typings.rcSelect.rcSelectStrings.effect
import web.typings.rcSelect.rcSelectStrings.submit
import web.typings.rcSelect.rcSelectStrings.typing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  var source: typing | effect | submit | blur = js.native
}
object Source {
  
  @scala.inline
  def apply(source: typing | effect | submit | blur): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: typing | effect | submit | blur): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
