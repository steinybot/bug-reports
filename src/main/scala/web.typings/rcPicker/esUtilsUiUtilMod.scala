package web.typings.rcPicker

import web.typings.rcPicker.esGenerateMod.GenerateConfig
import web.typings.rcPicker.esInterfaceMod.CustomFormat
import web.typings.rcPicker.esInterfaceMod.PanelMode
import web.typings.rcPicker.esInterfaceMod.PickerMode
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import slinky.web.SyntheticKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsUiUtilMod {
  
  @JSImport("rc-picker/es/utils/uiUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Record<rc-picker.rc-picker/es/interface.PickerMode, (next : rc-picker.rc-picker/es/interface.PanelMode): rc-picker.rc-picker/es/interface.PanelMode | null> */
  object PickerModeMap {
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.date")
    @js.native
    def date: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    @scala.inline
    def date_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.month")
    @js.native
    def month: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    @scala.inline
    def month_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("month")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.quarter")
    @js.native
    def quarter: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    @scala.inline
    def quarter_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quarter")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.time")
    @js.native
    def time: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    @scala.inline
    def time_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.week")
    @js.native
    def week: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    @scala.inline
    def week_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("week")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-picker/es/utils/uiUtil", "PickerModeMap.year")
    @js.native
    def year: (js.Function1[/* next */ PanelMode, PanelMode]) | Null = js.native
    @scala.inline
    def year_=(x: (js.Function1[/* next */ PanelMode, PanelMode]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("year")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def addGlobalMouseDownEvent(callback: ClickEventHandler): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalMouseDownEvent")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def createKeyDownHandler(event: SyntheticKeyboardEvent[HTMLElement], param1: KeyboardConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("createKeyDownHandler")(event.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def elementsContains(elements: js.Array[js.UndefOr[HTMLElement | Null]], target: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementsContains")(elements.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def getDefaultFormat[DateType](): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")().asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: CustomFormat[DateType]): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any]).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: PickerMode, showTime: Unit, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: Unit, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: Unit, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: Unit, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: Unit, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: CustomFormat[DateType], picker: Unit, showTime: Unit, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: String): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any]).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: String, picker: PickerMode): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: String, picker: PickerMode, showTime: Unit, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: String, picker: Unit, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: String, picker: Unit, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: String, picker: Unit, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: String, picker: Unit, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: String, picker: Unit, showTime: Unit, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]]): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any]).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: PickerMode): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: PickerMode, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: PickerMode,
    showTime: js.Object,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: PickerMode, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: PickerMode,
    showTime: Boolean,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: PickerMode,
    showTime: Unit,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: Unit, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: Unit,
    showTime: js.Object,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: js.Array[String | CustomFormat[DateType]], picker: Unit, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: Unit,
    showTime: Boolean,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](
    format: js.Array[String | CustomFormat[DateType]],
    picker: Unit,
    showTime: Unit,
    use12Hours: Boolean
  ): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: Unit, picker: PickerMode): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: Unit, picker: PickerMode, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: Unit, picker: PickerMode, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: Unit, picker: PickerMode, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: Unit, picker: PickerMode, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: Unit, picker: PickerMode, showTime: Unit, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: Unit, picker: Unit, showTime: js.Object): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: Unit, picker: Unit, showTime: js.Object, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: Unit, picker: Unit, showTime: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: Unit, picker: Unit, showTime: Boolean, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  @scala.inline
  def getDefaultFormat[DateType](format: Unit, picker: Unit, showTime: Unit, use12Hours: Boolean): String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormat")(format.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], showTime.asInstanceOf[js.Any], use12Hours.asInstanceOf[js.Any])).asInstanceOf[String | CustomFormat[DateType] | (js.Array[String | CustomFormat[DateType]])]
  
  @scala.inline
  def getInputSize[DateType](picker: PickerMode, format: CustomFormat[DateType], generateConfig: GenerateConfig[DateType]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputSize")(picker.asInstanceOf[js.Any], format.asInstanceOf[js.Any], generateConfig.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getInputSize[DateType](picker: PickerMode, format: String, generateConfig: GenerateConfig[DateType]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputSize")(picker.asInstanceOf[js.Any], format.asInstanceOf[js.Any], generateConfig.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getInputSize[DateType](picker: Unit, format: CustomFormat[DateType], generateConfig: GenerateConfig[DateType]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputSize")(picker.asInstanceOf[js.Any], format.asInstanceOf[js.Any], generateConfig.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getInputSize[DateType](picker: Unit, format: String, generateConfig: GenerateConfig[DateType]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputSize")(picker.asInstanceOf[js.Any], format.asInstanceOf[js.Any], generateConfig.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getTargetFromEvent(e: Event): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetFromEvent")(e.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  @scala.inline
  def scrollTo(element: HTMLElement, to: Double, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def waitElementReady(element: HTMLElement, callback: js.Function0[Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitElementReady")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  type ClickEventHandler = js.Function1[/* event */ MouseEvent, Unit]
  
  @js.native
  trait KeyboardConfig extends StObject {
    
    var onCtrlLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
    
    var onEnter: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    var onLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
    
    var onPageUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
    
    var onUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
  }
  object KeyboardConfig {
    
    @scala.inline
    def apply(): KeyboardConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: KeyboardConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCtrlLeftRight(value: /* diff */ Double => Unit): Self = StObject.set(x, "onCtrlLeftRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCtrlLeftRightNull: Self = StObject.set(x, "onCtrlLeftRight", null)
      
      @scala.inline
      def setOnCtrlLeftRightUndefined: Self = StObject.set(x, "onCtrlLeftRight", js.undefined)
      
      @scala.inline
      def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnterNull: Self = StObject.set(x, "onEnter", null)
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnLeftRight(value: /* diff */ Double => Unit): Self = StObject.set(x, "onLeftRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLeftRightNull: Self = StObject.set(x, "onLeftRight", null)
      
      @scala.inline
      def setOnLeftRightUndefined: Self = StObject.set(x, "onLeftRight", js.undefined)
      
      @scala.inline
      def setOnPageUpDown(value: /* diff */ Double => Unit): Self = StObject.set(x, "onPageUpDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageUpDownNull: Self = StObject.set(x, "onPageUpDown", null)
      
      @scala.inline
      def setOnPageUpDownUndefined: Self = StObject.set(x, "onPageUpDown", js.undefined)
      
      @scala.inline
      def setOnUpDown(value: /* diff */ Double => Unit): Self = StObject.set(x, "onUpDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpDownNull: Self = StObject.set(x, "onUpDown", null)
      
      @scala.inline
      def setOnUpDownUndefined: Self = StObject.set(x, "onUpDown", js.undefined)
    }
  }
}
