package web.typings.rcTable

import web.typings.rcTable.libInterfaceMod.CustomizeComponent
import web.typings.react.mod.JSX.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodyExpandedRowMod {
  
  @JSImport("rc-table/lib/Body/ExpandedRow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: ExpandedRowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait ExpandedRowProps extends StObject {
    
    var cellComponent: CustomizeComponent = js.native
    
    var children: ReactElement = js.native
    
    var className: String = js.native
    
    var colSpan: Double = js.native
    
    var component: CustomizeComponent = js.native
    
    var expanded: Boolean = js.native
    
    var isEmpty: Boolean = js.native
    
    var prefixCls: String = js.native
  }
  object ExpandedRowProps {
    
    @scala.inline
    def apply(
      cellComponent: CustomizeComponent,
      children: ReactElement,
      className: String,
      colSpan: Double,
      component: CustomizeComponent,
      expanded: Boolean,
      isEmpty: Boolean,
      prefixCls: String
    ): ExpandedRowProps = {
      val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colSpan = colSpan.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandedRowProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ExpandedRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellComponent(value: CustomizeComponent): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellComponentReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: CustomizeComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
