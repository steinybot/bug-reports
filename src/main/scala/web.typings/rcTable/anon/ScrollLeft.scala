package web.typings.rcTable.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollLeft extends StObject {
  
  var currentTarget: js.UndefOr[HTMLElement] = js.native
  
  var scrollLeft: js.UndefOr[Double] = js.native
}
object ScrollLeft {
  
  @scala.inline
  def apply(): ScrollLeft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollLeft]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ScrollLeft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTarget(value: HTMLElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
  }
}
