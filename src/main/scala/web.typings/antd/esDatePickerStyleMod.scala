package web.typings.antd

import web.typings.antd.antdStrings.DatePicker
import web.typings.antd.esStyleRoundedArrowMod.ArrowToken
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.TokenWithCommonCls
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDatePickerStyleMod {
  
  @JSImport("antd/es/date-picker/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @scala.inline
  def genPanelStyle(token: SharedPickerToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genPanelStyle")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def initPanelComponentToken(token: GlobalToken): PanelComponentToken = ^.asInstanceOf[js.Dynamic].applyDynamic("initPanelComponentToken")(token.asInstanceOf[js.Any]).asInstanceOf[PanelComponentToken]
  
  @scala.inline
  def initPickerPanelToken(token: TokenWithCommonCls[GlobalToken]): PickerPanelToken = ^.asInstanceOf[js.Dynamic].applyDynamic("initPickerPanelToken")(token.asInstanceOf[js.Any]).asInstanceOf[PickerPanelToken]
  
  @JSImport("antd/es/date-picker/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[DatePicker] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/input/style.SharedComponentToken extends 'addonBg' ? never : antd.antd/es/input/style.SharedComponentToken */ @js.native
  trait ComponentToken
    extends StObject
       with PanelComponentToken
       with ArrowToken {
    
    /**
      * @desc 预设区域最大宽度
      * @descEN Max width of preset area
      */
    var presetsMaxWidth: Double = js.native
    
    /**
      * @desc 预设区域宽度
      * @descEN Width of preset area
      */
    var presetsWidth: Double = js.native
    
    /**
      * @desc 弹窗 z-index
      * @descEN z-index of popup
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      cellActiveWithRangeBg: String,
      cellBgDisabled: String,
      cellHeight: Double,
      cellHoverBg: String,
      cellHoverWithRangeBg: String,
      cellRangeBorderColor: String,
      cellWidth: Double,
      presetsMaxWidth: Double,
      presetsWidth: Double,
      textHeight: Double,
      timeCellHeight: Double,
      timeColumnHeight: Double,
      timeColumnWidth: Double,
      withoutTimeCellHeight: Double,
      zIndexPopup: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(cellActiveWithRangeBg = cellActiveWithRangeBg.asInstanceOf[js.Any], cellBgDisabled = cellBgDisabled.asInstanceOf[js.Any], cellHeight = cellHeight.asInstanceOf[js.Any], cellHoverBg = cellHoverBg.asInstanceOf[js.Any], cellHoverWithRangeBg = cellHoverWithRangeBg.asInstanceOf[js.Any], cellRangeBorderColor = cellRangeBorderColor.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any], presetsMaxWidth = presetsMaxWidth.asInstanceOf[js.Any], presetsWidth = presetsWidth.asInstanceOf[js.Any], textHeight = textHeight.asInstanceOf[js.Any], timeCellHeight = timeCellHeight.asInstanceOf[js.Any], timeColumnHeight = timeColumnHeight.asInstanceOf[js.Any], timeColumnWidth = timeColumnWidth.asInstanceOf[js.Any], withoutTimeCellHeight = withoutTimeCellHeight.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPresetsMaxWidth(value: Double): Self = StObject.set(x, "presetsMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsWidth(value: Double): Self = StObject.set(x, "presetsWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PanelComponentToken extends StObject {
    
    /**
      * @desc 选取范围内的单元格背景色
      * @descEN Background color of cell in range
      */
    var cellActiveWithRangeBg: String = js.native
    
    /**
      * @desc 单元格禁用态背景色
      * @descEN Background color of disabled cell
      */
    var cellBgDisabled: String = js.native
    
    /**
      * @desc 单元格高度
      * @descEN Height of cell
      */
    var cellHeight: Double = js.native
    
    /**
      * @desc 单元格悬浮态背景色
      * @descEN Background color of cell hover state
      */
    var cellHoverBg: String = js.native
    
    /**
      * @desc 选取范围内的单元格悬浮态背景色
      * @descEN Background color of hovered cell in range
      */
    var cellHoverWithRangeBg: String = js.native
    
    /**
      * @desc 选取范围时单元格边框色
      * @descEN Border color of cell in range when picking
      */
    var cellRangeBorderColor: String = js.native
    
    /**
      * @desc 单元格宽度
      * @descEN Width of cell
      */
    var cellWidth: Double = js.native
    
    /**
      * @desc 单元格文本高度
      * @descEN Height of cell text
      */
    var textHeight: Double = js.native
    
    /**
      * @desc 时间单元格高度
      * @descEN Height of time cell
      */
    var timeCellHeight: Double = js.native
    
    /**
      * @desc 时间列高度
      * @descEN Height of time column
      */
    var timeColumnHeight: Double = js.native
    
    /**
      * @desc 时间列宽度
      * @descEN Width of time column
      */
    var timeColumnWidth: Double = js.native
    
    /**
      * @desc 十年/年/季/月/周单元格高度
      * @descEN Height of decade/year/quarter/month/week cell
      */
    var withoutTimeCellHeight: Double = js.native
  }
  object PanelComponentToken {
    
    @scala.inline
    def apply(
      cellActiveWithRangeBg: String,
      cellBgDisabled: String,
      cellHeight: Double,
      cellHoverBg: String,
      cellHoverWithRangeBg: String,
      cellRangeBorderColor: String,
      cellWidth: Double,
      textHeight: Double,
      timeCellHeight: Double,
      timeColumnHeight: Double,
      timeColumnWidth: Double,
      withoutTimeCellHeight: Double
    ): PanelComponentToken = {
      val __obj = js.Dynamic.literal(cellActiveWithRangeBg = cellActiveWithRangeBg.asInstanceOf[js.Any], cellBgDisabled = cellBgDisabled.asInstanceOf[js.Any], cellHeight = cellHeight.asInstanceOf[js.Any], cellHoverBg = cellHoverBg.asInstanceOf[js.Any], cellHoverWithRangeBg = cellHoverWithRangeBg.asInstanceOf[js.Any], cellRangeBorderColor = cellRangeBorderColor.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any], textHeight = textHeight.asInstanceOf[js.Any], timeCellHeight = timeCellHeight.asInstanceOf[js.Any], timeColumnHeight = timeColumnHeight.asInstanceOf[js.Any], timeColumnWidth = timeColumnWidth.asInstanceOf[js.Any], withoutTimeCellHeight = withoutTimeCellHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PanelComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellActiveWithRangeBg(value: String): Self = StObject.set(x, "cellActiveWithRangeBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellBgDisabled(value: String): Self = StObject.set(x, "cellBgDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHoverBg(value: String): Self = StObject.set(x, "cellHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHoverWithRangeBg(value: String): Self = StObject.set(x, "cellHoverWithRangeBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellRangeBorderColor(value: String): Self = StObject.set(x, "cellRangeBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextHeight(value: Double): Self = StObject.set(x, "textHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeCellHeight(value: Double): Self = StObject.set(x, "timeCellHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeColumnHeight(value: Double): Self = StObject.set(x, "timeColumnHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeColumnWidth(value: Double): Self = StObject.set(x, "timeColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutTimeCellHeight(value: Double): Self = StObject.set(x, "withoutTimeCellHeight", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PickerPanelToken extends StObject {
    
    var pickerCellBorderGap: Double = js.native
    
    var pickerCellCls: String = js.native
    
    var pickerCellInnerCls: String = js.native
    
    var pickerCellPaddingVertical: Double | String = js.native
    
    var pickerControlIconBorderWidth: Double = js.native
    
    var pickerControlIconMargin: Double = js.native
    
    var pickerControlIconSize: Double = js.native
    
    var pickerDatePanelPaddingHorizontal: Double | String = js.native
    
    var pickerQuarterPanelContentHeight: Double | String = js.native
    
    var pickerYearMonthCellWidth: Double | String = js.native
  }
  object PickerPanelToken {
    
    @scala.inline
    def apply(
      pickerCellBorderGap: Double,
      pickerCellCls: String,
      pickerCellInnerCls: String,
      pickerCellPaddingVertical: Double | String,
      pickerControlIconBorderWidth: Double,
      pickerControlIconMargin: Double,
      pickerControlIconSize: Double,
      pickerDatePanelPaddingHorizontal: Double | String,
      pickerQuarterPanelContentHeight: Double | String,
      pickerYearMonthCellWidth: Double | String
    ): PickerPanelToken = {
      val __obj = js.Dynamic.literal(pickerCellBorderGap = pickerCellBorderGap.asInstanceOf[js.Any], pickerCellCls = pickerCellCls.asInstanceOf[js.Any], pickerCellInnerCls = pickerCellInnerCls.asInstanceOf[js.Any], pickerCellPaddingVertical = pickerCellPaddingVertical.asInstanceOf[js.Any], pickerControlIconBorderWidth = pickerControlIconBorderWidth.asInstanceOf[js.Any], pickerControlIconMargin = pickerControlIconMargin.asInstanceOf[js.Any], pickerControlIconSize = pickerControlIconSize.asInstanceOf[js.Any], pickerDatePanelPaddingHorizontal = pickerDatePanelPaddingHorizontal.asInstanceOf[js.Any], pickerQuarterPanelContentHeight = pickerQuarterPanelContentHeight.asInstanceOf[js.Any], pickerYearMonthCellWidth = pickerYearMonthCellWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerPanelToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PickerPanelToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPickerCellBorderGap(value: Double): Self = StObject.set(x, "pickerCellBorderGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerCellCls(value: String): Self = StObject.set(x, "pickerCellCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerCellInnerCls(value: String): Self = StObject.set(x, "pickerCellInnerCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerCellPaddingVertical(value: Double | String): Self = StObject.set(x, "pickerCellPaddingVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerControlIconBorderWidth(value: Double): Self = StObject.set(x, "pickerControlIconBorderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerControlIconMargin(value: Double): Self = StObject.set(x, "pickerControlIconMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerControlIconSize(value: Double): Self = StObject.set(x, "pickerControlIconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerDatePanelPaddingHorizontal(value: Double | String): Self = StObject.set(x, "pickerDatePanelPaddingHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerQuarterPanelContentHeight(value: Double | String): Self = StObject.set(x, "pickerQuarterPanelContentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerYearMonthCellWidth(value: Double | String): Self = StObject.set(x, "pickerYearMonthCellWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type SharedPickerToken = TokenWithCommonCls[GlobalToken] with PickerPanelToken with PanelComponentToken
}
