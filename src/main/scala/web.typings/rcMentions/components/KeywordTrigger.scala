package web.typings.rcMentions.components

import web.typings.StBuildingComponent
import web.typings.rcMentions.esKeywordTriggerMod.KeywordTriggerProps
import web.typings.rcMentions.esMentionsMod.DataDrivenOptionProps
import web.typings.rcMentions.esMentionsMod.Direction
import web.typings.rcMentions.esMentionsMod.Placement
import org.scalajs.dom.HTMLElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeywordTrigger {
  
  @scala.inline
  def apply(options: js.Array[DataDrivenOptionProps]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[KeywordTriggerProps]))
  }
  
  @JSImport("rc-mentions/es/KeywordTrigger", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def direction(value: Direction): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: () => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  type Props = KeywordTriggerProps
  
  def withProps(p: KeywordTriggerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
