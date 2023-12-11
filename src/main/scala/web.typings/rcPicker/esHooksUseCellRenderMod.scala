package web.typings.rcPicker

import web.typings.rcPicker.esInterfaceMod.CellRender
import web.typings.rcPicker.esPickerPanelMod.PickerPanelProps
import web.typings.rcPicker.esRangePickerMod.RangePickerProps
import web.typings.rcPicker.rcPickerStrings.cellRender
import web.typings.rcPicker.rcPickerStrings.dateRender
import web.typings.rcPicker.rcPickerStrings.monthCellRender
import web.typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseCellRenderMod {
  
  @JSImport("rc-picker/es/hooks/useCellRender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useCellRender[DateType](param0: UseCellRenderOption[DateType]): CellRender[DateType, DateType | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCellRender")(param0.asInstanceOf[js.Any]).asInstanceOf[CellRender[DateType, DateType | Double]]
  
  type UseCellRenderOption[DateType] = Pick[
    PickerPanelProps[DateType] | RangePickerProps[DateType], 
    cellRender | monthCellRender | dateRender
  ]
}
