package web.typings.antd

import web.typings.antd.anon.PartialPopconfirmPropsRef
import web.typings.antd.anon.WeakValidationMapPopconfi
import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import web.typings.antd.esPopconfirmPurePanelMod.PurePanelProps
import web.typings.antd.esTooltipMod.AbstractTooltipProps
import web.typings.antd.esUtilGetRenderPropValueMod.RenderFunction
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopconfirmMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<antd.antd/es/popconfirm.PopconfirmProps & react.react.RefAttributes<unknown>> & {  _InternalPanelDoNotUseOrYouWillBeFired :react.react.FC<antd.antd/es/popconfirm/PurePanel.PurePanelProps>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    @scala.inline
    def apply(props: PopconfirmProps with RefAttributes[Any]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/popconfirm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/popconfirm", "default._InternalPanelDoNotUseOrYouWillBeFired")
    @js.native
    def InternalPanelDoNotUseOrYouWillBeFired: ReactComponentClass[PurePanelProps] = js.native
    
    @scala.inline
    def InternalPanelDoNotUseOrYouWillBeFired_=(x: ReactComponentClass[PurePanelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_InternalPanelDoNotUseOrYouWillBeFired")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/popconfirm", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialPopconfirmPropsRef] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialPopconfirmPropsRef]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/popconfirm", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/popconfirm", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapPopconfi] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapPopconfi]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/popconfirm", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  @js.native
  trait PopconfirmProps
    extends StObject
       with AbstractTooltipProps {
    
    var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var cancelText: js.UndefOr[ReactElement] = js.native
    
    var description: js.UndefOr[ReactElement | RenderFunction] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var okButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var okText: js.UndefOr[ReactElement] = js.native
    
    var okType: js.UndefOr[LegacyButtonType] = js.native
    
    var onCancel: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], Unit]] = js.native
    
    var onConfirm: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], Unit]] = js.native
    
    @JSName("onOpenChange")
    var onOpenChange_PopconfirmProps: js.UndefOr[
        js.Function2[
          /* open */ Boolean, 
          /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLDivElement]], 
          Unit
        ]
      ] = js.native
    
    var onPopupClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
    
    var showCancel: js.UndefOr[Boolean] = js.native
    
    var title: ReactElement | RenderFunction = js.native
  }
  object PopconfirmProps {
    
    @scala.inline
    def apply(title: ReactElement | RenderFunction): PopconfirmProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopconfirmProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PopconfirmProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      @scala.inline
      def setCancelText(value: ReactElement): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement | RenderFunction): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFunction0(value: () => ReactElement): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDescriptionReactElement(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      @scala.inline
      def setOkText(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      @scala.inline
      def setOnCancel(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      @scala.inline
      def setOnOpenChange(
        value: (/* open */ Boolean, /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLDivElement]]) => Unit
      ): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOnPopupClick(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onPopupClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPopupClickUndefined: Self = StObject.set(x, "onPopupClick", js.undefined)
      
      @scala.inline
      def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopconfirmState extends StObject {
    
    var open: js.UndefOr[Boolean] = js.native
  }
  object PopconfirmState {
    
    @scala.inline
    def apply(): PopconfirmState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopconfirmState]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PopconfirmState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
}
