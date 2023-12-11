package web.typings.rcTabs.components

import web.typings.StBuildingComponent
import web.typings.rcTabs.esInterfaceMod.EditableConfig
import web.typings.rcTabs.esInterfaceMod.TabsLocale
import web.typings.rcTabs.esTabNavListAddButtonMod.AddButtonProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLButtonElement
import slinky.web.html.button.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AddButton {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AddButtonProps with RefAttributes[HTMLButtonElement]]))
  }
  
  @JSImport("rc-tabs/es/TabNavList/AddButton", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLButtonElement] {
    
    @scala.inline
    def editable(value: EditableConfig): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: TabsLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = AddButtonProps with RefAttributes[HTMLButtonElement]
  
  def withProps(p: AddButtonProps with RefAttributes[HTMLButtonElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
