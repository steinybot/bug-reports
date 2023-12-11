package web.typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactPortal
  extends StObject
     with ReactElement
     with _ReactNode {
  
  var children: slinky.core.facade.ReactElement = js.native
}
object ReactPortal {
  
  @scala.inline
  def apply(children: slinky.core.facade.ReactElement, props: Any, `type`: Any): ReactPortal = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPortal]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ReactPortal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: slinky.core.facade.ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
