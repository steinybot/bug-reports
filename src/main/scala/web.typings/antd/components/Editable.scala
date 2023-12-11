package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.antd.esTypographyEditableMod.EditableProps
import web.typings.rcTextarea.esInterfaceMod.AutoSizeType
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Editable {
  
  @scala.inline
  def apply(onCancel: () => Unit, onSave: String => Unit, prefixCls: String, value: String): Builder = {
    val __props = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSave = js.Any.fromFunction1(onSave), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EditableProps]))
  }
  
  @JSImport("antd/es/typography/Editable", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoSize(value: Boolean | AutoSizeType): this.type = set("autoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enterIcon(value: ReactElement): this.type = set("enterIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnd(value: () => Unit): this.type = set("onEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = EditableProps
  
  def withProps(p: EditableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
