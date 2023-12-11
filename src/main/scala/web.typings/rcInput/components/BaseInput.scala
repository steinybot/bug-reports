package web.typings.rcInput.components

import web.typings.StBuildingComponent
import web.typings.rcInput.anon.AffixWrapper
import web.typings.rcInput.anon.ClearIcon
import web.typings.rcInput.anon.GroupAddon
import web.typings.rcInput.anon.Prefix
import web.typings.rcInput.anon.Suffix
import web.typings.rcInput.anon.`0`
import web.typings.rcInput.esInterfaceMod.BaseInputProps
import web.typings.rcInput.esInterfaceMod.ValueType
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseInput {
  
  @scala.inline
  def apply(inputElement: ReactElement): Builder = {
    val __props = js.Dynamic.literal(inputElement = inputElement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BaseInputProps]))
  }
  
  @JSImport("rc-input", "BaseInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def addonAfter(value: ReactElement): this.type = set("addonAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def addonBefore(value: ReactElement): this.type = set("addonBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowClear(value: Boolean | ClearIcon): this.type = set("allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNames(value: Prefix): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classes(value: AffixWrapper): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def components(value: GroupAddon): this.type = set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataAttrs(value: `0`): this.type = set("dataAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleReset(value: SyntheticMouseEvent[Element] => Unit): this.type = set("handleReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefix(value: ReactElement): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: Suffix): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suffix(value: ReactElement): this.type = set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerFocus(value: () => Unit): this.type = set("triggerFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def value(value: ValueType): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: String*): this.type = set("value", js.Array(value :_*))
  }
  
  type Props = BaseInputProps
  
  def withProps(p: BaseInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
