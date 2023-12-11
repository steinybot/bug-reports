package web.typings.antd

import web.typings.antd.anon.OverridePartial
import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.antd.esThemeInterfaceMapsMod.MapToken
import web.typings.antd.esThemeInterfaceMod.OverrideToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeUtilAliasMod {
  
  @JSImport("antd/es/theme/util/alias", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(derivativeToken: RawMergedToken): AliasToken = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(derivativeToken.asInstanceOf[js.Any]).asInstanceOf[AliasToken]
  
  /** Raw merge of `@ant-design/cssinjs` token. Which need additional process */
  type RawMergedToken = MapToken with OverrideToken with OverridePartial
}
