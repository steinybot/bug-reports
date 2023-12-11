package web.typings.rcTable

import web.typings.rcComponentContext.esContextMod.SelectorContext
import web.typings.rcTable.libInterfaceMod.TableSticky
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVirtualTableContextMod {
  
  @JSImport("rc-table/lib/VirtualTable/context", "GridContext")
  @js.native
  val GridContext: SelectorContext[GridContextProps] = js.native
  
  @JSImport("rc-table/lib/VirtualTable/context", "StaticContext")
  @js.native
  val StaticContext: SelectorContext[StaticContextProps] = js.native
  
  @js.native
  trait GridContextProps extends StObject {
    
    var columnsOffset: js.Array[Double] = js.native
  }
  object GridContextProps {
    
    @scala.inline
    def apply(columnsOffset: js.Array[Double]): GridContextProps = {
      val __obj = js.Dynamic.literal(columnsOffset = columnsOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: GridContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnsOffset(value: js.Array[Double]): Self = StObject.set(x, "columnsOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsOffsetVarargs(value: Double*): Self = StObject.set(x, "columnsOffset", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StaticContextProps extends StObject {
    
    var listItemHeight: Double = js.native
    
    var scrollY: Double = js.native
    
    var sticky: Boolean | TableSticky = js.native
  }
  object StaticContextProps {
    
    @scala.inline
    def apply(listItemHeight: Double, scrollY: Double, sticky: Boolean | TableSticky): StaticContextProps = {
      val __obj = js.Dynamic.literal(listItemHeight = listItemHeight.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: StaticContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListItemHeight(value: Double): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSticky(value: Boolean | TableSticky): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    }
  }
}
