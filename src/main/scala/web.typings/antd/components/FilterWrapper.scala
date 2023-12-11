package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esTableHooksUseFilterFilterWrapperMod.FilterDropdownMenuWrapperProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilterWrapper {
  
  @JSImport("antd/es/table/hooks/useFilter/FilterWrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  type Props = FilterDropdownMenuWrapperProps with RefAttributes[HTMLDivElement]
  
  implicit def make(companion: FilterWrapper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FilterDropdownMenuWrapperProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
