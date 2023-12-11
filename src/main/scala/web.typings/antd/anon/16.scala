package web.typings.antd.anon

import web.typings.antd.antdStrings.InputNumber
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.ComponentTokenKey
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FormatComponentToken
import web.typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `16` extends StObject {
  
  /**
    * Only use component style in client side. Ignore in SSR.
    */
  var clientOnly: js.UndefOr[Boolean] = js.native
  
  var deprecatedTokens: js.UndefOr[
    js.Array[js.Tuple2[ComponentTokenKey[InputNumber], ComponentTokenKey[InputNumber]]]
  ] = js.native
  
  var format: js.UndefOr[FormatComponentToken[InputNumber]] = js.native
  
  var injectStyle: js.UndefOr[Boolean] = js.native
  
  /**
    * Set order of component style. Default is -999.
    */
  var order: js.UndefOr[Double] = js.native
  
  var resetStyle: js.UndefOr[Boolean] = js.native
}
object `16` {
  
  @scala.inline
  def apply(): `16` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: `16`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientOnly(value: Boolean): Self = StObject.set(x, "clientOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOnlyUndefined: Self = StObject.set(x, "clientOnly", js.undefined)
    
    @scala.inline
    def setDeprecatedTokens(value: js.Array[js.Tuple2[ComponentTokenKey[InputNumber], ComponentTokenKey[InputNumber]]]): Self = StObject.set(x, "deprecatedTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedTokensUndefined: Self = StObject.set(x, "deprecatedTokens", js.undefined)
    
    @scala.inline
    def setDeprecatedTokensVarargs(value: (js.Tuple2[ComponentTokenKey[InputNumber], ComponentTokenKey[InputNumber]])*): Self = StObject.set(x, "deprecatedTokens", js.Array(value :_*))
    
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
  }
}
