package web.typings.rcPagination.components

import web.typings.StBuildingComponent
import web.typings.rcPagination.anon.Option
import web.typings.rcPagination.anon.PartialInternalSelectProp
import web.typings.rcPagination.esInterfaceMod.PaginationLocale
import web.typings.rcPagination.esOptionsMod.OptionsProps
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Options {
  
  @scala.inline
  def apply(
    locale: PaginationLocale,
    pageSize: Double,
    rootPrefixCls: String,
    selectComponentClass: ReactComponentClass[PartialInternalSelectProp] with Option
  ): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], rootPrefixCls = rootPrefixCls.asInstanceOf[js.Any], selectComponentClass = selectComponentClass.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OptionsProps]))
  }
  
  @JSImport("rc-pagination/es/Options", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def buildOptionText(value: /* value */ String | Double => String): this.type = set("buildOptionText", js.Any.fromFunction1(value))
    
    @scala.inline
    def changeSize(value: /* size */ Double => Unit): this.type = set("changeSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def goButton(value: Boolean | String): this.type = set("goButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageSizeOptions(value: js.Array[String | Double]): this.type = set("pageSizeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageSizeOptionsVarargs(value: (String | Double)*): this.type = set("pageSizeOptions", js.Array(value :_*))
    
    @scala.inline
    def quickGo(value: /* value */ Double => Unit): this.type = set("quickGo", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectPrefixCls(value: String): this.type = set("selectPrefixCls", value.asInstanceOf[js.Any])
  }
  
  type Props = OptionsProps
  
  def withProps(p: OptionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
