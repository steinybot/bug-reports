package web.typings.rcDrawer

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.Ref
import web.typings.std.VoidFunction
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDrawerPanelMod {
  
  object default {
    
    @scala.inline
    def apply(props: DrawerPanelProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-drawer/es/DrawerPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-drawer/es/DrawerPanel", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DrawerPanelEvents extends StObject {
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  }
  object DrawerPanelEvents {
    
    @scala.inline
    def apply(): DrawerPanelEvents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerPanelEvents]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DrawerPanelEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    }
  }
  
  @js.native
  trait DrawerPanelProps
    extends StObject
       with DrawerPanelEvents {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var containerRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var prefixCls: String = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object DrawerPanelProps {
    
    @scala.inline
    def apply(prefixCls: String): DrawerPanelProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerPanelProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DrawerPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContainerRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "containerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContainerRefNull: Self = StObject.set(x, "containerRef", null)
      
      @scala.inline
      def setContainerRefReactRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait DrawerPanelRef extends StObject {
    
    var focus: VoidFunction = js.native
  }
  object DrawerPanelRef {
    
    @scala.inline
    def apply(focus: () => Unit): DrawerPanelRef = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[DrawerPanelRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DrawerPanelRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
}
