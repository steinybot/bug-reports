package web.typings.rcComponentTrigger

import web.typings.std.VoidFunction
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseWatchMod {
  
  @JSImport("@rc-component/trigger/es/hooks/useWatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    open: Boolean,
    target: HTMLElement,
    popup: HTMLElement,
    onAlign: VoidFunction,
    onScroll: VoidFunction
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(open.asInstanceOf[js.Any], target.asInstanceOf[js.Any], popup.asInstanceOf[js.Any], onAlign.asInstanceOf[js.Any], onScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
