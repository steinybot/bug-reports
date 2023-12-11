package web.typings.rcMentions

import web.typings.rcMentions.anon.PartialMentionsPropsRefAt
import web.typings.rcMentions.anon.WeakValidationMapMentions
import web.typings.rcMentions.esMentionsMod.MentionsProps
import web.typings.rcMentions.esMentionsMod.MentionsRef
import web.typings.rcMentions.esOptionMod.OptionProps
import web.typings.react.mod.RefAttributes
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined react.react.ForwardRefExoticComponent<rc-mentions.rc-mentions/es/Mentions.MentionsProps & react.react.RefAttributes<rc-mentions.rc-mentions/es/Mentions.MentionsRef>> & {  Option :react.react.FC<rc-mentions.rc-mentions/es/Option.OptionProps>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    @scala.inline
    def apply(props: MentionsProps with RefAttributes[MentionsRef]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("rc-mentions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-mentions", "default.Option")
    @js.native
    def Option: ReactComponentClass[OptionProps] = js.native
    @scala.inline
    def Option_=(x: ReactComponentClass[OptionProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-mentions", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialMentionsPropsRefAt] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialMentionsPropsRefAt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-mentions", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-mentions", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapMentions] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapMentions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-mentions", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
}
