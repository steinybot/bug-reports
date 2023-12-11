package web.typings.rcMenu

import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMenuItemGroupMod {
  
  @JSImport("rc-menu/es/MenuItemGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: MenuItemGroupProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  /* Inlined parent std.Omit<rc-menu.rc-menu/es/interface.MenuItemGroupType, 'type' | 'children' | 'label'> */
  @js.native
  trait MenuItemGroupProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /** @private Internal filled key. Do not set it directly */
    var eventKey: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    /** @private Do not use. Private warning empty usage */
    var warnKey: js.UndefOr[Boolean] = js.native
  }
  object MenuItemGroupProps {
    
    @scala.inline
    def apply(): MenuItemGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemGroupProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MenuItemGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEventKey(value: String): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWarnKey(value: Boolean): Self = StObject.set(x, "warnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnKeyUndefined: Self = StObject.set(x, "warnKey", js.undefined)
    }
  }
}
