package web.typings.antd.anon

import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.mod.default
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `114` extends StObject {
  
  var ref: js.UndefOr[web.typings.react.mod.Ref[default[DataNode]]] = js.native
}
object `114` {
  
  @scala.inline
  def apply(): `114` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`114`]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: `114`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: web.typings.react.mod.Ref[default[DataNode]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ default[DataNode] | Null => scala.Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefReactRef(value: ReactRef[default[DataNode]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
