package web.typings.rcFieldForm.anon

import web.typings.rcFieldForm.esInterfaceMod.FormInstance
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref[Values] extends StObject {
  
  var ref: js.UndefOr[web.typings.react.mod.Ref[FormInstance[Values]]] = js.native
}
object Ref {
  
  @scala.inline
  def apply[Values](): Ref[Values] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref[Values]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Ref[_], Values] (val x: Self with Ref[Values]) extends AnyVal {
    
    @scala.inline
    def setRef(value: web.typings.react.mod.Ref[FormInstance[Values]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ FormInstance[Values] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefReactRef(value: ReactRef[FormInstance[Values]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
