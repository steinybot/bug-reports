package web.typings.rcVirtualList

import web.typings.rcVirtualList.esInterfaceMod.GetKey
import web.typings.rcVirtualList.esInterfaceMod.GetSize
import web.typings.rcVirtualList.esUtilsCacheMapMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseGetSizeMod {
  
  @JSImport("rc-virtual-list/es/hooks/useGetSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useGetSize[T](mergedData: js.Array[T], getKey: GetKey[T], heights: default, itemHeight: Double): GetSize = (^.asInstanceOf[js.Dynamic].applyDynamic("useGetSize")(mergedData.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], heights.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any])).asInstanceOf[GetSize]
}
