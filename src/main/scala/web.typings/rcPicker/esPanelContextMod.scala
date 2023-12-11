package web.typings.rcPicker

import web.typings.rcPicker.esInterfaceMod.OnSelect
import web.typings.rcPicker.esInterfaceMod.PanelMode
import web.typings.rcPicker.rcPickerStrings.key
import web.typings.rcPicker.rcPickerStrings.mouse
import web.typings.rcPicker.rcPickerStrings.submit
import web.typings.react.mod.Context
import web.typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelContextMod extends Shortcut {
  
  @JSImport("rc-picker/es/PanelContext", JSImport.Default)
  @js.native
  val default: Context[PanelContextProps] = js.native
  
  @js.native
  trait ContextOperationRefProps extends StObject {
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLElement], Boolean]] = js.native
  }
  object ContextOperationRefProps {
    
    @scala.inline
    def apply(): ContextOperationRefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextOperationRefProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ContextOperationRefProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* e */ SyntheticKeyboardEvent[HTMLElement] => Boolean): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  @js.native
  trait PanelContextProps extends StObject {
    
    /** Only used for TimePicker and this is a deprecated prop */
    var defaultOpenValue: js.UndefOr[Any] = js.native
    
    /** Only work with time panel */
    var hideHeader: js.UndefOr[Boolean] = js.native
    
    var hideNextBtn: js.UndefOr[Boolean] = js.native
    
    var hidePrevBtn: js.UndefOr[Boolean] = js.native
    
    var hideRanges: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[PanelMode] = js.native
    
    var onDateMouseEnter: js.UndefOr[js.Function1[/* date */ Any, Unit]] = js.native
    
    var onDateMouseLeave: js.UndefOr[js.Function1[/* date */ Any, Unit]] = js.native
    
    var onSelect: js.UndefOr[OnSelect[Any]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var operationRef: js.UndefOr[MutableRefObject[ContextOperationRefProps | Null]] = js.native
  }
  object PanelContextProps {
    
    @scala.inline
    def apply(): PanelContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PanelContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultOpenValue(value: Any): Self = StObject.set(x, "defaultOpenValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenValueUndefined: Self = StObject.set(x, "defaultOpenValue", js.undefined)
      
      @scala.inline
      def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      @scala.inline
      def setHideNextBtn(value: Boolean): Self = StObject.set(x, "hideNextBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideNextBtnUndefined: Self = StObject.set(x, "hideNextBtn", js.undefined)
      
      @scala.inline
      def setHidePrevBtn(value: Boolean): Self = StObject.set(x, "hidePrevBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidePrevBtnUndefined: Self = StObject.set(x, "hidePrevBtn", js.undefined)
      
      @scala.inline
      def setHideRanges(value: Boolean): Self = StObject.set(x, "hideRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideRangesUndefined: Self = StObject.set(x, "hideRanges", js.undefined)
      
      @scala.inline
      def setMode(value: PanelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnDateMouseEnter(value: /* date */ Any => Unit): Self = StObject.set(x, "onDateMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDateMouseEnterUndefined: Self = StObject.set(x, "onDateMouseEnter", js.undefined)
      
      @scala.inline
      def setOnDateMouseLeave(value: /* date */ Any => Unit): Self = StObject.set(x, "onDateMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDateMouseLeaveUndefined: Self = StObject.set(x, "onDateMouseLeave", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (Any, /* type */ key | mouse | submit) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOperationRef(value: MutableRefObject[ContextOperationRefProps | Null]): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationRefUndefined: Self = StObject.set(x, "operationRef", js.undefined)
    }
  }
  
  type _To = Context[PanelContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esPanelContextMod.foo` */
  override def _to: Context[PanelContextProps] = default
}
