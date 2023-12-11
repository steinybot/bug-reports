package web.typings.antd.anon

import web.typings.antd.esTreeTreeMod.AntTreeNodeProps
import web.typings.antd.esTreeTreeMod.TreeLeafIcon
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowLeafIcon extends StObject {
  
  var showLeafIcon: Boolean | TreeLeafIcon = js.native
}
object ShowLeafIcon {
  
  @scala.inline
  def apply(showLeafIcon: Boolean | TreeLeafIcon): ShowLeafIcon = {
    val __obj = js.Dynamic.literal(showLeafIcon = showLeafIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowLeafIcon]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ShowLeafIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowLeafIcon(value: Boolean | TreeLeafIcon): Self = StObject.set(x, "showLeafIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLeafIconFunction1(value: /* props */ AntTreeNodeProps => ReactElement): Self = StObject.set(x, "showLeafIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowLeafIconReactElement(value: ReactElement): Self = StObject.set(x, "showLeafIcon", value.asInstanceOf[js.Any])
  }
}
