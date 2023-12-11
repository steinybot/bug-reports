package web.typings.antd.anon

import org.scalajs.dom.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5` extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var ref: js.UndefOr[web.typings.react.mod.Ref[HTMLInputElement]] = js.native
}
object `5` {
  
  @scala.inline
  def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setRef(value: web.typings.react.mod.Ref[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLInputElement | Null => scala.Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefReactRef(value: ReactRef[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
