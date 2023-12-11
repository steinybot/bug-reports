package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esStatisticNumberMod.NumberProps
import web.typings.antd.esStatisticUtilsMod.FormatConfig
import web.typings.antd.esStatisticUtilsMod.Formatter
import web.typings.antd.esStatisticUtilsMod.valueType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Number {
  
  @scala.inline
  def apply(value: valueType): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NumberProps]))
  }
  
  @JSImport("antd/es/statistic/Number", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def decimalSeparator(value: String): this.type = set("decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatter(value: Formatter): this.type = set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatterFunction2(value: (/* value */ valueType, /* config */ js.UndefOr[FormatConfig]) => ReactElement): this.type = set("formatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def groupSeparator(value: String): this.type = set("groupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  }
  
  type Props = NumberProps
  
  def withProps(p: NumberProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
