package web.typings.rcFieldForm.components

import web.typings.rcFieldForm.esFormContextMod.FormProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormProvider {
  
  @JSImport("rc-field-form", "FormProvider")
  @js.native
  val component: js.Object = js.native
  
  type Props = FormProviderProps
  
  implicit def make(companion: FormProvider.type): SharedBuilder_FormProviderProps_1047307747 = new SharedBuilder_FormProviderProps_1047307747(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FormProviderProps): SharedBuilder_FormProviderProps_1047307747 = new SharedBuilder_FormProviderProps_1047307747(js.Array(this.component, p.asInstanceOf[js.Any]))
}
