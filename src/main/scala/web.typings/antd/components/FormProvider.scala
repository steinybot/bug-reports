package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esFormContextMod.FormProviderProps
import web.typings.rcFieldForm.esFormContextMod.FormChangeInfo
import web.typings.rcFieldForm.esFormContextMod.FormFinishInfo
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormProvider {
  
  @JSImport("antd/es/form/context", "FormProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def onFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Unit): this.type = set("onFormChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Unit): this.type = set("onFormFinish", js.Any.fromFunction2(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  }
  
  type Props = FormProviderProps
  
  implicit def make(companion: FormProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FormProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
