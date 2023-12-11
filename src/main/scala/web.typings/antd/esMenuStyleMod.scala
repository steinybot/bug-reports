package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Menu
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FormatComponentToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMenuStyleMod {
  
  @JSImport("antd/es/menu/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String, injectStyle: Boolean): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any], injectStyle.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: Unit, injectStyle: Boolean): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any], injectStyle.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/menu/style", "formatComponentToken")
  @js.native
  val formatComponentToken: FormatComponentToken[Menu] = js.native
  
  @JSImport("antd/es/menu/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Menu] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 菜单项指示条边框宽度
      * @descEN Border width of menu item active bar
      */
    var activeBarBorderWidth: Double = js.native
    
    /**
      * @desc 菜单项指示条高度
      * @descEN Height of menu item active bar
      */
    var activeBarHeight: Double = js.native
    
    /**
      * @desc 菜单项指示条宽度
      * @descEN Width of menu item active bar
      */
    var activeBarWidth: Double = js.native
    
    /**
      * @desc 收起时图标尺寸
      * @descEN Size of icon when collapsed
      */
    var collapsedIconSize: Double = js.native
    
    /**
      * @desc 收起后的宽度
      * @descEN Width when collapsed
      */
    var collapsedWidth: Double = js.native
    
    /** @deprecated Use `activeBarBorderWidth` instead */
    var colorActiveBarBorderSize: Double = js.native
    
    /** @deprecated Use `activeBarHeight` instead */
    var colorActiveBarHeight: Double = js.native
    
    /** @deprecated Use `activeBarWidth` instead */
    var colorActiveBarWidth: Double = js.native
    
    /** @deprecated Use `dangerItemActiveBg` instead */
    var colorDangerItemBgActive: String = js.native
    
    /** @deprecated Use `dangerItemSelectedBg` instead */
    var colorDangerItemBgSelected: String = js.native
    
    /** @deprecated Use `dangerItemColor` instead */
    var colorDangerItemText: String = js.native
    
    /** @deprecated Use `dangerItemHoverColor` instead */
    var colorDangerItemTextHover: String = js.native
    
    /** @deprecated Use `dangerItemSelectedColor` instead */
    var colorDangerItemTextSelected: String = js.native
    
    /** @deprecated Use `groupTitleColor` instead */
    var colorGroupTitle: String = js.native
    
    /** @deprecated Use `itemBg` instead */
    var colorItemBg: String = js.native
    
    /** @deprecated Use `itemActiveBg` instead */
    var colorItemBgActive: String = js.native
    
    /** @deprecated Use `itemHoverBg` instead */
    var colorItemBgHover: String = js.native
    
    /** @deprecated Use `itemSelectedBg` instead */
    var colorItemBgSelected: String = js.native
    
    /** @deprecated Use `horizontalItemSelectedBg` instead */
    var colorItemBgSelectedHorizontal: String = js.native
    
    /** @deprecated Use `itemColor` instead */
    var colorItemText: String = js.native
    
    /** @deprecated Use `itemDisabledColor` instead */
    var colorItemTextDisabled: String = js.native
    
    /** @deprecated Use `itemHoverColor` instead */
    var colorItemTextHover: String = js.native
    
    /** @deprecated Use `horizontalItemHoverColor` instead */
    var colorItemTextHoverHorizontal: String = js.native
    
    /** @deprecated Use `itemSelectedColor` instead */
    var colorItemTextSelected: String = js.native
    
    /** @deprecated Use `horizontalItemSelectedColor` instead */
    var colorItemTextSelectedHorizontal: String = js.native
    
    /** @deprecated Use `subMenuItemBg` instead */
    var colorSubItemBg: String = js.native
    
    /**
      * @desc 危险菜单项文字激活颜色
      * @descEN Color of active danger menu item text
      */
    var dangerItemActiveBg: String = js.native
    
    /**
      * @desc 危险菜单项文字颜色
      * @descEN Color of danger menu item text
      */
    var dangerItemColor: String = js.native
    
    /**
      * @desc 危险菜单项文字悬浮颜色
      * @descEN Hover color of danger menu item text
      */
    var dangerItemHoverColor: String = js.native
    
    /**
      * @desc 危险菜单项文字选中颜色
      * @descEN Color of selected danger menu item text
      */
    var dangerItemSelectedBg: String = js.native
    
    /**
      * @desc 危险菜单项文字选中颜色
      * @descEN Color of selected danger menu item text
      */
    var dangerItemSelectedColor: String = js.native
    
    /**
      * @desc 暗色模式下的危险菜单项激活态背景
      * @descEN Background of active danger menu item in dark mode
      */
    var darkDangerItemActiveBg: String = js.native
    
    /**
      * @desc 暗色模式下的危险菜单项文字颜色
      * @descEN Color of danger menu item text in dark mode
      */
    var darkDangerItemColor: String = js.native
    
    /**
      * @desc 暗色模式下的危险菜单项悬浮文字背景
      * @descEN Background of hovered danger menu item in dark mode
      */
    var darkDangerItemHoverColor: String = js.native
    
    /**
      * @desc 暗色模式下的危险菜单项选中背景
      * @descEN Background of active danger menu item in dark mode
      */
    var darkDangerItemSelectedBg: String = js.native
    
    /**
      * @desc 暗色模式下的危险菜单项选中文字颜色
      * @descEN Color of selected danger menu item in dark mode
      */
    var darkDangerItemSelectedColor: String = js.native
    
    /**
      * @desc 暗色模式下的分组标题文字颜色
      * @descEN Color of group title text in dark mode
      */
    var darkGroupTitleColor: String = js.native
    
    /**
      * @desc 暗色模式下的菜单项背景
      * @descEN Background of menu item in dark mode
      */
    var darkItemBg: String = js.native
    
    /**
      * @desc 暗色模式下的菜单项文字颜色
      * @descEN Color of menu item text in dark mode
      */
    var darkItemColor: String = js.native
    
    /**
      * @desc 暗色模式下的菜单项禁用颜色
      * @descEN Color of disabled menu item in dark mode
      */
    var darkItemDisabledColor: String = js.native
    
    /**
      * @desc 暗色模式下的菜单项悬浮背景
      * @descEN Background of hovered menu item in dark mode
      */
    var darkItemHoverBg: String = js.native
    
    /**
      * @desc 暗色模式下的菜单项悬浮颜色
      * @descEN Color of hovered menu item in dark mode
      */
    var darkItemHoverColor: String = js.native
    
    /**
      * @desc 暗色模式下的菜单项选中背景
      * @descEN Background of active menu item in dark mode
      */
    var darkItemSelectedBg: String = js.native
    
    /**
      * @desc 暗色模式下的菜单项选中颜色
      * @descEN Color of selected menu item in dark mode
      */
    var darkItemSelectedColor: String = js.native
    
    /**
      * @desc 暗色模式下的子菜单项背景
      * @descEN Background of submenu item in dark mode
      */
    var darkSubMenuItemBg: String = js.native
    
    /**
      * @desc 弹出菜单的宽度
      * @descEN Width of popup menu
      */
    var dropdownWidth: Double = js.native
    
    /**
      * @desc 分组标题文字颜色
      * @descEN Color of group title text
      */
    var groupTitleColor: String = js.native
    
    /**
      * @desc 分组标题文字大小
      * @descEN font-size of group title
      */
    var groupTitleFontSize: Double = js.native
    
    /**
      * @desc 分组标题文字高度
      * @descEN line-height of group title
      */
    var groupTitleLineHeight: String | Double = js.native
    
    /**
      * @desc 横向菜单项圆角
      * @descEN Border radius of horizontal menu item
      */
    var horizontalItemBorderRadius: Double = js.native
    
    /**
      * @desc 横向菜单项横悬浮态背景色
      * @descEN Background color of horizontal menu item when hover
      */
    var horizontalItemHoverBg: String = js.native
    
    /**
      * @desc 水平菜单项文字悬浮颜色
      * @descEN Hover color of horizontal menu item text
      */
    var horizontalItemHoverColor: String = js.native
    
    /**
      * @desc 水平菜单项选中态背景色
      * @descEN Background color of horizontal menu item when selected
      */
    var horizontalItemSelectedBg: String = js.native
    
    /**
      * @desc 水平菜单项文字选中颜色
      * @descEN Color of selected horizontal menu item text
      */
    var horizontalItemSelectedColor: String = js.native
    
    /**
      * @desc 横向菜单行高
      * @descEN LineHeight of horizontal menu item
      */
    var horizontalLineHeight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['lineHeight'] */ js.Any = js.native
    
    /**
      * @desc 图标与文字间距
      * @descEN Spacing between icon and text
      */
    var iconMarginInlineEnd: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginInlineEnd'] */ js.Any = js.native
    
    /**
      * @desc 图标尺寸
      * @descEN Size of icon
      */
    var iconSize: Double = js.native
    
    /**
      * @desc 菜单项激活态背景色
      * @descEN Background color of menu item when active
      */
    var itemActiveBg: String = js.native
    
    /**
      * @desc 菜单项背景色
      */
    var itemBg: String = js.native
    
    /**
      * @desc 菜单项的圆角
      * @descEN Radius of menu item
      */
    var itemBorderRadius: Double = js.native
    
    /**
      * @desc 菜单项文字颜色
      * @descEN Color of menu item text
      */
    var itemColor: String = js.native
    
    /**
      * @desc 菜单项文字禁用颜色
      * @descEN Color of disabled menu item text
      */
    var itemDisabledColor: String = js.native
    
    /**
      * @desc 菜单项高度
      * @descEN Height of menu item
      */
    var itemHeight: Double = js.native
    
    /**
      * @desc 菜单项悬浮态背景色
      * @descEN Background color of menu item when hover
      */
    var itemHoverBg: String = js.native
    
    /**
      * @desc 菜单项文字悬浮颜色
      * @descEN Hover color of menu item text
      */
    var itemHoverColor: String = js.native
    
    /**
      * @desc 菜单项纵向外间距
      * @descEN margin-block of menu item
      */
    var itemMarginBlock: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginBlock'] */ js.Any = js.native
    
    /**
      * @desc 菜单项横向外间距
      * @descEN Horizontal margin of menu item
      */
    var itemMarginInline: Double = js.native
    
    /**
      * @desc 菜单项横向内间距
      * @descEN padding-inline of menu item
      */
    var itemPaddingInline: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any = js.native
    
    /**
      * @desc 菜单项选中态背景色
      * @descEN Background color of menu item when selected
      */
    var itemSelectedBg: String = js.native
    
    /**
      * @desc 菜单项文字选中颜色
      * @descEN Color of selected menu item text
      */
    var itemSelectedColor: String = js.native
    
    /**
      * @desc 弹出框背景色
      * @descEN Background color of popup
      */
    var popupBg: String = js.native
    
    /** @deprecated Use `itemBorderRadius` instead */
    var radiusItem: Double = js.native
    
    /** @deprecated Use `subMenuItemBorderRadius` instead */
    var radiusSubMenuItem: Double = js.native
    
    /**
      * @desc 子菜单项背景色
      * @descEN Background color of sub-menu item
      */
    var subMenuItemBg: String = js.native
    
    /**
      * @desc 子菜单项的圆角
      * @descEN Radius of sub-menu item
      */
    var subMenuItemBorderRadius: Double = js.native
    
    /**
      * @desc 弹出菜单的 z-index
      * @descEN z-index of popup menu
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      activeBarBorderWidth: Double,
      activeBarHeight: Double,
      activeBarWidth: Double,
      collapsedIconSize: Double,
      collapsedWidth: Double,
      colorActiveBarBorderSize: Double,
      colorActiveBarHeight: Double,
      colorActiveBarWidth: Double,
      colorDangerItemBgActive: String,
      colorDangerItemBgSelected: String,
      colorDangerItemText: String,
      colorDangerItemTextHover: String,
      colorDangerItemTextSelected: String,
      colorGroupTitle: String,
      colorItemBg: String,
      colorItemBgActive: String,
      colorItemBgHover: String,
      colorItemBgSelected: String,
      colorItemBgSelectedHorizontal: String,
      colorItemText: String,
      colorItemTextDisabled: String,
      colorItemTextHover: String,
      colorItemTextHoverHorizontal: String,
      colorItemTextSelected: String,
      colorItemTextSelectedHorizontal: String,
      colorSubItemBg: String,
      dangerItemActiveBg: String,
      dangerItemColor: String,
      dangerItemHoverColor: String,
      dangerItemSelectedBg: String,
      dangerItemSelectedColor: String,
      darkDangerItemActiveBg: String,
      darkDangerItemColor: String,
      darkDangerItemHoverColor: String,
      darkDangerItemSelectedBg: String,
      darkDangerItemSelectedColor: String,
      darkGroupTitleColor: String,
      darkItemBg: String,
      darkItemColor: String,
      darkItemDisabledColor: String,
      darkItemHoverBg: String,
      darkItemHoverColor: String,
      darkItemSelectedBg: String,
      darkItemSelectedColor: String,
      darkSubMenuItemBg: String,
      dropdownWidth: Double,
      groupTitleColor: String,
      groupTitleFontSize: Double,
      groupTitleLineHeight: String | Double,
      horizontalItemBorderRadius: Double,
      horizontalItemHoverBg: String,
      horizontalItemHoverColor: String,
      horizontalItemSelectedBg: String,
      horizontalItemSelectedColor: String,
      horizontalLineHeight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['lineHeight'] */ js.Any,
      iconMarginInlineEnd: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginInlineEnd'] */ js.Any,
      iconSize: Double,
      itemActiveBg: String,
      itemBg: String,
      itemBorderRadius: Double,
      itemColor: String,
      itemDisabledColor: String,
      itemHeight: Double,
      itemHoverBg: String,
      itemHoverColor: String,
      itemMarginBlock: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginBlock'] */ js.Any,
      itemMarginInline: Double,
      itemPaddingInline: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any,
      itemSelectedBg: String,
      itemSelectedColor: String,
      popupBg: String,
      radiusItem: Double,
      radiusSubMenuItem: Double,
      subMenuItemBg: String,
      subMenuItemBorderRadius: Double,
      zIndexPopup: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(activeBarBorderWidth = activeBarBorderWidth.asInstanceOf[js.Any], activeBarHeight = activeBarHeight.asInstanceOf[js.Any], activeBarWidth = activeBarWidth.asInstanceOf[js.Any], collapsedIconSize = collapsedIconSize.asInstanceOf[js.Any], collapsedWidth = collapsedWidth.asInstanceOf[js.Any], colorActiveBarBorderSize = colorActiveBarBorderSize.asInstanceOf[js.Any], colorActiveBarHeight = colorActiveBarHeight.asInstanceOf[js.Any], colorActiveBarWidth = colorActiveBarWidth.asInstanceOf[js.Any], colorDangerItemBgActive = colorDangerItemBgActive.asInstanceOf[js.Any], colorDangerItemBgSelected = colorDangerItemBgSelected.asInstanceOf[js.Any], colorDangerItemText = colorDangerItemText.asInstanceOf[js.Any], colorDangerItemTextHover = colorDangerItemTextHover.asInstanceOf[js.Any], colorDangerItemTextSelected = colorDangerItemTextSelected.asInstanceOf[js.Any], colorGroupTitle = colorGroupTitle.asInstanceOf[js.Any], colorItemBg = colorItemBg.asInstanceOf[js.Any], colorItemBgActive = colorItemBgActive.asInstanceOf[js.Any], colorItemBgHover = colorItemBgHover.asInstanceOf[js.Any], colorItemBgSelected = colorItemBgSelected.asInstanceOf[js.Any], colorItemBgSelectedHorizontal = colorItemBgSelectedHorizontal.asInstanceOf[js.Any], colorItemText = colorItemText.asInstanceOf[js.Any], colorItemTextDisabled = colorItemTextDisabled.asInstanceOf[js.Any], colorItemTextHover = colorItemTextHover.asInstanceOf[js.Any], colorItemTextHoverHorizontal = colorItemTextHoverHorizontal.asInstanceOf[js.Any], colorItemTextSelected = colorItemTextSelected.asInstanceOf[js.Any], colorItemTextSelectedHorizontal = colorItemTextSelectedHorizontal.asInstanceOf[js.Any], colorSubItemBg = colorSubItemBg.asInstanceOf[js.Any], dangerItemActiveBg = dangerItemActiveBg.asInstanceOf[js.Any], dangerItemColor = dangerItemColor.asInstanceOf[js.Any], dangerItemHoverColor = dangerItemHoverColor.asInstanceOf[js.Any], dangerItemSelectedBg = dangerItemSelectedBg.asInstanceOf[js.Any], dangerItemSelectedColor = dangerItemSelectedColor.asInstanceOf[js.Any], darkDangerItemActiveBg = darkDangerItemActiveBg.asInstanceOf[js.Any], darkDangerItemColor = darkDangerItemColor.asInstanceOf[js.Any], darkDangerItemHoverColor = darkDangerItemHoverColor.asInstanceOf[js.Any], darkDangerItemSelectedBg = darkDangerItemSelectedBg.asInstanceOf[js.Any], darkDangerItemSelectedColor = darkDangerItemSelectedColor.asInstanceOf[js.Any], darkGroupTitleColor = darkGroupTitleColor.asInstanceOf[js.Any], darkItemBg = darkItemBg.asInstanceOf[js.Any], darkItemColor = darkItemColor.asInstanceOf[js.Any], darkItemDisabledColor = darkItemDisabledColor.asInstanceOf[js.Any], darkItemHoverBg = darkItemHoverBg.asInstanceOf[js.Any], darkItemHoverColor = darkItemHoverColor.asInstanceOf[js.Any], darkItemSelectedBg = darkItemSelectedBg.asInstanceOf[js.Any], darkItemSelectedColor = darkItemSelectedColor.asInstanceOf[js.Any], darkSubMenuItemBg = darkSubMenuItemBg.asInstanceOf[js.Any], dropdownWidth = dropdownWidth.asInstanceOf[js.Any], groupTitleColor = groupTitleColor.asInstanceOf[js.Any], groupTitleFontSize = groupTitleFontSize.asInstanceOf[js.Any], groupTitleLineHeight = groupTitleLineHeight.asInstanceOf[js.Any], horizontalItemBorderRadius = horizontalItemBorderRadius.asInstanceOf[js.Any], horizontalItemHoverBg = horizontalItemHoverBg.asInstanceOf[js.Any], horizontalItemHoverColor = horizontalItemHoverColor.asInstanceOf[js.Any], horizontalItemSelectedBg = horizontalItemSelectedBg.asInstanceOf[js.Any], horizontalItemSelectedColor = horizontalItemSelectedColor.asInstanceOf[js.Any], horizontalLineHeight = horizontalLineHeight.asInstanceOf[js.Any], iconMarginInlineEnd = iconMarginInlineEnd.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], itemActiveBg = itemActiveBg.asInstanceOf[js.Any], itemBg = itemBg.asInstanceOf[js.Any], itemBorderRadius = itemBorderRadius.asInstanceOf[js.Any], itemColor = itemColor.asInstanceOf[js.Any], itemDisabledColor = itemDisabledColor.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemHoverBg = itemHoverBg.asInstanceOf[js.Any], itemHoverColor = itemHoverColor.asInstanceOf[js.Any], itemMarginBlock = itemMarginBlock.asInstanceOf[js.Any], itemMarginInline = itemMarginInline.asInstanceOf[js.Any], itemPaddingInline = itemPaddingInline.asInstanceOf[js.Any], itemSelectedBg = itemSelectedBg.asInstanceOf[js.Any], itemSelectedColor = itemSelectedColor.asInstanceOf[js.Any], popupBg = popupBg.asInstanceOf[js.Any], radiusItem = radiusItem.asInstanceOf[js.Any], radiusSubMenuItem = radiusSubMenuItem.asInstanceOf[js.Any], subMenuItemBg = subMenuItemBg.asInstanceOf[js.Any], subMenuItemBorderRadius = subMenuItemBorderRadius.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveBarBorderWidth(value: Double): Self = StObject.set(x, "activeBarBorderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveBarHeight(value: Double): Self = StObject.set(x, "activeBarHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveBarWidth(value: Double): Self = StObject.set(x, "activeBarWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedIconSize(value: Double): Self = StObject.set(x, "collapsedIconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedWidth(value: Double): Self = StObject.set(x, "collapsedWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorActiveBarBorderSize(value: Double): Self = StObject.set(x, "colorActiveBarBorderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorActiveBarHeight(value: Double): Self = StObject.set(x, "colorActiveBarHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorActiveBarWidth(value: Double): Self = StObject.set(x, "colorActiveBarWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorDangerItemBgActive(value: String): Self = StObject.set(x, "colorDangerItemBgActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorDangerItemBgSelected(value: String): Self = StObject.set(x, "colorDangerItemBgSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorDangerItemText(value: String): Self = StObject.set(x, "colorDangerItemText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorDangerItemTextHover(value: String): Self = StObject.set(x, "colorDangerItemTextHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorDangerItemTextSelected(value: String): Self = StObject.set(x, "colorDangerItemTextSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorGroupTitle(value: String): Self = StObject.set(x, "colorGroupTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorItemBg(value: String): Self = StObject.set(x, "colorItemBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorItemBgActive(value: String): Self = StObject.set(x, "colorItemBgActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorItemBgHover(value: String): Self = StObject.set(x, "colorItemBgHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorItemBgSelected(value: String): Self = StObject.set(x, "colorItemBgSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorItemBgSelectedHorizontal(value: String): Self = StObject.set(x, "colorItemBgSelectedHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorItemText(value: String): Self = StObject.set(x, "colorItemText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorItemTextDisabled(value: String): Self = StObject.set(x, "colorItemTextDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorItemTextHover(value: String): Self = StObject.set(x, "colorItemTextHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorItemTextHoverHorizontal(value: String): Self = StObject.set(x, "colorItemTextHoverHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorItemTextSelected(value: String): Self = StObject.set(x, "colorItemTextSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorItemTextSelectedHorizontal(value: String): Self = StObject.set(x, "colorItemTextSelectedHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSubItemBg(value: String): Self = StObject.set(x, "colorSubItemBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerItemActiveBg(value: String): Self = StObject.set(x, "dangerItemActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerItemColor(value: String): Self = StObject.set(x, "dangerItemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerItemHoverColor(value: String): Self = StObject.set(x, "dangerItemHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerItemSelectedBg(value: String): Self = StObject.set(x, "dangerItemSelectedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerItemSelectedColor(value: String): Self = StObject.set(x, "dangerItemSelectedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkDangerItemActiveBg(value: String): Self = StObject.set(x, "darkDangerItemActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkDangerItemColor(value: String): Self = StObject.set(x, "darkDangerItemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkDangerItemHoverColor(value: String): Self = StObject.set(x, "darkDangerItemHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkDangerItemSelectedBg(value: String): Self = StObject.set(x, "darkDangerItemSelectedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkDangerItemSelectedColor(value: String): Self = StObject.set(x, "darkDangerItemSelectedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkGroupTitleColor(value: String): Self = StObject.set(x, "darkGroupTitleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkItemBg(value: String): Self = StObject.set(x, "darkItemBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkItemColor(value: String): Self = StObject.set(x, "darkItemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkItemDisabledColor(value: String): Self = StObject.set(x, "darkItemDisabledColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkItemHoverBg(value: String): Self = StObject.set(x, "darkItemHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkItemHoverColor(value: String): Self = StObject.set(x, "darkItemHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkItemSelectedBg(value: String): Self = StObject.set(x, "darkItemSelectedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkItemSelectedColor(value: String): Self = StObject.set(x, "darkItemSelectedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkSubMenuItemBg(value: String): Self = StObject.set(x, "darkSubMenuItemBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownWidth(value: Double): Self = StObject.set(x, "dropdownWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupTitleColor(value: String): Self = StObject.set(x, "groupTitleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupTitleFontSize(value: Double): Self = StObject.set(x, "groupTitleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupTitleLineHeight(value: String | Double): Self = StObject.set(x, "groupTitleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalItemBorderRadius(value: Double): Self = StObject.set(x, "horizontalItemBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalItemHoverBg(value: String): Self = StObject.set(x, "horizontalItemHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalItemHoverColor(value: String): Self = StObject.set(x, "horizontalItemHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalItemSelectedBg(value: String): Self = StObject.set(x, "horizontalItemSelectedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalItemSelectedColor(value: String): Self = StObject.set(x, "horizontalItemSelectedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['lineHeight'] */ js.Any
      ): Self = StObject.set(x, "horizontalLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconMarginInlineEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginInlineEnd'] */ js.Any
      ): Self = StObject.set(x, "iconMarginInlineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemActiveBg(value: String): Self = StObject.set(x, "itemActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemBg(value: String): Self = StObject.set(x, "itemBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemBorderRadius(value: Double): Self = StObject.set(x, "itemBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemDisabledColor(value: String): Self = StObject.set(x, "itemDisabledColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHoverBg(value: String): Self = StObject.set(x, "itemHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHoverColor(value: String): Self = StObject.set(x, "itemHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemMarginBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginBlock'] */ js.Any
      ): Self = StObject.set(x, "itemMarginBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemMarginInline(value: Double): Self = StObject.set(x, "itemMarginInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPaddingInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any
      ): Self = StObject.set(x, "itemPaddingInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSelectedBg(value: String): Self = StObject.set(x, "itemSelectedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSelectedColor(value: String): Self = StObject.set(x, "itemSelectedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupBg(value: String): Self = StObject.set(x, "popupBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusItem(value: Double): Self = StObject.set(x, "radiusItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusSubMenuItem(value: Double): Self = StObject.set(x, "radiusSubMenuItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuItemBg(value: String): Self = StObject.set(x, "subMenuItemBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuItemBorderRadius(value: Double): Self = StObject.set(x, "subMenuItemBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Menu'] */ @js.native
  trait MenuToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var menuArrowOffset: Double | String = js.native
    
    var menuArrowSize: Double | String = js.native
    
    var menuHorizontalHeight: Double | String = js.native
    
    var menuPanelMaskInset: Double = js.native
    
    var menuSubMenuBg: String = js.native
  }
  object MenuToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      menuArrowOffset: Double | String,
      menuArrowSize: Double | String,
      menuHorizontalHeight: Double | String,
      menuPanelMaskInset: Double,
      menuSubMenuBg: String
    ): MenuToken = {
      val __obj = js.Dynamic.literal(menuArrowOffset = menuArrowOffset.asInstanceOf[js.Any], menuArrowSize = menuArrowSize.asInstanceOf[js.Any], menuHorizontalHeight = menuHorizontalHeight.asInstanceOf[js.Any], menuPanelMaskInset = menuPanelMaskInset.asInstanceOf[js.Any], menuSubMenuBg = menuSubMenuBg.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[MenuToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MenuToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMenuArrowOffset(value: Double | String): Self = StObject.set(x, "menuArrowOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuArrowSize(value: Double | String): Self = StObject.set(x, "menuArrowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHorizontalHeight(value: Double | String): Self = StObject.set(x, "menuHorizontalHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPanelMaskInset(value: Double): Self = StObject.set(x, "menuPanelMaskInset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuSubMenuBg(value: String): Self = StObject.set(x, "menuSubMenuBg", value.asInstanceOf[js.Any])
    }
  }
}
