package web.typings.rcTable.components

import web.typings.StBuildingComponent
import web.typings.rcTable.libHooksUseFlattenRecordsMod.FlattenData
import web.typings.rcTable.libVirtualTableBodyLineMod.BodyLineProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BodyLine {
  
  @scala.inline
  def apply(data: FlattenData[Any], index: Double, rowKey: Key): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BodyLineProps[Any] with RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-table/lib/VirtualTable/BodyLine", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: Boolean): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getHeight(value: /* rowSpan */ Double => Double): this.type = set("getHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = BodyLineProps[Any] with RefAttributes[HTMLDivElement]
  
  def withProps(p: BodyLineProps[Any] with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
