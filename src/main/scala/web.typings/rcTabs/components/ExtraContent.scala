package web.typings.rcTabs.components

import web.typings.StBuildingComponent
import web.typings.rcTabs.esInterfaceMod.TabBarExtraContent
import web.typings.rcTabs.esInterfaceMod.TabBarExtraPosition
import web.typings.rcTabs.esTabNavListExtraContentMod.ExtraContentProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExtraContent {
  
  @scala.inline
  def apply(position: TabBarExtraPosition, prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(position = position.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ExtraContentProps with RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-tabs/es/TabNavList/ExtraContent", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def extra(value: TabBarExtraContent): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
  }
  
  type Props = ExtraContentProps with RefAttributes[HTMLDivElement]
  
  def withProps(p: ExtraContentProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
