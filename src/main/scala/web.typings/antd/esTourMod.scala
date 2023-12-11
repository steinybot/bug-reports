package web.typings.antd

import web.typings.antd.anon.PartialTourProps
import web.typings.antd.anon.WeakValidationMapTourProp
import web.typings.antd.esTourInterfaceMod.TourProps
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.ValidationMap
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTourMod {
  
  /* Inlined react.react.FC<antd.antd/es/tour/interface.TourProps> & {  _InternalPanelDoNotUseOrYouWillBeFired :(props : any): react.react.JSX.Element} */
  object default {
    
    @scala.inline
    def apply(props: TourProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    @scala.inline
    def apply(props: TourProps, context: Any): ReactElement = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/tour", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/tour", "default._InternalPanelDoNotUseOrYouWillBeFired")
    @js.native
    def InternalPanelDoNotUseOrYouWillBeFired: js.Function1[/* props */ Any, Element] = js.native
    
    @scala.inline
    def InternalPanelDoNotUseOrYouWillBeFired_=(x: js.Function1[/* props */ Any, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_InternalPanelDoNotUseOrYouWillBeFired")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/tour", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/tour", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTourProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialTourProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/tour", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/tour", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTourProp] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapTourProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
