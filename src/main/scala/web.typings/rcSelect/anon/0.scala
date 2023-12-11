package web.typings.rcSelect.anon

import web.typings.rcSelect.rcSelectStrings.keyboard
import web.typings.rcSelect.rcSelectStrings.mouse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var source: js.UndefOr[keyboard | mouse] = js.native
}
object `0` {
  
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: keyboard | mouse): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
