package web.typings.rcTable

import web.typings.rcTable.libInterfaceMod.ColumnsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseColumnsUseWidthColumnsMod {
  
  @JSImport("rc-table/lib/hooks/useColumns/useWidthColumns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(flattenColumns: ColumnsType[Any], scrollWidth: Double, clientWidth: Double): js.Tuple2[/* columns */ ColumnsType[Any], /* realScrollWidth */ Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(flattenColumns.asInstanceOf[js.Any], scrollWidth.asInstanceOf[js.Any], clientWidth.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[/* columns */ ColumnsType[Any], /* realScrollWidth */ Double]]
}
