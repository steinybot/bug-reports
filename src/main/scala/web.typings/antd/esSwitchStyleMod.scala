package web.typings.antd

import web.typings.antd.antdStrings.Switch
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSwitchStyleMod {
  
  @JSImport("antd/es/switch/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/switch/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Switch] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 开关把手背景色
      * @descEN Background color of Switch handle
      */
    var handleBg: String = js.native
    
    /**
      * @desc 开关把手阴影
      * @descEN Shadow of Switch handle
      */
    var handleShadow: String = js.native
    
    /**
      * @desc 开关把手大小
      * @descEN Size of Switch handle
      */
    var handleSize: Double = js.native
    
    /**
      * @desc 小号开关把手大小
      * @descEN Size of small Switch handle
      */
    var handleSizeSM: Double = js.native
    
    /**
      * @desc 内容区域最大边距
      * @descEN Maximum margin of content area
      */
    var innerMaxMargin: Double = js.native
    
    /**
      * @desc 小号开关内容区域最大边距
      * @descEN Maximum margin of content area of small Switch
      */
    var innerMaxMarginSM: Double = js.native
    
    /**
      * @desc 内容区域最小边距
      * @descEN Minimum margin of content area
      */
    var innerMinMargin: Double = js.native
    
    /**
      * @desc 小号开关内容区域最小边距
      * @descEN Minimum margin of content area of small Switch
      */
    var innerMinMarginSM: Double = js.native
    
    /**
      *  @desc 开关高度
      *  @descEN Height of Switch
      */
    var trackHeight: Double = js.native
    
    /**
      * @desc 小号开关高度
      * @descEN Height of small Switch
      */
    var trackHeightSM: Double = js.native
    
    /**
      * @desc 开关最小宽度
      * @descEN Minimum width of Switch
      */
    var trackMinWidth: Double = js.native
    
    /**
      * @desc 小号开关最小宽度
      * @descEN Minimum width of small Switch
      */
    var trackMinWidthSM: Double = js.native
    
    /**
      * @desc 开关内边距
      * @descEN Padding of Switch
      */
    var trackPadding: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      handleBg: String,
      handleShadow: String,
      handleSize: Double,
      handleSizeSM: Double,
      innerMaxMargin: Double,
      innerMaxMarginSM: Double,
      innerMinMargin: Double,
      innerMinMarginSM: Double,
      trackHeight: Double,
      trackHeightSM: Double,
      trackMinWidth: Double,
      trackMinWidthSM: Double,
      trackPadding: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(handleBg = handleBg.asInstanceOf[js.Any], handleShadow = handleShadow.asInstanceOf[js.Any], handleSize = handleSize.asInstanceOf[js.Any], handleSizeSM = handleSizeSM.asInstanceOf[js.Any], innerMaxMargin = innerMaxMargin.asInstanceOf[js.Any], innerMaxMarginSM = innerMaxMarginSM.asInstanceOf[js.Any], innerMinMargin = innerMinMargin.asInstanceOf[js.Any], innerMinMarginSM = innerMinMarginSM.asInstanceOf[js.Any], trackHeight = trackHeight.asInstanceOf[js.Any], trackHeightSM = trackHeightSM.asInstanceOf[js.Any], trackMinWidth = trackMinWidth.asInstanceOf[js.Any], trackMinWidthSM = trackMinWidthSM.asInstanceOf[js.Any], trackPadding = trackPadding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleBg(value: String): Self = StObject.set(x, "handleBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleShadow(value: String): Self = StObject.set(x, "handleShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSize(value: Double): Self = StObject.set(x, "handleSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSizeSM(value: Double): Self = StObject.set(x, "handleSizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerMaxMargin(value: Double): Self = StObject.set(x, "innerMaxMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerMaxMarginSM(value: Double): Self = StObject.set(x, "innerMaxMarginSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerMinMargin(value: Double): Self = StObject.set(x, "innerMinMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerMinMarginSM(value: Double): Self = StObject.set(x, "innerMinMarginSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackHeight(value: Double): Self = StObject.set(x, "trackHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackHeightSM(value: Double): Self = StObject.set(x, "trackHeightSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackMinWidth(value: Double): Self = StObject.set(x, "trackMinWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackMinWidthSM(value: Double): Self = StObject.set(x, "trackMinWidthSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackPadding(value: Double): Self = StObject.set(x, "trackPadding", value.asInstanceOf[js.Any])
    }
  }
}
