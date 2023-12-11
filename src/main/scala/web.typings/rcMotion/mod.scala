package web.typings.rcMotion

import web.typings.rcMotion.anon.CSSMotionPropsrefRefanyun
import web.typings.rcMotion.anon.MotionContextPropschildre
import web.typings.rcMotion.esCssmotionlistMod.CSSMotionListProps
import web.typings.react.mod.Component
import web.typings.react.mod.JSX.Element
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-motion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-motion", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CSSMotionPropsrefRefanyun] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-motion", "CSSMotionList")
  @js.native
  class CSSMotionList protected () extends Component[CSSMotionListProps, Any, Any] {
    def this(props: CSSMotionListProps) = this()
    def this(props: CSSMotionListProps, context: Any) = this()
  }
  @JSImport("rc-motion", "CSSMotionList")
  @js.native
  val CSSMotionList: ReactComponentClass[CSSMotionListProps] = js.native
  
  @scala.inline
  def Provider(param0: MotionContextPropschildre): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Provider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
