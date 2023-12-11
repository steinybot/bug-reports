package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esColorPickerComponentsColorSteppersMod.ColorSteppersProps
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorSteppers {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColorSteppersProps]))
  }
  
  @JSImport("antd/es/color-picker/components/ColorSteppers", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatter(value: (/* value */ js.UndefOr[Double], /* info */ web.typings.rcInputNumber.anon.Input) => String): this.type = set("formatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ Double | Null => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefix(value: /* prefixCls */ String => ReactElement): this.type = set("prefix", js.Any.fromFunction1(value))
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  type Props = ColorSteppersProps
  
  def withProps(p: ColorSteppersProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
