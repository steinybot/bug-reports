package web.typings.rcPicker

import web.typings.rcPicker.esInterfaceMod.CellRender
import web.typings.rcPicker.esInterfaceMod.PanelSharedProps
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsQuarterPanelMod {
  
  @JSImport("rc-picker/es/panels/QuarterPanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: QuarterPanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait QuarterPanelProps[DateType]
    extends StObject
       with PanelSharedProps[DateType] {
    
    var cellRender: js.UndefOr[CellRender[DateType, DateType | Double]] = js.native
  }
}
