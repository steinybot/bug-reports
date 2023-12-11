package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlItemWidth extends StObject {
  
  var controlItemWidth: Double = js.native
  
  var controlWidth: Double = js.native
  
  var dropdownHeight: Double = js.native
  
  var menuPadding: Double = js.native
  
  var optionPadding: String = js.native
  
  var optionSelectedBg: String = js.native
  
  var optionSelectedFontWeight: Double = js.native
}
object ControlItemWidth {
  
  @scala.inline
  def apply(
    controlItemWidth: Double,
    controlWidth: Double,
    dropdownHeight: Double,
    menuPadding: Double,
    optionPadding: String,
    optionSelectedBg: String,
    optionSelectedFontWeight: Double
  ): ControlItemWidth = {
    val __obj = js.Dynamic.literal(controlItemWidth = controlItemWidth.asInstanceOf[js.Any], controlWidth = controlWidth.asInstanceOf[js.Any], dropdownHeight = dropdownHeight.asInstanceOf[js.Any], menuPadding = menuPadding.asInstanceOf[js.Any], optionPadding = optionPadding.asInstanceOf[js.Any], optionSelectedBg = optionSelectedBg.asInstanceOf[js.Any], optionSelectedFontWeight = optionSelectedFontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlItemWidth]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ControlItemWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlItemWidth(value: Double): Self = StObject.set(x, "controlItemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlWidth(value: Double): Self = StObject.set(x, "controlWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownHeight(value: Double): Self = StObject.set(x, "dropdownHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuPadding(value: Double): Self = StObject.set(x, "menuPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionPadding(value: String): Self = StObject.set(x, "optionPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionSelectedBg(value: String): Self = StObject.set(x, "optionSelectedBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionSelectedFontWeight(value: Double): Self = StObject.set(x, "optionSelectedFontWeight", value.asInstanceOf[js.Any])
  }
}
