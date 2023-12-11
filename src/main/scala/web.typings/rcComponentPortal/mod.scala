package web.typings.rcComponentPortal

import web.typings.rcComponentPortal.esPortalMod.PortalProps
import web.typings.react.mod.RefAttributes
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rc-component/portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rc-component/portal", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PortalProps with RefAttributes[Any]] = js.native
  
  @scala.inline
  def inlineMock(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineMock")().asInstanceOf[Boolean]
  @scala.inline
  def inlineMock(nextInline: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineMock")(nextInline.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
