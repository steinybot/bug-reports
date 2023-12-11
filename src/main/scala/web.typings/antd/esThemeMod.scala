package web.typings.antd

import web.typings.antd.anon.Hashed
import web.typings.antd.anon.Theme
import web.typings.antd.esConfigProviderContextMod.ThemeConfig
import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.antd.esThemeInterfaceMapsMod.MapToken
import web.typings.antd.esThemeInterfaceSeedsMod.SeedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeMod {
  
  object default {
    
    @JSImport("antd/es/theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/theme", "default.compactAlgorithm")
    @js.native
    def compactAlgorithm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cssinjs.DerivativeFunc<imported_interface.SeedToken, imported_interface.MapToken> */ Any = js.native
    @scala.inline
    def compactAlgorithm_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cssinjs.DerivativeFunc<imported_interface.SeedToken, imported_interface.MapToken> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compactAlgorithm")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/theme", "default.darkAlgorithm")
    @js.native
    def darkAlgorithm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cssinjs.DerivativeFunc<imported_interface.SeedToken, imported_interface.MapToken> */ Any = js.native
    @scala.inline
    def darkAlgorithm_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cssinjs.DerivativeFunc<imported_interface.SeedToken, imported_interface.MapToken> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkAlgorithm")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/theme", "default.defaultAlgorithm")
    @js.native
    def defaultAlgorithm: js.Function1[/* token */ SeedToken, MapToken] = js.native
    @scala.inline
    def defaultAlgorithm_=(x: js.Function1[/* token */ SeedToken, MapToken]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultAlgorithm")(x.asInstanceOf[js.Any])
    
    /** @private Test Usage. Do not use in production. */
    @JSImport("antd/es/theme", "default.defaultConfig")
    @js.native
    def defaultConfig: Hashed = js.native
    @scala.inline
    def defaultConfig_=(x: Hashed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultConfig")(x.asInstanceOf[js.Any])
    
    /** Default seedToken */
    @JSImport("antd/es/theme", "default.defaultSeed")
    @js.native
    def defaultSeed: SeedToken = js.native
    @scala.inline
    def defaultSeed_=(x: SeedToken): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSeed")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDesignToken(): AliasToken = ^.asInstanceOf[js.Dynamic].applyDynamic("getDesignToken")().asInstanceOf[AliasToken]
    @scala.inline
    def getDesignToken(config: ThemeConfig): AliasToken = ^.asInstanceOf[js.Dynamic].applyDynamic("getDesignToken")(config.asInstanceOf[js.Any]).asInstanceOf[AliasToken]
    
    @JSImport("antd/es/theme", "default.useToken")
    @js.native
    def useToken: js.Function0[Theme] = js.native
    @scala.inline
    def useToken_=(x: js.Function0[Theme]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useToken")(x.asInstanceOf[js.Any])
  }
}
