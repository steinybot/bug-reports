package web.typings.rcTable.anon

import web.typings.rcTable.libInterfaceMod.ScrollConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollTo extends StObject {
  
  var scrollLeft: Double = js.native
  
  var scrollTo: js.UndefOr[js.Function1[/* scrollConfig */ ScrollConfig, Unit]] = js.native
}
object ScrollTo {
  
  @scala.inline
  def apply(scrollLeft: Double): ScrollTo = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollTo]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ScrollTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTo(value: /* scrollConfig */ ScrollConfig => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
  }
}
