package web.typings.antd

import web.typings.antd.esConfigProviderContextMod.CSPConfig
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConfigProviderStyleMod {
  
  @JSImport("antd/es/config-provider/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(iconPrefixCls: String): js.Function1[/* node */ ReactElement, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(iconPrefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ ReactElement, Element]]
  @scala.inline
  def default(iconPrefixCls: String, csp: CSPConfig): js.Function1[/* node */ ReactElement, Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iconPrefixCls.asInstanceOf[js.Any], csp.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* node */ ReactElement, Element]]
}
