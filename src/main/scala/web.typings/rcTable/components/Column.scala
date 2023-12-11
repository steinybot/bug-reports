package web.typings.rcTable.components

import web.typings.StBuildingComponent
import web.typings.rcTable.libInterfaceMod.AlignType
import web.typings.rcTable.libInterfaceMod.CellEllipsisType
import web.typings.rcTable.libInterfaceMod.DataIndex
import web.typings.rcTable.libInterfaceMod.FixedType
import web.typings.rcTable.libInterfaceMod.RenderedCell
import web.typings.rcTable.libInterfaceMod.RowScopeType
import web.typings.rcTable.libSugarColumnMod.ColumnProps
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.TdHTMLAttributes
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Column {
  
  @scala.inline
  def apply[RecordType](): Builder[RecordType] = {
    val __props = js.Dynamic.literal()
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[ColumnProps[RecordType]]))
  }
  
  @JSImport("rc-table", "Column")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[RecordType] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataIndex(value: DataIndex): this.type = set("dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataIndexVarargs(value: (String | Double)*): this.type = set("dataIndex", js.Array(value :_*))
    
    @scala.inline
    def ellipsis(value: CellEllipsisType): this.type = set("ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixed(value: FixedType): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCell(
      value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]
    ): this.type = set("onCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCellClick(value: (RecordType, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onCellClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onHeaderCell(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] with TdHTMLAttributes[Any]
    ): this.type = set("onHeaderCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def render(
      value: (/* value */ Any, RecordType, /* index */ Double) => ReactElement | RenderedCell[RecordType]
    ): this.type = set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def rowScope(value: RowScopeType): this.type = set("rowScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldCellUpdate(value: (RecordType, RecordType) => Boolean): this.type = set("shouldCellUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  type Props[RecordType] = ColumnProps[RecordType]
  
  implicit def make[RecordType](companion: Column.type): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[RecordType](p: ColumnProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
