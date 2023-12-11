package web.typings.rcTable.components

import web.typings.StBuildingComponent
import web.typings.rcTable.anon.CurrentTarget
import web.typings.rcTable.libFixedHolderMod.FixedHeaderProps
import web.typings.rcTable.libHeaderHeaderMod.HeaderProps
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.ColumnsType
import web.typings.rcTable.libInterfaceMod.Direction
import web.typings.rcTable.libInterfaceMod.StickyOffsets
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.RefAttributes
import web.typings.react.mod.TdHTMLAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FixedHolder {
  
  @scala.inline
  def apply(
    children: HeaderProps[Any] => ReactElement,
    className: String,
    colWidths: js.Array[Double],
    columCount: Double,
    columns: ColumnsType[Any],
    direction: Direction,
    fixHeader: Boolean,
    flattenColumns: js.Array[ColumnType[Any]],
    maxContentScroll: Boolean,
    noData: Boolean,
    onHeaderRow: (js.Array[ColumnType[Any]], /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any],
    onScroll: CurrentTarget => Unit,
    stickyOffsets: StickyOffsets
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), className = className.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], columCount = columCount.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], maxContentScroll = maxContentScroll.asInstanceOf[js.Any], noData = noData.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), onScroll = js.Any.fromFunction1(onScroll), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FixedHeaderProps[Any] with RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-table/lib/FixedHolder", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def stickyBottomOffset(value: Double): this.type = set("stickyBottomOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stickyClassName(value: String): this.type = set("stickyClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stickyTopOffset(value: Double): this.type = set("stickyTopOffset", value.asInstanceOf[js.Any])
  }
  
  type Props = FixedHeaderProps[Any] with RefAttributes[HTMLDivElement]
  
  def withProps(p: FixedHeaderProps[Any] with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
