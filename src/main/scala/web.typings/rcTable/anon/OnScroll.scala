package web.typings.rcTable.anon

import web.typings.rcTable.libInterfaceMod.OnCustomizeScroll
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnScroll extends StObject {
  
  var onScroll: OnCustomizeScroll = js.native
  
  var ref: web.typings.react.mod.Ref[ScrollTo] = js.native
  
  var scrollbarSize: Double = js.native
}
object OnScroll {
  
  @scala.inline
  def apply(onScroll: /* info */ ScrollLeft => Unit, scrollbarSize: Double): OnScroll = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll), scrollbarSize = scrollbarSize.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[OnScroll]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OnScroll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnScroll(value: /* info */ ScrollLeft => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: web.typings.react.mod.Ref[ScrollTo]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ ScrollTo | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefReactRef(value: ReactRef[ScrollTo]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarSize(value: Double): Self = StObject.set(x, "scrollbarSize", value.asInstanceOf[js.Any])
  }
}
