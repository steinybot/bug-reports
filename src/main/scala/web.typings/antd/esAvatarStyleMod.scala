package web.typings.antd

import web.typings.antd.antdStrings.Avatar
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAvatarStyleMod {
  
  @JSImport("antd/es/avatar/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/avatar/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Avatar] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 头像尺寸
      * @descEN Size of Avatar
      */
    var containerSize: Double = js.native
    
    /**
      * @desc 大号头像尺寸
      * @descEN Size of large Avatar
      */
    var containerSizeLG: Double = js.native
    
    /**
      * @desc 小号头像尺寸
      * @descEN Size of small Avatar
      */
    var containerSizeSM: Double = js.native
    
    /**
      * @desc 头像组边框颜色
      * @descEN Border color of avatars in a group
      */
    var groupBorderColor: String = js.native
    
    /**
      * @desc 头像组重叠宽度
      * @descEN Overlapping of avatars in a group
      */
    var groupOverlapping: Double = js.native
    
    /**
      * @desc 头像组间距
      * @descEN Spacing between avatars in a group
      */
    var groupSpace: Double = js.native
    
    /**
      * @desc 头像文字大小
      * @descEN Font size of Avatar
      */
    var textFontSize: Double = js.native
    
    /**
      * @desc 大号头像文字大小
      * @descEN Font size of large Avatar
      */
    var textFontSizeLG: Double = js.native
    
    /**
      * @desc 小号头像文字大小
      * @descEN Font size of small Avatar
      */
    var textFontSizeSM: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      containerSize: Double,
      containerSizeLG: Double,
      containerSizeSM: Double,
      groupBorderColor: String,
      groupOverlapping: Double,
      groupSpace: Double,
      textFontSize: Double,
      textFontSizeLG: Double,
      textFontSizeSM: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(containerSize = containerSize.asInstanceOf[js.Any], containerSizeLG = containerSizeLG.asInstanceOf[js.Any], containerSizeSM = containerSizeSM.asInstanceOf[js.Any], groupBorderColor = groupBorderColor.asInstanceOf[js.Any], groupOverlapping = groupOverlapping.asInstanceOf[js.Any], groupSpace = groupSpace.asInstanceOf[js.Any], textFontSize = textFontSize.asInstanceOf[js.Any], textFontSizeLG = textFontSizeLG.asInstanceOf[js.Any], textFontSizeSM = textFontSizeSM.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerSize(value: Double): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerSizeLG(value: Double): Self = StObject.set(x, "containerSizeLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerSizeSM(value: Double): Self = StObject.set(x, "containerSizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupBorderColor(value: String): Self = StObject.set(x, "groupBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupOverlapping(value: Double): Self = StObject.set(x, "groupOverlapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSpace(value: Double): Self = StObject.set(x, "groupSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFontSize(value: Double): Self = StObject.set(x, "textFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFontSizeLG(value: Double): Self = StObject.set(x, "textFontSizeLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFontSizeSM(value: Double): Self = StObject.set(x, "textFontSizeSM", value.asInstanceOf[js.Any])
    }
  }
}
