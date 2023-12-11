package web.typings.rcFieldForm.components

import web.typings.StBuildingComponent
import web.typings.rcFieldForm.esInterfaceMod.Meta
import web.typings.rcFieldForm.esInterfaceMod.NamePath
import web.typings.rcFieldForm.esInterfaceMod.ValidatorRule
import web.typings.rcFieldForm.esListMod.ListField
import web.typings.rcFieldForm.esListMod.ListOperations
import web.typings.rcFieldForm.esListMod.ListProps
import web.typings.rcFieldForm.rcFieldFormBooleans.`false`
import web.typings.react.mod.global.JSX.Element
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @scala.inline
  def apply[Values](name: NamePath[Values]): Builder[Values] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder[Values](js.Array(this.component, __props.asInstanceOf[ListProps[Values]]))
  }
  
  @JSImport("rc-field-form", "List")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[Values] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(
      value: (/* fields */ js.Array[ListField], /* operations */ ListOperations, /* meta */ Meta) => Element | ReactElement
    ): this.type = set("children", js.Any.fromFunction3(value))
    
    @scala.inline
    def initialValue(value: js.Array[Any]): this.type = set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialValueVarargs(value: Any*): this.type = set("initialValue", js.Array(value :_*))
    
    @scala.inline
    def isListField(value: Boolean): this.type = set("isListField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rules(value: js.Array[ValidatorRule]): this.type = set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rulesVarargs(value: ValidatorRule*): this.type = set("rules", js.Array(value :_*))
    
    @scala.inline
    def validateTrigger(value: String | js.Array[String] | `false`): this.type = set("validateTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validateTriggerVarargs(value: String*): this.type = set("validateTrigger", js.Array(value :_*))
  }
  
  type Props[Values] = ListProps[Values]
  
  def withProps[Values](p: ListProps[Values]): Builder[Values] = new Builder[Values](js.Array(this.component, p.asInstanceOf[js.Any]))
}
