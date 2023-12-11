package web.typings.rcSelect.anon

import web.typings.rcSelect.libInterfaceMod.RenderNode
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearIcon extends StObject {
  
  var clearIcon: js.UndefOr[RenderNode] = js.native
}
object ClearIcon {
  
  @scala.inline
  def apply(): ClearIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearIcon]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ClearIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearIcon(value: RenderNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIconFunction1(value: /* props */ Any => ReactElement): Self = StObject.set(x, "clearIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearIconReactElement(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
  }
}
