package web.typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeInterfaceMapsStyleMod {
  
  @js.native
  trait StyleMapToken extends StObject {
    
    /**
      * @nameZH LG号圆角
      * @nameEN LG Border Radius
      * @desc LG号圆角，用于组件中的一些大圆角，如 Card、Modal 等一些组件样式。
      * @descEN LG size border radius, used in some large border radius components, such as Card, Modal and other components.
      * @default 8
      */
    var borderRadiusLG: Double = js.native
    
    /**
      * @nameZH 外部圆角
      * @nameEN Outer Border Radius
      * @default 4
      * @desc 外部圆角
      * @descEN Outer border radius
      */
    var borderRadiusOuter: Double = js.native
    
    /**
      * @nameZH SM号圆角
      * @nameEN SM Border Radius
      * @desc SM号圆角，用于组件小尺寸下的圆角，如 Button、Input、Select 等输入类控件在 small size 下的圆角
      * @descEN SM size border radius, used in small size components, such as Button, Input, Select and other input components in small size
      * @default 4
      */
    var borderRadiusSM: Double = js.native
    
    /**
      * @nameZH XS号圆角
      * @nameEN XS Border Radius
      * @desc XS号圆角，用于组件中的一些小圆角，如 Segmented 、Arrow 等一些内部圆角的组件样式中。
      * @descEN XS size border radius, used in some small border radius components, such as Segmented, Arrow and other components with small border radius.
      * @default 2
      */
    var borderRadiusXS: Double = js.native
    
    /**
      * @nameZH 线宽
      * @nameEN Line Width
      * @desc 描边类组件的默认线宽，如 Button、Input、Select 等输入类控件。
      * @descEN The default line width of the outline class components, such as Button, Input, Select, etc.
      * @default 1
      */
    var lineWidthBold: Double = js.native
  }
  object StyleMapToken {
    
    @scala.inline
    def apply(
      borderRadiusLG: Double,
      borderRadiusOuter: Double,
      borderRadiusSM: Double,
      borderRadiusXS: Double,
      lineWidthBold: Double
    ): StyleMapToken = {
      val __obj = js.Dynamic.literal(borderRadiusLG = borderRadiusLG.asInstanceOf[js.Any], borderRadiusOuter = borderRadiusOuter.asInstanceOf[js.Any], borderRadiusSM = borderRadiusSM.asInstanceOf[js.Any], borderRadiusXS = borderRadiusXS.asInstanceOf[js.Any], lineWidthBold = lineWidthBold.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleMapToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: StyleMapToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderRadiusLG(value: Double): Self = StObject.set(x, "borderRadiusLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusOuter(value: Double): Self = StObject.set(x, "borderRadiusOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusSM(value: Double): Self = StObject.set(x, "borderRadiusSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusXS(value: Double): Self = StObject.set(x, "borderRadiusXS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthBold(value: Double): Self = StObject.set(x, "lineWidthBold", value.asInstanceOf[js.Any])
    }
  }
}
