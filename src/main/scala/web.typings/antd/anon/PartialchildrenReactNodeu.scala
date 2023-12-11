package web.typings.antd.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  children :react.react.ReactNode | undefined}> */
@js.native
trait PartialchildrenReactNodeu extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
}
object PartialchildrenReactNodeu {
  
  @scala.inline
  def apply(): PartialchildrenReactNodeu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialchildrenReactNodeu]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PartialchildrenReactNodeu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
