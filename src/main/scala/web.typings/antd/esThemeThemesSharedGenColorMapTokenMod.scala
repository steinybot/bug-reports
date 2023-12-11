package web.typings.antd

import web.typings.antd.esThemeInterfaceMapsColorsMod.ColorMapToken
import web.typings.antd.esThemeInterfaceMapsColorsMod.ColorNeutralMapToken
import web.typings.antd.esThemeInterfaceSeedsMod.SeedToken
import web.typings.antd.esThemeThemesColorMapMod.ColorMap
import web.typings.antd.esThemeThemesColorMapMod.GenerateColorMap
import web.typings.antd.esThemeThemesColorMapMod.GenerateNeutralColorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeThemesSharedGenColorMapTokenMod {
  
  @JSImport("antd/es/theme/themes/shared/genColorMapToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(seed: SeedToken, param1: PaletteGenerators): ColorMapToken = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(seed.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ColorMapToken]
  
  @js.native
  trait PaletteGenerators extends StObject {
    
    var generateColorPalettes: GenerateColorMap = js.native
    
    var generateNeutralColorPalettes: GenerateNeutralColorMap = js.native
  }
  object PaletteGenerators {
    
    @scala.inline
    def apply(
      generateColorPalettes: /* baseColor */ String => ColorMap,
      generateNeutralColorPalettes: (/* bgBaseColor */ String, /* textBaseColor */ String) => ColorNeutralMapToken
    ): PaletteGenerators = {
      val __obj = js.Dynamic.literal(generateColorPalettes = js.Any.fromFunction1(generateColorPalettes), generateNeutralColorPalettes = js.Any.fromFunction2(generateNeutralColorPalettes))
      __obj.asInstanceOf[PaletteGenerators]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PaletteGenerators] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenerateColorPalettes(value: /* baseColor */ String => ColorMap): Self = StObject.set(x, "generateColorPalettes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenerateNeutralColorPalettes(value: (/* bgBaseColor */ String, /* textBaseColor */ String) => ColorNeutralMapToken): Self = StObject.set(x, "generateNeutralColorPalettes", js.Any.fromFunction2(value))
    }
  }
}
