package web.typings.antd.components

import web.typings.antd.esInputPasswordMod.PasswordProps
import web.typings.rcInput.esInterfaceMod.InputRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Password {
  
  @JSImport("antd/es/input/Password", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = PasswordProps with RefAttributes[InputRef]
  
  implicit def make(companion: Password.type): SharedBuilder_PasswordPropsRefAttributes858351580[InputRef] = new SharedBuilder_PasswordPropsRefAttributes858351580[InputRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PasswordProps with RefAttributes[InputRef]): SharedBuilder_PasswordPropsRefAttributes858351580[InputRef] = new SharedBuilder_PasswordPropsRefAttributes858351580[InputRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
