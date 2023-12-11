package web.typings.antd.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearIcon extends StObject {
  
  var clearIcon: String | Double | Boolean | ReactElement | js.Iterable[ReactElement] | Null = js.native
}
object ClearIcon {
  
  @scala.inline
  def apply(): ClearIcon = {
    val __obj = js.Dynamic.literal(clearIcon = null)
    __obj.asInstanceOf[ClearIcon]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ClearIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearIcon(value: String | Double | Boolean | ReactElement | js.Iterable[ReactElement]): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
    
    @scala.inline
    def setClearIconReactElement(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
  }
}
