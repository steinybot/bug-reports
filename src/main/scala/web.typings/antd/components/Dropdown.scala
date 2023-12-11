package web.typings.antd.components

import web.typings.antd.esDropdownDropdownButtonMod.DropdownButtonProps
import web.typings.antd.esDropdownDropdownMod.DropdownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  object Button {
    
    @JSImport("antd", "Dropdown.Button")
    @js.native
    val component: js.Object = js.native
    
    type Props = DropdownButtonProps
    
    implicit def make(companion: Button.type): SharedBuilder_DropdownButtonProps_1585901623 = new SharedBuilder_DropdownButtonProps_1585901623(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DropdownButtonProps): SharedBuilder_DropdownButtonProps_1585901623 = new SharedBuilder_DropdownButtonProps_1585901623(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object InternalPanelDoNotUseOrYouWillBeFired {
    
    @JSImport("antd", "Dropdown.InternalPanelDoNotUseOrYouWillBeFired")
    @js.native
    val component: js.Object = js.native
    
    type Props = DropdownProps
    
    implicit def make(companion: InternalPanelDoNotUseOrYouWillBeFired.type): SharedBuilder_DropdownProps_1577630435 = new SharedBuilder_DropdownProps_1577630435(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DropdownProps): SharedBuilder_DropdownProps_1577630435 = new SharedBuilder_DropdownProps_1577630435(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Dropdown")
  @js.native
  val component: js.Object = js.native
  
  type Props = DropdownProps
  
  implicit def make(companion: Dropdown.type): SharedBuilder_DropdownProps_1577630435 = new SharedBuilder_DropdownProps_1577630435(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownProps): SharedBuilder_DropdownProps_1577630435 = new SharedBuilder_DropdownProps_1577630435(js.Array(this.component, p.asInstanceOf[js.Any]))
}
