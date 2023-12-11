package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.Warnings
import web.typings.antd.esFormFormListMod.FormListFieldData
import web.typings.antd.esFormFormListMod.FormListOperation
import web.typings.antd.esFormFormListMod.FormListProps
import web.typings.rcFieldForm.esInterfaceMod.ValidatorRule
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormList {
  
  @scala.inline
  def apply(
    children: (js.Array[FormListFieldData], FormListOperation, Warnings) => ReactElement,
    name: String | Double | (js.Array[String | Double])
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction3(children), name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FormListProps]))
  }
  
  @JSImport("antd/es/form/FormList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def initialValue(value: js.Array[Any]): this.type = set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialValueVarargs(value: Any*): this.type = set("initialValue", js.Array(value :_*))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rules(value: js.Array[ValidatorRule]): this.type = set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rulesVarargs(value: ValidatorRule*): this.type = set("rules", js.Array(value :_*))
  }
  
  type Props = FormListProps
  
  def withProps(p: FormListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
