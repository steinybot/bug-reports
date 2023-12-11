package web.typings.rcTable.anon

import web.typings.react.mod.MutableRefObject
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends StObject {
  
  var body: MutableRefObject[HTMLDivElement] = js.native
}
object Body {
  
  @scala.inline
  def apply(body: MutableRefObject[HTMLDivElement]): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: MutableRefObject[HTMLDivElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
