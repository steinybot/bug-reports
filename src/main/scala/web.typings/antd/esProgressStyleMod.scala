package web.typings.antd

import web.typings.antd.antdStrings.Progress
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esProgressStyleMod {
  
  @JSImport("antd/es/progress/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/progress/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Progress] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 圆形进度条图标大小
      * @descEN Icon size of circular progress bar
      */
    var circleIconFontSize: String = js.native
    
    /**
      * @desc 圆形进度条文字颜色
      * @descEN Text color of circular progress bar
      */
    var circleTextColor: String = js.native
    
    /**
      * @desc 圆形进度条文本大小
      * @descEN Text size of circular progress bar
      */
    var circleTextFontSize: String = js.native
    
    /**
      * @desc 进度条默认颜色
      * @descEN Default color of progress bar
      */
    var defaultColor: String = js.native
    
    /**
      * @desc 条状进度条圆角
      * @descEN Border radius of line progress bar
      */
    var lineBorderRadius: Double = js.native
    
    /**
      * @desc 进度条剩余部分颜色
      * @descEN Color of remaining part of progress bar
      */
    var remainingColor: String = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      circleIconFontSize: String,
      circleTextColor: String,
      circleTextFontSize: String,
      defaultColor: String,
      lineBorderRadius: Double,
      remainingColor: String
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(circleIconFontSize = circleIconFontSize.asInstanceOf[js.Any], circleTextColor = circleTextColor.asInstanceOf[js.Any], circleTextFontSize = circleTextFontSize.asInstanceOf[js.Any], defaultColor = defaultColor.asInstanceOf[js.Any], lineBorderRadius = lineBorderRadius.asInstanceOf[js.Any], remainingColor = remainingColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircleIconFontSize(value: String): Self = StObject.set(x, "circleIconFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleTextColor(value: String): Self = StObject.set(x, "circleTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleTextFontSize(value: String): Self = StObject.set(x, "circleTextFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColor(value: String): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineBorderRadius(value: Double): Self = StObject.set(x, "lineBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemainingColor(value: String): Self = StObject.set(x, "remainingColor", value.asInstanceOf[js.Any])
    }
  }
}
