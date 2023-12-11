package web.typings.antd

import web.typings.antd.anon.PartialPopoverPropsRefAtt
import web.typings.antd.anon.WeakValidationMapPopoverP
import web.typings.antd.esPopoverPurePanelMod.PurePanelProps
import web.typings.antd.esTooltipMod.AbstractTooltipProps
import web.typings.antd.esUtilGetRenderPropValueMod.RenderFunction
import web.typings.react.mod.RefAttributes
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopoverMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<antd.antd/es/popover.PopoverProps & react.react.RefAttributes<unknown>> & {  _InternalPanelDoNotUseOrYouWillBeFired :react.react.FC<antd.antd/es/popover/PurePanel.PurePanelProps>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    @scala.inline
    def apply(props: PopoverProps with RefAttributes[Any]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/popover", "default._InternalPanelDoNotUseOrYouWillBeFired")
    @js.native
    def InternalPanelDoNotUseOrYouWillBeFired: ReactComponentClass[PurePanelProps] = js.native
    
    @scala.inline
    def InternalPanelDoNotUseOrYouWillBeFired_=(x: ReactComponentClass[PurePanelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_InternalPanelDoNotUseOrYouWillBeFired")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/popover", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialPopoverPropsRefAtt] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialPopoverPropsRefAtt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/popover", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/popover", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapPopoverP] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapPopoverP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/popover", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  @js.native
  trait PopoverProps
    extends StObject
       with AbstractTooltipProps {
    
    var content: js.UndefOr[ReactElement | RenderFunction] = js.native
    
    var title: js.UndefOr[ReactElement | RenderFunction] = js.native
  }
  object PopoverProps {
    
    @scala.inline
    def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactElement | RenderFunction): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction0(value: () => ReactElement): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
