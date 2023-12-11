package web.typings.antd

import web.typings.antd.anon.PartialDropdownProps
import web.typings.antd.anon.WeakValidationMapDropdown
import web.typings.antd.esDropdownDropdownButtonMod.CompoundedComponent
import web.typings.antd.esDropdownDropdownMod.DropdownProps
import web.typings.react.mod.ValidationMap
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDropdownMod {
  
  /* Inlined {  _InternalPanelDoNotUseOrYouWillBeFired :react.react.FC<antd.antd/es/dropdown/dropdown.DropdownProps>,   Button :antd.antd/es/dropdown/dropdown-button.CompoundedComponent} & react.react.FC<antd.antd/es/dropdown/dropdown.DropdownProps> */
  object default {
    
    @scala.inline
    def apply(props: DropdownProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    @scala.inline
    def apply(props: DropdownProps, context: Any): ReactElement = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/dropdown", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/dropdown", "default.Button")
    @js.native
    def Button: CompoundedComponent = js.native
    @scala.inline
    def Button_=(x: CompoundedComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/dropdown", "default._InternalPanelDoNotUseOrYouWillBeFired")
    @js.native
    def InternalPanelDoNotUseOrYouWillBeFired: ReactComponentClass[DropdownProps] = js.native
    
    @scala.inline
    def InternalPanelDoNotUseOrYouWillBeFired_=(x: ReactComponentClass[DropdownProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_InternalPanelDoNotUseOrYouWillBeFired")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/dropdown", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/dropdown", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialDropdownProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialDropdownProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/dropdown", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/dropdown", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapDropdown] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapDropdown]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
