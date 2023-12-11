package web.typings.rcTable.anon

import web.typings.rcTable.libInterfaceMod.Reference
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref extends StObject {
  
  var ref: js.UndefOr[web.typings.react.mod.Ref[Reference]] = js.native
}
object Ref {
  
  @scala.inline
  def apply(): Ref = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: web.typings.react.mod.Ref[Reference]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ Reference | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefReactRef(value: ReactRef[Reference]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
