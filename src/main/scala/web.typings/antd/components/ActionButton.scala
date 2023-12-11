package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import web.typings.antd.esUtilActionButtonMod.ActionButtonProps
import web.typings.std.PromiseLike
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionButton {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionButtonProps]))
  }
  
  @JSImport("antd/es/_util/ActionButton", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def actionFn(value: /* repeated */ Any => Any | PromiseLike[Any]): this.type = set("actionFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonProps(value: ButtonProps): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def close(value: js.Function): this.type = set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emitEvent(value: Boolean): this.type = set("emitEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isSilent(value: () => Boolean): this.type = set("isSilent", js.Any.fromFunction0(value))
    
    @scala.inline
    def quitOnNullishReturnValue(value: Boolean): this.type = set("quitOnNullishReturnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: LegacyButtonType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  type Props = ActionButtonProps
  
  def withProps(p: ActionButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
