package web.typings.antd.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownIcon extends StObject {
  
  var downIcon: js.UndefOr[ReactElement] = js.native
  
  var upIcon: js.UndefOr[ReactElement] = js.native
}
object DownIcon {
  
  @scala.inline
  def apply(): DownIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownIcon]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DownIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownIcon(value: ReactElement): Self = StObject.set(x, "downIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownIconUndefined: Self = StObject.set(x, "downIcon", js.undefined)
    
    @scala.inline
    def setUpIcon(value: ReactElement): Self = StObject.set(x, "upIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpIconUndefined: Self = StObject.set(x, "upIcon", js.undefined)
  }
}
