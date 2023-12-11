package web.typings.antd

import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableHooksUseFilterFilterWrapperMod extends Shortcut {
  
  @JSImport("antd/es/table/hooks/useFilter/FilterWrapper", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FilterDropdownMenuWrapperProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait FilterDropdownMenuWrapperProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
  }
  object FilterDropdownMenuWrapperProps {
    
    @scala.inline
    def apply(): FilterDropdownMenuWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterDropdownMenuWrapperProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FilterDropdownMenuWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FilterDropdownMenuWrapperProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esTableHooksUseFilterFilterWrapperMod.foo` */
  override def _to: ReactComponentClass[FilterDropdownMenuWrapperProps with RefAttributes[HTMLDivElement]] = default
}
