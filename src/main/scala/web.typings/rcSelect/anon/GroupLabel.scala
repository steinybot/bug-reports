package web.typings.rcSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupLabel extends StObject {
  
  var groupLabel: String = js.native
  
  var label: String = js.native
  
  var options: String = js.native
  
  var value: String = js.native
}
object GroupLabel {
  
  @scala.inline
  def apply(groupLabel: String, label: String, options: String, value: String): GroupLabel = {
    val __obj = js.Dynamic.literal(groupLabel = groupLabel.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupLabel]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: GroupLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupLabel(value: String): Self = StObject.set(x, "groupLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
