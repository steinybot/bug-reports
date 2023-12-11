package web.typings.rcMentions.components

import web.typings.rcMentions.esMentionsMod.MentionsProps
import web.typings.rcMentions.esMentionsMod.MentionsRef
import web.typings.rcMentions.esOptionMod.OptionProps
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mentions {
  
  object Option {
    
    @JSImport("rc-mentions/es/Mentions", "default.Option")
    @js.native
    val component: js.Object = js.native
    
    type Props = OptionProps
    
    implicit def make(companion: Option.type): SharedBuilder_OptionProps1915032353 = new SharedBuilder_OptionProps1915032353(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OptionProps): SharedBuilder_OptionProps1915032353 = new SharedBuilder_OptionProps1915032353(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-mentions/es/Mentions", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = MentionsProps with RefAttributes[MentionsRef]
  
  implicit def make(companion: Mentions.type): SharedBuilder_MentionsPropsRefAttributes_680664533[MentionsRef] = new SharedBuilder_MentionsPropsRefAttributes_680664533[MentionsRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MentionsProps with RefAttributes[MentionsRef]): SharedBuilder_MentionsPropsRefAttributes_680664533[MentionsRef] = new SharedBuilder_MentionsPropsRefAttributes_680664533[MentionsRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
