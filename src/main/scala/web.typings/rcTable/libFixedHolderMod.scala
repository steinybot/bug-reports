package web.typings.rcTable

import web.typings.rcTable.anon.CurrentTarget
import web.typings.rcTable.libHeaderHeaderMod.HeaderProps
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.ColumnsType
import web.typings.rcTable.libInterfaceMod.Direction
import web.typings.rcTable.libInterfaceMod.StickyOffsets
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.RefAttributes
import web.typings.react.mod.TdHTMLAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFixedHolderMod extends Shortcut {
  
  /** Return a table in div as fixed element which contains sticky info */
  @JSImport("rc-table/lib/FixedHolder", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ReactComponentClass[FixedHeaderProps[Any] with RefAttributes[HTMLDivElement]]] = js.native
  
  @js.native
  trait FixedHeaderProps[RecordType]
    extends StObject
       with HeaderProps[RecordType] {
    
    def children(info: HeaderProps[RecordType]): ReactElement = js.native
    
    var className: String = js.native
    
    var colWidths: js.Array[Double] = js.native
    
    var columCount: Double = js.native
    
    var direction: Direction = js.native
    
    var fixHeader: Boolean = js.native
    
    var maxContentScroll: Boolean = js.native
    
    var noData: Boolean = js.native
    
    def onScroll(info: CurrentTarget): Unit = js.native
    
    var stickyBottomOffset: js.UndefOr[Double] = js.native
    
    var stickyClassName: js.UndefOr[String] = js.native
    
    var stickyTopOffset: js.UndefOr[Double] = js.native
  }
  object FixedHeaderProps {
    
    @scala.inline
    def apply[RecordType](
      children: HeaderProps[RecordType] => ReactElement,
      className: String,
      colWidths: js.Array[Double],
      columCount: Double,
      columns: ColumnsType[RecordType],
      direction: Direction,
      fixHeader: Boolean,
      flattenColumns: js.Array[ColumnType[RecordType]],
      maxContentScroll: Boolean,
      noData: Boolean,
      onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any],
      onScroll: CurrentTarget => Unit,
      stickyOffsets: StickyOffsets
    ): FixedHeaderProps[RecordType] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), className = className.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], columCount = columCount.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], maxContentScroll = maxContentScroll.asInstanceOf[js.Any], noData = noData.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), onScroll = js.Any.fromFunction1(onScroll), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedHeaderProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FixedHeaderProps[_], RecordType] (val x: Self with FixedHeaderProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: HeaderProps[RecordType] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColWidths(value: js.Array[Double]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColWidthsVarargs(value: Double*): Self = StObject.set(x, "colWidths", js.Array(value :_*))
      
      @scala.inline
      def setColumCount(value: Double): Self = StObject.set(x, "columCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxContentScroll(value: Boolean): Self = StObject.set(x, "maxContentScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoData(value: Boolean): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScroll(value: CurrentTarget => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStickyBottomOffset(value: Double): Self = StObject.set(x, "stickyBottomOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyBottomOffsetUndefined: Self = StObject.set(x, "stickyBottomOffset", js.undefined)
      
      @scala.inline
      def setStickyClassName(value: String): Self = StObject.set(x, "stickyClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyClassNameUndefined: Self = StObject.set(x, "stickyClassName", js.undefined)
      
      @scala.inline
      def setStickyTopOffset(value: Double): Self = StObject.set(x, "stickyTopOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyTopOffsetUndefined: Self = StObject.set(x, "stickyTopOffset", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ReactComponentClass[FixedHeaderProps[Any] with RefAttributes[HTMLDivElement]]]
  
  /* This means you don't have to write `default`, but can instead just say `libFixedHolderMod.foo` */
  override def _to: ReactComponentClass[ReactComponentClass[FixedHeaderProps[Any] with RefAttributes[HTMLDivElement]]] = default
}
