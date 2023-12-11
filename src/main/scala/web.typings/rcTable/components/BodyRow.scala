package web.typings.rcTable.components

import web.typings.StBuildingComponent
import web.typings.rcTable.anon.Children
import web.typings.rcTable.libBodyBodyRowMod.BodyRowProps
import web.typings.rcTable.libInterfaceMod.CustomizeComponent
import web.typings.rcTable.libInterfaceMod.Key
import web.typings.react.mod.CSSProperties
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BodyRow {
  
  @scala.inline
  def apply[RecordType /* <: Children[RecordType] */](
    cellComponent: CustomizeComponent,
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    index: Double,
    record: RecordType,
    renderIndex: Double,
    rowComponent: CustomizeComponent,
    rowKey: web.typings.react.mod.Key,
    scopeCellComponent: CustomizeComponent
  ): Builder[RecordType] = {
    val __props = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), index = index.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], renderIndex = renderIndex.asInstanceOf[js.Any], rowComponent = rowComponent.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any], scopeCellComponent = scopeCellComponent.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[BodyRowProps[RecordType]]))
  }
  
  @JSImport("rc-table/lib/Body/BodyRow", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[RecordType /* <: Children[RecordType] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indent(value: Double): this.type = set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props[RecordType /* <: Children[RecordType] */] = BodyRowProps[RecordType]
  
  def withProps[RecordType /* <: Children[RecordType] */](p: BodyRowProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
