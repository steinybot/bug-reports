package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Tabs
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabsStyleMod {
  
  @JSImport("antd/es/tabs/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/tabs/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Tabs] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 卡片标签页背景色
      * @descEN Background color of card tab
      */
    var cardBg: String = js.native
    
    /**
      * @desc 卡片标签间距
      * @descEN Gutter of card tab
      */
    var cardGutter: Double = js.native
    
    /**
      * @desc 卡片标签页高度
      * @descEN Height of card tab
      */
    var cardHeight: Double = js.native
    
    /**
      * @desc 卡片标签页内间距
      * @descEN Padding of card tab
      */
    var cardPadding: String = js.native
    
    /**
      * @desc 大号卡片标签页内间距
      * @descEN Padding of large card tab
      */
    var cardPaddingLG: String = js.native
    
    /**
      * @desc 小号卡片标签页内间距
      * @descEN Padding of small card tab
      */
    var cardPaddingSM: String = js.native
    
    /**
      * @desc 横向标签页标签间距
      * @descEN Horizontal gutter of horizontal tab
      */
    var horizontalItemGutter: Double = js.native
    
    /**
      * @desc 横向标签页标签外间距
      * @descEN Horizontal margin of horizontal tab item
      */
    var horizontalItemMargin: String = js.native
    
    /**
      * @desc 横向标签页标签外间距（RTL）
      * @descEN Horizontal margin of horizontal tab item (RTL)
      */
    var horizontalItemMarginRTL: String = js.native
    
    /**
      * @desc 横向标签页标签内间距
      * @descEN Horizontal padding of horizontal tab item
      */
    var horizontalItemPadding: String = js.native
    
    /**
      * @desc 大号横向标签页标签内间距
      * @descEN Horizontal padding of large horizontal tab item
      */
    var horizontalItemPaddingLG: String = js.native
    
    /**
      * @desc 小号横向标签页标签内间距
      * @descEN Horizontal padding of small horizontal tab item
      */
    var horizontalItemPaddingSM: String = js.native
    
    /**
      * @desc 横向标签页外间距
      * @descEN Horizontal margin of horizontal tab
      */
    var horizontalMargin: String = js.native
    
    /**
      * @desc 指示条颜色
      * @descEN Color of indicator
      */
    var inkBarColor: String = js.native
    
    /**
      * @desc 标签激活态文本颜色
      * @descEN Text color of active tab
      */
    var itemActiveColor: String = js.native
    
    /**
      * @desc 标签文本颜色
      * @descEN Text color of tab
      */
    var itemColor: String = js.native
    
    /**
      * @desc 标签悬浮态文本颜色
      * @descEN Text color of hover tab
      */
    var itemHoverColor: String = js.native
    
    /**
      * @desc 标签选中态文本颜色
      * @descEN Text color of selected tab
      */
    var itemSelectedColor: String = js.native
    
    /**
      * @desc 标齐页标题文本大小
      * @descEN Font size of title
      */
    var titleFontSize: Double = js.native
    
    /**
      * @desc 大号标签页标题文本大小
      * @descEN Font size of large title
      */
    var titleFontSizeLG: Double = js.native
    
    /**
      * @desc 小号标签页标题文本大小
      * @descEN Font size of small title
      */
    var titleFontSizeSM: Double = js.native
    
    /**
      * @desc 纵向标签页标签外间距
      * @descEN Vertical margin of vertical tab item
      */
    var verticalItemMargin: String = js.native
    
    /**
      * @desc 纵向标签页标签内间距
      * @descEN Vertical padding of vertical tab item
      */
    var verticalItemPadding: String = js.native
    
    /**
      * @desc 下拉菜单 z-index
      * @descEN z-index of dropdown menu
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      cardBg: String,
      cardGutter: Double,
      cardHeight: Double,
      cardPadding: String,
      cardPaddingLG: String,
      cardPaddingSM: String,
      horizontalItemGutter: Double,
      horizontalItemMargin: String,
      horizontalItemMarginRTL: String,
      horizontalItemPadding: String,
      horizontalItemPaddingLG: String,
      horizontalItemPaddingSM: String,
      horizontalMargin: String,
      inkBarColor: String,
      itemActiveColor: String,
      itemColor: String,
      itemHoverColor: String,
      itemSelectedColor: String,
      titleFontSize: Double,
      titleFontSizeLG: Double,
      titleFontSizeSM: Double,
      verticalItemMargin: String,
      verticalItemPadding: String,
      zIndexPopup: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(cardBg = cardBg.asInstanceOf[js.Any], cardGutter = cardGutter.asInstanceOf[js.Any], cardHeight = cardHeight.asInstanceOf[js.Any], cardPadding = cardPadding.asInstanceOf[js.Any], cardPaddingLG = cardPaddingLG.asInstanceOf[js.Any], cardPaddingSM = cardPaddingSM.asInstanceOf[js.Any], horizontalItemGutter = horizontalItemGutter.asInstanceOf[js.Any], horizontalItemMargin = horizontalItemMargin.asInstanceOf[js.Any], horizontalItemMarginRTL = horizontalItemMarginRTL.asInstanceOf[js.Any], horizontalItemPadding = horizontalItemPadding.asInstanceOf[js.Any], horizontalItemPaddingLG = horizontalItemPaddingLG.asInstanceOf[js.Any], horizontalItemPaddingSM = horizontalItemPaddingSM.asInstanceOf[js.Any], horizontalMargin = horizontalMargin.asInstanceOf[js.Any], inkBarColor = inkBarColor.asInstanceOf[js.Any], itemActiveColor = itemActiveColor.asInstanceOf[js.Any], itemColor = itemColor.asInstanceOf[js.Any], itemHoverColor = itemHoverColor.asInstanceOf[js.Any], itemSelectedColor = itemSelectedColor.asInstanceOf[js.Any], titleFontSize = titleFontSize.asInstanceOf[js.Any], titleFontSizeLG = titleFontSizeLG.asInstanceOf[js.Any], titleFontSizeSM = titleFontSizeSM.asInstanceOf[js.Any], verticalItemMargin = verticalItemMargin.asInstanceOf[js.Any], verticalItemPadding = verticalItemPadding.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardBg(value: String): Self = StObject.set(x, "cardBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardGutter(value: Double): Self = StObject.set(x, "cardGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardHeight(value: Double): Self = StObject.set(x, "cardHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardPadding(value: String): Self = StObject.set(x, "cardPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardPaddingLG(value: String): Self = StObject.set(x, "cardPaddingLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardPaddingSM(value: String): Self = StObject.set(x, "cardPaddingSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalItemGutter(value: Double): Self = StObject.set(x, "horizontalItemGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalItemMargin(value: String): Self = StObject.set(x, "horizontalItemMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalItemMarginRTL(value: String): Self = StObject.set(x, "horizontalItemMarginRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalItemPadding(value: String): Self = StObject.set(x, "horizontalItemPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalItemPaddingLG(value: String): Self = StObject.set(x, "horizontalItemPaddingLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalItemPaddingSM(value: String): Self = StObject.set(x, "horizontalItemPaddingSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalMargin(value: String): Self = StObject.set(x, "horizontalMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInkBarColor(value: String): Self = StObject.set(x, "inkBarColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemActiveColor(value: String): Self = StObject.set(x, "itemActiveColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHoverColor(value: String): Self = StObject.set(x, "itemHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSelectedColor(value: String): Self = StObject.set(x, "itemSelectedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeLG(value: Double): Self = StObject.set(x, "titleFontSizeLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeSM(value: Double): Self = StObject.set(x, "titleFontSizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalItemMargin(value: String): Self = StObject.set(x, "verticalItemMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalItemPadding(value: String): Self = StObject.set(x, "verticalItemPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Tabs'] */ @js.native
  trait TabsToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var dropdownEdgeChildVerticalPadding: Double = js.native
    
    var tabsActiveTextShadow: String = js.native
    
    var tabsCardPadding: String = js.native
    
    var tabsDropdownHeight: Double = js.native
    
    var tabsDropdownWidth: Double = js.native
    
    var tabsHorizontalItemMargin: String = js.native
    
    var tabsHorizontalItemMarginRTL: String = js.native
    
    var tabsNavWrapPseudoWidth: Double = js.native
  }
  object TabsToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      dropdownEdgeChildVerticalPadding: Double,
      tabsActiveTextShadow: String,
      tabsCardPadding: String,
      tabsDropdownHeight: Double,
      tabsDropdownWidth: Double,
      tabsHorizontalItemMargin: String,
      tabsHorizontalItemMarginRTL: String,
      tabsNavWrapPseudoWidth: Double
    ): TabsToken = {
      val __obj = js.Dynamic.literal(dropdownEdgeChildVerticalPadding = dropdownEdgeChildVerticalPadding.asInstanceOf[js.Any], tabsActiveTextShadow = tabsActiveTextShadow.asInstanceOf[js.Any], tabsCardPadding = tabsCardPadding.asInstanceOf[js.Any], tabsDropdownHeight = tabsDropdownHeight.asInstanceOf[js.Any], tabsDropdownWidth = tabsDropdownWidth.asInstanceOf[js.Any], tabsHorizontalItemMargin = tabsHorizontalItemMargin.asInstanceOf[js.Any], tabsHorizontalItemMarginRTL = tabsHorizontalItemMarginRTL.asInstanceOf[js.Any], tabsNavWrapPseudoWidth = tabsNavWrapPseudoWidth.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[TabsToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TabsToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropdownEdgeChildVerticalPadding(value: Double): Self = StObject.set(x, "dropdownEdgeChildVerticalPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsActiveTextShadow(value: String): Self = StObject.set(x, "tabsActiveTextShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsCardPadding(value: String): Self = StObject.set(x, "tabsCardPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsDropdownHeight(value: Double): Self = StObject.set(x, "tabsDropdownHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsDropdownWidth(value: Double): Self = StObject.set(x, "tabsDropdownWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsHorizontalItemMargin(value: String): Self = StObject.set(x, "tabsHorizontalItemMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsHorizontalItemMarginRTL(value: String): Self = StObject.set(x, "tabsHorizontalItemMarginRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsNavWrapPseudoWidth(value: Double): Self = StObject.set(x, "tabsNavWrapPseudoWidth", value.asInstanceOf[js.Any])
    }
  }
}
