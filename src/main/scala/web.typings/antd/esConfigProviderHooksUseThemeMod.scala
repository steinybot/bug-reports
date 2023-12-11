package web.typings.antd

import web.typings.antd.esConfigProviderContextMod.ThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConfigProviderHooksUseThemeMod {
  
  @JSImport("antd/es/config-provider/hooks/useTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.UndefOr[ThemeConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[ThemeConfig]]
  @scala.inline
  def default(theme: ThemeConfig): js.UndefOr[ThemeConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ThemeConfig]]
  @scala.inline
  def default(theme: ThemeConfig, parentTheme: ThemeConfig): js.UndefOr[ThemeConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any], parentTheme.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ThemeConfig]]
  @scala.inline
  def default(theme: Unit, parentTheme: ThemeConfig): js.UndefOr[ThemeConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any], parentTheme.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ThemeConfig]]
}
