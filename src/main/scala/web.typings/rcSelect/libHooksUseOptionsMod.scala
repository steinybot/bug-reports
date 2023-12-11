package web.typings.rcSelect

import web.typings.rcSelect.anon.LabelOptions
import web.typings.rcSelect.libSelectMod.FieldNames
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseOptionsMod {
  
  @JSImport("rc-select/lib/hooks/useOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[OptionType](
    options: js.Array[OptionType],
    children: ReactElement,
    fieldNames: FieldNames,
    optionFilterProp: String,
    optionLabelProp: String
  ): LabelOptions[OptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], children.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], optionFilterProp.asInstanceOf[js.Any], optionLabelProp.asInstanceOf[js.Any])).asInstanceOf[LabelOptions[OptionType]]
}
