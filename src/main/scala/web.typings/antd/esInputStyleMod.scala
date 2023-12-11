package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.anon.BackgroundColor
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInputStyleMod {
  
  @JSImport("antd/es/input/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @scala.inline
  def genActiveStyle(token: InputToken): BackgroundColor = ^.asInstanceOf[js.Dynamic].applyDynamic("genActiveStyle")(token.asInstanceOf[js.Any]).asInstanceOf[BackgroundColor]
  
  @scala.inline
  def genBasicInputStyle(token: InputToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genBasicInputStyle")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def genDisabledStyle(token: InputToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genDisabledStyle")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def genHoverStyle(token: InputToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genHoverStyle")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def genInputGroupStyle(token: InputToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genInputGroupStyle")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def genInputSmallStyle(token: InputToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genInputSmallStyle")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def genPlaceholderStyle(color: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genPlaceholderStyle")(color.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def genStatusStyle(token: InputToken, parentCls: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("genStatusStyle")(token.asInstanceOf[js.Any], parentCls.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @scala.inline
  def initComponentToken(token: GlobalToken): SharedComponentToken = ^.asInstanceOf[js.Dynamic].applyDynamic("initComponentToken")(token.asInstanceOf[js.Any]).asInstanceOf[SharedComponentToken]
  
  @scala.inline
  def initInputToken(token: GlobalToken): SharedInputToken = ^.asInstanceOf[js.Dynamic].applyDynamic("initInputToken")(token.asInstanceOf[js.Any]).asInstanceOf[SharedInputToken]
  
  type ComponentToken = SharedComponentToken
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Input'] */ @js.native
  trait InputToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil
       with SharedInputToken
  object InputToken {
    
    @scala.inline
    def apply(AntCls: AntCls, CSSUtil: CSSUtil, SharedInputToken: SharedInputToken): InputToken = {
      val __obj = js.Dynamic.literal()
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      js.Dynamic.global.Object.assign(__obj, SharedInputToken)
      __obj.asInstanceOf[InputToken]
    }
  }
  
  @js.native
  trait SharedComponentToken extends StObject {
    
    /**
      * @desc 输入框激活状态时背景颜色
      * @descEN Background color when the input box is activated
      */
    var activeBg: String = js.native
    
    /**
      * @desc 激活态边框色
      * @descEN Active border color
      */
    var activeBorderColor: String = js.native
    
    /**
      * @desc 激活态阴影
      * @descEN Box-shadow when active
      */
    var activeShadow: String = js.native
    
    /**
      * @desc 前/后置标签背景色
      * @descEN Background color of addon
      */
    var addonBg: String = js.native
    
    /**
      * @desc 错误状态时激活态阴影
      * @descEN Box-shadow when active in error status
      */
    var errorActiveShadow: String = js.native
    
    /**
      * @desc 输入框hover状态时背景颜色
      * @descEN Background color when the input box hovers
      */
    var hoverBg: String = js.native
    
    /**
      * @desc 悬浮态边框色
      * @descEN Hover border color
      */
    var hoverBorderColor: String = js.native
    
    /**
      * @desc 输入框纵向内边距
      * @descEN Vertical padding of input
      */
    var paddingBlock: Double = js.native
    
    /**
      * @desc 大号输入框纵向内边距
      * @descEN Vertical padding of large input
      */
    var paddingBlockLG: Double = js.native
    
    /**
      * @desc 小号输入框纵向内边距
      * @descEN Vertical padding of small input
      */
    var paddingBlockSM: Double = js.native
    
    /**
      * @desc 输入框横向内边距
      * @descEN Horizontal padding of input
      */
    var paddingInline: Double = js.native
    
    /**
      * @desc 大号输入框横向内边距
      * @descEN Horizontal padding of large input
      */
    var paddingInlineLG: Double = js.native
    
    /**
      * @desc 小号输入框横向内边距
      * @descEN Horizontal padding of small input
      */
    var paddingInlineSM: Double = js.native
    
    /**
      * @desc 警告状态时激活态阴影
      * @descEN Box-shadow when active in warning status
      */
    var warningActiveShadow: String = js.native
  }
  object SharedComponentToken {
    
    @scala.inline
    def apply(
      activeBg: String,
      activeBorderColor: String,
      activeShadow: String,
      addonBg: String,
      errorActiveShadow: String,
      hoverBg: String,
      hoverBorderColor: String,
      paddingBlock: Double,
      paddingBlockLG: Double,
      paddingBlockSM: Double,
      paddingInline: Double,
      paddingInlineLG: Double,
      paddingInlineSM: Double,
      warningActiveShadow: String
    ): SharedComponentToken = {
      val __obj = js.Dynamic.literal(activeBg = activeBg.asInstanceOf[js.Any], activeBorderColor = activeBorderColor.asInstanceOf[js.Any], activeShadow = activeShadow.asInstanceOf[js.Any], addonBg = addonBg.asInstanceOf[js.Any], errorActiveShadow = errorActiveShadow.asInstanceOf[js.Any], hoverBg = hoverBg.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], paddingBlock = paddingBlock.asInstanceOf[js.Any], paddingBlockLG = paddingBlockLG.asInstanceOf[js.Any], paddingBlockSM = paddingBlockSM.asInstanceOf[js.Any], paddingInline = paddingInline.asInstanceOf[js.Any], paddingInlineLG = paddingInlineLG.asInstanceOf[js.Any], paddingInlineSM = paddingInlineSM.asInstanceOf[js.Any], warningActiveShadow = warningActiveShadow.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SharedComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveBg(value: String): Self = StObject.set(x, "activeBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveBorderColor(value: String): Self = StObject.set(x, "activeBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveShadow(value: String): Self = StObject.set(x, "activeShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonBg(value: String): Self = StObject.set(x, "addonBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorActiveShadow(value: String): Self = StObject.set(x, "errorActiveShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverBg(value: String): Self = StObject.set(x, "hoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverBorderColor(value: String): Self = StObject.set(x, "hoverBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBlock(value: Double): Self = StObject.set(x, "paddingBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBlockLG(value: Double): Self = StObject.set(x, "paddingBlockLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBlockSM(value: Double): Self = StObject.set(x, "paddingBlockSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInline(value: Double): Self = StObject.set(x, "paddingInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInlineLG(value: Double): Self = StObject.set(x, "paddingInlineLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInlineSM(value: Double): Self = StObject.set(x, "paddingInlineSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningActiveShadow(value: String): Self = StObject.set(x, "warningActiveShadow", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SharedInputToken extends StObject {
    
    var inputAffixPadding: Double = js.native
  }
  object SharedInputToken {
    
    @scala.inline
    def apply(inputAffixPadding: Double): SharedInputToken = {
      val __obj = js.Dynamic.literal(inputAffixPadding = inputAffixPadding.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedInputToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SharedInputToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputAffixPadding(value: Double): Self = StObject.set(x, "inputAffixPadding", value.asInstanceOf[js.Any])
    }
  }
}
