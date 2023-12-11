package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esMessageInterfaceMod.NoticeType
import web.typings.antd.esMessagePurePanelMod.PureContentProps
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PureContent {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PureContentProps]))
  }
  
  @JSImport("antd/es/message/PurePanel", "PureContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: NoticeType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  type Props = PureContentProps
  
  def withProps(p: PureContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
