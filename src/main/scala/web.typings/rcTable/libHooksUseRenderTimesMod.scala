package web.typings.rcTable

import web.typings.rcTable.anon.FnCallPropsDebug
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseRenderTimesMod extends Shortcut {
  
  @JSImport("rc-table/lib/hooks/useRenderTimes", JSImport.Default)
  @js.native
  val default: FnCallPropsDebug | js.Function0[Unit] = js.native
  
  @JSImport("rc-table/lib/hooks/useRenderTimes", "RenderBlock")
  @js.native
  val RenderBlock: ReactComponentClass[js.Function0[Element]] = js.native
  
  type _To = FnCallPropsDebug | js.Function0[Unit]
  
  /* This means you don't have to write `default`, but can instead just say `libHooksUseRenderTimesMod.foo` */
  override def _to: FnCallPropsDebug | js.Function0[Unit] = default
}
