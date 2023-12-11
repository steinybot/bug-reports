package web.typings.antd.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.PropsWithChildren<{}> */
@js.native
trait PropsWithChildren extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
}
object PropsWithChildren {
  
  @scala.inline
  def apply(): PropsWithChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsWithChildren]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PropsWithChildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
