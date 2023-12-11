package web.typings.rcPicker

import web.typings.rcPicker.esGenerateMod.GenerateConfig
import web.typings.rcPicker.esInterfaceMod.CellRender
import web.typings.rcPicker.esInterfaceMod.DisabledTimes
import web.typings.rcPicker.esInterfaceMod.IntRange
import web.typings.rcPicker.esInterfaceMod.Locale
import web.typings.rcPicker.esInterfaceMod.NullableDateType
import web.typings.rcPicker.esInterfaceMod.OnSelect
import web.typings.rcPicker.esInterfaceMod.PanelMode
import web.typings.rcPicker.esInterfaceMod.PanelRefProps
import web.typings.rcPicker.rcPickerInts.`1`
import web.typings.rcPicker.rcPickerInts.`23`
import web.typings.rcPicker.rcPickerInts.`59`
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.MutableRefObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsTimePanelMod {
  
  @JSImport("rc-picker/es/panels/TimePanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: TimePanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait SharedTimeProps[DateType] extends StObject {
    
    var defaultValue: js.UndefOr[DateType] = js.native
    
    /** @deprecated Please use `disabledTime` instead. */
    var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
    
    /** @deprecated Please use `disabledTime` instead. */
    var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
    
    /** @deprecated Please use `disabledTime` instead. */
    var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
    
    var disabledTime: js.UndefOr[js.Function1[/* date */ DateType, DisabledTimes]] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.native
    
    var hourStep: js.UndefOr[IntRange[`1`, `23`]] = js.native
    
    var minuteStep: js.UndefOr[IntRange[`1`, `59`]] = js.native
    
    var secondStep: js.UndefOr[IntRange[`1`, `59`]] = js.native
    
    var showHour: js.UndefOr[Boolean] = js.native
    
    var showMinute: js.UndefOr[Boolean] = js.native
    
    var showNow: js.UndefOr[Boolean] = js.native
    
    var showSecond: js.UndefOr[Boolean] = js.native
    
    var use12Hours: js.UndefOr[Boolean] = js.native
  }
  object SharedTimeProps {
    
    @scala.inline
    def apply[DateType](): SharedTimeProps[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedTimeProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SharedTimeProps[_], DateType] (val x: Self with SharedTimeProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabledHours(value: () => js.Array[Double]): Self = StObject.set(x, "disabledHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      @scala.inline
      def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
      
      @scala.inline
      def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
      
      @scala.inline
      def setDisabledTime(value: /* date */ DateType => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      @scala.inline
      def setHourStep(value: IntRange[`1`, `23`]): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      @scala.inline
      def setMinuteStep(value: IntRange[`1`, `59`]): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      @scala.inline
      def setSecondStep(value: IntRange[`1`, `59`]): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      @scala.inline
      def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      @scala.inline
      def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      @scala.inline
      def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      @scala.inline
      def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      @scala.inline
      def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
    }
  }
  
  /* Inlined {  format :string | undefined,   active :boolean | undefined} & rc-picker.rc-picker/es/interface.PanelSharedProps<DateType> & rc-picker.rc-picker/es/panels/TimePanel.SharedTimeProps<DateType> & std.Pick<rc-picker.rc-picker/es/panels/TimePanel/TimeBody.TimeBodyProps<DateType>, 'cellRender'> */
  @js.native
  trait TimePanelProps[DateType] extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var cellRender: js.UndefOr[CellRender[DateType, Double]] = js.native
    
    /**
      * @deprecated please use `defaultValue` instead.
      * Set default display picker view date
      */
    var defaultPickerValue: js.UndefOr[DateType] = js.native
    
    var defaultValue: js.UndefOr[DateType] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    /** @deprecated Please use `disabledTime` instead. */
    var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
    
    /** @deprecated Please use `disabledTime` instead. */
    var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
    
    /** @deprecated Please use `disabledTime` instead. */
    var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
    
    var disabledTime: js.UndefOr[js.Function1[/* date */ DateType, DisabledTimes]] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.native
    
    var hourStep: js.UndefOr[IntRange[`1`, `23`]] = js.native
    
    var locale: Locale = js.native
    
    var minuteStep: js.UndefOr[IntRange[`1`, `59`]] = js.native
    
    var nextIcon: js.UndefOr[ReactElement] = js.native
    
    def onPanelChange(mode: PanelMode, viewValue: DateType): Unit = js.native
    def onPanelChange(mode: Null, viewValue: DateType): Unit = js.native
    
    var onSelect: OnSelect[DateType] = js.native
    
    def onViewDateChange(value: DateType): Unit = js.native
    
    /**
      * Typescript can not handle generic type so we can not use `forwardRef` here.
      * Thus, move ref into operationRef.
      * This is little hack which should refactor after typescript support.
      */
    var operationRef: MutableRefObject[PanelRefProps] = js.native
    
    var prefixCls: String = js.native
    
    var prevIcon: js.UndefOr[ReactElement] = js.native
    
    var secondStep: js.UndefOr[IntRange[`1`, `59`]] = js.native
    
    var showHour: js.UndefOr[Boolean] = js.native
    
    var showMinute: js.UndefOr[Boolean] = js.native
    
    var showNow: js.UndefOr[Boolean] = js.native
    
    var showSecond: js.UndefOr[Boolean] = js.native
    
    var superNextIcon: js.UndefOr[ReactElement] = js.native
    
    var superPrevIcon: js.UndefOr[ReactElement] = js.native
    
    var use12Hours: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[NullableDateType[DateType]] = js.native
    
    var viewDate: DateType = js.native
  }
}
