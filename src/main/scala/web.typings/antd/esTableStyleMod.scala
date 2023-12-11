package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Table
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableStyleMod {
  
  @JSImport("antd/es/table/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/table/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Table] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 表格排序列背景色
      * @descEN Background color of table sorted column
      */
    var bodySortBg: String = js.native
    
    /**
      * @desc 表格边框/分割线颜色
      * @descEN Border color of table
      */
    var borderColor: String = js.native
    
    /**
      * @desc 单元格文字大小（默认大尺寸）
      * @descEN Font size of table cell (large size by default)
      */
    var cellFontSize: Double = js.native
    
    /**
      * @desc 单元格文字大小（中等尺寸）
      * @descEN Font size of table cell (middle size)
      */
    var cellFontSizeMD: Double = js.native
    
    /**
      * @desc 单元格文字大小（小尺寸）
      * @descEN Font size of table cell (small size)
      */
    var cellFontSizeSM: Double = js.native
    
    /**
      * @desc 单元格纵向内间距
      * @descEN Vertical padding of table cell
      */
    var cellPaddingBlock: Double = js.native
    
    /**
      * @desc 单元格纵向内间距（中等尺寸）
      * @descEN Vertical padding of table cell (middle size)
      */
    var cellPaddingBlockMD: Double = js.native
    
    /**
      * @desc 单元格纵向内间距（小尺寸）
      * @descEN Vertical padding of table cell (small size)
      */
    var cellPaddingBlockSM: Double = js.native
    
    /**
      * @desc 单元格横向内间距（默认大尺寸）
      * @descEN Horizontal padding of table cell (large size by default)
      */
    var cellPaddingInline: Double = js.native
    
    /**
      * @desc 单元格横向内间距（中等尺寸）
      * @descEN Horizontal padding of table cell (middle size)
      */
    var cellPaddingInlineMD: Double = js.native
    
    /**
      * @desc 单元格横向内间距（小尺寸）
      * @descEN Horizontal padding of table cell (small size)
      */
    var cellPaddingInlineSM: Double = js.native
    
    /**
      * @desc 展开按钮背景色
      * @descEN Background of expand button
      */
    var expandIconBg: String = js.native
    
    /**
      * @desc 过滤下拉菜单颜色
      * @descEN Color of filter dropdown
      */
    var filterDropdownBg: String = js.native
    
    /**
      * @desc 过滤下拉菜单选项背景
      * @descEN Background of filter dropdown menu item
      */
    var filterDropdownMenuBg: String = js.native
    
    /**
      * @desc 固定表头排序激活态背景色
      * @descEN Background color of fixed table header when sorted
      */
    var fixedHeaderSortActiveBg: String = js.native
    
    /**
      * @desc 表格底部背景色
      * @descEN Background of footer
      */
    var footerBg: String = js.native
    
    /**
      * @desc 表格底部文字颜色
      * @descEN Color of footer text
      */
    var footerColor: String = js.native
    
    /**
      * @desc 表头背景
      * @descEN Background of table header
      */
    var headerBg: String = js.native
    
    /**
      * @desc 表头圆角
      * @descEN Border radius of table header
      */
    var headerBorderRadius: Double = js.native
    
    /**
      * @desc 表头文字颜色
      * @descEN Color of table header text
      */
    var headerColor: String = js.native
    
    /**
      * @desc 表头过滤按钮悬浮背景色
      * @descEN Background color of table header filter button when hovered
      */
    var headerFilterHoverBg: String = js.native
    
    /**
      * @desc 表头排序激活态背景色
      * @descEN Background color of table header when sorted
      */
    var headerSortActiveBg: String = js.native
    
    /**
      * @desc 表头排序激活态悬浮背景色
      * @descEN Background color of table header when sorted and hovered
      */
    var headerSortHoverBg: String = js.native
    
    /**
      * @desc 表头分割线颜色
      * @descEN Split border color of table header
      */
    var headerSplitColor: String = js.native
    
    /**
      * @desc 表格行展开背景色
      * @descEN Background color of table expanded row
      */
    var rowExpandedBg: String = js.native
    
    /**
      * @desc 表格行悬浮背景色
      * @descEN Background color of table hovered row
      */
    var rowHoverBg: String = js.native
    
    /**
      * @desc 表格行选中背景色
      * @descEN Background color of table selected row
      */
    var rowSelectedBg: String = js.native
    
    /**
      * @desc 表格行选中悬浮背景色
      * @descEN Background color of table selected row when hovered
      */
    var rowSelectedHoverBg: String = js.native
    
    /**
      * @desc 选择列宽度
      * @descEN Width of selection column
      */
    var selectionColumnWidth: Double = js.native
    
    /**
      * @desc Sticky 模式下滚动条背景色
      * @descEN Background of sticky scrollbar
      */
    var stickyScrollBarBg: String = js.native
    
    /**
      * @desc Sticky 模式下滚动条圆角
      * @descEN Border radius of sticky scrollbar
      */
    var stickyScrollBarBorderRadius: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      bodySortBg: String,
      borderColor: String,
      cellFontSize: Double,
      cellFontSizeMD: Double,
      cellFontSizeSM: Double,
      cellPaddingBlock: Double,
      cellPaddingBlockMD: Double,
      cellPaddingBlockSM: Double,
      cellPaddingInline: Double,
      cellPaddingInlineMD: Double,
      cellPaddingInlineSM: Double,
      expandIconBg: String,
      filterDropdownBg: String,
      filterDropdownMenuBg: String,
      fixedHeaderSortActiveBg: String,
      footerBg: String,
      footerColor: String,
      headerBg: String,
      headerBorderRadius: Double,
      headerColor: String,
      headerFilterHoverBg: String,
      headerSortActiveBg: String,
      headerSortHoverBg: String,
      headerSplitColor: String,
      rowExpandedBg: String,
      rowHoverBg: String,
      rowSelectedBg: String,
      rowSelectedHoverBg: String,
      selectionColumnWidth: Double,
      stickyScrollBarBg: String,
      stickyScrollBarBorderRadius: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(bodySortBg = bodySortBg.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], cellFontSize = cellFontSize.asInstanceOf[js.Any], cellFontSizeMD = cellFontSizeMD.asInstanceOf[js.Any], cellFontSizeSM = cellFontSizeSM.asInstanceOf[js.Any], cellPaddingBlock = cellPaddingBlock.asInstanceOf[js.Any], cellPaddingBlockMD = cellPaddingBlockMD.asInstanceOf[js.Any], cellPaddingBlockSM = cellPaddingBlockSM.asInstanceOf[js.Any], cellPaddingInline = cellPaddingInline.asInstanceOf[js.Any], cellPaddingInlineMD = cellPaddingInlineMD.asInstanceOf[js.Any], cellPaddingInlineSM = cellPaddingInlineSM.asInstanceOf[js.Any], expandIconBg = expandIconBg.asInstanceOf[js.Any], filterDropdownBg = filterDropdownBg.asInstanceOf[js.Any], filterDropdownMenuBg = filterDropdownMenuBg.asInstanceOf[js.Any], fixedHeaderSortActiveBg = fixedHeaderSortActiveBg.asInstanceOf[js.Any], footerBg = footerBg.asInstanceOf[js.Any], footerColor = footerColor.asInstanceOf[js.Any], headerBg = headerBg.asInstanceOf[js.Any], headerBorderRadius = headerBorderRadius.asInstanceOf[js.Any], headerColor = headerColor.asInstanceOf[js.Any], headerFilterHoverBg = headerFilterHoverBg.asInstanceOf[js.Any], headerSortActiveBg = headerSortActiveBg.asInstanceOf[js.Any], headerSortHoverBg = headerSortHoverBg.asInstanceOf[js.Any], headerSplitColor = headerSplitColor.asInstanceOf[js.Any], rowExpandedBg = rowExpandedBg.asInstanceOf[js.Any], rowHoverBg = rowHoverBg.asInstanceOf[js.Any], rowSelectedBg = rowSelectedBg.asInstanceOf[js.Any], rowSelectedHoverBg = rowSelectedHoverBg.asInstanceOf[js.Any], selectionColumnWidth = selectionColumnWidth.asInstanceOf[js.Any], stickyScrollBarBg = stickyScrollBarBg.asInstanceOf[js.Any], stickyScrollBarBorderRadius = stickyScrollBarBorderRadius.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodySortBg(value: String): Self = StObject.set(x, "bodySortBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellFontSize(value: Double): Self = StObject.set(x, "cellFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellFontSizeMD(value: Double): Self = StObject.set(x, "cellFontSizeMD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellFontSizeSM(value: Double): Self = StObject.set(x, "cellFontSizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingBlock(value: Double): Self = StObject.set(x, "cellPaddingBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingBlockMD(value: Double): Self = StObject.set(x, "cellPaddingBlockMD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingBlockSM(value: Double): Self = StObject.set(x, "cellPaddingBlockSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingInline(value: Double): Self = StObject.set(x, "cellPaddingInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingInlineMD(value: Double): Self = StObject.set(x, "cellPaddingInlineMD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingInlineSM(value: Double): Self = StObject.set(x, "cellPaddingInlineSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconBg(value: String): Self = StObject.set(x, "expandIconBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDropdownBg(value: String): Self = StObject.set(x, "filterDropdownBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDropdownMenuBg(value: String): Self = StObject.set(x, "filterDropdownMenuBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderSortActiveBg(value: String): Self = StObject.set(x, "fixedHeaderSortActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterBg(value: String): Self = StObject.set(x, "footerBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterColor(value: String): Self = StObject.set(x, "footerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderBg(value: String): Self = StObject.set(x, "headerBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderBorderRadius(value: Double): Self = StObject.set(x, "headerBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderColor(value: String): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterHoverBg(value: String): Self = StObject.set(x, "headerFilterHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSortActiveBg(value: String): Self = StObject.set(x, "headerSortActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSortHoverBg(value: String): Self = StObject.set(x, "headerSortHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSplitColor(value: String): Self = StObject.set(x, "headerSplitColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowExpandedBg(value: String): Self = StObject.set(x, "rowExpandedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHoverBg(value: String): Self = StObject.set(x, "rowHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSelectedBg(value: String): Self = StObject.set(x, "rowSelectedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSelectedHoverBg(value: String): Self = StObject.set(x, "rowSelectedHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionColumnWidth(value: Double): Self = StObject.set(x, "selectionColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyScrollBarBg(value: String): Self = StObject.set(x, "stickyScrollBarBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyScrollBarBorderRadius(value: Double): Self = StObject.set(x, "stickyScrollBarBorderRadius", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Table'] */ @js.native
  trait TableToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var tableBg: String = js.native
    
    var tableBodySortBg: String = js.native
    
    var tableBorderColor: String = js.native
    
    var tableExpandColumnWidth: Double | String = js.native
    
    var tableExpandIconBg: String = js.native
    
    var tableExpandedRowBg: String = js.native
    
    var tableFilterDropdownBg: String = js.native
    
    var tableFilterDropdownHeight: Double = js.native
    
    var tableFilterDropdownSearchWidth: Double = js.native
    
    var tableFilterDropdownWidth: Double = js.native
    
    var tableFixedHeaderSortActiveBg: String = js.native
    
    var tableFontSize: Double = js.native
    
    var tableFontSizeMiddle: Double = js.native
    
    var tableFontSizeSmall: Double = js.native
    
    var tableFooterBg: String = js.native
    
    var tableFooterTextColor: String = js.native
    
    var tableHeaderBg: String = js.native
    
    var tableHeaderCellSplitColor: String = js.native
    
    var tableHeaderFilterActiveBg: String = js.native
    
    var tableHeaderSortBg: String = js.native
    
    var tableHeaderSortHoverBg: String = js.native
    
    var tableHeaderTextColor: String = js.native
    
    var tablePaddingHorizontal: Double = js.native
    
    var tablePaddingHorizontalMiddle: Double = js.native
    
    var tablePaddingHorizontalSmall: Double = js.native
    
    var tablePaddingVertical: Double = js.native
    
    var tablePaddingVerticalMiddle: Double = js.native
    
    var tablePaddingVerticalSmall: Double = js.native
    
    var tableRadius: Double = js.native
    
    var tableRowHoverBg: String = js.native
    
    var tableScrollBg: String = js.native
    
    var tableScrollThumbBg: String = js.native
    
    var tableScrollThumbBgHover: String = js.native
    
    var tableScrollThumbSize: Double = js.native
    
    var tableSelectedRowBg: String = js.native
    
    var tableSelectedRowHoverBg: String = js.native
    
    var tableSelectionColumnWidth: Double = js.native
    
    var zIndexTableFixed: Double = js.native
    
    var zIndexTableSticky: Double | String = js.native
  }
  object TableToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      tableBg: String,
      tableBodySortBg: String,
      tableBorderColor: String,
      tableExpandColumnWidth: Double | String,
      tableExpandIconBg: String,
      tableExpandedRowBg: String,
      tableFilterDropdownBg: String,
      tableFilterDropdownHeight: Double,
      tableFilterDropdownSearchWidth: Double,
      tableFilterDropdownWidth: Double,
      tableFixedHeaderSortActiveBg: String,
      tableFontSize: Double,
      tableFontSizeMiddle: Double,
      tableFontSizeSmall: Double,
      tableFooterBg: String,
      tableFooterTextColor: String,
      tableHeaderBg: String,
      tableHeaderCellSplitColor: String,
      tableHeaderFilterActiveBg: String,
      tableHeaderSortBg: String,
      tableHeaderSortHoverBg: String,
      tableHeaderTextColor: String,
      tablePaddingHorizontal: Double,
      tablePaddingHorizontalMiddle: Double,
      tablePaddingHorizontalSmall: Double,
      tablePaddingVertical: Double,
      tablePaddingVerticalMiddle: Double,
      tablePaddingVerticalSmall: Double,
      tableRadius: Double,
      tableRowHoverBg: String,
      tableScrollBg: String,
      tableScrollThumbBg: String,
      tableScrollThumbBgHover: String,
      tableScrollThumbSize: Double,
      tableSelectedRowBg: String,
      tableSelectedRowHoverBg: String,
      tableSelectionColumnWidth: Double,
      zIndexTableFixed: Double,
      zIndexTableSticky: Double | String
    ): TableToken = {
      val __obj = js.Dynamic.literal(tableBg = tableBg.asInstanceOf[js.Any], tableBodySortBg = tableBodySortBg.asInstanceOf[js.Any], tableBorderColor = tableBorderColor.asInstanceOf[js.Any], tableExpandColumnWidth = tableExpandColumnWidth.asInstanceOf[js.Any], tableExpandIconBg = tableExpandIconBg.asInstanceOf[js.Any], tableExpandedRowBg = tableExpandedRowBg.asInstanceOf[js.Any], tableFilterDropdownBg = tableFilterDropdownBg.asInstanceOf[js.Any], tableFilterDropdownHeight = tableFilterDropdownHeight.asInstanceOf[js.Any], tableFilterDropdownSearchWidth = tableFilterDropdownSearchWidth.asInstanceOf[js.Any], tableFilterDropdownWidth = tableFilterDropdownWidth.asInstanceOf[js.Any], tableFixedHeaderSortActiveBg = tableFixedHeaderSortActiveBg.asInstanceOf[js.Any], tableFontSize = tableFontSize.asInstanceOf[js.Any], tableFontSizeMiddle = tableFontSizeMiddle.asInstanceOf[js.Any], tableFontSizeSmall = tableFontSizeSmall.asInstanceOf[js.Any], tableFooterBg = tableFooterBg.asInstanceOf[js.Any], tableFooterTextColor = tableFooterTextColor.asInstanceOf[js.Any], tableHeaderBg = tableHeaderBg.asInstanceOf[js.Any], tableHeaderCellSplitColor = tableHeaderCellSplitColor.asInstanceOf[js.Any], tableHeaderFilterActiveBg = tableHeaderFilterActiveBg.asInstanceOf[js.Any], tableHeaderSortBg = tableHeaderSortBg.asInstanceOf[js.Any], tableHeaderSortHoverBg = tableHeaderSortHoverBg.asInstanceOf[js.Any], tableHeaderTextColor = tableHeaderTextColor.asInstanceOf[js.Any], tablePaddingHorizontal = tablePaddingHorizontal.asInstanceOf[js.Any], tablePaddingHorizontalMiddle = tablePaddingHorizontalMiddle.asInstanceOf[js.Any], tablePaddingHorizontalSmall = tablePaddingHorizontalSmall.asInstanceOf[js.Any], tablePaddingVertical = tablePaddingVertical.asInstanceOf[js.Any], tablePaddingVerticalMiddle = tablePaddingVerticalMiddle.asInstanceOf[js.Any], tablePaddingVerticalSmall = tablePaddingVerticalSmall.asInstanceOf[js.Any], tableRadius = tableRadius.asInstanceOf[js.Any], tableRowHoverBg = tableRowHoverBg.asInstanceOf[js.Any], tableScrollBg = tableScrollBg.asInstanceOf[js.Any], tableScrollThumbBg = tableScrollThumbBg.asInstanceOf[js.Any], tableScrollThumbBgHover = tableScrollThumbBgHover.asInstanceOf[js.Any], tableScrollThumbSize = tableScrollThumbSize.asInstanceOf[js.Any], tableSelectedRowBg = tableSelectedRowBg.asInstanceOf[js.Any], tableSelectedRowHoverBg = tableSelectedRowHoverBg.asInstanceOf[js.Any], tableSelectionColumnWidth = tableSelectionColumnWidth.asInstanceOf[js.Any], zIndexTableFixed = zIndexTableFixed.asInstanceOf[js.Any], zIndexTableSticky = zIndexTableSticky.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[TableToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TableToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableBg(value: String): Self = StObject.set(x, "tableBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBodySortBg(value: String): Self = StObject.set(x, "tableBodySortBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBorderColor(value: String): Self = StObject.set(x, "tableBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableExpandColumnWidth(value: Double | String): Self = StObject.set(x, "tableExpandColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableExpandIconBg(value: String): Self = StObject.set(x, "tableExpandIconBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableExpandedRowBg(value: String): Self = StObject.set(x, "tableExpandedRowBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableFilterDropdownBg(value: String): Self = StObject.set(x, "tableFilterDropdownBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableFilterDropdownHeight(value: Double): Self = StObject.set(x, "tableFilterDropdownHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableFilterDropdownSearchWidth(value: Double): Self = StObject.set(x, "tableFilterDropdownSearchWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableFilterDropdownWidth(value: Double): Self = StObject.set(x, "tableFilterDropdownWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableFixedHeaderSortActiveBg(value: String): Self = StObject.set(x, "tableFixedHeaderSortActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableFontSize(value: Double): Self = StObject.set(x, "tableFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableFontSizeMiddle(value: Double): Self = StObject.set(x, "tableFontSizeMiddle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableFontSizeSmall(value: Double): Self = StObject.set(x, "tableFontSizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableFooterBg(value: String): Self = StObject.set(x, "tableFooterBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableFooterTextColor(value: String): Self = StObject.set(x, "tableFooterTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderBg(value: String): Self = StObject.set(x, "tableHeaderBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderCellSplitColor(value: String): Self = StObject.set(x, "tableHeaderCellSplitColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderFilterActiveBg(value: String): Self = StObject.set(x, "tableHeaderFilterActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderSortBg(value: String): Self = StObject.set(x, "tableHeaderSortBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderSortHoverBg(value: String): Self = StObject.set(x, "tableHeaderSortHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderTextColor(value: String): Self = StObject.set(x, "tableHeaderTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablePaddingHorizontal(value: Double): Self = StObject.set(x, "tablePaddingHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablePaddingHorizontalMiddle(value: Double): Self = StObject.set(x, "tablePaddingHorizontalMiddle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablePaddingHorizontalSmall(value: Double): Self = StObject.set(x, "tablePaddingHorizontalSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablePaddingVertical(value: Double): Self = StObject.set(x, "tablePaddingVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablePaddingVerticalMiddle(value: Double): Self = StObject.set(x, "tablePaddingVerticalMiddle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablePaddingVerticalSmall(value: Double): Self = StObject.set(x, "tablePaddingVerticalSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableRadius(value: Double): Self = StObject.set(x, "tableRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableRowHoverBg(value: String): Self = StObject.set(x, "tableRowHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableScrollBg(value: String): Self = StObject.set(x, "tableScrollBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableScrollThumbBg(value: String): Self = StObject.set(x, "tableScrollThumbBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableScrollThumbBgHover(value: String): Self = StObject.set(x, "tableScrollThumbBgHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableScrollThumbSize(value: Double): Self = StObject.set(x, "tableScrollThumbSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableSelectedRowBg(value: String): Self = StObject.set(x, "tableSelectedRowBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableSelectedRowHoverBg(value: String): Self = StObject.set(x, "tableSelectedRowHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableSelectionColumnWidth(value: Double): Self = StObject.set(x, "tableSelectionColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexTableFixed(value: Double): Self = StObject.set(x, "zIndexTableFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexTableSticky(value: Double | String): Self = StObject.set(x, "zIndexTableSticky", value.asInstanceOf[js.Any])
    }
  }
}
