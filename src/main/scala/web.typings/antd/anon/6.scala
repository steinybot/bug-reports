package web.typings.antd.anon

import web.typings.antd.antdStrings.clear
import web.typings.antd.antdStrings.input_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `6` extends StObject {
  
  var source: js.UndefOr[clear | input_] = js.native
}
object `6` {
  
  @scala.inline
  def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: clear | input_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
