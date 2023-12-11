package web.typings.antd

import web.typings.antd.antdStrings.blue
import web.typings.antd.antdStrings.cyan
import web.typings.antd.antdStrings.geekblue
import web.typings.antd.antdStrings.gold
import web.typings.antd.antdStrings.green
import web.typings.antd.antdStrings.lime
import web.typings.antd.antdStrings.magenta
import web.typings.antd.antdStrings.orange
import web.typings.antd.antdStrings.pink
import web.typings.antd.antdStrings.purple
import web.typings.antd.antdStrings.red
import web.typings.antd.antdStrings.volcano
import web.typings.antd.antdStrings.yellow
import web.typings.antd.esAffixStyleMod.ComponentToken
import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.antd.esThemeInterfaceComponentsMod.ComponentTokenMap
import web.typings.std.Partial
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeInterfaceMod {
  
  @JSImport("antd/es/theme/interface", "PresetColors")
  @js.native
  val PresetColors: js.Tuple13[blue, purple, cyan, green, magenta, pink, red, orange, yellow, volcano, geekblue, lime, gold] = js.native
  
  type GenerateStyle[ComponentToken /* <: js.Object */, ReturnType] = js.Function1[/* token */ ComponentToken, ReturnType]
  
  @js.native
  trait GlobalToken
    extends StObject
       with AliasToken
       with ComponentTokenMap
  object GlobalToken {
    
    @scala.inline
    def apply(
      borderRadius: Double,
      borderRadiusLG: Double,
      borderRadiusOuter: Double,
      borderRadiusSM: Double,
      borderRadiusXS: Double,
      boxShadow: String,
      boxShadowSecondary: String,
      boxShadowTertiary: String,
      colorBgBase: String,
      colorBgBlur: String,
      colorBgContainer: String,
      colorBgContainerDisabled: String,
      colorBgElevated: String,
      colorBgLayout: String,
      colorBgMask: String,
      colorBgSpotlight: String,
      colorBgTextActive: String,
      colorBgTextHover: String,
      colorBorder: String,
      colorBorderBg: String,
      colorBorderSecondary: String,
      colorError: String,
      colorErrorActive: String,
      colorErrorBg: String,
      colorErrorBgHover: String,
      colorErrorBorder: String,
      colorErrorBorderHover: String,
      colorErrorHover: String,
      colorErrorOutline: String,
      colorErrorText: String,
      colorErrorTextActive: String,
      colorErrorTextHover: String,
      colorFill: String,
      colorFillAlter: String,
      colorFillContent: String,
      colorFillContentHover: String,
      colorFillQuaternary: String,
      colorFillSecondary: String,
      colorFillTertiary: String,
      colorHighlight: String,
      colorIcon: String,
      colorIconHover: String,
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
      colorSplit: String,
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
      colorTextDescription: String,
      colorTextDisabled: String,
      colorTextHeading: String,
      colorTextLabel: String,
      colorTextLightSolid: String,
      colorTextPlaceholder: String,
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
      colorWarningOutline: String,
      colorWarningText: String,
      colorWarningTextActive: String,
      colorWarningTextHover: String,
      colorWhite: String,
      controlHeight: Double,
      controlHeightLG: Double,
      controlHeightSM: Double,
      controlHeightXS: Double,
      controlInteractiveSize: Double,
      controlItemBgActive: String,
      controlItemBgActiveDisabled: String,
      controlItemBgActiveHover: String,
      controlItemBgHover: String,
      controlOutline: String,
      controlOutlineWidth: Double,
      controlPaddingHorizontal: Double,
      controlPaddingHorizontalSM: Double,
      controlTmpOutline: String,
      fontFamily: String,
      fontFamilyCode: String,
      fontSize: Double,
      fontSizeHeading1: Double,
      fontSizeHeading2: Double,
      fontSizeHeading3: Double,
      fontSizeHeading4: Double,
      fontSizeHeading5: Double,
      fontSizeIcon: Double,
      fontSizeLG: Double,
      fontSizeSM: Double,
      fontSizeXL: Double,
      fontWeightStrong: Double,
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
      lineWidthFocus: Double,
      linkDecoration: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['textDecoration'] */ js.Any,
      linkFocusDecoration: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['textDecoration'] */ js.Any,
      linkHoverDecoration: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['textDecoration'] */ js.Any,
      margin: Double,
      marginLG: Double,
      marginMD: Double,
      marginSM: Double,
      marginXL: Double,
      marginXS: Double,
      marginXXL: Double,
      marginXXS: Double,
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
      opacityLoading: Double,
      padding: Double,
      paddingContentHorizontal: Double,
      paddingContentHorizontalLG: Double,
      paddingContentHorizontalSM: Double,
      paddingContentVertical: Double,
      paddingContentVerticalLG: Double,
      paddingContentVerticalSM: Double,
      paddingLG: Double,
      paddingMD: Double,
      paddingSM: Double,
      paddingXL: Double,
      paddingXS: Double,
      paddingXXS: Double,
      screenLG: Double,
      screenLGMax: Double,
      screenLGMin: Double,
      screenMD: Double,
      screenMDMax: Double,
      screenMDMin: Double,
      screenSM: Double,
      screenSMMax: Double,
      screenSMMin: Double,
      screenXL: Double,
      screenXLMax: Double,
      screenXLMin: Double,
      screenXS: Double,
      screenXSMax: Double,
      screenXSMin: Double,
      screenXXL: Double,
      screenXXLMin: Double,
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
    ): GlobalToken = {
      val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], borderRadiusLG = borderRadiusLG.asInstanceOf[js.Any], borderRadiusOuter = borderRadiusOuter.asInstanceOf[js.Any], borderRadiusSM = borderRadiusSM.asInstanceOf[js.Any], borderRadiusXS = borderRadiusXS.asInstanceOf[js.Any], boxShadow = boxShadow.asInstanceOf[js.Any], boxShadowSecondary = boxShadowSecondary.asInstanceOf[js.Any], boxShadowTertiary = boxShadowTertiary.asInstanceOf[js.Any], colorBgBase = colorBgBase.asInstanceOf[js.Any], colorBgBlur = colorBgBlur.asInstanceOf[js.Any], colorBgContainer = colorBgContainer.asInstanceOf[js.Any], colorBgContainerDisabled = colorBgContainerDisabled.asInstanceOf[js.Any], colorBgElevated = colorBgElevated.asInstanceOf[js.Any], colorBgLayout = colorBgLayout.asInstanceOf[js.Any], colorBgMask = colorBgMask.asInstanceOf[js.Any], colorBgSpotlight = colorBgSpotlight.asInstanceOf[js.Any], colorBgTextActive = colorBgTextActive.asInstanceOf[js.Any], colorBgTextHover = colorBgTextHover.asInstanceOf[js.Any], colorBorder = colorBorder.asInstanceOf[js.Any], colorBorderBg = colorBorderBg.asInstanceOf[js.Any], colorBorderSecondary = colorBorderSecondary.asInstanceOf[js.Any], colorError = colorError.asInstanceOf[js.Any], colorErrorActive = colorErrorActive.asInstanceOf[js.Any], colorErrorBg = colorErrorBg.asInstanceOf[js.Any], colorErrorBgHover = colorErrorBgHover.asInstanceOf[js.Any], colorErrorBorder = colorErrorBorder.asInstanceOf[js.Any], colorErrorBorderHover = colorErrorBorderHover.asInstanceOf[js.Any], colorErrorHover = colorErrorHover.asInstanceOf[js.Any], colorErrorOutline = colorErrorOutline.asInstanceOf[js.Any], colorErrorText = colorErrorText.asInstanceOf[js.Any], colorErrorTextActive = colorErrorTextActive.asInstanceOf[js.Any], colorErrorTextHover = colorErrorTextHover.asInstanceOf[js.Any], colorFill = colorFill.asInstanceOf[js.Any], colorFillAlter = colorFillAlter.asInstanceOf[js.Any], colorFillContent = colorFillContent.asInstanceOf[js.Any], colorFillContentHover = colorFillContentHover.asInstanceOf[js.Any], colorFillQuaternary = colorFillQuaternary.asInstanceOf[js.Any], colorFillSecondary = colorFillSecondary.asInstanceOf[js.Any], colorFillTertiary = colorFillTertiary.asInstanceOf[js.Any], colorHighlight = colorHighlight.asInstanceOf[js.Any], colorIcon = colorIcon.asInstanceOf[js.Any], colorIconHover = colorIconHover.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorInfoActive = colorInfoActive.asInstanceOf[js.Any], colorInfoBg = colorInfoBg.asInstanceOf[js.Any], colorInfoBgHover = colorInfoBgHover.asInstanceOf[js.Any], colorInfoBorder = colorInfoBorder.asInstanceOf[js.Any], colorInfoBorderHover = colorInfoBorderHover.asInstanceOf[js.Any], colorInfoHover = colorInfoHover.asInstanceOf[js.Any], colorInfoText = colorInfoText.asInstanceOf[js.Any], colorInfoTextActive = colorInfoTextActive.asInstanceOf[js.Any], colorInfoTextHover = colorInfoTextHover.asInstanceOf[js.Any], colorLink = colorLink.asInstanceOf[js.Any], colorLinkActive = colorLinkActive.asInstanceOf[js.Any], colorLinkHover = colorLinkHover.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorPrimaryActive = colorPrimaryActive.asInstanceOf[js.Any], colorPrimaryBg = colorPrimaryBg.asInstanceOf[js.Any], colorPrimaryBgHover = colorPrimaryBgHover.asInstanceOf[js.Any], colorPrimaryBorder = colorPrimaryBorder.asInstanceOf[js.Any], colorPrimaryBorderHover = colorPrimaryBorderHover.asInstanceOf[js.Any], colorPrimaryHover = colorPrimaryHover.asInstanceOf[js.Any], colorPrimaryText = colorPrimaryText.asInstanceOf[js.Any], colorPrimaryTextActive = colorPrimaryTextActive.asInstanceOf[js.Any], colorPrimaryTextHover = colorPrimaryTextHover.asInstanceOf[js.Any], colorSplit = colorSplit.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorSuccessActive = colorSuccessActive.asInstanceOf[js.Any], colorSuccessBg = colorSuccessBg.asInstanceOf[js.Any], colorSuccessBgHover = colorSuccessBgHover.asInstanceOf[js.Any], colorSuccessBorder = colorSuccessBorder.asInstanceOf[js.Any], colorSuccessBorderHover = colorSuccessBorderHover.asInstanceOf[js.Any], colorSuccessHover = colorSuccessHover.asInstanceOf[js.Any], colorSuccessText = colorSuccessText.asInstanceOf[js.Any], colorSuccessTextActive = colorSuccessTextActive.asInstanceOf[js.Any], colorSuccessTextHover = colorSuccessTextHover.asInstanceOf[js.Any], colorText = colorText.asInstanceOf[js.Any], colorTextBase = colorTextBase.asInstanceOf[js.Any], colorTextDescription = colorTextDescription.asInstanceOf[js.Any], colorTextDisabled = colorTextDisabled.asInstanceOf[js.Any], colorTextHeading = colorTextHeading.asInstanceOf[js.Any], colorTextLabel = colorTextLabel.asInstanceOf[js.Any], colorTextLightSolid = colorTextLightSolid.asInstanceOf[js.Any], colorTextPlaceholder = colorTextPlaceholder.asInstanceOf[js.Any], colorTextQuaternary = colorTextQuaternary.asInstanceOf[js.Any], colorTextSecondary = colorTextSecondary.asInstanceOf[js.Any], colorTextTertiary = colorTextTertiary.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], colorWarningActive = colorWarningActive.asInstanceOf[js.Any], colorWarningBg = colorWarningBg.asInstanceOf[js.Any], colorWarningBgHover = colorWarningBgHover.asInstanceOf[js.Any], colorWarningBorder = colorWarningBorder.asInstanceOf[js.Any], colorWarningBorderHover = colorWarningBorderHover.asInstanceOf[js.Any], colorWarningHover = colorWarningHover.asInstanceOf[js.Any], colorWarningOutline = colorWarningOutline.asInstanceOf[js.Any], colorWarningText = colorWarningText.asInstanceOf[js.Any], colorWarningTextActive = colorWarningTextActive.asInstanceOf[js.Any], colorWarningTextHover = colorWarningTextHover.asInstanceOf[js.Any], colorWhite = colorWhite.asInstanceOf[js.Any], controlHeight = controlHeight.asInstanceOf[js.Any], controlHeightLG = controlHeightLG.asInstanceOf[js.Any], controlHeightSM = controlHeightSM.asInstanceOf[js.Any], controlHeightXS = controlHeightXS.asInstanceOf[js.Any], controlInteractiveSize = controlInteractiveSize.asInstanceOf[js.Any], controlItemBgActive = controlItemBgActive.asInstanceOf[js.Any], controlItemBgActiveDisabled = controlItemBgActiveDisabled.asInstanceOf[js.Any], controlItemBgActiveHover = controlItemBgActiveHover.asInstanceOf[js.Any], controlItemBgHover = controlItemBgHover.asInstanceOf[js.Any], controlOutline = controlOutline.asInstanceOf[js.Any], controlOutlineWidth = controlOutlineWidth.asInstanceOf[js.Any], controlPaddingHorizontal = controlPaddingHorizontal.asInstanceOf[js.Any], controlPaddingHorizontalSM = controlPaddingHorizontalSM.asInstanceOf[js.Any], controlTmpOutline = controlTmpOutline.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontFamilyCode = fontFamilyCode.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontSizeHeading1 = fontSizeHeading1.asInstanceOf[js.Any], fontSizeHeading2 = fontSizeHeading2.asInstanceOf[js.Any], fontSizeHeading3 = fontSizeHeading3.asInstanceOf[js.Any], fontSizeHeading4 = fontSizeHeading4.asInstanceOf[js.Any], fontSizeHeading5 = fontSizeHeading5.asInstanceOf[js.Any], fontSizeIcon = fontSizeIcon.asInstanceOf[js.Any], fontSizeLG = fontSizeLG.asInstanceOf[js.Any], fontSizeSM = fontSizeSM.asInstanceOf[js.Any], fontSizeXL = fontSizeXL.asInstanceOf[js.Any], fontWeightStrong = fontWeightStrong.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineHeightHeading1 = lineHeightHeading1.asInstanceOf[js.Any], lineHeightHeading2 = lineHeightHeading2.asInstanceOf[js.Any], lineHeightHeading3 = lineHeightHeading3.asInstanceOf[js.Any], lineHeightHeading4 = lineHeightHeading4.asInstanceOf[js.Any], lineHeightHeading5 = lineHeightHeading5.asInstanceOf[js.Any], lineHeightLG = lineHeightLG.asInstanceOf[js.Any], lineHeightSM = lineHeightSM.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], lineWidthBold = lineWidthBold.asInstanceOf[js.Any], lineWidthFocus = lineWidthFocus.asInstanceOf[js.Any], linkDecoration = linkDecoration.asInstanceOf[js.Any], linkFocusDecoration = linkFocusDecoration.asInstanceOf[js.Any], linkHoverDecoration = linkHoverDecoration.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], marginLG = marginLG.asInstanceOf[js.Any], marginMD = marginMD.asInstanceOf[js.Any], marginSM = marginSM.asInstanceOf[js.Any], marginXL = marginXL.asInstanceOf[js.Any], marginXS = marginXS.asInstanceOf[js.Any], marginXXL = marginXXL.asInstanceOf[js.Any], marginXXS = marginXXS.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], motionBase = motionBase.asInstanceOf[js.Any], motionDurationFast = motionDurationFast.asInstanceOf[js.Any], motionDurationMid = motionDurationMid.asInstanceOf[js.Any], motionDurationSlow = motionDurationSlow.asInstanceOf[js.Any], motionEaseInBack = motionEaseInBack.asInstanceOf[js.Any], motionEaseInOut = motionEaseInOut.asInstanceOf[js.Any], motionEaseInOutCirc = motionEaseInOutCirc.asInstanceOf[js.Any], motionEaseInQuint = motionEaseInQuint.asInstanceOf[js.Any], motionEaseOut = motionEaseOut.asInstanceOf[js.Any], motionEaseOutBack = motionEaseOutBack.asInstanceOf[js.Any], motionEaseOutCirc = motionEaseOutCirc.asInstanceOf[js.Any], motionEaseOutQuint = motionEaseOutQuint.asInstanceOf[js.Any], motionUnit = motionUnit.asInstanceOf[js.Any], opacityImage = opacityImage.asInstanceOf[js.Any], opacityLoading = opacityLoading.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], paddingContentHorizontal = paddingContentHorizontal.asInstanceOf[js.Any], paddingContentHorizontalLG = paddingContentHorizontalLG.asInstanceOf[js.Any], paddingContentHorizontalSM = paddingContentHorizontalSM.asInstanceOf[js.Any], paddingContentVertical = paddingContentVertical.asInstanceOf[js.Any], paddingContentVerticalLG = paddingContentVerticalLG.asInstanceOf[js.Any], paddingContentVerticalSM = paddingContentVerticalSM.asInstanceOf[js.Any], paddingLG = paddingLG.asInstanceOf[js.Any], paddingMD = paddingMD.asInstanceOf[js.Any], paddingSM = paddingSM.asInstanceOf[js.Any], paddingXL = paddingXL.asInstanceOf[js.Any], paddingXS = paddingXS.asInstanceOf[js.Any], paddingXXS = paddingXXS.asInstanceOf[js.Any], screenLG = screenLG.asInstanceOf[js.Any], screenLGMax = screenLGMax.asInstanceOf[js.Any], screenLGMin = screenLGMin.asInstanceOf[js.Any], screenMD = screenMD.asInstanceOf[js.Any], screenMDMax = screenMDMax.asInstanceOf[js.Any], screenMDMin = screenMDMin.asInstanceOf[js.Any], screenSM = screenSM.asInstanceOf[js.Any], screenSMMax = screenSMMax.asInstanceOf[js.Any], screenSMMin = screenSMMin.asInstanceOf[js.Any], screenXL = screenXL.asInstanceOf[js.Any], screenXLMax = screenXLMax.asInstanceOf[js.Any], screenXLMin = screenXLMin.asInstanceOf[js.Any], screenXS = screenXS.asInstanceOf[js.Any], screenXSMax = screenXSMax.asInstanceOf[js.Any], screenXSMin = screenXSMin.asInstanceOf[js.Any], screenXXL = screenXXL.asInstanceOf[js.Any], screenXXLMin = screenXXLMin.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizeLG = sizeLG.asInstanceOf[js.Any], sizeMD = sizeMD.asInstanceOf[js.Any], sizeMS = sizeMS.asInstanceOf[js.Any], sizePopupArrow = sizePopupArrow.asInstanceOf[js.Any], sizeSM = sizeSM.asInstanceOf[js.Any], sizeStep = sizeStep.asInstanceOf[js.Any], sizeUnit = sizeUnit.asInstanceOf[js.Any], sizeXL = sizeXL.asInstanceOf[js.Any], sizeXS = sizeXS.asInstanceOf[js.Any], sizeXXL = sizeXXL.asInstanceOf[js.Any], sizeXXS = sizeXXS.asInstanceOf[js.Any], wireframe = wireframe.asInstanceOf[js.Any], zIndexBase = zIndexBase.asInstanceOf[js.Any], zIndexPopupBase = zIndexPopupBase.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalToken]
    }
  }
  
  type MappingAlgorithm = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DerivativeFunc<SeedToken, MapToken> */ Any
  
  /* Inlined {[ key in keyof antd.antd/es/theme/interface/components.ComponentTokenMap ]: std.Partial<antd.antd/es/theme/interface/components.ComponentTokenMap[key]> & std.Partial<antd.antd/es/theme/interface/alias.AliasToken>} */
  @js.native
  trait OverrideToken extends StObject {
    
    var Affix: js.UndefOr[Partial[js.UndefOr[ComponentToken]] with Partial[AliasToken]] = js.native
    
    var Alert: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esAlertStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Anchor: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esAnchorStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var App: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esAppStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Avatar: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esAvatarStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var BackTop: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esBackTopStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Badge: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esBadgeStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Breadcrumb: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esBreadcrumbStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Button: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esButtonStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Calendar: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esCalendarStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Card: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esCardStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Carousel: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esCarouselStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Cascader: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esCascaderStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Checkbox: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esCheckboxStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Collapse: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esCollapseStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var ColorPicker: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esColorPickerStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var DatePicker: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esDatePickerStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Descriptions: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esDescriptionsStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Divider: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esDividerStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Drawer: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esDrawerStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Dropdown: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esDropdownStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Empty: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esEmptyStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Flex: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esFlexStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var FloatButton: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esFloatButtonStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Form: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esFormStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Grid: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esGridStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Image: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esImageStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Input: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esInputStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var InputNumber: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esInputNumberStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Layout: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esLayoutStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var List: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esListStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Mentions: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esMentionsStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Menu: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esMenuStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Message: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esMessageStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Modal: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esModalStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Notification: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esNotificationStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Pagination: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esPaginationStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Popconfirm: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esPopconfirmStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Popover: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esPopoverStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Progress: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esProgressStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var QRCode: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esQrCodeStyleMod_.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Radio: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esRadioStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Rate: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esRateStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Result: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esResultStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Segmented: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esSegmentedStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Select: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esSelectStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Skeleton: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esSkeletonStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Slider: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esSliderStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Space: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esSpaceStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Spin: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esSpinStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Statistic: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esStatisticStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Steps: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esStepsStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Switch: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esSwitchStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Table: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esTableStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Tabs: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esTabsStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Tag: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esTagStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Timeline: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esTimelineStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Tooltip: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esTooltipStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Tour: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esTourStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Transfer: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esTransferStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Tree: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esTreeStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var TreeSelect: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esTreeSelectStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Typography: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esTypographyStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Upload: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esUploadStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
    
    var Wave: js.UndefOr[
        Partial[js.UndefOr[web.typings.antd.esUtilWaveStyleMod.ComponentToken]] with Partial[AliasToken]
      ] = js.native
  }
  object OverrideToken {
    
    @scala.inline
    def apply(): OverrideToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverrideToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: OverrideToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffix(value: Partial[js.UndefOr[ComponentToken]] with Partial[AliasToken]): Self = StObject.set(x, "Affix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixUndefined: Self = StObject.set(x, "Affix", js.undefined)
      
      @scala.inline
      def setAlert(
        value: Partial[js.UndefOr[web.typings.antd.esAlertStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertUndefined: Self = StObject.set(x, "Alert", js.undefined)
      
      @scala.inline
      def setAnchor(
        value: Partial[js.UndefOr[web.typings.antd.esAnchorStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "Anchor", js.undefined)
      
      @scala.inline
      def setApp(value: Partial[js.UndefOr[web.typings.antd.esAppStyleMod.ComponentToken]] with Partial[AliasToken]): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "App", js.undefined)
      
      @scala.inline
      def setAvatar(
        value: Partial[js.UndefOr[web.typings.antd.esAvatarStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "Avatar", js.undefined)
      
      @scala.inline
      def setBackTop(
        value: Partial[js.UndefOr[web.typings.antd.esBackTopStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "BackTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackTopUndefined: Self = StObject.set(x, "BackTop", js.undefined)
      
      @scala.inline
      def setBadge(
        value: Partial[js.UndefOr[web.typings.antd.esBadgeStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
      
      @scala.inline
      def setBreadcrumb(
        value: Partial[js.UndefOr[web.typings.antd.esBreadcrumbStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Breadcrumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbUndefined: Self = StObject.set(x, "Breadcrumb", js.undefined)
      
      @scala.inline
      def setButton(
        value: Partial[js.UndefOr[web.typings.antd.esButtonStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "Button", js.undefined)
      
      @scala.inline
      def setCalendar(
        value: Partial[js.UndefOr[web.typings.antd.esCalendarStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Calendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarUndefined: Self = StObject.set(x, "Calendar", js.undefined)
      
      @scala.inline
      def setCard(
        value: Partial[js.UndefOr[web.typings.antd.esCardStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "Card", js.undefined)
      
      @scala.inline
      def setCarousel(
        value: Partial[js.UndefOr[web.typings.antd.esCarouselStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Carousel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarouselUndefined: Self = StObject.set(x, "Carousel", js.undefined)
      
      @scala.inline
      def setCascader(
        value: Partial[js.UndefOr[web.typings.antd.esCascaderStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Cascader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCascaderUndefined: Self = StObject.set(x, "Cascader", js.undefined)
      
      @scala.inline
      def setCheckbox(
        value: Partial[js.UndefOr[web.typings.antd.esCheckboxStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Checkbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxUndefined: Self = StObject.set(x, "Checkbox", js.undefined)
      
      @scala.inline
      def setCollapse(
        value: Partial[js.UndefOr[web.typings.antd.esCollapseStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Collapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "Collapse", js.undefined)
      
      @scala.inline
      def setColorPicker(
        value: Partial[js.UndefOr[web.typings.antd.esColorPickerStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "ColorPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerUndefined: Self = StObject.set(x, "ColorPicker", js.undefined)
      
      @scala.inline
      def setDatePicker(
        value: Partial[js.UndefOr[web.typings.antd.esDatePickerStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePickerUndefined: Self = StObject.set(x, "DatePicker", js.undefined)
      
      @scala.inline
      def setDescriptions(
        value: Partial[js.UndefOr[web.typings.antd.esDescriptionsStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Descriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionsUndefined: Self = StObject.set(x, "Descriptions", js.undefined)
      
      @scala.inline
      def setDivider(
        value: Partial[js.UndefOr[web.typings.antd.esDividerStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "Divider", js.undefined)
      
      @scala.inline
      def setDrawer(
        value: Partial[js.UndefOr[web.typings.antd.esDrawerStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Drawer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerUndefined: Self = StObject.set(x, "Drawer", js.undefined)
      
      @scala.inline
      def setDropdown(
        value: Partial[js.UndefOr[web.typings.antd.esDropdownStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Dropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownUndefined: Self = StObject.set(x, "Dropdown", js.undefined)
      
      @scala.inline
      def setEmpty(
        value: Partial[js.UndefOr[web.typings.antd.esEmptyStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "Empty", js.undefined)
      
      @scala.inline
      def setFlex(
        value: Partial[js.UndefOr[web.typings.antd.esFlexStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "Flex", js.undefined)
      
      @scala.inline
      def setFloatButton(
        value: Partial[js.UndefOr[web.typings.antd.esFloatButtonStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "FloatButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatButtonUndefined: Self = StObject.set(x, "FloatButton", js.undefined)
      
      @scala.inline
      def setForm(
        value: Partial[js.UndefOr[web.typings.antd.esFormStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "Form", js.undefined)
      
      @scala.inline
      def setGrid(
        value: Partial[js.UndefOr[web.typings.antd.esGridStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "Grid", js.undefined)
      
      @scala.inline
      def setImage(
        value: Partial[js.UndefOr[web.typings.antd.esImageStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
      
      @scala.inline
      def setInput(
        value: Partial[js.UndefOr[web.typings.antd.esInputStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNumber(
        value: Partial[js.UndefOr[web.typings.antd.esInputNumberStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "InputNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNumberUndefined: Self = StObject.set(x, "InputNumber", js.undefined)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      @scala.inline
      def setLayout(
        value: Partial[js.UndefOr[web.typings.antd.esLayoutStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "Layout", js.undefined)
      
      @scala.inline
      def setList(
        value: Partial[js.UndefOr[web.typings.antd.esListStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "List", js.undefined)
      
      @scala.inline
      def setMentions(
        value: Partial[js.UndefOr[web.typings.antd.esMentionsStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Mentions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionsUndefined: Self = StObject.set(x, "Mentions", js.undefined)
      
      @scala.inline
      def setMenu(
        value: Partial[js.UndefOr[web.typings.antd.esMenuStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "Menu", js.undefined)
      
      @scala.inline
      def setMessage(
        value: Partial[js.UndefOr[web.typings.antd.esMessageStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      @scala.inline
      def setModal(
        value: Partial[js.UndefOr[web.typings.antd.esModalStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "Modal", js.undefined)
      
      @scala.inline
      def setNotification(
        value: Partial[js.UndefOr[web.typings.antd.esNotificationStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
      
      @scala.inline
      def setPagination(
        value: Partial[js.UndefOr[web.typings.antd.esPaginationStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "Pagination", js.undefined)
      
      @scala.inline
      def setPopconfirm(
        value: Partial[js.UndefOr[web.typings.antd.esPopconfirmStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Popconfirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopconfirmUndefined: Self = StObject.set(x, "Popconfirm", js.undefined)
      
      @scala.inline
      def setPopover(
        value: Partial[js.UndefOr[web.typings.antd.esPopoverStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Popover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverUndefined: Self = StObject.set(x, "Popover", js.undefined)
      
      @scala.inline
      def setProgress(
        value: Partial[js.UndefOr[web.typings.antd.esProgressStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
      
      @scala.inline
      def setQRCode(
        value: Partial[js.UndefOr[web.typings.antd.esQrCodeStyleMod_.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "QRCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQRCodeUndefined: Self = StObject.set(x, "QRCode", js.undefined)
      
      @scala.inline
      def setRadio(
        value: Partial[js.UndefOr[web.typings.antd.esRadioStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Radio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioUndefined: Self = StObject.set(x, "Radio", js.undefined)
      
      @scala.inline
      def setRate(
        value: Partial[js.UndefOr[web.typings.antd.esRateStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "Rate", js.undefined)
      
      @scala.inline
      def setResult(
        value: Partial[js.UndefOr[web.typings.antd.esResultStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
      
      @scala.inline
      def setSegmented(
        value: Partial[js.UndefOr[web.typings.antd.esSegmentedStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Segmented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentedUndefined: Self = StObject.set(x, "Segmented", js.undefined)
      
      @scala.inline
      def setSelect(
        value: Partial[js.UndefOr[web.typings.antd.esSelectStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
      
      @scala.inline
      def setSkeleton(
        value: Partial[js.UndefOr[web.typings.antd.esSkeletonStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Skeleton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkeletonUndefined: Self = StObject.set(x, "Skeleton", js.undefined)
      
      @scala.inline
      def setSlider(
        value: Partial[js.UndefOr[web.typings.antd.esSliderStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Slider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderUndefined: Self = StObject.set(x, "Slider", js.undefined)
      
      @scala.inline
      def setSpace(
        value: Partial[js.UndefOr[web.typings.antd.esSpaceStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "Space", js.undefined)
      
      @scala.inline
      def setSpin(
        value: Partial[js.UndefOr[web.typings.antd.esSpinStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Spin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "Spin", js.undefined)
      
      @scala.inline
      def setStatistic(
        value: Partial[js.UndefOr[web.typings.antd.esStatisticStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
      
      @scala.inline
      def setSteps(
        value: Partial[js.UndefOr[web.typings.antd.esStepsStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
      
      @scala.inline
      def setSwitch(
        value: Partial[js.UndefOr[web.typings.antd.esSwitchStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Switch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchUndefined: Self = StObject.set(x, "Switch", js.undefined)
      
      @scala.inline
      def setTable(
        value: Partial[js.UndefOr[web.typings.antd.esTableStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
      
      @scala.inline
      def setTabs(
        value: Partial[js.UndefOr[web.typings.antd.esTabsStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsUndefined: Self = StObject.set(x, "Tabs", js.undefined)
      
      @scala.inline
      def setTag(value: Partial[js.UndefOr[web.typings.antd.esTagStyleMod.ComponentToken]] with Partial[AliasToken]): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      @scala.inline
      def setTimeline(
        value: Partial[js.UndefOr[web.typings.antd.esTimelineStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
      
      @scala.inline
      def setTooltip(
        value: Partial[js.UndefOr[web.typings.antd.esTooltipStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
      
      @scala.inline
      def setTour(
        value: Partial[js.UndefOr[web.typings.antd.esTourStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Tour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTourUndefined: Self = StObject.set(x, "Tour", js.undefined)
      
      @scala.inline
      def setTransfer(
        value: Partial[js.UndefOr[web.typings.antd.esTransferStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Transfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferUndefined: Self = StObject.set(x, "Transfer", js.undefined)
      
      @scala.inline
      def setTree(
        value: Partial[js.UndefOr[web.typings.antd.esTreeStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Tree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeSelect(
        value: Partial[js.UndefOr[web.typings.antd.esTreeSelectStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "TreeSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeSelectUndefined: Self = StObject.set(x, "TreeSelect", js.undefined)
      
      @scala.inline
      def setTreeUndefined: Self = StObject.set(x, "Tree", js.undefined)
      
      @scala.inline
      def setTypography(
        value: Partial[js.UndefOr[web.typings.antd.esTypographyStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Typography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypographyUndefined: Self = StObject.set(x, "Typography", js.undefined)
      
      @scala.inline
      def setUpload(
        value: Partial[js.UndefOr[web.typings.antd.esUploadStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Upload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUndefined: Self = StObject.set(x, "Upload", js.undefined)
      
      @scala.inline
      def setWave(
        value: Partial[js.UndefOr[web.typings.antd.esUtilWaveStyleMod.ComponentToken]] with Partial[AliasToken]
      ): Self = StObject.set(x, "Wave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaveUndefined: Self = StObject.set(x, "Wave", js.undefined)
    }
  }
  
  type UseComponentStyleResult = js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]
}
