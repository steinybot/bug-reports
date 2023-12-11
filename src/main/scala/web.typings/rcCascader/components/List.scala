package web.typings.rcCascader.components

import web.typings.StBuildingComponent
import web.typings.rcCascader.esOptionListListMod.RawOptionListProps
import web.typings.rcSelect.libOptionListMod.RefOptionListProps
import web.typings.react.mod.RefAttributes
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @JSImport("rc-cascader/es/OptionList/List", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, RefOptionListProps] {
    
    @scala.inline
    def direction(value: Any): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: Any): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notFoundContent(value: Any): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def open(value: Any): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: Any): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchValue(value: Any): this.type = set("searchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toggleOpen(value: Any): this.type = set("toggleOpen", value.asInstanceOf[js.Any])
  }
  
  type Props = RawOptionListProps with RefAttributes[RefOptionListProps]
  
  implicit def make(companion: List.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RawOptionListProps with RefAttributes[RefOptionListProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
