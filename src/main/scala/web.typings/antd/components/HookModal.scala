package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esModalInterfaceMod.ModalFuncProps
import web.typings.antd.esModalUseModalHookModalMod.HookModalProps
import web.typings.antd.esModalUseModalHookModalMod.HookModalRef
import web.typings.react.mod.RefAttributes
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HookModal {
  
  @scala.inline
  def apply(afterClose: () => Unit, config: ModalFuncProps): Builder = {
    val __props = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), config = config.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HookModalProps with RefAttributes[HookModalRef]]))
  }
  
  @JSImport("antd/es/modal/useModal/HookModal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HookModalRef] {
    
    @scala.inline
    def isSilent(value: () => Boolean): this.type = set("isSilent", js.Any.fromFunction0(value))
    
    @scala.inline
    def onConfirm(value: /* confirmed */ Boolean => Unit): this.type = set("onConfirm", js.Any.fromFunction1(value))
  }
  
  type Props = HookModalProps with RefAttributes[HookModalRef]
  
  def withProps(p: HookModalProps with RefAttributes[HookModalRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
