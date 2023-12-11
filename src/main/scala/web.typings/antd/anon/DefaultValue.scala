package web.typings.antd.anon

import web.typings.antd.esColorPickerInterfaceMod.ColorValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultValue extends StObject {
  
  var defaultValue: js.UndefOr[ColorValueType] = js.native
  
  var value: js.UndefOr[ColorValueType] = js.native
}
object DefaultValue {
  
  @scala.inline
  def apply(): DefaultValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultValue]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: ColorValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setValue(value: ColorValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
