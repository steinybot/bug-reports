package web.typings.rcVirtualList

import web.typings.rcVirtualList.esInterfaceMod.RenderFunc
import web.typings.rcVirtualList.esInterfaceMod.SharedConfig
import web.typings.react.mod.JSX.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseChildrenMod {
  
  @JSImport("rc-virtual-list/es/hooks/useChildren", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](
    list: js.Array[T],
    startIndex: Double,
    endIndex: Double,
    scrollWidth: Double,
    setNodeRef: js.Function2[/* item */ T, /* element */ HTMLElement, Unit],
    renderFunc: RenderFunc[T],
    param6: SharedConfig[T]
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], scrollWidth.asInstanceOf[js.Any], setNodeRef.asInstanceOf[js.Any], renderFunc.asInstanceOf[js.Any], param6.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
}
