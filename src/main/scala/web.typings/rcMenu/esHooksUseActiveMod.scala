package web.typings.rcMenu

import web.typings.rcMenu.esInterfaceMod.MenuHoverEventHandler
import web.typings.react.mod.MouseEventHandler
import org.scalajs.dom.HTMLElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseActiveMod {
  
  @JSImport("rc-menu/es/hooks/useActive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(eventKey: String, disabled: Boolean): ActiveObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventKey.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[ActiveObj]
  @scala.inline
  def default(eventKey: String, disabled: Boolean, onMouseEnter: MenuHoverEventHandler): ActiveObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventKey.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onMouseEnter.asInstanceOf[js.Any])).asInstanceOf[ActiveObj]
  @scala.inline
  def default(
    eventKey: String,
    disabled: Boolean,
    onMouseEnter: MenuHoverEventHandler,
    onMouseLeave: MenuHoverEventHandler
  ): ActiveObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventKey.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onMouseEnter.asInstanceOf[js.Any], onMouseLeave.asInstanceOf[js.Any])).asInstanceOf[ActiveObj]
  @scala.inline
  def default(eventKey: String, disabled: Boolean, onMouseEnter: Unit, onMouseLeave: MenuHoverEventHandler): ActiveObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventKey.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onMouseEnter.asInstanceOf[js.Any], onMouseLeave.asInstanceOf[js.Any])).asInstanceOf[ActiveObj]
  
  @js.native
  trait ActiveObj extends StObject {
    
    var active: Boolean = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  }
  object ActiveObj {
    
    @scala.inline
    def apply(active: Boolean): ActiveObj = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveObj]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ActiveObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    }
  }
}
