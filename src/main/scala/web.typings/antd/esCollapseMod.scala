package web.typings.antd

import web.typings.antd.anon.PartialCollapsePropsRefAt
import web.typings.antd.anon.WeakValidationMapCollapse
import web.typings.antd.esCollapseCollapseMod.CollapseProps
import web.typings.antd.esCollapseCollapsePanelMod.CollapsePanelProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCollapseMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<antd.antd/es/collapse/Collapse.CollapseProps & react.react.RefAttributes<std.HTMLDivElement>> & {  Panel :react.react.ForwardRefExoticComponent<antd.antd/es/collapse/CollapsePanel.CollapsePanelProps & react.react.RefAttributes<std.HTMLDivElement>>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    @scala.inline
    def apply(props: CollapseProps with RefAttributes[HTMLDivElement]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/collapse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/collapse", "default.Panel")
    @js.native
    def Panel: ReactComponentClass[CollapsePanelProps with RefAttributes[HTMLDivElement]] = js.native
    @scala.inline
    def Panel_=(x: ReactComponentClass[CollapsePanelProps with RefAttributes[HTMLDivElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Panel")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/collapse", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCollapsePropsRefAt] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialCollapsePropsRefAt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/collapse", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/collapse", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCollapse] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapCollapse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/collapse", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
}
