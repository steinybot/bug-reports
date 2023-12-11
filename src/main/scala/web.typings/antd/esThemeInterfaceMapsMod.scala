package web.typings.antd

import web.typings.antd.esThemeInterfaceMapsColorsMod.ColorNeutralMapToken
import web.typings.antd.esThemeInterfaceMapsSizeMod.HeightMapToken
import web.typings.antd.esThemeInterfaceMapsSizeMod.SizeMapToken
import web.typings.antd.esThemeInterfaceMapsStyleMod.StyleMapToken
import web.typings.antd.esThemeInterfaceSeedsMod.SeedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeInterfaceMapsMod {
  
  @js.native
  trait CommonMapToken
    extends StObject
       with StyleMapToken {
    
    /**
      * @desc 动效播放速度，快速。用于小型元素动画交互
      * @descEN Motion speed, fast speed. Used for small element animation interaction.
      */
    var motionDurationFast: String = js.native
    
    /**
      * @desc 动效播放速度，中速。用于中型元素动画交互
      * @descEN Motion speed, medium speed. Used for medium element animation interaction.
      */
    var motionDurationMid: String = js.native
    
    /**
      * @desc 动效播放速度，慢速。用于大型元素如面板动画交互
      * @descEN Motion speed, slow speed. Used for large element animation interaction.
      */
    var motionDurationSlow: String = js.native
  }
  object CommonMapToken {
    
    @scala.inline
    def apply(
      borderRadiusLG: Double,
      borderRadiusOuter: Double,
      borderRadiusSM: Double,
      borderRadiusXS: Double,
      lineWidthBold: Double,
      motionDurationFast: String,
      motionDurationMid: String,
      motionDurationSlow: String
    ): CommonMapToken = {
      val __obj = js.Dynamic.literal(borderRadiusLG = borderRadiusLG.asInstanceOf[js.Any], borderRadiusOuter = borderRadiusOuter.asInstanceOf[js.Any], borderRadiusSM = borderRadiusSM.asInstanceOf[js.Any], borderRadiusXS = borderRadiusXS.asInstanceOf[js.Any], lineWidthBold = lineWidthBold.asInstanceOf[js.Any], motionDurationFast = motionDurationFast.asInstanceOf[js.Any], motionDurationMid = motionDurationMid.asInstanceOf[js.Any], motionDurationSlow = motionDurationSlow.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonMapToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CommonMapToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMotionDurationFast(value: String): Self = StObject.set(x, "motionDurationFast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionDurationMid(value: String): Self = StObject.set(x, "motionDurationMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionDurationSlow(value: String): Self = StObject.set(x, "motionDurationSlow", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ key in / * template literal string: ${keyofPresetColorType}${ColorPaletteKeyIndex} * / string ]: string}
  - Dropped {[ key in / * template literal string: ${keyofPresetColorType}-${ColorPaletteKeyIndex} * / string ]: string} */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `web.typings`.antd.esThemeInterfaceMapsColorsMod.ColorLinkMapToken because var conflicts: colorLink. Inlined colorLinkHover, colorLinkActive
  - `web.typings`.antd.esThemeInterfaceMapsColorsMod.ColorInfoMapToken because var conflicts: colorInfo. Inlined colorInfoBg, colorInfoBgHover, colorInfoBorder, colorInfoBorderHover, colorInfoHover, colorInfoActive, colorInfoTextHover, colorInfoText, colorInfoTextActive
  - `web.typings`.antd.esThemeInterfaceMapsColorsMod.ColorErrorMapToken because var conflicts: colorError. Inlined colorErrorBg, colorErrorBgHover, colorErrorBorder, colorErrorBorderHover, colorErrorHover, colorErrorActive, colorErrorTextHover, colorErrorText, colorErrorTextActive
  - `web.typings`.antd.esThemeInterfaceMapsColorsMod.ColorWarningMapToken because var conflicts: colorWarning. Inlined colorWarningBg, colorWarningBgHover, colorWarningBorder, colorWarningBorderHover, colorWarningHover, colorWarningActive, colorWarningTextHover, colorWarningText, colorWarningTextActive
  - `web.typings`.antd.esThemeInterfaceMapsColorsMod.ColorSuccessMapToken because var conflicts: colorSuccess. Inlined colorSuccessBg, colorSuccessBgHover, colorSuccessBorder, colorSuccessBorderHover, colorSuccessHover, colorSuccessActive, colorSuccessTextHover, colorSuccessText, colorSuccessTextActive
  - `web.typings`.antd.esThemeInterfaceMapsColorsMod.ColorPrimaryMapToken because var conflicts: colorPrimary. Inlined colorPrimaryBg, colorPrimaryBgHover, colorPrimaryBorder, colorPrimaryBorderHover, colorPrimaryHover, colorPrimaryActive, colorPrimaryTextHover, colorPrimaryText, colorPrimaryTextActive
  - `web.typings`.antd.esThemeInterfaceMapsFontMod.FontMapToken because var conflicts: fontSize. Inlined fontSizeSM, fontSizeLG, fontSizeXL, fontSizeHeading1, fontSizeHeading2, fontSizeHeading3, fontSizeHeading4, fontSizeHeading5, lineHeight, lineHeightLG, lineHeightSM, lineHeightHeading1, lineHeightHeading2, lineHeightHeading3, lineHeightHeading4, lineHeightHeading5
  - `web.typings`.antd.esThemeInterfaceMapsColorsMod.ColorMapToken because var conflicts: colorError, colorInfo, colorLink, colorPrimary, colorSuccess, colorWarning. Inlined colorWhite, colorBgMask */ @js.native
  trait MapToken
    extends StObject
       with SeedToken
       with SizeMapToken
       with HeightMapToken
       with CommonMapToken
       with ColorNeutralMapToken {
    
    /**
      * @nameZH 浮层的背景蒙层颜色
      * @nameEN Background color of the mask
      * @desc 浮层的背景蒙层颜色，用于遮罩浮层下面的内容，Modal、Drawer 等组件的蒙层使用的是该 token
      * @descEN The background color of the mask, used to cover the content below the mask, Modal, Drawer and other components use this token
      */
    var colorBgMask: String = js.native
    
    /**
      * @nameZH 错误色的深色激活态
      * @nameEN Error active color
      * @desc 错误色的深色激活态
      * @descEN The active state of the error color.
      */
    var colorErrorActive: String = js.native
    
    /**
      * @nameZH 错误色的浅色背景颜色
      * @nameEN Error background color
      * @desc 错误色的浅色背景颜色
      * @descEN The background color of the error state.
      */
    var colorErrorBg: String = js.native
    
    /**
      * @nameZH 错误色的浅色背景色悬浮态
      * @nameEN Error background color hover state
      * @desc 错误色的浅色背景色悬浮态
      * @descEN The hover state background color of the error state.
      */
    var colorErrorBgHover: String = js.native
    
    /**
      * @nameZH 错误色的描边色
      * @nameEN Error border color
      * @desc 错误色的描边色
      * @descEN The border color of the error state.
      */
    var colorErrorBorder: String = js.native
    
    /**
      * @nameZH 错误色的描边色悬浮态
      * @nameEN Error border color hover state
      * @desc 错误色的描边色悬浮态
      * @descEN The hover state border color of the error state.
      */
    var colorErrorBorderHover: String = js.native
    
    /**
      * @nameZH 错误色的深色悬浮态
      * @nameEN Error hover color
      * @desc 错误色的深色悬浮态
      * @descEN The hover state of the error color.
      */
    var colorErrorHover: String = js.native
    
    /**
      * @nameZH 错误色的文本默认态
      * @nameEN Error text default state
      * @desc 错误色的文本默认态
      * @descEN The default state of the text in the error color.
      */
    var colorErrorText: String = js.native
    
    /**
      * @nameZH 错误色的文本激活态
      * @nameEN Error text active state
      * @desc 错误色的文本激活态
      * @descEN The active state of the text in the error color.
      */
    var colorErrorTextActive: String = js.native
    
    /**
      * @nameZH 错误色的文本悬浮态
      * @nameEN Error text hover state
      * @desc 错误色的文本悬浮态
      * @descEN The hover state of the text in the error color.
      */
    var colorErrorTextHover: String = js.native
    
    /**
      * @nameZH 信息色的深色激活态
      * @nameEN Active state of dark color of information color
      * @desc 信息色的深色激活态。
      * @descEN Active state of dark color of information color.
      */
    var colorInfoActive: String = js.native
    
    /**
      * @nameZH 信息色的浅色背景颜色
      * @nameEN Light background color of information color
      * @desc 信息色的浅色背景颜色。
      * @descEN Light background color of information color.
      */
    var colorInfoBg: String = js.native
    
    /**
      * @nameZH 信息色的浅色背景色悬浮态
      * @nameEN Hover state of light background color of information color
      * @desc 信息色的浅色背景色悬浮态。
      * @descEN Hover state of light background color of information color.
      */
    var colorInfoBgHover: String = js.native
    
    /**
      * @nameZH 信息色的描边色
      * @nameEN Border color of information color
      * @desc 信息色的描边色。
      * @descEN Border color of information color.
      */
    var colorInfoBorder: String = js.native
    
    /**
      * @nameZH 信息色的描边色悬浮态
      * @nameEN Hover state of border color of information color
      * @desc 信息色的描边色悬浮态。
      * @descEN Hover state of border color of information color.
      */
    var colorInfoBorderHover: String = js.native
    
    /**
      * @nameZH 信息色的深色悬浮态
      * @nameEN Hover state of dark color of information color
      * @desc 信息色的深色悬浮态。
      * @descEN Hover state of dark color of information color.
      */
    var colorInfoHover: String = js.native
    
    /**
      * @nameZH 信息色的文本默认态
      * @nameEN Default state of text color of information color
      * @desc 信息色的文本默认态。
      * @descEN Default state of text color of information color.
      */
    var colorInfoText: String = js.native
    
    /**
      * @nameZH 信息色的文本激活态
      * @nameEN Active state of text color of information color
      * @desc 信息色的文本激活态。
      * @descEN Active state of text color of information color.
      */
    var colorInfoTextActive: String = js.native
    
    /**
      * @nameZH 信息色的文本悬浮态
      * @nameEN Hover state of text color of information color
      * @desc 信息色的文本悬浮态。
      * @descEN Hover state of text color of information color.
      */
    var colorInfoTextHover: String = js.native
    
    /**
      * @nameZH 超链接激活颜色
      * @nameEN Hyperlink active color
      * @desc 控制超链接被点击时的颜色。
      * @descEN Control the color of hyperlink when clicked.
      */
    var colorLinkActive: String = js.native
    
    /**
      * @nameZH 超链接悬浮颜色
      * @nameEN Hyperlink hover color
      * @desc 控制超链接悬浮时的颜色。
      * @descEN Control the color of hyperlink when hovering.
      */
    var colorLinkHover: String = js.native
    
    /**
      * @nameZH 主色激活态
      * @nameEN Active state of primary color
      * @desc 主色梯度下的深色激活态。
      * @descEN Dark active state under the main color gradient.
      */
    var colorPrimaryActive: String = js.native
    
    /**
      * @nameZH 主色浅色背景色
      * @nameEN Light background color of primary color
      * @desc 主色浅色背景颜色，一般用于视觉层级较弱的选中状态。
      * @descEN Light background color of primary color, usually used for weak visual level selection state.
      */
    var colorPrimaryBg: String = js.native
    
    /**
      * @nameZH 主色浅色背景悬浮态
      * @nameEN Hover state of light background color of primary color
      * @desc 与主色浅色背景颜色相对应的悬浮态颜色。
      * @descEN The hover state color corresponding to the light background color of the primary color.
      */
    var colorPrimaryBgHover: String = js.native
    
    /**
      * @nameZH 主色描边色
      * @nameEN Border color of primary color
      * @desc 主色梯度下的描边用色，用在 Slider 等组件的描边上。
      * @descEN The stroke color under the main color gradient, used on the stroke of components such as Slider.
      */
    var colorPrimaryBorder: String = js.native
    
    /**
      * @nameZH 主色描边色悬浮态
      * @nameEN Hover state of border color of primary color
      * @desc 主色梯度下的描边用色的悬浮态，Slider 、Button 等组件的描边 Hover 时会使用。
      * @descEN The hover state of the stroke color under the main color gradient, which will be used when the stroke Hover of components such as Slider and Button.
      */
    var colorPrimaryBorderHover: String = js.native
    
    /**
      * @nameZH 主色悬浮态
      * @nameEN Hover state of primary color
      * @desc 主色梯度下的悬浮态。
      * @descEN Hover state under the main color gradient.
      */
    var colorPrimaryHover: String = js.native
    
    /**
      * @nameZH 主色文本
      * @nameEN Text color of primary color
      * @desc 主色梯度下的文本颜色。
      * @descEN Text color under the main color gradient.
      */
    var colorPrimaryText: String = js.native
    
    /**
      * @nameZH 主色文本激活态
      * @nameEN Active state of text color of primary color
      * @desc 主色梯度下的文本激活态。
      * @descEN Active state of text color under the main color gradient.
      */
    var colorPrimaryTextActive: String = js.native
    
    /**
      * @nameZH 主色文本悬浮态
      * @nameEN Hover state of text color of primary color
      * @desc 主色梯度下的文本悬浮态。
      * @descEN Hover state of text color under the main color gradient.
      */
    var colorPrimaryTextHover: String = js.native
    
    /**
      * @nameZH 成功色的深色激活态
      * @nameEN Active State Color of Dark Success
      * @desc 成功色的深色激活态
      * @descEN Active state color of dark success color
      */
    var colorSuccessActive: String = js.native
    
    /**
      * @nameZH 成功色的浅色背景颜色
      * @nameEN Light Background Color of Success Color
      * @desc 成功色的浅色背景颜色，用于 Tag 和 Alert 的成功态背景色
      * @descEN Light background color of success color, used for Tag and Alert success state background color
      */
    var colorSuccessBg: String = js.native
    
    /**
      * @nameZH 成功色的浅色背景色悬浮态
      * @nameEN Hover State Color of Light Success Background
      * @desc 成功色浅色背景颜色，一般用于视觉层级较弱的选中状态，不过 antd 目前没有使用到该 token
      * @descEN Light background color of success color, but antd does not use this token currently
      */
    var colorSuccessBgHover: String = js.native
    
    /**
      * @nameZH 成功色的描边色
      * @nameEN Border Color of Success Color
      * @desc 成功色的描边色，用于 Tag 和 Alert 的成功态描边色
      * @descEN Border color of success color, used for Tag and Alert success state border color
      */
    var colorSuccessBorder: String = js.native
    
    /**
      * @nameZH 成功色的描边色悬浮态
      * @nameEN Hover State Color of Success Border
      * @desc 成功色的描边色悬浮态
      * @descEN Hover state color of success color border
      */
    var colorSuccessBorderHover: String = js.native
    
    /**
      * @nameZH 成功色的深色悬浮态
      * @nameEN Hover State Color of Dark Success
      * @desc 成功色的深色悬浮态
      * @descEN Hover state color of dark success color
      */
    var colorSuccessHover: String = js.native
    
    /**
      * @nameZH 成功色的文本默认态
      * @nameEN Default State Color of Success Text
      * @desc 成功色的文本默认态
      * @descEN Default state color of success color text
      */
    var colorSuccessText: String = js.native
    
    /**
      * @nameZH 成功色的文本激活态
      * @nameEN Active State Color of Success Text
      * @desc 成功色的文本激活态
      * @descEN Active state color of success color text
      */
    var colorSuccessTextActive: String = js.native
    
    /**
      * @nameZH 成功色的文本悬浮态
      * @nameEN Hover State Color of Success Text
      * @desc 成功色的文本悬浮态
      * @descEN Hover state color of success color text
      */
    var colorSuccessTextHover: String = js.native
    
    /**
      * @nameZH 警戒色的深色激活态
      * @nameEN Warning active color
      * @desc 警戒色的深色激活态
      * @descEN The active state of the warning color.
      */
    var colorWarningActive: String = js.native
    
    /**
      * @nameZH 警戒色的浅色背景颜色
      * @nameEN Warning background color
      * @desc 警戒色的浅色背景颜色
      * @descEN The background color of the warning state.
      */
    var colorWarningBg: String = js.native
    
    /**
      * @nameZH 警戒色的浅色背景色悬浮态
      * @nameEN Warning background color hover state
      * @desc 警戒色的浅色背景色悬浮态
      * @descEN The hover state background color of the warning state.
      */
    var colorWarningBgHover: String = js.native
    
    /**
      * @nameZH 警戒色的描边色
      * @nameEN Warning border color
      * @desc 警戒色的描边色
      * @descEN The border color of the warning state.
      */
    var colorWarningBorder: String = js.native
    
    /**
      * @nameZH 警戒色的描边色悬浮态
      * @nameEN Warning border color hover state
      * @desc 警戒色的描边色悬浮态
      * @descEN The hover state border color of the warning state.
      */
    var colorWarningBorderHover: String = js.native
    
    /**
      * @nameZH 警戒色的深色悬浮态
      * @nameEN Warning hover color
      * @desc 警戒色的深色悬浮态
      * @descEN The hover state of the warning color.
      */
    var colorWarningHover: String = js.native
    
    /**
      * @nameZH 警戒色的文本默认态
      * @nameEN Warning text default state
      * @desc 警戒色的文本默认态
      * @descEN The default state of the text in the warning color.
      */
    var colorWarningText: String = js.native
    
    /**
      * @nameZH 警戒色的文本激活态
      * @nameEN Warning text active state
      * @desc 警戒色的文本激活态
      * @descEN The active state of the text in the warning color.
      */
    var colorWarningTextActive: String = js.native
    
    /**
      * @nameZH 警戒色的文本悬浮态
      * @nameEN Warning text hover state
      * @desc 警戒色的文本悬浮态
      * @descEN The hover state of the text in the warning color.
      */
    var colorWarningTextHover: String = js.native
    
    /**
      * @nameZH 纯白色
      * @desc 不随主题变化的纯白色
      * @descEN Pure white color don't changed by theme
      * @default #FFFFFF
      */
    var colorWhite: String = js.native
    
    /**
      * @nameZH 一级标题字号
      * @nameEN Font size of heading level 1
      * @desc H1 标签所使用的字号
      * @descEN Font size of h1 tag.
      * @default 38
      */
    var fontSizeHeading1: Double = js.native
    
    /**
      * @nameZH 二级标题字号
      * @nameEN Font size of heading level 2
      * @desc h2 标签所使用的字号
      * @descEN Font size of h2 tag.
      * @default 30
      */
    var fontSizeHeading2: Double = js.native
    
    /**
      * @nameZH 三级标题字号
      * @nameEN Font size of heading level 3
      * @desc h3 标签使用的字号
      * @descEN Font size of h3 tag.
      * @default 24
      */
    var fontSizeHeading3: Double = js.native
    
    /**
      * @nameZH 四级标题字号
      * @nameEN Font size of heading level 4
      * @desc h4 标签使用的字号
      * @descEN Font size of h4 tag.
      * @default 20
      */
    var fontSizeHeading4: Double = js.native
    
    /**
      * @nameZH 五级标题字号
      * @nameEN Font size of heading level 5
      * @desc h5 标签使用的字号
      * @descEN Font size of h5 tag.
      * @default 16
      */
    var fontSizeHeading5: Double = js.native
    
    /**
      * @desc 大号字体大小
      * @descEN Large font size
      */
    var fontSizeLG: Double = js.native
    
    /**
      * @desc 小号字体大小
      * @descEN Small font size
      */
    var fontSizeSM: Double = js.native
    
    /**
      * @desc 超大号字体大小
      * @descEN Super large font size
      */
    var fontSizeXL: Double = js.native
    
    /**
      * @desc 文本行高
      * @descEN Line height of text.
      */
    var lineHeight: Double = js.native
    
    /**
      * @nameZH 一级标题行高
      * @nameEN Line height of heading level 1
      * @desc H1 标签所使用的行高
      * @descEN Line height of h1 tag.
      * @default 1.4
      */
    var lineHeightHeading1: Double = js.native
    
    /**
      * @nameZH 二级标题行高
      * @nameEN Line height of heading level 2
      * @desc h2 标签所使用的行高
      * @descEN Line height of h2 tag.
      * @default 1.35
      */
    var lineHeightHeading2: Double = js.native
    
    /**
      * @nameZH 三级标题行高
      * @nameEN Line height of heading level 3
      * @desc h3 标签所使用的行高
      * @descEN Line height of h3 tag.
      * @default 1.3
      */
    var lineHeightHeading3: Double = js.native
    
    /**
      * @nameZH 四级标题行高
      * @nameEN Line height of heading level 4
      * @desc h4 标签所使用的行高
      * @descEN Line height of h4 tag.
      * @default 1.25
      */
    var lineHeightHeading4: Double = js.native
    
    /**
      * @nameZH 五级标题行高
      * @nameEN Line height of heading level 5
      * @desc h5 标签所使用的行高
      * @descEN Line height of h5 tag.
      * @default 1.2
      */
    var lineHeightHeading5: Double = js.native
    
    /**
      * @desc 大型文本行高
      * @descEN Line height of large text.
      */
    var lineHeightLG: Double = js.native
    
    /**
      * @desc 小型文本行高
      * @descEN Line height of small text.
      */
    var lineHeightSM: Double = js.native
  }
  object MapToken {
    
    @scala.inline
    def apply(
      borderRadius: Double,
      borderRadiusLG: Double,
      borderRadiusOuter: Double,
      borderRadiusSM: Double,
      borderRadiusXS: Double,
      colorBgBase: String,
      colorBgBlur: String,
      colorBgContainer: String,
      colorBgElevated: String,
      colorBgLayout: String,
      colorBgMask: String,
      colorBgSpotlight: String,
      colorBorder: String,
      colorBorderSecondary: String,
      colorError: String,
      colorErrorActive: String,
      colorErrorBg: String,
      colorErrorBgHover: String,
      colorErrorBorder: String,
      colorErrorBorderHover: String,
      colorErrorHover: String,
      colorErrorText: String,
      colorErrorTextActive: String,
      colorErrorTextHover: String,
      colorFill: String,
      colorFillQuaternary: String,
      colorFillSecondary: String,
      colorFillTertiary: String,
      colorInfo: String,
      colorInfoActive: String,
      colorInfoBg: String,
      colorInfoBgHover: String,
      colorInfoBorder: String,
      colorInfoBorderHover: String,
      colorInfoHover: String,
      colorInfoText: String,
      colorInfoTextActive: String,
      colorInfoTextHover: String,
      colorLink: String,
      colorLinkActive: String,
      colorLinkHover: String,
      colorPrimary: String,
      colorPrimaryActive: String,
      colorPrimaryBg: String,
      colorPrimaryBgHover: String,
      colorPrimaryBorder: String,
      colorPrimaryBorderHover: String,
      colorPrimaryHover: String,
      colorPrimaryText: String,
      colorPrimaryTextActive: String,
      colorPrimaryTextHover: String,
      colorSuccess: String,
      colorSuccessActive: String,
      colorSuccessBg: String,
      colorSuccessBgHover: String,
      colorSuccessBorder: String,
      colorSuccessBorderHover: String,
      colorSuccessHover: String,
      colorSuccessText: String,
      colorSuccessTextActive: String,
      colorSuccessTextHover: String,
      colorText: String,
      colorTextBase: String,
      colorTextQuaternary: String,
      colorTextSecondary: String,
      colorTextTertiary: String,
      colorWarning: String,
      colorWarningActive: String,
      colorWarningBg: String,
      colorWarningBgHover: String,
      colorWarningBorder: String,
      colorWarningBorderHover: String,
      colorWarningHover: String,
      colorWarningText: String,
      colorWarningTextActive: String,
      colorWarningTextHover: String,
      colorWhite: String,
      controlHeight: Double,
      controlHeightLG: Double,
      controlHeightSM: Double,
      controlHeightXS: Double,
      fontFamily: String,
      fontFamilyCode: String,
      fontSize: Double,
      fontSizeHeading1: Double,
      fontSizeHeading2: Double,
      fontSizeHeading3: Double,
      fontSizeHeading4: Double,
      fontSizeHeading5: Double,
      fontSizeLG: Double,
      fontSizeSM: Double,
      fontSizeXL: Double,
      lineHeight: Double,
      lineHeightHeading1: Double,
      lineHeightHeading2: Double,
      lineHeightHeading3: Double,
      lineHeightHeading4: Double,
      lineHeightHeading5: Double,
      lineHeightLG: Double,
      lineHeightSM: Double,
      lineType: String,
      lineWidth: Double,
      lineWidthBold: Double,
      motion: Boolean,
      motionBase: Double,
      motionDurationFast: String,
      motionDurationMid: String,
      motionDurationSlow: String,
      motionEaseInBack: String,
      motionEaseInOut: String,
      motionEaseInOutCirc: String,
      motionEaseInQuint: String,
      motionEaseOut: String,
      motionEaseOutBack: String,
      motionEaseOutCirc: String,
      motionEaseOutQuint: String,
      motionUnit: Double,
      opacityImage: Double,
      size: Double,
      sizeLG: Double,
      sizeMD: Double,
      sizeMS: Double,
      sizePopupArrow: Double,
      sizeSM: Double,
      sizeStep: Double,
      sizeUnit: Double,
      sizeXL: Double,
      sizeXS: Double,
      sizeXXL: Double,
      sizeXXS: Double,
      wireframe: Boolean,
      zIndexBase: Double,
      zIndexPopupBase: Double
    ): MapToken = {
      val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], borderRadiusLG = borderRadiusLG.asInstanceOf[js.Any], borderRadiusOuter = borderRadiusOuter.asInstanceOf[js.Any], borderRadiusSM = borderRadiusSM.asInstanceOf[js.Any], borderRadiusXS = borderRadiusXS.asInstanceOf[js.Any], colorBgBase = colorBgBase.asInstanceOf[js.Any], colorBgBlur = colorBgBlur.asInstanceOf[js.Any], colorBgContainer = colorBgContainer.asInstanceOf[js.Any], colorBgElevated = colorBgElevated.asInstanceOf[js.Any], colorBgLayout = colorBgLayout.asInstanceOf[js.Any], colorBgMask = colorBgMask.asInstanceOf[js.Any], colorBgSpotlight = colorBgSpotlight.asInstanceOf[js.Any], colorBorder = colorBorder.asInstanceOf[js.Any], colorBorderSecondary = colorBorderSecondary.asInstanceOf[js.Any], colorError = colorError.asInstanceOf[js.Any], colorErrorActive = colorErrorActive.asInstanceOf[js.Any], colorErrorBg = colorErrorBg.asInstanceOf[js.Any], colorErrorBgHover = colorErrorBgHover.asInstanceOf[js.Any], colorErrorBorder = colorErrorBorder.asInstanceOf[js.Any], colorErrorBorderHover = colorErrorBorderHover.asInstanceOf[js.Any], colorErrorHover = colorErrorHover.asInstanceOf[js.Any], colorErrorText = colorErrorText.asInstanceOf[js.Any], colorErrorTextActive = colorErrorTextActive.asInstanceOf[js.Any], colorErrorTextHover = colorErrorTextHover.asInstanceOf[js.Any], colorFill = colorFill.asInstanceOf[js.Any], colorFillQuaternary = colorFillQuaternary.asInstanceOf[js.Any], colorFillSecondary = colorFillSecondary.asInstanceOf[js.Any], colorFillTertiary = colorFillTertiary.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorInfoActive = colorInfoActive.asInstanceOf[js.Any], colorInfoBg = colorInfoBg.asInstanceOf[js.Any], colorInfoBgHover = colorInfoBgHover.asInstanceOf[js.Any], colorInfoBorder = colorInfoBorder.asInstanceOf[js.Any], colorInfoBorderHover = colorInfoBorderHover.asInstanceOf[js.Any], colorInfoHover = colorInfoHover.asInstanceOf[js.Any], colorInfoText = colorInfoText.asInstanceOf[js.Any], colorInfoTextActive = colorInfoTextActive.asInstanceOf[js.Any], colorInfoTextHover = colorInfoTextHover.asInstanceOf[js.Any], colorLink = colorLink.asInstanceOf[js.Any], colorLinkActive = colorLinkActive.asInstanceOf[js.Any], colorLinkHover = colorLinkHover.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorPrimaryActive = colorPrimaryActive.asInstanceOf[js.Any], colorPrimaryBg = colorPrimaryBg.asInstanceOf[js.Any], colorPrimaryBgHover = colorPrimaryBgHover.asInstanceOf[js.Any], colorPrimaryBorder = colorPrimaryBorder.asInstanceOf[js.Any], colorPrimaryBorderHover = colorPrimaryBorderHover.asInstanceOf[js.Any], colorPrimaryHover = colorPrimaryHover.asInstanceOf[js.Any], colorPrimaryText = colorPrimaryText.asInstanceOf[js.Any], colorPrimaryTextActive = colorPrimaryTextActive.asInstanceOf[js.Any], colorPrimaryTextHover = colorPrimaryTextHover.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorSuccessActive = colorSuccessActive.asInstanceOf[js.Any], colorSuccessBg = colorSuccessBg.asInstanceOf[js.Any], colorSuccessBgHover = colorSuccessBgHover.asInstanceOf[js.Any], colorSuccessBorder = colorSuccessBorder.asInstanceOf[js.Any], colorSuccessBorderHover = colorSuccessBorderHover.asInstanceOf[js.Any], colorSuccessHover = colorSuccessHover.asInstanceOf[js.Any], colorSuccessText = colorSuccessText.asInstanceOf[js.Any], colorSuccessTextActive = colorSuccessTextActive.asInstanceOf[js.Any], colorSuccessTextHover = colorSuccessTextHover.asInstanceOf[js.Any], colorText = colorText.asInstanceOf[js.Any], colorTextBase = colorTextBase.asInstanceOf[js.Any], colorTextQuaternary = colorTextQuaternary.asInstanceOf[js.Any], colorTextSecondary = colorTextSecondary.asInstanceOf[js.Any], colorTextTertiary = colorTextTertiary.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], colorWarningActive = colorWarningActive.asInstanceOf[js.Any], colorWarningBg = colorWarningBg.asInstanceOf[js.Any], colorWarningBgHover = colorWarningBgHover.asInstanceOf[js.Any], colorWarningBorder = colorWarningBorder.asInstanceOf[js.Any], colorWarningBorderHover = colorWarningBorderHover.asInstanceOf[js.Any], colorWarningHover = colorWarningHover.asInstanceOf[js.Any], colorWarningText = colorWarningText.asInstanceOf[js.Any], colorWarningTextActive = colorWarningTextActive.asInstanceOf[js.Any], colorWarningTextHover = colorWarningTextHover.asInstanceOf[js.Any], colorWhite = colorWhite.asInstanceOf[js.Any], controlHeight = controlHeight.asInstanceOf[js.Any], controlHeightLG = controlHeightLG.asInstanceOf[js.Any], controlHeightSM = controlHeightSM.asInstanceOf[js.Any], controlHeightXS = controlHeightXS.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontFamilyCode = fontFamilyCode.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontSizeHeading1 = fontSizeHeading1.asInstanceOf[js.Any], fontSizeHeading2 = fontSizeHeading2.asInstanceOf[js.Any], fontSizeHeading3 = fontSizeHeading3.asInstanceOf[js.Any], fontSizeHeading4 = fontSizeHeading4.asInstanceOf[js.Any], fontSizeHeading5 = fontSizeHeading5.asInstanceOf[js.Any], fontSizeLG = fontSizeLG.asInstanceOf[js.Any], fontSizeSM = fontSizeSM.asInstanceOf[js.Any], fontSizeXL = fontSizeXL.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineHeightHeading1 = lineHeightHeading1.asInstanceOf[js.Any], lineHeightHeading2 = lineHeightHeading2.asInstanceOf[js.Any], lineHeightHeading3 = lineHeightHeading3.asInstanceOf[js.Any], lineHeightHeading4 = lineHeightHeading4.asInstanceOf[js.Any], lineHeightHeading5 = lineHeightHeading5.asInstanceOf[js.Any], lineHeightLG = lineHeightLG.asInstanceOf[js.Any], lineHeightSM = lineHeightSM.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], lineWidthBold = lineWidthBold.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], motionBase = motionBase.asInstanceOf[js.Any], motionDurationFast = motionDurationFast.asInstanceOf[js.Any], motionDurationMid = motionDurationMid.asInstanceOf[js.Any], motionDurationSlow = motionDurationSlow.asInstanceOf[js.Any], motionEaseInBack = motionEaseInBack.asInstanceOf[js.Any], motionEaseInOut = motionEaseInOut.asInstanceOf[js.Any], motionEaseInOutCirc = motionEaseInOutCirc.asInstanceOf[js.Any], motionEaseInQuint = motionEaseInQuint.asInstanceOf[js.Any], motionEaseOut = motionEaseOut.asInstanceOf[js.Any], motionEaseOutBack = motionEaseOutBack.asInstanceOf[js.Any], motionEaseOutCirc = motionEaseOutCirc.asInstanceOf[js.Any], motionEaseOutQuint = motionEaseOutQuint.asInstanceOf[js.Any], motionUnit = motionUnit.asInstanceOf[js.Any], opacityImage = opacityImage.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizeLG = sizeLG.asInstanceOf[js.Any], sizeMD = sizeMD.asInstanceOf[js.Any], sizeMS = sizeMS.asInstanceOf[js.Any], sizePopupArrow = sizePopupArrow.asInstanceOf[js.Any], sizeSM = sizeSM.asInstanceOf[js.Any], sizeStep = sizeStep.asInstanceOf[js.Any], sizeUnit = sizeUnit.asInstanceOf[js.Any], sizeXL = sizeXL.asInstanceOf[js.Any], sizeXS = sizeXS.asInstanceOf[js.Any], sizeXXL = sizeXXL.asInstanceOf[js.Any], sizeXXS = sizeXXS.asInstanceOf[js.Any], wireframe = wireframe.asInstanceOf[js.Any], zIndexBase = zIndexBase.asInstanceOf[js.Any], zIndexPopupBase = zIndexPopupBase.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MapToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorBgMask(value: String): Self = StObject.set(x, "colorBgMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorErrorActive(value: String): Self = StObject.set(x, "colorErrorActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorErrorBg(value: String): Self = StObject.set(x, "colorErrorBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorErrorBgHover(value: String): Self = StObject.set(x, "colorErrorBgHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorErrorBorder(value: String): Self = StObject.set(x, "colorErrorBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorErrorBorderHover(value: String): Self = StObject.set(x, "colorErrorBorderHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorErrorHover(value: String): Self = StObject.set(x, "colorErrorHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorErrorText(value: String): Self = StObject.set(x, "colorErrorText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorErrorTextActive(value: String): Self = StObject.set(x, "colorErrorTextActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorErrorTextHover(value: String): Self = StObject.set(x, "colorErrorTextHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInfoActive(value: String): Self = StObject.set(x, "colorInfoActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInfoBg(value: String): Self = StObject.set(x, "colorInfoBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInfoBgHover(value: String): Self = StObject.set(x, "colorInfoBgHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInfoBorder(value: String): Self = StObject.set(x, "colorInfoBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInfoBorderHover(value: String): Self = StObject.set(x, "colorInfoBorderHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInfoHover(value: String): Self = StObject.set(x, "colorInfoHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInfoText(value: String): Self = StObject.set(x, "colorInfoText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInfoTextActive(value: String): Self = StObject.set(x, "colorInfoTextActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInfoTextHover(value: String): Self = StObject.set(x, "colorInfoTextHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorLinkActive(value: String): Self = StObject.set(x, "colorLinkActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorLinkHover(value: String): Self = StObject.set(x, "colorLinkHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimaryActive(value: String): Self = StObject.set(x, "colorPrimaryActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimaryBg(value: String): Self = StObject.set(x, "colorPrimaryBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimaryBgHover(value: String): Self = StObject.set(x, "colorPrimaryBgHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimaryBorder(value: String): Self = StObject.set(x, "colorPrimaryBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimaryBorderHover(value: String): Self = StObject.set(x, "colorPrimaryBorderHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimaryHover(value: String): Self = StObject.set(x, "colorPrimaryHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimaryText(value: String): Self = StObject.set(x, "colorPrimaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimaryTextActive(value: String): Self = StObject.set(x, "colorPrimaryTextActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimaryTextHover(value: String): Self = StObject.set(x, "colorPrimaryTextHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSuccessActive(value: String): Self = StObject.set(x, "colorSuccessActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSuccessBg(value: String): Self = StObject.set(x, "colorSuccessBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSuccessBgHover(value: String): Self = StObject.set(x, "colorSuccessBgHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSuccessBorder(value: String): Self = StObject.set(x, "colorSuccessBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSuccessBorderHover(value: String): Self = StObject.set(x, "colorSuccessBorderHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSuccessHover(value: String): Self = StObject.set(x, "colorSuccessHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSuccessText(value: String): Self = StObject.set(x, "colorSuccessText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSuccessTextActive(value: String): Self = StObject.set(x, "colorSuccessTextActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSuccessTextHover(value: String): Self = StObject.set(x, "colorSuccessTextHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWarningActive(value: String): Self = StObject.set(x, "colorWarningActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWarningBg(value: String): Self = StObject.set(x, "colorWarningBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWarningBgHover(value: String): Self = StObject.set(x, "colorWarningBgHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWarningBorder(value: String): Self = StObject.set(x, "colorWarningBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWarningBorderHover(value: String): Self = StObject.set(x, "colorWarningBorderHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWarningHover(value: String): Self = StObject.set(x, "colorWarningHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWarningText(value: String): Self = StObject.set(x, "colorWarningText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWarningTextActive(value: String): Self = StObject.set(x, "colorWarningTextActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWarningTextHover(value: String): Self = StObject.set(x, "colorWarningTextHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWhite(value: String): Self = StObject.set(x, "colorWhite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeHeading1(value: Double): Self = StObject.set(x, "fontSizeHeading1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeHeading2(value: Double): Self = StObject.set(x, "fontSizeHeading2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeHeading3(value: Double): Self = StObject.set(x, "fontSizeHeading3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeHeading4(value: Double): Self = StObject.set(x, "fontSizeHeading4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeHeading5(value: Double): Self = StObject.set(x, "fontSizeHeading5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeLG(value: Double): Self = StObject.set(x, "fontSizeLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeSM(value: Double): Self = StObject.set(x, "fontSizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeXL(value: Double): Self = StObject.set(x, "fontSizeXL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightHeading1(value: Double): Self = StObject.set(x, "lineHeightHeading1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightHeading2(value: Double): Self = StObject.set(x, "lineHeightHeading2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightHeading3(value: Double): Self = StObject.set(x, "lineHeightHeading3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightHeading4(value: Double): Self = StObject.set(x, "lineHeightHeading4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightHeading5(value: Double): Self = StObject.set(x, "lineHeightHeading5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightLG(value: Double): Self = StObject.set(x, "lineHeightLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightSM(value: Double): Self = StObject.set(x, "lineHeightSM", value.asInstanceOf[js.Any])
    }
  }
}
