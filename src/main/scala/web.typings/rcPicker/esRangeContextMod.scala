package web.typings.rcPicker

import web.typings.rcPicker.esInterfaceMod.NullableDateType
import web.typings.rcPicker.esInterfaceMod.RangeValue
import web.typings.rcPicker.rcPickerBooleans.`false`
import web.typings.rcPicker.rcPickerStrings.left
import web.typings.rcPicker.rcPickerStrings.right
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRangeContextMod extends Shortcut {
  
  @JSImport("rc-picker/es/RangeContext", JSImport.Default)
  @js.native
  val default: Context[RangeContextProps] = js.native
  
  @js.native
  trait RangeContextProps extends StObject {
    
    var hoverRangedValue: js.UndefOr[RangeValue[Any]] = js.native
    
    var inRange: js.UndefOr[Boolean] = js.native
    
    var panelPosition: js.UndefOr[left | right | `false`] = js.native
    
    /**
      * Set displayed range value style.
      * Panel only has one value, this is only style effect.
      */
    var rangedValue: js.UndefOr[(js.Tuple2[NullableDateType[Any], NullableDateType[Any]]) | Null] = js.native
  }
  object RangeContextProps {
    
    @scala.inline
    def apply(): RangeContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RangeContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHoverRangedValue(value: RangeValue[Any]): Self = StObject.set(x, "hoverRangedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverRangedValueNull: Self = StObject.set(x, "hoverRangedValue", null)
      
      @scala.inline
      def setHoverRangedValueUndefined: Self = StObject.set(x, "hoverRangedValue", js.undefined)
      
      @scala.inline
      def setInRange(value: Boolean): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInRangeUndefined: Self = StObject.set(x, "inRange", js.undefined)
      
      @scala.inline
      def setPanelPosition(value: left | right | `false`): Self = StObject.set(x, "panelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelPositionUndefined: Self = StObject.set(x, "panelPosition", js.undefined)
      
      @scala.inline
      def setRangedValue(value: js.Tuple2[NullableDateType[Any], NullableDateType[Any]]): Self = StObject.set(x, "rangedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangedValueNull: Self = StObject.set(x, "rangedValue", null)
      
      @scala.inline
      def setRangedValueUndefined: Self = StObject.set(x, "rangedValue", js.undefined)
    }
  }
  
  type _To = Context[RangeContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esRangeContextMod.foo` */
  override def _to: Context[RangeContextProps] = default
}
