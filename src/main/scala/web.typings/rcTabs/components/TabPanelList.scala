package web.typings.rcTabs.components

import web.typings.StBuildingComponent
import web.typings.rcTabs.esInterfaceMod.AnimatedConfig
import web.typings.rcTabs.esInterfaceMod.TabPosition
import web.typings.rcTabs.esTabPanelListMod.TabPanelListProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPanelList {
  
  @scala.inline
  def apply(activeKey: String, id: String): Builder = {
    val __props = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabPanelListProps]))
  }
  
  @JSImport("rc-tabs/es/TabPanelList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def animated(value: AnimatedConfig): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def destroyInactiveTabPane(value: Boolean): this.type = set("destroyInactiveTabPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabPosition(value: TabPosition): this.type = set("tabPosition", value.asInstanceOf[js.Any])
  }
  
  type Props = TabPanelListProps
  
  def withProps(p: TabPanelListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
