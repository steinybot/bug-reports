package web.typings.rcPicker

import web.typings.rcPicker.esInterfaceMod.DisabledTimes
import web.typings.rcPicker.esInterfaceMod.PickerMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsWarnUtilMod {
  
  @JSImport("rc-picker/es/utils/warnUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def legacyPropsWarning(props: WarningProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("legacyPropsWarning")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait WarningProps
    extends StObject
       with DisabledTimes {
    
    var picker: js.UndefOr[PickerMode] = js.native
  }
  object WarningProps {
    
    @scala.inline
    def apply(): WarningProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WarningProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: WarningProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPicker(value: PickerMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
    }
  }
}
