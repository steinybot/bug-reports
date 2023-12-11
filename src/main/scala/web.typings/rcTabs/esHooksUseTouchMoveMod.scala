package web.typings.rcTabs

import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseTouchMoveMod {
  
  @JSImport("rc-tabs/es/hooks/useTouchMove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    ref: ReactRef[HTMLDivElement],
    onOffset: js.Function2[/* offsetX */ Double, /* offsetY */ Double, Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
