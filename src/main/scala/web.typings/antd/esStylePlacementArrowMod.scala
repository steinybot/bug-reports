package web.typings.antd

import web.typings.antd.anon.ArrowDistance
import web.typings.antd.anon.ContentRadius
import web.typings.antd.esStyleRoundedArrowMod.ArrowToken
import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.TokenWithCommonCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStylePlacementArrowMod {
  
  @JSImport("antd/es/style/placementArrow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Token /* <: TokenWithCommonCls[AliasToken] with ArrowOffsetToken with ArrowToken */](token: Token, colorBg: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(token.asInstanceOf[js.Any], colorBg.asInstanceOf[js.Any])).asInstanceOf[Any]
  @scala.inline
  def default[Token /* <: TokenWithCommonCls[AliasToken] with ArrowOffsetToken with ArrowToken */](token: Token, colorBg: String, options: ArrowDistance): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(token.asInstanceOf[js.Any], colorBg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("antd/es/style/placementArrow", "MAX_VERTICAL_CONTENT_RADIUS")
  @js.native
  val MAX_VERTICAL_CONTENT_RADIUS: /* 8 */ Double = js.native
  
  @scala.inline
  def getArrowOffsetToken(options: ContentRadius): ArrowOffsetToken = ^.asInstanceOf[js.Dynamic].applyDynamic("getArrowOffsetToken")(options.asInstanceOf[js.Any]).asInstanceOf[ArrowOffsetToken]
  
  @js.native
  trait ArrowOffsetToken extends StObject
}
