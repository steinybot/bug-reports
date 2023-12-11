package web.typings.antd

import web.typings.antd.esMenuMenuContextMod.MenuTheme
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMenuSubMenuMod extends Shortcut {
  
  @JSImport("antd/es/menu/SubMenu", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SubMenuProps] = js.native
  
  @js.native
  trait SubMenuProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var level: js.UndefOr[Double] = js.native
    
    var onTitleClick: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.native
    
    var onTitleMouseEnter: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.native
    
    var onTitleMouseLeave: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.native
    
    var popupClassName: js.UndefOr[String] = js.native
    
    var popupOffset: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var theme: js.UndefOr[MenuTheme] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object SubMenuProps {
    
    @scala.inline
    def apply(): SubMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubMenuProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SubMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setOnTitleClick(value: /* e */ TitleEventEntity => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
      
      @scala.inline
      def setOnTitleMouseEnter(value: /* e */ TitleEventEntity => Unit): Self = StObject.set(x, "onTitleMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTitleMouseEnterUndefined: Self = StObject.set(x, "onTitleMouseEnter", js.undefined)
      
      @scala.inline
      def setOnTitleMouseLeave(value: /* e */ TitleEventEntity => Unit): Self = StObject.set(x, "onTitleMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTitleMouseLeaveUndefined: Self = StObject.set(x, "onTitleMouseLeave", js.undefined)
      
      @scala.inline
      def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      @scala.inline
      def setPopupOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "popupOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupOffsetUndefined: Self = StObject.set(x, "popupOffset", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTheme(value: MenuTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait TitleEventEntity extends StObject {
    
    var domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement] = js.native
    
    var key: String = js.native
  }
  object TitleEventEntity {
    
    @scala.inline
    def apply(domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement], key: String): TitleEventEntity = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleEventEntity]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TitleEventEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomEvent(value: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomEventSyntheticKeyboardEvent(value: SyntheticKeyboardEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomEventSyntheticMouseEvent(value: SyntheticMouseEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[SubMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `esMenuSubMenuMod.foo` */
  override def _to: ReactComponentClass[SubMenuProps] = default
}
