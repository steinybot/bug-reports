package web.typings.rcPicker

import web.typings.rcPicker.anon.CellRender
import web.typings.rcPicker.rcPickerStrings.hour
import web.typings.rcPicker.rcPickerStrings.meridiem
import web.typings.rcPicker.rcPickerStrings.minute
import web.typings.rcPicker.rcPickerStrings.second
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.ReactText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsTimePanelTimeUnitColumnMod {
  
  @JSImport("rc-picker/es/panels/TimePanel/TimeUnitColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: TimeUnitColumnProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait TimeUnitColumnProps[DateType] extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.native
    
    var info: CellRender[DateType] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* value */ Double, scala.Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var `type`: hour | minute | second | meridiem = js.native
    
    var units: js.UndefOr[js.Array[Unit]] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object TimeUnitColumnProps {
    
    @scala.inline
    def apply[DateType](info: CellRender[DateType], `type`: hour | minute | second | meridiem): TimeUnitColumnProps[DateType] = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeUnitColumnProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TimeUnitColumnProps[_], DateType] (val x: Self with TimeUnitColumnProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      @scala.inline
      def setInfo(value: CellRender[DateType]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelect(value: /* value */ Double => scala.Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setType(value: hour | minute | second | meridiem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnits(value: js.Array[Unit]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      @scala.inline
      def setUnitsVarargs(value: Unit*): Self = StObject.set(x, "units", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Unit extends StObject {
    
    var disabled: Boolean = js.native
    
    var label: ReactText = js.native
    
    var value: Double = js.native
  }
  object Unit {
    
    @scala.inline
    def apply(disabled: Boolean, label: ReactText, value: Double): Unit = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unit]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: ReactText): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
