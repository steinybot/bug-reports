package web.typings.antd

import web.typings.rcFieldForm.esInterfaceMod.NamePath
import web.typings.scrollIntoViewIfNeeded.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFormHooksUseFormMod {
  
  @JSImport("antd/es/form/hooks/useForm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Values](): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[FormInstance[Values]]]
  @scala.inline
  def default[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(form.asInstanceOf[js.Any]).asInstanceOf[js.Array[FormInstance[Values]]]
  
  @js.native
  trait FormInstance[Values]
    extends StObject
       with web.typings.rcFieldForm.esInterfaceMod.FormInstance[Values] {
    
    def getFieldInstance(name: NamePath[Any]): Any = js.native
    
    def scrollToField(name: NamePath[Any]): Unit = js.native
    def scrollToField(name: NamePath[Any], options: Options[Any]): Unit = js.native
  }
}
