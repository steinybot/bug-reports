package web.typings.antd

import web.typings.antd.esThemeInterfaceMapsColorsMod.ColorNeutralMapToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeThemesColorMapMod {
  
  @js.native
  trait ColorMap extends StObject {
    
    var `1`: String = js.native
    
    var `10`: String = js.native
    
    var `2`: String = js.native
    
    var `3`: String = js.native
    
    var `4`: String = js.native
    
    var `5`: String = js.native
    
    var `6`: String = js.native
    
    var `7`: String = js.native
    
    var `8`: String = js.native
    
    var `9`: String = js.native
  }
  object ColorMap {
    
    @scala.inline
    def apply(
      `1`: String,
      `10`: String,
      `2`: String,
      `3`: String,
      `4`: String,
      `5`: String,
      `6`: String,
      `7`: String,
      `8`: String,
      `9`: String
    ): ColorMap = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("10")(`10`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
      __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
      __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
      __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
      __obj.updateDynamic("9")(`9`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorMap]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColorMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set10(value: String): Self = StObject.set(x, "10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4(value: String): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set5(value: String): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set6(value: String): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set7(value: String): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set8(value: String): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set9(value: String): Self = StObject.set(x, "9", value.asInstanceOf[js.Any])
    }
  }
  
  type GenerateColorMap = js.Function1[/* baseColor */ String, ColorMap]
  
  type GenerateNeutralColorMap = js.Function2[/* bgBaseColor */ String, /* textBaseColor */ String, ColorNeutralMapToken]
}
