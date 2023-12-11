package web.typings.rcUtil.components

import web.typings.StBuildingComponent
import web.typings.rcUtil.anon.GetContainer
import web.typings.rcUtil.esPortalWrapperMod.PortalWrapperProps
import web.typings.rcUtil.esPortalWrapperMod.default
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortalWrapper {
  
  @scala.inline
  def apply(children: GetContainer => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[PortalWrapperProps]))
  }
  
  @JSImport("rc-util/es/PortalWrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainer(value: web.typings.rcUtil.esPortalWrapperMod.GetContainer): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainerFunction0(value: () => HTMLElement): this.type = set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperClassName(value: String): this.type = set("wrapperClassName", value.asInstanceOf[js.Any])
  }
  
  type Props = PortalWrapperProps
  
  def withProps(p: PortalWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
