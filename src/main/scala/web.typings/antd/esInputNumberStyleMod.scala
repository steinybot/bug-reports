package web.typings.antd

import web.typings.antd.anon.BorderEndEndRadius
import web.typings.antd.anon.BorderEndEndRadiusBorderStartEndRadius
import web.typings.antd.anon.BorderStartEndRadius
import web.typings.antd.antdBooleans.`true`
import web.typings.antd.antdStrings.InputNumber
import web.typings.antd.antdStrings.auto
import web.typings.antd.antdStrings.lg
import web.typings.antd.antdStrings.sm
import web.typings.antd.esInputStyleMod.SharedComponentToken
import web.typings.antd.esInputStyleMod.SharedInputToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FormatComponentToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FullToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInputNumberStyleMod {
  
  @JSImport("antd/es/input-number/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/input-number/style", "formatComponentToken")
  @js.native
  val formatComponentToken: FormatComponentToken[InputNumber] = js.native
  
  @scala.inline
  def genRadiusStyle(param0: InputNumberToken, size: lg | sm): StringDictionary[
    StringDictionary[
      BorderEndEndRadius | BorderStartEndRadius | BorderEndEndRadiusBorderStartEndRadius
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("genRadiusStyle")(param0.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[
    StringDictionary[
      BorderEndEndRadius | BorderStartEndRadius | BorderEndEndRadiusBorderStartEndRadius
    ]
  ]]
  
  @JSImport("antd/es/input-number/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[InputNumber] = js.native
  
  @js.native
  trait ComponentToken
    extends StObject
       with SharedComponentToken {
    
    /**
      * @desc 输入框宽度
      * @descEN Width of input
      */
    var controlWidth: Double = js.native
    
    /**
      * @desc 操作按钮激活背景色
      * @descEN Active background color of handle
      */
    var handleActiveBg: String = js.native
    
    /**
      * @desc 操作按钮背景色
      * @descEN Background color of handle
      */
    var handleBg: String = js.native
    
    /**
      * @desc 操作按钮边框颜色
      * @descEN Border color of handle
      */
    var handleBorderColor: String = js.native
    
    /**
      * @desc 操作按钮图标大小
      * @descEN Icon size of control button
      */
    var handleFontSize: Double = js.native
    
    /**
      * @desc 操作按钮悬浮颜色
      * @descEN Hover color of handle
      */
    var handleHoverColor: String = js.native
    
    /**
      * Default `auto`. Set `true` will always show the handle
      * @desc 操作按钮可见性
      * @descEN Handle visible
      */
    var handleVisible: auto | `true` = js.native
    
    /**
      * @desc 操作按钮宽度
      * @descEN Width of control button
      */
    var handleWidth: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      activeBg: String,
      activeBorderColor: String,
      activeShadow: String,
      addonBg: String,
      controlWidth: Double,
      errorActiveShadow: String,
      handleActiveBg: String,
      handleBg: String,
      handleBorderColor: String,
      handleFontSize: Double,
      handleHoverColor: String,
      handleVisible: auto | `true`,
      handleWidth: Double,
      hoverBg: String,
      hoverBorderColor: String,
      paddingBlock: Double,
      paddingBlockLG: Double,
      paddingBlockSM: Double,
      paddingInline: Double,
      paddingInlineLG: Double,
      paddingInlineSM: Double,
      warningActiveShadow: String
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(activeBg = activeBg.asInstanceOf[js.Any], activeBorderColor = activeBorderColor.asInstanceOf[js.Any], activeShadow = activeShadow.asInstanceOf[js.Any], addonBg = addonBg.asInstanceOf[js.Any], controlWidth = controlWidth.asInstanceOf[js.Any], errorActiveShadow = errorActiveShadow.asInstanceOf[js.Any], handleActiveBg = handleActiveBg.asInstanceOf[js.Any], handleBg = handleBg.asInstanceOf[js.Any], handleBorderColor = handleBorderColor.asInstanceOf[js.Any], handleFontSize = handleFontSize.asInstanceOf[js.Any], handleHoverColor = handleHoverColor.asInstanceOf[js.Any], handleVisible = handleVisible.asInstanceOf[js.Any], handleWidth = handleWidth.asInstanceOf[js.Any], hoverBg = hoverBg.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], paddingBlock = paddingBlock.asInstanceOf[js.Any], paddingBlockLG = paddingBlockLG.asInstanceOf[js.Any], paddingBlockSM = paddingBlockSM.asInstanceOf[js.Any], paddingInline = paddingInline.asInstanceOf[js.Any], paddingInlineLG = paddingInlineLG.asInstanceOf[js.Any], paddingInlineSM = paddingInlineSM.asInstanceOf[js.Any], warningActiveShadow = warningActiveShadow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlWidth(value: Double): Self = StObject.set(x, "controlWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleActiveBg(value: String): Self = StObject.set(x, "handleActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleBg(value: String): Self = StObject.set(x, "handleBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleBorderColor(value: String): Self = StObject.set(x, "handleBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleFontSize(value: Double): Self = StObject.set(x, "handleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleHoverColor(value: String): Self = StObject.set(x, "handleHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleVisible(value: auto | `true`): Self = StObject.set(x, "handleVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleWidth(value: Double): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type InputNumberToken = FullToken[InputNumber] with SharedInputToken
}
