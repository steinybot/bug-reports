package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Badge
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBadgeStyleMod {
  
  @JSImport("antd/es/badge/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/badge/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Badge] = js.native
  
  @scala.inline
  def prepareToken(
    token: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<antd.antd/es/theme/util/genComponentStyleHook.GenStyleFn<'Badge'>>[0] */ js.Any
  ): BadgeToken = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareToken")(token.asInstanceOf[js.Any]).asInstanceOf[BadgeToken]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Badge'] */ @js.native
  trait BadgeToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var badgeColor: String = js.native
    
    var badgeColorHover: String = js.native
    
    var badgeFontHeight: Double = js.native
    
    var badgeProcessingDuration: String = js.native
    
    var badgeRibbonCornerFilter: String = js.native
    
    var badgeRibbonCornerTransform: String = js.native
    
    var badgeRibbonOffset: Double = js.native
    
    var badgeShadowColor: String = js.native
    
    var badgeShadowSize: Double = js.native
    
    var badgeTextColor: String = js.native
  }
  object BadgeToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      badgeColor: String,
      badgeColorHover: String,
      badgeFontHeight: Double,
      badgeProcessingDuration: String,
      badgeRibbonCornerFilter: String,
      badgeRibbonCornerTransform: String,
      badgeRibbonOffset: Double,
      badgeShadowColor: String,
      badgeShadowSize: Double,
      badgeTextColor: String
    ): BadgeToken = {
      val __obj = js.Dynamic.literal(badgeColor = badgeColor.asInstanceOf[js.Any], badgeColorHover = badgeColorHover.asInstanceOf[js.Any], badgeFontHeight = badgeFontHeight.asInstanceOf[js.Any], badgeProcessingDuration = badgeProcessingDuration.asInstanceOf[js.Any], badgeRibbonCornerFilter = badgeRibbonCornerFilter.asInstanceOf[js.Any], badgeRibbonCornerTransform = badgeRibbonCornerTransform.asInstanceOf[js.Any], badgeRibbonOffset = badgeRibbonOffset.asInstanceOf[js.Any], badgeShadowColor = badgeShadowColor.asInstanceOf[js.Any], badgeShadowSize = badgeShadowSize.asInstanceOf[js.Any], badgeTextColor = badgeTextColor.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[BadgeToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BadgeToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadgeColor(value: String): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeColorHover(value: String): Self = StObject.set(x, "badgeColorHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeFontHeight(value: Double): Self = StObject.set(x, "badgeFontHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeProcessingDuration(value: String): Self = StObject.set(x, "badgeProcessingDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeRibbonCornerFilter(value: String): Self = StObject.set(x, "badgeRibbonCornerFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeRibbonCornerTransform(value: String): Self = StObject.set(x, "badgeRibbonCornerTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeRibbonOffset(value: Double): Self = StObject.set(x, "badgeRibbonOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeShadowColor(value: String): Self = StObject.set(x, "badgeShadowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeShadowSize(value: Double): Self = StObject.set(x, "badgeShadowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeTextColor(value: String): Self = StObject.set(x, "badgeTextColor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 点状徽标尺寸
      * @descEN Size of dot badge
      */
    var dotSize: Double = js.native
    
    /**
      * @desc 徽标高度
      * @descEN Height of badge
      */
    var indicatorHeight: Double = js.native
    
    /**
      * @desc 小号徽标高度
      * @descEN Height of small badge
      */
    var indicatorHeightSM: Double = js.native
    
    /**
      * @desc 徽标 z-index
      * @descEN z-index of badge
      */
    var indicatorZIndex: Double | String = js.native
    
    /**
      * @desc 状态徽标尺寸
      * @descEN Size of status badge
      */
    var statusSize: Double = js.native
    
    /**
      * @desc 徽标文本尺寸
      * @descEN Font size of badge text
      */
    var textFontSize: Double = js.native
    
    /**
      * @desc 小号徽标文本尺寸
      * @descEN Font size of small badge text
      */
    var textFontSizeSM: Double = js.native
    
    /**
      * @desc 徽标文本粗细
      * @descEN Font weight of badge text
      */
    var textFontWeight: Double | String = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      dotSize: Double,
      indicatorHeight: Double,
      indicatorHeightSM: Double,
      indicatorZIndex: Double | String,
      statusSize: Double,
      textFontSize: Double,
      textFontSizeSM: Double,
      textFontWeight: Double | String
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(dotSize = dotSize.asInstanceOf[js.Any], indicatorHeight = indicatorHeight.asInstanceOf[js.Any], indicatorHeightSM = indicatorHeightSM.asInstanceOf[js.Any], indicatorZIndex = indicatorZIndex.asInstanceOf[js.Any], statusSize = statusSize.asInstanceOf[js.Any], textFontSize = textFontSize.asInstanceOf[js.Any], textFontSizeSM = textFontSizeSM.asInstanceOf[js.Any], textFontWeight = textFontWeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDotSize(value: Double): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorHeight(value: Double): Self = StObject.set(x, "indicatorHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorHeightSM(value: Double): Self = StObject.set(x, "indicatorHeightSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorZIndex(value: Double | String): Self = StObject.set(x, "indicatorZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusSize(value: Double): Self = StObject.set(x, "statusSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFontSize(value: Double): Self = StObject.set(x, "textFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFontSizeSM(value: Double): Self = StObject.set(x, "textFontSizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFontWeight(value: Double | String): Self = StObject.set(x, "textFontWeight", value.asInstanceOf[js.Any])
    }
  }
}
