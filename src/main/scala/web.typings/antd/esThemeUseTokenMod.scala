package web.typings.antd

import web.typings.antd.anon.Key
import web.typings.antd.anon.`113`
import web.typings.antd.esThemeContextMod.ComponentsToken
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeInterfaceSeedsMod.SeedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeUseTokenMod {
  
  @JSImport("antd/es/theme/useToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Tuple5[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme<SeedToken, MapToken> */ /* theme */ Any, 
    /* token */ GlobalToken, 
    /* hashId */ String, 
    /* realToken */ GlobalToken, 
    /* cssVar */ js.UndefOr[Key]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple5[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme<SeedToken, MapToken> */ /* theme */ Any, 
    /* token */ GlobalToken, 
    /* hashId */ String, 
    /* realToken */ GlobalToken, 
    /* cssVar */ js.UndefOr[Key]
  ]]
  
  @scala.inline
  def getComputedToken(
    originToken: SeedToken,
    overrideToken: js.UndefOr[ComponentsToken] with `113`,
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme<any, any> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getComputedToken")(originToken.asInstanceOf[js.Any], overrideToken.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[Any]
}
