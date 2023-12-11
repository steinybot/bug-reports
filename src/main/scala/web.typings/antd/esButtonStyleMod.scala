package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Button
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esButtonStyleMod {
  
  @JSImport("antd/es/button/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/button/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Button] = js.native
  
  @scala.inline
  def prepareToken(
    token: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<antd.antd/es/theme/util/genComponentStyleHook.GenStyleFn<'Button'>>[0] */ js.Any
  ): ButtonToken = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareToken")(token.asInstanceOf[js.Any]).asInstanceOf[ButtonToken]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Button'] */ @js.native
  trait ButtonToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var buttonIconOnlyFontSize: Double = js.native
    
    var buttonPaddingHorizontal: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any = js.native
    
    var buttonPaddingVertical: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingBlock'] */ js.Any = js.native
  }
  object ButtonToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      buttonIconOnlyFontSize: Double,
      buttonPaddingHorizontal: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any,
      buttonPaddingVertical: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingBlock'] */ js.Any
    ): ButtonToken = {
      val __obj = js.Dynamic.literal(buttonIconOnlyFontSize = buttonIconOnlyFontSize.asInstanceOf[js.Any], buttonPaddingHorizontal = buttonPaddingHorizontal.asInstanceOf[js.Any], buttonPaddingVertical = buttonPaddingVertical.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[ButtonToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ButtonToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonIconOnlyFontSize(value: Double): Self = StObject.set(x, "buttonIconOnlyFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPaddingHorizontal(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any
      ): Self = StObject.set(x, "buttonPaddingHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPaddingVertical(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingBlock'] */ js.Any
      ): Self = StObject.set(x, "buttonPaddingVertical", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 禁用状态边框颜色
      * @descEN Border color of disabled button
      */
    var borderColorDisabled: String = js.native
    
    /**
      * @desc 按钮内容字体大小
      * @descEN Font size of button content
      */
    var contentFontSize: Double = js.native
    
    /**
      * @desc 大号按钮内容字体大小
      * @descEN Font size of large button content
      */
    var contentFontSizeLG: Double = js.native
    
    /**
      * @desc 小号按钮内容字体大小
      * @descEN Font size of small button content
      */
    var contentFontSizeSM: Double = js.native
    
    /**
      * @desc 危险按钮文本颜色
      * @descEN Text color of danger button
      */
    var dangerColor: String = js.native
    
    /**
      * @desc 危险按钮阴影
      * @descEN Shadow of danger button
      */
    var dangerShadow: String = js.native
    
    /**
      * @desc 默认按钮背景色
      * @descEN Background color of default button
      */
    var defaultBg: String = js.native
    
    /**
      * @desc 默认按钮边框颜色
      * @descEN Border color of default button
      */
    var defaultBorderColor: String = js.native
    
    /**
      * @desc 默认按钮文本颜色
      * @descEN Text color of default button
      */
    var defaultColor: String = js.native
    
    /**
      * @desc 默认幽灵按钮边框颜色
      * @descEN Border color of default ghost button
      */
    var defaultGhostBorderColor: String = js.native
    
    /**
      * @desc 默认幽灵按钮文本颜色
      * @descEN Text color of default ghost button
      */
    var defaultGhostColor: String = js.native
    
    /**
      * @desc 默认按钮阴影
      * @descEN Shadow of default button
      */
    var defaultShadow: String = js.native
    
    /**
      * @desc 文字字重
      * @descEN Font weight of text
      */
    var fontWeight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['fontWeight'] */ js.Any = js.native
    
    /**
      * @desc 幽灵按钮背景色
      * @descEN Background color of ghost button
      */
    var ghostBg: String = js.native
    
    /**
      * @desc 按钮组边框颜色
      * @descEN Border color of button group
      */
    var groupBorderColor: String = js.native
    
    /**
      * @desc 链接按钮悬浮态背景色
      * @descEN Background color of link button when hover
      */
    var linkHoverBg: String = js.native
    
    /**
      * @desc 只有图标的按钮图标尺寸
      * @descEN Icon size of button which only contains icon
      */
    var onlyIconSize: Double = js.native
    
    /**
      * @desc 大号只有图标的按钮图标尺寸
      * @descEN Icon size of large button which only contains icon
      */
    var onlyIconSizeLG: Double = js.native
    
    /**
      * @desc 小号只有图标的按钮图标尺寸
      * @descEN Icon size of small button which only contains icon
      */
    var onlyIconSizeSM: Double = js.native
    
    /**
      * @desc 按钮横向内间距
      * @descEN Horizontal padding of button
      */
    var paddingBlock: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any = js.native
    
    /**
      * @desc 大号按钮横向内间距
      * @descEN Horizontal padding of large button
      */
    var paddingBlockLG: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any = js.native
    
    /**
      * @desc 小号按钮横向内间距
      * @descEN Horizontal padding of small button
      */
    var paddingBlockSM: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any = js.native
    
    /**
      * @desc 按钮横向内间距
      * @descEN Horizontal padding of button
      */
    var paddingInline: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any = js.native
    
    /**
      * @desc 大号按钮横向内间距
      * @descEN Horizontal padding of large button
      */
    var paddingInlineLG: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any = js.native
    
    /**
      * @desc 小号按钮横向内间距
      * @descEN Horizontal padding of small button
      */
    var paddingInlineSM: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any = js.native
    
    /**
      * @desc 主要按钮文本颜色
      * @descEN Text color of primary button
      */
    var primaryColor: String = js.native
    
    /**
      * @desc 主要按钮阴影
      * @descEN Shadow of primary button
      */
    var primaryShadow: String = js.native
    
    /**
      * @desc 文本按钮悬浮态背景色
      * @descEN Background color of text button when hover
      */
    var textHoverBg: String = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      borderColorDisabled: String,
      contentFontSize: Double,
      contentFontSizeLG: Double,
      contentFontSizeSM: Double,
      dangerColor: String,
      dangerShadow: String,
      defaultBg: String,
      defaultBorderColor: String,
      defaultColor: String,
      defaultGhostBorderColor: String,
      defaultGhostColor: String,
      defaultShadow: String,
      fontWeight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['fontWeight'] */ js.Any,
      ghostBg: String,
      groupBorderColor: String,
      linkHoverBg: String,
      onlyIconSize: Double,
      onlyIconSizeLG: Double,
      onlyIconSizeSM: Double,
      paddingBlock: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any,
      paddingBlockLG: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any,
      paddingBlockSM: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any,
      paddingInline: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any,
      paddingInlineLG: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any,
      paddingInlineSM: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any,
      primaryColor: String,
      primaryShadow: String,
      textHoverBg: String
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(borderColorDisabled = borderColorDisabled.asInstanceOf[js.Any], contentFontSize = contentFontSize.asInstanceOf[js.Any], contentFontSizeLG = contentFontSizeLG.asInstanceOf[js.Any], contentFontSizeSM = contentFontSizeSM.asInstanceOf[js.Any], dangerColor = dangerColor.asInstanceOf[js.Any], dangerShadow = dangerShadow.asInstanceOf[js.Any], defaultBg = defaultBg.asInstanceOf[js.Any], defaultBorderColor = defaultBorderColor.asInstanceOf[js.Any], defaultColor = defaultColor.asInstanceOf[js.Any], defaultGhostBorderColor = defaultGhostBorderColor.asInstanceOf[js.Any], defaultGhostColor = defaultGhostColor.asInstanceOf[js.Any], defaultShadow = defaultShadow.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], ghostBg = ghostBg.asInstanceOf[js.Any], groupBorderColor = groupBorderColor.asInstanceOf[js.Any], linkHoverBg = linkHoverBg.asInstanceOf[js.Any], onlyIconSize = onlyIconSize.asInstanceOf[js.Any], onlyIconSizeLG = onlyIconSizeLG.asInstanceOf[js.Any], onlyIconSizeSM = onlyIconSizeSM.asInstanceOf[js.Any], paddingBlock = paddingBlock.asInstanceOf[js.Any], paddingBlockLG = paddingBlockLG.asInstanceOf[js.Any], paddingBlockSM = paddingBlockSM.asInstanceOf[js.Any], paddingInline = paddingInline.asInstanceOf[js.Any], paddingInlineLG = paddingInlineLG.asInstanceOf[js.Any], paddingInlineSM = paddingInlineSM.asInstanceOf[js.Any], primaryColor = primaryColor.asInstanceOf[js.Any], primaryShadow = primaryShadow.asInstanceOf[js.Any], textHoverBg = textHoverBg.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColorDisabled(value: String): Self = StObject.set(x, "borderColorDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFontSize(value: Double): Self = StObject.set(x, "contentFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFontSizeLG(value: Double): Self = StObject.set(x, "contentFontSizeLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFontSizeSM(value: Double): Self = StObject.set(x, "contentFontSizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerColor(value: String): Self = StObject.set(x, "dangerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerShadow(value: String): Self = StObject.set(x, "dangerShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBg(value: String): Self = StObject.set(x, "defaultBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBorderColor(value: String): Self = StObject.set(x, "defaultBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColor(value: String): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultGhostBorderColor(value: String): Self = StObject.set(x, "defaultGhostBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultGhostColor(value: String): Self = StObject.set(x, "defaultGhostColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultShadow(value: String): Self = StObject.set(x, "defaultShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['fontWeight'] */ js.Any
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGhostBg(value: String): Self = StObject.set(x, "ghostBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupBorderColor(value: String): Self = StObject.set(x, "groupBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkHoverBg(value: String): Self = StObject.set(x, "linkHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyIconSize(value: Double): Self = StObject.set(x, "onlyIconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyIconSizeLG(value: Double): Self = StObject.set(x, "onlyIconSizeLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyIconSizeSM(value: Double): Self = StObject.set(x, "onlyIconSizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any
      ): Self = StObject.set(x, "paddingBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBlockLG(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any
      ): Self = StObject.set(x, "paddingBlockLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBlockSM(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any
      ): Self = StObject.set(x, "paddingBlockSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any
      ): Self = StObject.set(x, "paddingInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInlineLG(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any
      ): Self = StObject.set(x, "paddingInlineLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInlineSM(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any
      ): Self = StObject.set(x, "paddingInlineSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryShadow(value: String): Self = StObject.set(x, "primaryShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextHoverBg(value: String): Self = StObject.set(x, "textHoverBg", value.asInstanceOf[js.Any])
    }
  }
}
