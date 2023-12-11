package web.typings.rcCollapse

import web.typings.rcCollapse.anon.PartialCollapsePropsRefAt
import web.typings.rcCollapse.anon.WeakValidationMapCollapse
import web.typings.rcCollapse.esInterfaceMod.CollapsePanelProps
import web.typings.rcCollapse.esInterfaceMod.CollapseProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCollapseMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<rc-collapse.rc-collapse/es/interface.CollapseProps & react.react.RefAttributes<std.HTMLDivElement>> & {  Panel :react.react.ForwardRefExoticComponent<rc-collapse.rc-collapse/es/interface.CollapsePanelProps & react.react.RefAttributes<std.HTMLDivElement>>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    @scala.inline
    def apply(props: CollapseProps with RefAttributes[HTMLDivElement]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("rc-collapse/es/Collapse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @deprecated use `items` instead, will be removed in `v4.0.0`
      */
    @JSImport("rc-collapse/es/Collapse", "default.Panel")
    @js.native
    def Panel: ReactComponentClass[CollapsePanelProps with RefAttributes[HTMLDivElement]] = js.native
    @scala.inline
    def Panel_=(x: ReactComponentClass[CollapsePanelProps with RefAttributes[HTMLDivElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Panel")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-collapse/es/Collapse", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCollapsePropsRefAt] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialCollapsePropsRefAt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-collapse/es/Collapse", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-collapse/es/Collapse", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCollapse] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapCollapse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-collapse/es/Collapse", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
}
