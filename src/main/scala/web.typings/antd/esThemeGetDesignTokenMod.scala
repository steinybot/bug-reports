package web.typings.antd

import web.typings.antd.esConfigProviderContextMod.ThemeConfig
import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeGetDesignTokenMod {
  
  @JSImport("antd/es/theme/getDesignToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): AliasToken = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[AliasToken]
  @scala.inline
  def default(config: ThemeConfig): AliasToken = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[AliasToken]
}
