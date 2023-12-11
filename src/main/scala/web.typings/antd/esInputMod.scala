package web.typings.antd

import web.typings.antd.esInputGroupMod.GroupProps
import web.typings.antd.esInputInputMod.InputProps
import web.typings.antd.esInputPasswordMod.PasswordProps
import web.typings.antd.esInputSearchMod.SearchProps
import web.typings.antd.esInputTextAreaMod.TextAreaProps
import web.typings.antd.esInputTextAreaMod.TextAreaRef
import web.typings.rcInput.esInterfaceMod.InputRef
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInputMod extends Shortcut {
  
  @JSImport("antd/es/input", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[InputProps with RefAttributes[InputRef]] {
    
    var Group: ReactComponentClass[GroupProps] = js.native
    
    var Password: ReactComponentClass[PasswordProps with RefAttributes[InputRef]] = js.native
    
    var Search: ReactComponentClass[SearchProps with RefAttributes[InputRef]] = js.native
    
    var TextArea: ReactComponentClass[TextAreaProps with RefAttributes[TextAreaRef]] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esInputMod.foo` */
  override def _to: CompoundedComponent = default
}
