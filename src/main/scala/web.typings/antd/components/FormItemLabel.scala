package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.FormItemLabelPropsrequire
import web.typings.antd.esFormFormItemLabelMod.LabelTooltipType
import web.typings.antd.esFormInterfaceMod.FormLabelAlign
import web.typings.antd.esGridColMod.ColProps
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormItemLabel {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FormItemLabelPropsrequire]))
  }
  
  @JSImport("antd/es/form/FormItemLabel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def colon(value: Boolean): this.type = set("colon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def htmlFor(value: String): this.type = set("htmlFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelAlign(value: FormLabelAlign): this.type = set("labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelCol(value: ColProps): this.type = set("labelCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: LabelTooltipType): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipReactElement(value: ReactElement): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  type Props = FormItemLabelPropsrequire
  
  def withProps(p: FormItemLabelPropsrequire): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
