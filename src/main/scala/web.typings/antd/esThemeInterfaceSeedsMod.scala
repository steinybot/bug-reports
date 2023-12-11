package web.typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeInterfaceSeedsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in antd.antd/es/theme/interface/presetColors.PresetColorKey ]: string} */ @js.native
  trait SeedToken extends StObject {
    
    /**
      * @nameZH 基础圆角
      * @nameEN Base Border Radius
      * @descEN Border radius of base components
      * @desc 基础组件的圆角大小，例如按钮、输入框、卡片等
      */
    var borderRadius: Double = js.native
    
    /**
      * @nameZH 基础背景色
      * @nameEN Seed Background Color
      * @desc 用于派生背景色梯度的基础变量，v5 中我们添加了一层背景色的派生算法可以产出梯度明确的背景色的梯度变量。但请不要在代码中直接使用该 Seed Token ！
      * @descEN Used to derive the base variable of the background color gradient. In v5, we added a layer of background color derivation algorithm to produce map token of background color. But PLEASE DO NOT USE this Seed Token directly in the code!
      */
    var colorBgBase: String = js.native
    
    /**
      * @nameZH 错误色
      * @nameEN Error Color
      * @desc 用于表示操作失败的 Token 序列，如失败按钮、错误状态提示（Result）组件等。
      * @descEN Used to represent the visual elements of the operation failure, such as the error Button, error Result component, etc.
      */
    var colorError: String = js.native
    
    /**
      * @nameZH 信息色
      * @nameEN Info Color
      * @desc 用于表示操作信息的 Token 序列，如 Alert 、Tag、 Progress 等组件都有用到该组梯度变量。
      * @descEN Used to represent the operation information of the Token sequence, such as Alert, Tag, Progress, and other components use these map tokens.
      */
    var colorInfo: String = js.native
    
    /**
      * @nameZH 超链接颜色
      * @nameEN Hyperlink color
      * @desc 控制超链接的颜色。
      * @descEN Control the color of hyperlink.
      */
    var colorLink: String = js.native
    
    /**
      * @nameZH 品牌主色
      * @nameEN Brand Color
      * @desc 品牌色是体现产品特性和传播理念最直观的视觉元素之一。在你完成品牌主色的选取之后，我们会自动帮你生成一套完整的色板，并赋予它们有效的设计语义
      * @descEN Brand color is one of the most direct visual elements to reflect the characteristics and communication of the product. After you have selected the brand color, we will automatically generate a complete color palette and assign it effective design semantics.
      */
    var colorPrimary: String = js.native
    
    /**
      * @nameZH 成功色
      * @nameEN Success Color
      * @desc 用于表示操作成功的 Token 序列，如 Result、Progress 等组件会使用该组梯度变量。
      * @descEN Used to represent the token sequence of operation success, such as Result, Progress and other components will use these map tokens.
      */
    var colorSuccess: String = js.native
    
    /**
      * @nameZH 基础文本色
      * @nameEN Seed Text Color
      * @desc 用于派生文本色梯度的基础变量，v5 中我们添加了一层文本色的派生算法可以产出梯度明确的文本色的梯度变量。但请不要在代码中直接使用该 Seed Token ！
      * @descEN Used to derive the base variable of the text color gradient. In v5, we added a layer of text color derivation algorithm to produce gradient variables of text color gradient. But please do not use this Seed Token directly in the code!
      */
    var colorTextBase: String = js.native
    
    /**
      * @nameZH 警戒色
      * @nameEN Warning Color
      * @desc 用于表示操作警告的 Token 序列，如 Notification、 Alert等警告类组件或 Input 输入类等组件会使用该组梯度变量。
      * @descEN Used to represent the warning map token, such as Notification, Alert, etc. Alert or Control component(like Input) will use these map tokens.
      */
    var colorWarning: String = js.native
    
    /**
      * @nameZH 基础高度
      * @nameEN Base Control Height
      * @desc Ant Design 中按钮和输入框等基础控件的高度
      * @descEN The height of the basic controls such as buttons and input boxes in Ant Design
      * @default 32
      */
    var controlHeight: Double = js.native
    
    /**
      * @nameZH 字体
      * @nameEN Font family for default text
      * @desc Ant Design 的字体家族中优先使用系统默认的界面字体，同时提供了一套利于屏显的备用字体库，来维护在不同平台以及浏览器的显示下，字体始终保持良好的易读性和可读性，体现了友好、稳定和专业的特性。
      * @descEN The font family of Ant Design prioritizes the default interface font of the system, and provides a set of alternative font libraries that are suitable for screen display to maintain the readability and readability of the font under different platforms and browsers, reflecting the friendly, stable and professional characteristics.
      */
    var fontFamily: String = js.native
    
    /**
      * @nameZH 代码字体
      * @nameEN Font family for code text
      * @desc 代码字体，用于 Typography 内的 code、pre 和 kbd 类型的元素
      * @descEN Code font, used for code, pre and kbd elements in Typography
      */
    var fontFamilyCode: String = js.native
    
    /**
      * @nameZH 默认字号
      * @nameEN Default Font Size
      * @desc 设计系统中使用最广泛的字体大小，文本梯度也将基于该字号进行派生。
      * @descEN The most widely used font size in the design system, from which the text gradient will be derived.
      * @default 14
      */
    var fontSize: Double = js.native
    
    /**
      * @nameZH 线条样式
      * @nameEN Line Style
      * @desc 用于控制组件边框、分割线等的样式，默认是实线
      * @descEN Border style of base components
      */
    var lineType: String = js.native
    
    /**
      * @nameZH 基础线宽
      * @nameEN Base Line Width
      * @desc 用于控制组件边框、分割线等的宽度
      * @descEN Border width of base components
      */
    var lineWidth: Double = js.native
    
    /**
      * @nameZH 动画风格
      * @nameEN Motion Style
      * @desc 用于配置动画效果，为 `false` 时则关闭动画
      * @descEN Used to configure the motion effect, when it is `false`, the motion is turned off
      * @default false
      */
    var motion: Boolean = js.native
    
    /**
      * @nameZH 动画基础时长。
      * @nameEN Animation Base Duration.
      */
    var motionBase: Double = js.native
    
    /**
      * @desc 预设动效曲率
      * @descEN Preset motion curve.
      */
    var motionEaseInBack: String = js.native
    
    /**
      * @desc 预设动效曲率
      * @descEN Preset motion curve.
      */
    var motionEaseInOut: String = js.native
    
    /**
      * @desc 预设动效曲率
      * @descEN Preset motion curve.
      */
    var motionEaseInOutCirc: String = js.native
    
    /**
      * @desc 预设动效曲率
      * @descEN Preset motion curve.
      */
    var motionEaseInQuint: String = js.native
    
    /**
      * @desc 预设动效曲率
      * @descEN Preset motion curve.
      */
    var motionEaseOut: String = js.native
    
    /**
      * @desc 预设动效曲率
      * @descEN Preset motion curve.
      */
    var motionEaseOutBack: String = js.native
    
    /**
      * @desc 预设动效曲率
      * @descEN Preset motion curve.
      */
    var motionEaseOutCirc: String = js.native
    
    /**
      * @desc 预设动效曲率
      * @descEN Preset motion curve.
      */
    var motionEaseOutQuint: String = js.native
    
    /**
      * @nameZH 动画时长变化单位
      * @nameEN Animation Duration Unit
      * @desc 用于控制动画时长的变化单位
      * @descEN The unit of animation duration change
      * @default 100ms
      */
    var motionUnit: Double = js.native
    
    /**
      * @nameZH 图片不透明度
      * @nameEN Define default Image opacity. Useful when in dark-like theme
      */
    var opacityImage: Double = js.native
    
    /**
      * @nameZH 组件箭头尺寸
      * @desc 组件箭头的尺寸
      * @descEN The size of the component arrow
      */
    var sizePopupArrow: Double = js.native
    
    /**
      * @nameZH 尺寸步长
      * @nameEN Size Base Step
      * @desc 用于控制组件尺寸的基础步长，尺寸步长结合尺寸变化单位，就可以派生各种尺寸梯度。通过调整步长即可得到不同的布局模式，例如 V5 紧凑模式下的尺寸步长为 2
      * @descEN The base step of size change, the size step combined with the size change unit, can derive various size steps. By adjusting the step, you can get different layout modes, such as the size step of the compact mode of V5 is 2
      * @default 4
      */
    var sizeStep: Double = js.native
    
    /**
      * @nameZH 尺寸变化单位
      * @nameEN Size Change Unit
      * @desc 用于控制组件尺寸的变化单位，在 Ant Design 中我们的基础单位为 4 ，便于更加细致地控制尺寸梯度
      * @descEN The unit of size change, in Ant Design, our base unit is 4, which is more fine-grained control of the size step
      * @default 4
      */
    var sizeUnit: Double = js.native
    
    /**
      * @nameZH 线框风格
      * @nameEN Wireframe Style
      * @desc 用于将组件的视觉效果变为线框化，如果需要使用 V4 的效果，需要开启配置项
      * @descEN Used to change the visual effect of the component to wireframe, if you need to use the V4 effect, you need to enable the configuration item
      * @default false
      */
    var wireframe: Boolean = js.native
    
    /**
      * @nameZH 基础 zIndex
      * @nameEN Base zIndex
      * @desc 所有组件的基础 Z 轴值，用于一些悬浮类的组件的可以基于该值 Z 轴控制层级，例如 BackTop、 Affix 等
      * @descEN The base Z axis value of all components, which can be used to control the level of some floating components based on the Z axis value, such as BackTop, Affix, etc.
      *
      * @default 0
      */
    var zIndexBase: Double = js.native
    
    /**
      * @nameZH 浮层基础 zIndex
      * @nameEN popup base zIndex
      * @desc 浮层类组件的基础 Z 轴值，用于一些悬浮类的组件的可以基于该值 Z 轴控制层级，例如 FloatButton、 Affix、Modal 等
      * @descEN Base zIndex of component like FloatButton, Affix which can be cover by large popup
      * @default 1000
      */
    var zIndexPopupBase: Double = js.native
  }
  object SeedToken {
    
    @scala.inline
    def apply(
      borderRadius: Double,
      colorBgBase: String,
      colorError: String,
      colorInfo: String,
      colorLink: String,
      colorPrimary: String,
      colorSuccess: String,
      colorTextBase: String,
      colorWarning: String,
      controlHeight: Double,
      fontFamily: String,
      fontFamilyCode: String,
      fontSize: Double,
      lineType: String,
      lineWidth: Double,
      motion: Boolean,
      motionBase: Double,
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
      sizePopupArrow: Double,
      sizeStep: Double,
      sizeUnit: Double,
      wireframe: Boolean,
      zIndexBase: Double,
      zIndexPopupBase: Double
    ): SeedToken = {
      val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], colorBgBase = colorBgBase.asInstanceOf[js.Any], colorError = colorError.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorLink = colorLink.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorTextBase = colorTextBase.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], controlHeight = controlHeight.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontFamilyCode = fontFamilyCode.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], motionBase = motionBase.asInstanceOf[js.Any], motionEaseInBack = motionEaseInBack.asInstanceOf[js.Any], motionEaseInOut = motionEaseInOut.asInstanceOf[js.Any], motionEaseInOutCirc = motionEaseInOutCirc.asInstanceOf[js.Any], motionEaseInQuint = motionEaseInQuint.asInstanceOf[js.Any], motionEaseOut = motionEaseOut.asInstanceOf[js.Any], motionEaseOutBack = motionEaseOutBack.asInstanceOf[js.Any], motionEaseOutCirc = motionEaseOutCirc.asInstanceOf[js.Any], motionEaseOutQuint = motionEaseOutQuint.asInstanceOf[js.Any], motionUnit = motionUnit.asInstanceOf[js.Any], opacityImage = opacityImage.asInstanceOf[js.Any], sizePopupArrow = sizePopupArrow.asInstanceOf[js.Any], sizeStep = sizeStep.asInstanceOf[js.Any], sizeUnit = sizeUnit.asInstanceOf[js.Any], wireframe = wireframe.asInstanceOf[js.Any], zIndexBase = zIndexBase.asInstanceOf[js.Any], zIndexPopupBase = zIndexPopupBase.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeedToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SeedToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBgBase(value: String): Self = StObject.set(x, "colorBgBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorError(value: String): Self = StObject.set(x, "colorError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorLink(value: String): Self = StObject.set(x, "colorLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorTextBase(value: String): Self = StObject.set(x, "colorTextBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlHeight(value: Double): Self = StObject.set(x, "controlHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyCode(value: String): Self = StObject.set(x, "fontFamilyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineType(value: String): Self = StObject.set(x, "lineType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotion(value: Boolean): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionBase(value: Double): Self = StObject.set(x, "motionBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionEaseInBack(value: String): Self = StObject.set(x, "motionEaseInBack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionEaseInOut(value: String): Self = StObject.set(x, "motionEaseInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionEaseInOutCirc(value: String): Self = StObject.set(x, "motionEaseInOutCirc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionEaseInQuint(value: String): Self = StObject.set(x, "motionEaseInQuint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionEaseOut(value: String): Self = StObject.set(x, "motionEaseOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionEaseOutBack(value: String): Self = StObject.set(x, "motionEaseOutBack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionEaseOutCirc(value: String): Self = StObject.set(x, "motionEaseOutCirc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionEaseOutQuint(value: String): Self = StObject.set(x, "motionEaseOutQuint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionUnit(value: Double): Self = StObject.set(x, "motionUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityImage(value: Double): Self = StObject.set(x, "opacityImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizePopupArrow(value: Double): Self = StObject.set(x, "sizePopupArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeStep(value: Double): Self = StObject.set(x, "sizeStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUnit(value: Double): Self = StObject.set(x, "sizeUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexBase(value: Double): Self = StObject.set(x, "zIndexBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexPopupBase(value: Double): Self = StObject.set(x, "zIndexPopupBase", value.asInstanceOf[js.Any])
    }
  }
}
