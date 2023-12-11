package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esFormFormItemInputMod.FormItemInputMiscProps
import web.typings.antd.esFormFormItemInputMod.FormItemInputProps
import web.typings.antd.esFormFormItemMod.ValidateStatus
import web.typings.antd.esGridColMod.ColProps
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormItemInput {
  
  @scala.inline
  def apply(errors: js.Array[ReactElement], prefixCls: String, warnings: js.Array[ReactElement]): Builder = {
    val __props = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FormItemInputProps with FormItemInputMiscProps]))
  }
  
  @JSImport("antd/es/form/FormItemInput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fieldId(value: String): this.type = set("fieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def help(value: ReactElement): this.type = set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginBottom(value: Double): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginBottomNull: this.type = set("marginBottom", null)
    
    @scala.inline
    def onErrorVisibleChanged(value: /* visible */ Boolean => Unit): this.type = set("onErrorVisibleChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def status(value: ValidateStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperCol(value: ColProps): this.type = set("wrapperCol", value.asInstanceOf[js.Any])
  }
  
  type Props = FormItemInputProps with FormItemInputMiscProps
  
  def withProps(p: FormItemInputProps with FormItemInputMiscProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
