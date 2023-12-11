package web.typings.rcSelect.anon

import web.typings.rcSelect.libSelectMod.RawValueType
import web.typings.std.Map
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelOptions[OptionType] extends StObject {
  
  var labelOptions: Map[ReactElement, OptionType] = js.native
  
  var options: js.Array[OptionType] = js.native
  
  var valueOptions: Map[RawValueType, OptionType] = js.native
}
object LabelOptions {
  
  @scala.inline
  def apply[OptionType](
    labelOptions: Map[ReactElement, OptionType],
    options: js.Array[OptionType],
    valueOptions: Map[RawValueType, OptionType]
  ): LabelOptions[OptionType] = {
    val __obj = js.Dynamic.literal(labelOptions = labelOptions.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], valueOptions = valueOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOptions[OptionType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: LabelOptions[_], OptionType] (val x: Self with LabelOptions[OptionType]) extends AnyVal {
    
    @scala.inline
    def setLabelOptions(value: Map[ReactElement, OptionType]): Self = StObject.set(x, "labelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Array[OptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: OptionType*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setValueOptions(value: Map[RawValueType, OptionType]): Self = StObject.set(x, "valueOptions", value.asInstanceOf[js.Any])
  }
}
