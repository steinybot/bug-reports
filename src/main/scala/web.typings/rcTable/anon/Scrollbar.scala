package web.typings.rcTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scrollbar extends StObject {
  
  var scrollbar: js.UndefOr[Boolean] = js.native
}
object Scrollbar {
  
  @scala.inline
  def apply(): Scrollbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scrollbar]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Scrollbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollbar(value: Boolean): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
  }
}
