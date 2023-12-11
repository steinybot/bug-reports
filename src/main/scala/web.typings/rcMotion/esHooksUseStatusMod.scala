package web.typings.rcMotion

import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.rcMotion.esInterfaceMod.MotionStatus
import web.typings.rcMotion.esInterfaceMod.StepStatus
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseStatusMod {
  
  @JSImport("rc-motion/es/hooks/useStatus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    supportMotion: Boolean,
    visible: Boolean,
    getElement: js.Function0[HTMLElement],
    param3: CSSMotionProps
  ): js.Tuple4[MotionStatus, StepStatus, CSSProperties, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(supportMotion.asInstanceOf[js.Any], visible.asInstanceOf[js.Any], getElement.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[MotionStatus, StepStatus, CSSProperties, Boolean]]
}
