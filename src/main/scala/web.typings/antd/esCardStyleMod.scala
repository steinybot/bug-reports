package web.typings.antd

import web.typings.antd.antdStrings.Card
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCardStyleMod {
  
  @JSImport("antd/es/card/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/card/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Card] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 操作区背景色
      * @descEN Background color of card actions
      */
    var actionsBg: String = js.native
    
    /**
      * @desc 操作区每一项的外间距
      * @descEN Margin of each item in card actions
      */
    var actionsLiMargin: String = js.native
    
    /**
      * @desc 额外区文字颜色
      * @descEN Text color of extra area
      */
    var extraColor: String = js.native
    
    /**
      * @desc 卡片头部背景色
      * @descEN Background color of card header
      */
    var headerBg: String = js.native
    
    /**
      * @desc 卡片头部文字大小
      * @descEN Font size of card header
      */
    var headerFontSize: Double = js.native
    
    /**
      * @desc 小号卡片头部文字大小
      * @descEN Font size of small card header
      */
    var headerFontSizeSM: Double = js.native
    
    /**
      * @desc 卡片头部高度
      * @descEN Height of card header
      */
    var headerHeight: Double = js.native
    
    /**
      * @desc 小号卡片头部高度
      * @descEN Height of small card header
      */
    var headerHeightSM: Double = js.native
    
    /**
      * @desc 内置标签页组件下间距
      * @descEN Margin bottom of tabs component
      */
    var tabsMarginBottom: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      actionsBg: String,
      actionsLiMargin: String,
      extraColor: String,
      headerBg: String,
      headerFontSize: Double,
      headerFontSizeSM: Double,
      headerHeight: Double,
      headerHeightSM: Double,
      tabsMarginBottom: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(actionsBg = actionsBg.asInstanceOf[js.Any], actionsLiMargin = actionsLiMargin.asInstanceOf[js.Any], extraColor = extraColor.asInstanceOf[js.Any], headerBg = headerBg.asInstanceOf[js.Any], headerFontSize = headerFontSize.asInstanceOf[js.Any], headerFontSizeSM = headerFontSizeSM.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], headerHeightSM = headerHeightSM.asInstanceOf[js.Any], tabsMarginBottom = tabsMarginBottom.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionsBg(value: String): Self = StObject.set(x, "actionsBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsLiMargin(value: String): Self = StObject.set(x, "actionsLiMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraColor(value: String): Self = StObject.set(x, "extraColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderBg(value: String): Self = StObject.set(x, "headerBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFontSize(value: Double): Self = StObject.set(x, "headerFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFontSizeSM(value: Double): Self = StObject.set(x, "headerFontSizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeightSM(value: Double): Self = StObject.set(x, "headerHeightSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsMarginBottom(value: Double): Self = StObject.set(x, "tabsMarginBottom", value.asInstanceOf[js.Any])
    }
  }
}
