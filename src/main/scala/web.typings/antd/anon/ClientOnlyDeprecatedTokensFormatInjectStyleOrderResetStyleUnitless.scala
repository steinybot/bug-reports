package web.typings.antd.anon

import web.typings.antd.antdStrings.Button
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FormatComponentToken
import web.typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOnlyDeprecatedTokensFormatInjectStyleOrderResetStyleUnitless extends StObject {
  
  /**
    * Only use component style in client side. Ignore in SSR.
    */
  var clientOnly: js.UndefOr[Boolean] = js.native
  
  var deprecatedTokens: js.UndefOr[
    js.Array[
      js.Tuple2[
        /* keyof std.Exclude<std.Partial<antd.antd/es/button/style.ComponentToken | undefined> & std.Partial<antd.antd/es/theme/interface/alias.AliasToken> | undefined, undefined> */ String, 
        /* keyof std.Exclude<std.Partial<antd.antd/es/button/style.ComponentToken | undefined> & std.Partial<antd.antd/es/theme/interface/alias.AliasToken> | undefined, undefined> */ String
      ]
    ]
  ] = js.native
  
  /**
    * Chance to format component token with user input.
    * Useful when need calculated token as css variables.
    */
  var format: js.UndefOr[FormatComponentToken[Button]] = js.native
  
  /**
    * Whether generate styles
    * @default true
    */
  var injectStyle: js.UndefOr[Boolean] = js.native
  
  /**
    * Set order of component style.
    * @default -999
    */
  var order: js.UndefOr[Double] = js.native
  
  var resetStyle: js.UndefOr[Boolean] = js.native
  
  /**
    * Component tokens that do not need unit.
    */
  var unitless: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof std.Exclude<std.Partial<antd.antd/es/button/style.ComponentToken | undefined> & std.Partial<antd.antd/es/theme/interface/alias.AliasToken> | undefined, undefined> extends infer T ? {[ key in T ]: boolean} : never */ js.Any
  ] = js.native
}
object ClientOnlyDeprecatedTokensFormatInjectStyleOrderResetStyleUnitless {
  
  @scala.inline
  def apply(): ClientOnlyDeprecatedTokensFormatInjectStyleOrderResetStyleUnitless = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOnlyDeprecatedTokensFormatInjectStyleOrderResetStyleUnitless]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ClientOnlyDeprecatedTokensFormatInjectStyleOrderResetStyleUnitless] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientOnly(value: Boolean): Self = StObject.set(x, "clientOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOnlyUndefined: Self = StObject.set(x, "clientOnly", js.undefined)
    
    @scala.inline
    def setDeprecatedTokens(
      value: js.Array[
          js.Tuple2[
            /* keyof std.Exclude<std.Partial<antd.antd/es/button/style.ComponentToken | undefined> & std.Partial<antd.antd/es/theme/interface/alias.AliasToken> | undefined, undefined> */ String, 
            /* keyof std.Exclude<std.Partial<antd.antd/es/button/style.ComponentToken | undefined> & std.Partial<antd.antd/es/theme/interface/alias.AliasToken> | undefined, undefined> */ String
          ]
        ]
    ): Self = StObject.set(x, "deprecatedTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedTokensUndefined: Self = StObject.set(x, "deprecatedTokens", js.undefined)
    
    @scala.inline
    def setDeprecatedTokensVarargs(
      value: (js.Tuple2[
          /* keyof std.Exclude<std.Partial<antd.antd/es/button/style.ComponentToken | undefined> & std.Partial<antd.antd/es/theme/interface/alias.AliasToken> | undefined, undefined> */ String, 
          /* keyof std.Exclude<std.Partial<antd.antd/es/button/style.ComponentToken | undefined> & std.Partial<antd.antd/es/theme/interface/alias.AliasToken> | undefined, undefined> */ String
        ])*
    ): Self = StObject.set(x, "deprecatedTokens", js.Array(value :_*))
    
    @scala.inline
    def setFormat(
      value: /* token */ NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/theme/util/genComponentStyleHook.OverrideTokenWithoutDerivative[C] */ js.Any
        ] => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/theme/util/genComponentStyleHook.OverrideTokenWithoutDerivative[C] */ js.Any
        ]
    ): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setInjectStyle(value: Boolean): Self = StObject.set(x, "injectStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInjectStyleUndefined: Self = StObject.set(x, "injectStyle", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setResetStyle(value: Boolean): Self = StObject.set(x, "resetStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetStyleUndefined: Self = StObject.set(x, "resetStyle", js.undefined)
    
    @scala.inline
    def setUnitless(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof std.Exclude<std.Partial<antd.antd/es/button/style.ComponentToken | undefined> & std.Partial<antd.antd/es/theme/interface/alias.AliasToken> | undefined, undefined> extends infer T ? {[ key in T ]: boolean} : never */ js.Any
    ): Self = StObject.set(x, "unitless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitlessUndefined: Self = StObject.set(x, "unitless", js.undefined)
  }
}
