package web.typings.rcPicker

import web.typings.rcPicker.esInterfaceMod.CellRender
import web.typings.rcPicker.esInterfaceMod.PanelSharedProps
import web.typings.rcPicker.esUtilsUiUtilMod.KeyboardConfig
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsDatePanelMod {
  
  @JSImport("rc-picker/es/panels/DatePanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: DatePanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `web.typings`.rcPicker.esPanelsDatePanelDateBodyMod.DateBodyPassProps because var conflicts: disabledDate. Inlined cellRender, prefixColumn, rowClassName, isSameCell */ @js.native
  trait DatePanelProps[DateType]
    extends StObject
       with PanelSharedProps[DateType] {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var cellRender: js.UndefOr[CellRender[DateType, DateType | Double]] = js.native
    
    var isSameCell: js.UndefOr[js.Function2[DateType, DateType, Boolean]] = js.native
    
    var keyboardConfig: js.UndefOr[KeyboardConfig] = js.native
    
    var panelName: js.UndefOr[String] = js.native
    
    var prefixColumn: js.UndefOr[js.Function1[DateType, ReactElement]] = js.native
    
    var rowClassName: js.UndefOr[js.Function1[DateType, String]] = js.native
  }
}
