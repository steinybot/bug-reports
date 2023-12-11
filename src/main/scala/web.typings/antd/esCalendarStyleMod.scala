package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Calendar
import web.typings.antd.esDatePickerStyleMod.PanelComponentToken
import web.typings.antd.esDatePickerStyleMod.PickerPanelToken
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCalendarStyleMod {
  
  @JSImport("antd/es/calendar/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @scala.inline
  def genCalendarStyles(token: CalendarToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genCalendarStyles")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("antd/es/calendar/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Calendar] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Calendar'] */ @js.native
  trait CalendarToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil
       with PickerPanelToken
       with PanelComponentToken {
    
    var calendarCls: String = js.native
    
    var dateContentHeight: Double = js.native
    
    var dateValueHeight: Double = js.native
    
    var weekHeight: Double = js.native
  }
  object CalendarToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      PanelComponentToken: PanelComponentToken,
      PickerPanelToken: PickerPanelToken,
      calendarCls: String,
      dateContentHeight: Double,
      dateValueHeight: Double,
      weekHeight: Double
    ): CalendarToken = {
      val __obj = js.Dynamic.literal(calendarCls = calendarCls.asInstanceOf[js.Any], dateContentHeight = dateContentHeight.asInstanceOf[js.Any], dateValueHeight = dateValueHeight.asInstanceOf[js.Any], weekHeight = weekHeight.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      js.Dynamic.global.Object.assign(__obj, PanelComponentToken)
      js.Dynamic.global.Object.assign(__obj, PickerPanelToken)
      __obj.asInstanceOf[CalendarToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CalendarToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendarCls(value: String): Self = StObject.set(x, "calendarCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateContentHeight(value: Double): Self = StObject.set(x, "dateContentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateValueHeight(value: Double): Self = StObject.set(x, "dateValueHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekHeight(value: Double): Self = StObject.set(x, "weekHeight", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 完整日历背景色
      * @descEN Background color of full calendar
      */
    var fullBg: String = js.native
    
    /**
      * @desc 完整日历面板背景色
      * @descEN Background color of full calendar panel
      */
    var fullPanelBg: String = js.native
    
    /**
      * @desc 日期项选中背景色
      * @descEN Background color of selected date item
      */
    var itemActiveBg: String = js.native
    
    /**
      * @desc 迷你日历内容高度
      * @descEN Height of mini calendar content
      */
    var miniContentHeight: Double = js.native
    
    /**
      * @desc 月选择器宽度
      * @descEN Width of month select
      */
    var monthControlWidth: Double = js.native
    
    /**
      * @desc 年选择器宽度
      * @descEN Width of year select
      */
    var yearControlWidth: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      fullBg: String,
      fullPanelBg: String,
      itemActiveBg: String,
      miniContentHeight: Double,
      monthControlWidth: Double,
      yearControlWidth: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(fullBg = fullBg.asInstanceOf[js.Any], fullPanelBg = fullPanelBg.asInstanceOf[js.Any], itemActiveBg = itemActiveBg.asInstanceOf[js.Any], miniContentHeight = miniContentHeight.asInstanceOf[js.Any], monthControlWidth = monthControlWidth.asInstanceOf[js.Any], yearControlWidth = yearControlWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullBg(value: String): Self = StObject.set(x, "fullBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullPanelBg(value: String): Self = StObject.set(x, "fullPanelBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemActiveBg(value: String): Self = StObject.set(x, "itemActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiniContentHeight(value: Double): Self = StObject.set(x, "miniContentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthControlWidth(value: Double): Self = StObject.set(x, "monthControlWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearControlWidth(value: Double): Self = StObject.set(x, "yearControlWidth", value.asInstanceOf[js.Any])
    }
  }
}
