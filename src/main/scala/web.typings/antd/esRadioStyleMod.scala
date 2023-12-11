package web.typings.antd

import web.typings.antd.antdStrings.Radio
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRadioStyleMod {
  
  @JSImport("antd/es/radio/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/radio/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Radio] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 单选框按钮背景色
      * @descEN Background color of Radio button
      */
    var buttonBg: String = js.native
    
    /**
      * @desc 单选框按钮选中背景色
      * @descEN Background color of checked Radio button
      */
    var buttonCheckedBg: String = js.native
    
    /**
      * @desc 单选框按钮选中并禁用时的背景色
      * @descEN Background color of checked and disabled Radio button
      */
    var buttonCheckedBgDisabled: String = js.native
    
    /**
      * @desc 单选框按钮选中并禁用时的文本颜色
      * @descEN Color of checked and disabled Radio button text
      */
    var buttonCheckedColorDisabled: String = js.native
    
    /**
      * @desc 单选框按钮文本颜色
      * @descEN Color of Radio button text
      */
    var buttonColor: String = js.native
    
    /**
      * @desc 单选框按钮横向内间距
      * @descEN Horizontal padding of Radio button
      */
    var buttonPaddingInline: Double = js.native
    
    /**
      * @desc 单选框实色按钮选中时的激活态背景色
      * @descEN Background color of checked solid Radio button text when active
      */
    var buttonSolidCheckedActiveBg: String = js.native
    
    /**
      * @desc 单选框实色按钮选中时的背景色
      * @descEN Background color of checked solid Radio button text
      */
    var buttonSolidCheckedBg: String = js.native
    
    /**
      * @desc 单选框实色按钮选中时的文本颜色
      * @descEN Color of checked solid Radio button text
      */
    var buttonSolidCheckedColor: String = js.native
    
    /**
      * @desc 单选框实色按钮选中时的悬浮态背景色
      * @descEN Background color of checked solid Radio button text when hover
      */
    var buttonSolidCheckedHoverBg: String = js.native
    
    /**
      * @desc 单选框圆点禁用颜色
      * @descEN Color of disabled Radio dot
      */
    var dotColorDisabled: String = js.native
    
    /**
      * @desc 单选框圆点大小
      * @descEN Size of Radio dot
      */
    var dotSize: Double = js.native
    
    /**
      * @desc 单选框大小
      * @descEN Radio size
      */
    var radioSize: Double = js.native
    
    /**
      * @desc 单选框右间距
      * @descEN Margin right of Radio button
      */
    var wrapperMarginInlineEnd: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      buttonBg: String,
      buttonCheckedBg: String,
      buttonCheckedBgDisabled: String,
      buttonCheckedColorDisabled: String,
      buttonColor: String,
      buttonPaddingInline: Double,
      buttonSolidCheckedActiveBg: String,
      buttonSolidCheckedBg: String,
      buttonSolidCheckedColor: String,
      buttonSolidCheckedHoverBg: String,
      dotColorDisabled: String,
      dotSize: Double,
      radioSize: Double,
      wrapperMarginInlineEnd: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(buttonBg = buttonBg.asInstanceOf[js.Any], buttonCheckedBg = buttonCheckedBg.asInstanceOf[js.Any], buttonCheckedBgDisabled = buttonCheckedBgDisabled.asInstanceOf[js.Any], buttonCheckedColorDisabled = buttonCheckedColorDisabled.asInstanceOf[js.Any], buttonColor = buttonColor.asInstanceOf[js.Any], buttonPaddingInline = buttonPaddingInline.asInstanceOf[js.Any], buttonSolidCheckedActiveBg = buttonSolidCheckedActiveBg.asInstanceOf[js.Any], buttonSolidCheckedBg = buttonSolidCheckedBg.asInstanceOf[js.Any], buttonSolidCheckedColor = buttonSolidCheckedColor.asInstanceOf[js.Any], buttonSolidCheckedHoverBg = buttonSolidCheckedHoverBg.asInstanceOf[js.Any], dotColorDisabled = dotColorDisabled.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], radioSize = radioSize.asInstanceOf[js.Any], wrapperMarginInlineEnd = wrapperMarginInlineEnd.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonBg(value: String): Self = StObject.set(x, "buttonBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonCheckedBg(value: String): Self = StObject.set(x, "buttonCheckedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonCheckedBgDisabled(value: String): Self = StObject.set(x, "buttonCheckedBgDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonCheckedColorDisabled(value: String): Self = StObject.set(x, "buttonCheckedColorDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonColor(value: String): Self = StObject.set(x, "buttonColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPaddingInline(value: Double): Self = StObject.set(x, "buttonPaddingInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonSolidCheckedActiveBg(value: String): Self = StObject.set(x, "buttonSolidCheckedActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonSolidCheckedBg(value: String): Self = StObject.set(x, "buttonSolidCheckedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonSolidCheckedColor(value: String): Self = StObject.set(x, "buttonSolidCheckedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonSolidCheckedHoverBg(value: String): Self = StObject.set(x, "buttonSolidCheckedHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotColorDisabled(value: String): Self = StObject.set(x, "dotColorDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotSize(value: Double): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioSize(value: Double): Self = StObject.set(x, "radioSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperMarginInlineEnd(value: Double): Self = StObject.set(x, "wrapperMarginInlineEnd", value.asInstanceOf[js.Any])
    }
  }
}
