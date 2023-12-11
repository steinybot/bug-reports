package web.typings.rcTable

import web.typings.rcTable.anon.ScrollLeft
import web.typings.rcTable.libInterfaceMod.OnCustomizeScroll
import web.typings.rcTable.libInterfaceMod.ScrollConfig
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVirtualTableBodyGridMod extends Shortcut {
  
  @JSImport("rc-table/lib/VirtualTable/BodyGrid", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GridProps[Any] with RefAttributes[GridRef]] = js.native
  
  @js.native
  trait GridProps[RecordType] extends StObject {
    
    var data: js.Array[RecordType] = js.native
    
    var onScroll: OnCustomizeScroll = js.native
  }
  object GridProps {
    
    @scala.inline
    def apply[RecordType](data: js.Array[RecordType], onScroll: /* info */ ScrollLeft => Unit): GridProps[RecordType] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll))
      __obj.asInstanceOf[GridProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: GridProps[_], RecordType] (val x: Self with GridProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: RecordType*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setOnScroll(value: /* info */ ScrollLeft => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GridRef extends StObject {
    
    var scrollLeft: Double = js.native
    
    var scrollTo: js.UndefOr[js.Function1[/* scrollConfig */ ScrollConfig, Unit]] = js.native
  }
  object GridRef {
    
    @scala.inline
    def apply(scrollLeft: Double): GridRef = {
      val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: GridRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTo(value: /* scrollConfig */ ScrollConfig => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[GridProps[Any] with RefAttributes[GridRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libVirtualTableBodyGridMod.foo` */
  override def _to: ReactComponentClass[GridProps[Any] with RefAttributes[GridRef]] = default
}
