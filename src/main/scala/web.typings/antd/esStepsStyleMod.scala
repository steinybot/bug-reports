package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Steps
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStepsStyleMod {
  
  @JSImport("antd/es/steps/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/steps/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Steps] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 自定义图标大小
      * @descEN Font size of custom icon
      */
    var customIconFontSize: Double = js.native
    
    /**
      * @desc 自定义图标容器尺寸
      * @descEN Size of custom icon container
      */
    var customIconSize: Double = js.native
    
    /**
      * @desc 自定义图标 top
      * @descEN Top of custom icon
      */
    var customIconTop: Double = js.native
    
    /**
      * @desc 描述区域最大宽度
      * @descEN Max width of description area
      */
    var descriptionMaxWidth: Double = js.native
    
    /**
      * @desc 点状步骤点当前大小
      * @descEN Current size of dot
      */
    var dotCurrentSize: Double = js.native
    
    /**
      * @desc 点状步骤点大小
      * @descEN Size of dot
      */
    var dotSize: Double = js.native
    
    /**
      * @Internal
      */
    var finishIconBorderColor: String = js.native
    
    /**
      * @desc 图标大小
      * @descEN Size of icon
      */
    var iconFontSize: Double = js.native
    
    /**
      * @desc 图标容器尺寸
      * @descEN Size of icon container
      */
    var iconSize: Double = js.native
    
    /**
      * @desc 小号步骤条图标大小
      * @descEN Size of small steps icon
      */
    var iconSizeSM: Double = js.native
    
    /**
      * @desc 图标 top
      * @descEN Top of icon
      */
    var iconTop: Double = js.native
    
    /**
      * @desc 可跳转步骤条箭头颜色
      * @descEN Color of arrow in nav
      */
    var navArrowColor: String = js.native
    
    /**
      * @desc 可跳转步骤条内容最大宽度
      * @descEN Max width of nav content
      */
    var navContentMaxWidth: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any = js.native
    
    /**
      * @desc 标题行高
      * @descEN Line height of title
      */
    var titleLineHeight: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      customIconFontSize: Double,
      customIconSize: Double,
      customIconTop: Double,
      descriptionMaxWidth: Double,
      dotCurrentSize: Double,
      dotSize: Double,
      finishIconBorderColor: String,
      iconFontSize: Double,
      iconSize: Double,
      iconSizeSM: Double,
      iconTop: Double,
      navArrowColor: String,
      navContentMaxWidth: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any,
      titleLineHeight: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(customIconFontSize = customIconFontSize.asInstanceOf[js.Any], customIconSize = customIconSize.asInstanceOf[js.Any], customIconTop = customIconTop.asInstanceOf[js.Any], descriptionMaxWidth = descriptionMaxWidth.asInstanceOf[js.Any], dotCurrentSize = dotCurrentSize.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], finishIconBorderColor = finishIconBorderColor.asInstanceOf[js.Any], iconFontSize = iconFontSize.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], iconSizeSM = iconSizeSM.asInstanceOf[js.Any], iconTop = iconTop.asInstanceOf[js.Any], navArrowColor = navArrowColor.asInstanceOf[js.Any], navContentMaxWidth = navContentMaxWidth.asInstanceOf[js.Any], titleLineHeight = titleLineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomIconFontSize(value: Double): Self = StObject.set(x, "customIconFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomIconSize(value: Double): Self = StObject.set(x, "customIconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomIconTop(value: Double): Self = StObject.set(x, "customIconTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionMaxWidth(value: Double): Self = StObject.set(x, "descriptionMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotCurrentSize(value: Double): Self = StObject.set(x, "dotCurrentSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotSize(value: Double): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishIconBorderColor(value: String): Self = StObject.set(x, "finishIconBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFontSize(value: Double): Self = StObject.set(x, "iconFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSizeSM(value: Double): Self = StObject.set(x, "iconSizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconTop(value: Double): Self = StObject.set(x, "iconTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavArrowColor(value: String): Self = StObject.set(x, "navArrowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavContentMaxWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ): Self = StObject.set(x, "navContentMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeight(value: Double): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Steps'] */ @js.native
  trait StepsToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var errorDescriptionColor: String = js.native
    
    var errorDotColor: String = js.native
    
    var errorIconBgColor: String = js.native
    
    var errorIconBorderColor: String = js.native
    
    var errorIconColor: String = js.native
    
    var errorTailColor: String = js.native
    
    var errorTitleColor: String = js.native
    
    var finishDescriptionColor: String = js.native
    
    var finishDotColor: String = js.native
    
    var finishIconColor: String = js.native
    
    var finishTailColor: String = js.native
    
    var finishTitleColor: String = js.native
    
    var inlineDotSize: Double = js.native
    
    var inlineTailColor: String = js.native
    
    var inlineTitleColor: String = js.native
    
    var processDescriptionColor: String = js.native
    
    var processDotColor: String = js.native
    
    var processIconBgColor: String = js.native
    
    var processIconBorderColor: String = js.native
    
    var processIconColor: String = js.native
    
    var processTailColor: String = js.native
    
    var processTitleColor: String = js.native
    
    var stepsNavActiveColor: String = js.native
    
    var stepsProgressSize: Double = js.native
    
    var waitDescriptionColor: String = js.native
    
    var waitDotColor: String = js.native
    
    var waitTailColor: String = js.native
    
    var waitTitleColor: String = js.native
  }
  object StepsToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      errorDescriptionColor: String,
      errorDotColor: String,
      errorIconBgColor: String,
      errorIconBorderColor: String,
      errorIconColor: String,
      errorTailColor: String,
      errorTitleColor: String,
      finishDescriptionColor: String,
      finishDotColor: String,
      finishIconColor: String,
      finishTailColor: String,
      finishTitleColor: String,
      inlineDotSize: Double,
      inlineTailColor: String,
      inlineTitleColor: String,
      processDescriptionColor: String,
      processDotColor: String,
      processIconBgColor: String,
      processIconBorderColor: String,
      processIconColor: String,
      processTailColor: String,
      processTitleColor: String,
      stepsNavActiveColor: String,
      stepsProgressSize: Double,
      waitDescriptionColor: String,
      waitDotColor: String,
      waitTailColor: String,
      waitTitleColor: String
    ): StepsToken = {
      val __obj = js.Dynamic.literal(errorDescriptionColor = errorDescriptionColor.asInstanceOf[js.Any], errorDotColor = errorDotColor.asInstanceOf[js.Any], errorIconBgColor = errorIconBgColor.asInstanceOf[js.Any], errorIconBorderColor = errorIconBorderColor.asInstanceOf[js.Any], errorIconColor = errorIconColor.asInstanceOf[js.Any], errorTailColor = errorTailColor.asInstanceOf[js.Any], errorTitleColor = errorTitleColor.asInstanceOf[js.Any], finishDescriptionColor = finishDescriptionColor.asInstanceOf[js.Any], finishDotColor = finishDotColor.asInstanceOf[js.Any], finishIconColor = finishIconColor.asInstanceOf[js.Any], finishTailColor = finishTailColor.asInstanceOf[js.Any], finishTitleColor = finishTitleColor.asInstanceOf[js.Any], inlineDotSize = inlineDotSize.asInstanceOf[js.Any], inlineTailColor = inlineTailColor.asInstanceOf[js.Any], inlineTitleColor = inlineTitleColor.asInstanceOf[js.Any], processDescriptionColor = processDescriptionColor.asInstanceOf[js.Any], processDotColor = processDotColor.asInstanceOf[js.Any], processIconBgColor = processIconBgColor.asInstanceOf[js.Any], processIconBorderColor = processIconBorderColor.asInstanceOf[js.Any], processIconColor = processIconColor.asInstanceOf[js.Any], processTailColor = processTailColor.asInstanceOf[js.Any], processTitleColor = processTitleColor.asInstanceOf[js.Any], stepsNavActiveColor = stepsNavActiveColor.asInstanceOf[js.Any], stepsProgressSize = stepsProgressSize.asInstanceOf[js.Any], waitDescriptionColor = waitDescriptionColor.asInstanceOf[js.Any], waitDotColor = waitDotColor.asInstanceOf[js.Any], waitTailColor = waitTailColor.asInstanceOf[js.Any], waitTitleColor = waitTitleColor.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[StepsToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: StepsToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorDescriptionColor(value: String): Self = StObject.set(x, "errorDescriptionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorDotColor(value: String): Self = StObject.set(x, "errorDotColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorIconBgColor(value: String): Self = StObject.set(x, "errorIconBgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorIconBorderColor(value: String): Self = StObject.set(x, "errorIconBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorIconColor(value: String): Self = StObject.set(x, "errorIconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorTailColor(value: String): Self = StObject.set(x, "errorTailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorTitleColor(value: String): Self = StObject.set(x, "errorTitleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishDescriptionColor(value: String): Self = StObject.set(x, "finishDescriptionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishDotColor(value: String): Self = StObject.set(x, "finishDotColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishIconColor(value: String): Self = StObject.set(x, "finishIconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishTailColor(value: String): Self = StObject.set(x, "finishTailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishTitleColor(value: String): Self = StObject.set(x, "finishTitleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineDotSize(value: Double): Self = StObject.set(x, "inlineDotSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineTailColor(value: String): Self = StObject.set(x, "inlineTailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineTitleColor(value: String): Self = StObject.set(x, "inlineTitleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessDescriptionColor(value: String): Self = StObject.set(x, "processDescriptionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessDotColor(value: String): Self = StObject.set(x, "processDotColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessIconBgColor(value: String): Self = StObject.set(x, "processIconBgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessIconBorderColor(value: String): Self = StObject.set(x, "processIconBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessIconColor(value: String): Self = StObject.set(x, "processIconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessTailColor(value: String): Self = StObject.set(x, "processTailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessTitleColor(value: String): Self = StObject.set(x, "processTitleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsNavActiveColor(value: String): Self = StObject.set(x, "stepsNavActiveColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsProgressSize(value: Double): Self = StObject.set(x, "stepsProgressSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitDescriptionColor(value: String): Self = StObject.set(x, "waitDescriptionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitDotColor(value: String): Self = StObject.set(x, "waitDotColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitTailColor(value: String): Self = StObject.set(x, "waitTailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitTitleColor(value: String): Self = StObject.set(x, "waitTitleColor", value.asInstanceOf[js.Any])
    }
  }
}
