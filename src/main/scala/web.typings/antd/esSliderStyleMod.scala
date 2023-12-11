package web.typings.antd

import web.typings.antd.antdStrings.Slider
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSliderStyleMod {
  
  @JSImport("antd/es/slider/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/slider/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Slider] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 滑动输入高度
      * @descEN Height of slider
      */
    var controlSize: Double = js.native
    
    /**
      * @desc 圆点激活态边框颜色
      * @descEN Border color of dot when active
      */
    var dotActiveBorderColor: String = js.native
    
    /**
      * @desc 圆点边框颜色
      * @descEN Border color of dot
      */
    var dotBorderColor: String = js.native
    
    /**
      * @desc 滑块圆点尺寸
      * @descEN Size of dot
      */
    var dotSize: Double = js.native
    
    /**
      * @desc 滑块激活态颜色
      * @descEN Color of handle when active
      */
    var handleActiveColor: String = js.native
    
    /**
      * @desc 滑块颜色
      * @descEN Color of handle
      */
    var handleColor: String = js.native
    
    /**
      * @desc 滑块禁用颜色
      * @descEN Color of handle when disabled
      */
    var handleColorDisabled: String = js.native
    
    /**
      * @desc 滑块边框宽度
      * @descEN Border width of handle
      */
    var handleLineWidth: Double = js.native
    
    /**
      * @desc 滑块边框宽度（悬浮态）
      * @descEN Border width of handle when hover
      */
    var handleLineWidthHover: Double = js.native
    
    /**
      * @desc 滑块尺寸
      * @descEN Size of handle
      */
    var handleSize: Double = js.native
    
    /**
      * @desc 滑块尺寸（悬浮态）
      * @descEN Size of handle when hover
      */
    var handleSizeHover: Double = js.native
    
    /**
      * @desc 轨道背景色
      * @descEN Background color of rail
      */
    var railBg: String = js.native
    
    /**
      * @desc 轨道背景色（悬浮态）
      * @descEN Background color of rail when hover
      */
    var railHoverBg: String = js.native
    
    /**
      * @desc 轨道高度
      * @descEN Height of rail
      */
    var railSize: Double = js.native
    
    /**
      * @desc 轨道已覆盖部分背景色
      * @descEN Background color of track
      */
    var trackBg: String = js.native
    
    /**
      * @desc 轨道禁用态背景色
      * @descEN Background color of track when disabled
      */
    var trackBgDisabled: String = js.native
    
    /**
      * @desc 轨道已覆盖部分背景色（悬浮态）
      * @descEN Background color of track when hover
      */
    var trackHoverBg: String = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      controlSize: Double,
      dotActiveBorderColor: String,
      dotBorderColor: String,
      dotSize: Double,
      handleActiveColor: String,
      handleColor: String,
      handleColorDisabled: String,
      handleLineWidth: Double,
      handleLineWidthHover: Double,
      handleSize: Double,
      handleSizeHover: Double,
      railBg: String,
      railHoverBg: String,
      railSize: Double,
      trackBg: String,
      trackBgDisabled: String,
      trackHoverBg: String
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(controlSize = controlSize.asInstanceOf[js.Any], dotActiveBorderColor = dotActiveBorderColor.asInstanceOf[js.Any], dotBorderColor = dotBorderColor.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], handleActiveColor = handleActiveColor.asInstanceOf[js.Any], handleColor = handleColor.asInstanceOf[js.Any], handleColorDisabled = handleColorDisabled.asInstanceOf[js.Any], handleLineWidth = handleLineWidth.asInstanceOf[js.Any], handleLineWidthHover = handleLineWidthHover.asInstanceOf[js.Any], handleSize = handleSize.asInstanceOf[js.Any], handleSizeHover = handleSizeHover.asInstanceOf[js.Any], railBg = railBg.asInstanceOf[js.Any], railHoverBg = railHoverBg.asInstanceOf[js.Any], railSize = railSize.asInstanceOf[js.Any], trackBg = trackBg.asInstanceOf[js.Any], trackBgDisabled = trackBgDisabled.asInstanceOf[js.Any], trackHoverBg = trackHoverBg.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlSize(value: Double): Self = StObject.set(x, "controlSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotActiveBorderColor(value: String): Self = StObject.set(x, "dotActiveBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotBorderColor(value: String): Self = StObject.set(x, "dotBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotSize(value: Double): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleActiveColor(value: String): Self = StObject.set(x, "handleActiveColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleColor(value: String): Self = StObject.set(x, "handleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleColorDisabled(value: String): Self = StObject.set(x, "handleColorDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleLineWidth(value: Double): Self = StObject.set(x, "handleLineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleLineWidthHover(value: Double): Self = StObject.set(x, "handleLineWidthHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSize(value: Double): Self = StObject.set(x, "handleSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSizeHover(value: Double): Self = StObject.set(x, "handleSizeHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailBg(value: String): Self = StObject.set(x, "railBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailHoverBg(value: String): Self = StObject.set(x, "railHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailSize(value: Double): Self = StObject.set(x, "railSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackBg(value: String): Self = StObject.set(x, "trackBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackBgDisabled(value: String): Self = StObject.set(x, "trackBgDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackHoverBg(value: String): Self = StObject.set(x, "trackHoverBg", value.asInstanceOf[js.Any])
    }
  }
}
