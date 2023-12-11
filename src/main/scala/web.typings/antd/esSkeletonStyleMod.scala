package web.typings.antd

import web.typings.antd.antdStrings.Skeleton
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSkeletonStyleMod {
  
  @JSImport("antd/es/skeleton/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/skeleton/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Skeleton] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 骨架屏圆角
      * @descEN Border radius of skeleton
      */
    var blockRadius: Double = js.native
    
    /** @deprecated use gradientFromColor instead. */
    var color: String = js.native
    
    /** @deprecated use gradientToColor instead. */
    var colorGradientEnd: String = js.native
    
    /**
      * @desc 渐变色起点颜色
      * @descEN Start color of gradient
      */
    var gradientFromColor: String = js.native
    
    /**
      * @desc 渐变色终点颜色
      * @descEN End color of gradient
      */
    var gradientToColor: String = js.native
    
    /**
      * @desc 段落骨架屏单行高度
      * @descEN Line height of paragraph skeleton
      */
    var paragraphLiHeight: Double = js.native
    
    /**
      * @desc 段落骨架屏上间距
      * @descEN Margin top of paragraph skeleton
      */
    var paragraphMarginTop: Double = js.native
    
    /**
      * @desc 标题骨架屏高度
      * @descEN Height of title skeleton
      */
    var titleHeight: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      blockRadius: Double,
      color: String,
      colorGradientEnd: String,
      gradientFromColor: String,
      gradientToColor: String,
      paragraphLiHeight: Double,
      paragraphMarginTop: Double,
      titleHeight: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(blockRadius = blockRadius.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorGradientEnd = colorGradientEnd.asInstanceOf[js.Any], gradientFromColor = gradientFromColor.asInstanceOf[js.Any], gradientToColor = gradientToColor.asInstanceOf[js.Any], paragraphLiHeight = paragraphLiHeight.asInstanceOf[js.Any], paragraphMarginTop = paragraphMarginTop.asInstanceOf[js.Any], titleHeight = titleHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockRadius(value: Double): Self = StObject.set(x, "blockRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorGradientEnd(value: String): Self = StObject.set(x, "colorGradientEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientFromColor(value: String): Self = StObject.set(x, "gradientFromColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientToColor(value: String): Self = StObject.set(x, "gradientToColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphLiHeight(value: Double): Self = StObject.set(x, "paragraphLiHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphMarginTop(value: Double): Self = StObject.set(x, "paragraphMarginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleHeight(value: Double): Self = StObject.set(x, "titleHeight", value.asInstanceOf[js.Any])
    }
  }
}
