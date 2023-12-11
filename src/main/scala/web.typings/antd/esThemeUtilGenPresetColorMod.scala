package web.typings.antd

import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.antd.esThemeInterfacePresetColorsMod.PresetColorKey
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.TokenWithCommonCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeUtilGenPresetColorMod {
  
  @JSImport("antd/es/theme/util/genPresetColor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Token /* <: TokenWithCommonCls[AliasToken] */](token: Token, genCss: GenCSS): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(token.asInstanceOf[js.Any], genCss.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @js.native
  trait CalcColor extends StObject {
    
    /** token[`${colorKey}-6`] */
    var darkColor: String = js.native
    
    /** token[`${colorKey}-3`] */
    var lightBorderColor: String = js.native
    
    /** token[`${colorKey}-1`] */
    var lightColor: String = js.native
    
    /** token[`${colorKey}-7`] */
    var textColor: String = js.native
  }
  object CalcColor {
    
    @scala.inline
    def apply(darkColor: String, lightBorderColor: String, lightColor: String, textColor: String): CalcColor = {
      val __obj = js.Dynamic.literal(darkColor = darkColor.asInstanceOf[js.Any], lightBorderColor = lightBorderColor.asInstanceOf[js.Any], lightColor = lightColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalcColor]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CalcColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDarkColor(value: String): Self = StObject.set(x, "darkColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightBorderColor(value: String): Self = StObject.set(x, "lightBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightColor(value: String): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    }
  }
  
  type GenCSS = js.Function2[
    /* colorKey */ PresetColorKey, 
    /* calcColor */ CalcColor, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any
  ]
}
