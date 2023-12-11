package web.typings.rcTable.components

import web.typings.StBuildingComponent
import web.typings.rcTable.libBodyMod.BodyProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Body {
  
  @scala.inline
  def apply[RecordType](data: js.Array[RecordType], measureColumnWidth: Boolean): Builder[RecordType] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], measureColumnWidth = measureColumnWidth.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[BodyProps[RecordType]]))
  }
  
  @JSImport("rc-table/lib/Body", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[RecordType] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  type Props[RecordType] = BodyProps[RecordType]
  
  def withProps[RecordType](p: BodyProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
