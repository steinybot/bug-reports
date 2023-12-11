package web.typings.rcSelect

import web.typings.rcSelect.libInterfaceMod.RawValueType
import web.typings.rcSelect.libSelectMod.DefaultOptionType
import web.typings.rcSelect.libSelectMod.LabelInValueType
import web.typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseCacheMod {
  
  @JSImport("rc-select/lib/hooks/useCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Cache `value` related LabeledValue & options.
    */
  @scala.inline
  def default(labeledValues: js.Array[LabelInValueType], valueOptions: Map[RawValueType, DefaultOptionType]): js.Tuple2[
    js.Array[LabelInValueType], 
    js.Function1[/* val */ RawValueType, DefaultOptionType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(labeledValues.asInstanceOf[js.Any], valueOptions.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Array[LabelInValueType], 
    js.Function1[/* val */ RawValueType, DefaultOptionType]
  ]]
}
