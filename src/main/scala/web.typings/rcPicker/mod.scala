package web.typings.rcPicker

import web.typings.rcPicker.esPickerPanelMod.PickerPanelProps
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-picker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-picker", JSImport.Default)
  @js.native
  class default[DateType] ()
    extends web.typings.rcPicker.esPickerMod.default[DateType]
  
  @scala.inline
  def PickerPanel[DateType](props: PickerPanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PickerPanel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-picker", "RangePicker")
  @js.native
  class RangePicker[DateType] ()
    extends web.typings.rcPicker.esRangePickerMod.default[DateType]
}
