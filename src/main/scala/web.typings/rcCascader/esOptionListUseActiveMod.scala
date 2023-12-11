package web.typings.rcCascader

import web.typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionListUseActiveMod {
  
  @JSImport("rc-cascader/es/OptionList/useActive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Control the active open options path.
    */
  @scala.inline
  def default(multiple: Boolean, open: Boolean): js.Tuple2[js.Array[Key], js.Function1[/* activeValueCells */ js.Array[Key], Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(multiple.asInstanceOf[js.Any], open.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Key], js.Function1[/* activeValueCells */ js.Array[Key], Unit]]]
}
