package web.typings.antd

import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStyleRoundedArrowMod {
  
  @JSImport("antd/es/style/roundedArrow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def genRoundedArrow[T /* <: AliasToken with ArrowToken with CSSUtil */](token: T, bgColor: String, boxShadow: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("genRoundedArrow")(token.asInstanceOf[js.Any], bgColor.asInstanceOf[js.Any], boxShadow.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @scala.inline
  def getArrowToken(token: AliasToken): ArrowToken = ^.asInstanceOf[js.Dynamic].applyDynamic("getArrowToken")(token.asInstanceOf[js.Any]).asInstanceOf[ArrowToken]
  
  @js.native
  trait ArrowToken extends StObject
}
