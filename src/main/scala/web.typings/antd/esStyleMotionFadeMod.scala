package web.typings.antd

import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.TokenWithCommonCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStyleMotionFadeMod {
  
  @JSImport("antd/es/style/motion/fade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/es/style/motion/fade", "fadeIn")
  @js.native
  val fadeIn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Keyframes */ Any = js.native
  
  @JSImport("antd/es/style/motion/fade", "fadeOut")
  @js.native
  val fadeOut: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Keyframes */ Any = js.native
  
  @scala.inline
  def initFadeMotion(token: TokenWithCommonCls[AliasToken]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initFadeMotion")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  @scala.inline
  def initFadeMotion(token: TokenWithCommonCls[AliasToken], sameLevel: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("initFadeMotion")(token.asInstanceOf[js.Any], sameLevel.asInstanceOf[js.Any])).asInstanceOf[Any]
}
