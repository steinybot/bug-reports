package web.typings.antd.components

import web.typings.antd.esAlertErrorBoundaryMod.ErrorBoundaryProps
import web.typings.antd.esAlertErrorBoundaryMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorBoundary {
  
  @JSImport("antd/es/alert/ErrorBoundary", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = ErrorBoundaryProps
  
  implicit def make(companion: ErrorBoundary.type): SharedBuilder_ErrorBoundaryProps1272393588[default] = new SharedBuilder_ErrorBoundaryProps1272393588[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ErrorBoundaryProps): SharedBuilder_ErrorBoundaryProps1272393588[default] = new SharedBuilder_ErrorBoundaryProps1272393588[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
