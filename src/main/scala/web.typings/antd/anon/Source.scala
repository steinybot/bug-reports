package web.typings.antd.anon

import web.typings.antd.antdStrings.menu_
import web.typings.antd.antdStrings.trigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  var source: trigger | menu_ = js.native
}
object Source {
  
  @scala.inline
  def apply(source: trigger | menu_): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: trigger | menu_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
