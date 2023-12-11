package web.typings.rcTabs

import web.typings.rcTabs.esInterfaceMod.EditableConfig
import web.typings.rcTabs.esInterfaceMod.Tab
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.FocusEventHandler
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListTabNodeMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/TabNode", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TabNodeProps] = js.native
  
  @js.native
  trait TabNodeProps extends StObject {
    
    var active: Boolean = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var id: String = js.native
    
    var onClick: js.UndefOr[
        js.Function1[/* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], Unit]
      ] = js.native
    
    var onFocus: FocusEventHandler[Element] = js.native
    
    var onResize: js.UndefOr[
        js.Function4[/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double, Unit]
      ] = js.native
    
    var prefixCls: String = js.native
    
    var removeAriaLabel: js.UndefOr[String] = js.native
    
    var removeIcon: js.UndefOr[ReactElement] = js.native
    
    var renderWrapper: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tab: Tab = js.native
  }
  object TabNodeProps {
    
    @scala.inline
    def apply(
      active: Boolean,
      id: String,
      onFocus: SyntheticFocusEvent[Element] => Unit,
      prefixCls: String,
      tab: Tab
    ): TabNodeProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1(onFocus), prefixCls = prefixCls.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabNodeProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TabNodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setEditable(value: EditableConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: /* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResize(value: (/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double) => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAriaLabel(value: String): Self = StObject.set(x, "removeAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAriaLabelUndefined: Self = StObject.set(x, "removeAriaLabel", js.undefined)
      
      @scala.inline
      def setRemoveIcon(value: ReactElement): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setRenderWrapper(value: /* node */ ReactElement => ReactElement): Self = StObject.set(x, "renderWrapper", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTab(value: Tab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[TabNodeProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTabNavListTabNodeMod.foo` */
  override def _to: ReactComponentClass[TabNodeProps] = default
}
