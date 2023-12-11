package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.OnChange
import web.typings.antd.esCalendarGenerateCalendarMod.CalendarMode
import web.typings.antd.esCalendarGenerateCalendarMod.SelectInfo
import web.typings.antd.esDatePickerGeneratePickerMod.PickerLocale
import web.typings.dayjs.mod.Dayjs
import web.typings.rcPicker.esInterfaceMod.CellRenderInfo
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_CalendarProps_1526459521 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def cellRender(value: (Dayjs, /* info */ CellRenderInfo[Dayjs]) => ReactElement): this.type = set("cellRender", js.Any.fromFunction2(value))
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dateCellRender(value: Dayjs => ReactElement): this.type = set("dateCellRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def dateFullCellRender(value: Dayjs => ReactElement): this.type = set("dateFullCellRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def defaultValue(value: Dayjs): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabledDate(value: Dayjs => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
  
  @scala.inline
  def fullCellRender(value: (Dayjs, /* info */ CellRenderInfo[Dayjs]) => ReactElement): this.type = set("fullCellRender", js.Any.fromFunction2(value))
  
  @scala.inline
  def fullscreen(value: Boolean): this.type = set("fullscreen", value.asInstanceOf[js.Any])
  
  @scala.inline
  def headerRender(value: /* config */ OnChange[Dayjs] => ReactElement): this.type = set("headerRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mode(value: CalendarMode): this.type = set("mode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def monthCellRender(value: Dayjs => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def monthFullCellRender(value: Dayjs => ReactElement): this.type = set("monthFullCellRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def onChange(value: Dayjs => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPanelChange(value: (Dayjs, /* mode */ CalendarMode) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
  
  @scala.inline
  def onSelect(value: (Dayjs, /* selectInfo */ SelectInfo) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def validRange(value: js.Tuple2[Dayjs, Dayjs]): this.type = set("validRange", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: Dayjs): this.type = set("value", value.asInstanceOf[js.Any])
}
