package web.typings.rcComponentPortal.components

import web.typings.StBuildingComponent
import web.typings.rcComponentPortal.esPortalMod.ContainerType
import web.typings.rcComponentPortal.esPortalMod.GetContainer
import web.typings.rcComponentPortal.esPortalMod.PortalProps
import web.typings.react.mod.RefAttributes
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("@rc-component/portal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def autoDestroy(value: Boolean): this.type = set("autoDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoLock(value: Boolean): this.type = set("autoLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debug(value: String): this.type = set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainer(value: GetContainer): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainerFunction0(value: () => ContainerType): this.type = set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  }
  
  type Props = PortalProps with RefAttributes[Any]
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalProps with RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
