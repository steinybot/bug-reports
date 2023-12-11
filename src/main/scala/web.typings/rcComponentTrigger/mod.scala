package web.typings.rcComponentTrigger

import web.typings.rcComponentTrigger.esInterfaceMod.ActionType
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.AnimationType
import web.typings.rcComponentTrigger.esInterfaceMod.ArrowTypeOuter
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.rcComponentTrigger.esInterfaceMod.TransitionNameType
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.ReactInstance
import web.typings.react.mod.RefAttributes
import web.typings.std.VoidFunction
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rc-component/trigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rc-component/trigger", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TriggerProps with RefAttributes[TriggerRef]] = js.native
  
  @scala.inline
  def generateTrigger(): ReactComponentClass[TriggerProps with RefAttributes[TriggerRef]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTrigger")().asInstanceOf[ReactComponentClass[TriggerProps with RefAttributes[TriggerRef]]]
  @scala.inline
  def generateTrigger(PortalComponent: ReactComponentClass[Any]): ReactComponentClass[TriggerProps with RefAttributes[TriggerRef]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTrigger")(PortalComponent.asInstanceOf[js.Any]).asInstanceOf[ReactComponentClass[TriggerProps with RefAttributes[TriggerRef]]]
  
  @js.native
  trait TriggerProps extends StObject {
    
    var action: js.UndefOr[ActionType | js.Array[ActionType]] = js.native
    
    var afterPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var alignPoint: js.UndefOr[Boolean] = js.native
    
    var arrow: js.UndefOr[Boolean | ArrowTypeOuter] = js.native
    
    var autoDestroy: js.UndefOr[Boolean] = js.native
    
    var blurDelay: js.UndefOr[Double] = js.native
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.native
    
    var children: ReactElement = js.native
    
    /** @deprecated Add `className` on `children`. Please add `className` directly instead. */
    var className: js.UndefOr[String] = js.native
    
    var defaultPopupVisible: js.UndefOr[Boolean] = js.native
    
    /** @deprecated Please use `autoDestroy` instead */
    var destroyPopupOnHide: js.UndefOr[Boolean] = js.native
    
    var focusDelay: js.UndefOr[Double] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    /**
      * Trigger will memo content when close.
      * This may affect the case if want to keep content update.
      * Set `fresh` to `false` will always keep update.
      */
    var fresh: js.UndefOr[Boolean] = js.native
    
    var getPopupClassNameFromAlign: js.UndefOr[js.Function1[/* align */ AlignType, String]] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    /**
      * @private Get trigger DOM node.
      * Used for some component is function component which can not access by `findDOMNode`
      */
    var getTriggerDOMNode: js.UndefOr[js.Function1[/* node */ ReactInstance, HTMLElement]] = js.native
    
    var hideAction: js.UndefOr[js.Array[ActionType]] = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
    
    /** @deprecated Please us `maskMotion` instead. */
    var maskAnimation: js.UndefOr[AnimationType] = js.native
    
    var maskClosable: js.UndefOr[Boolean] = js.native
    
    /** Set mask motion. You can ref `rc-motion` for more info. */
    var maskMotion: js.UndefOr[CSSMotionProps] = js.native
    
    /** @deprecated Please us `maskMotion` instead. */
    var maskTransitionName: js.UndefOr[TransitionNameType] = js.native
    
    var mouseEnterDelay: js.UndefOr[Double] = js.native
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.native
    
    var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.native
    
    var onPopupClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var popup: ReactElement | js.Function0[ReactElement] = js.native
    
    var popupAlign: js.UndefOr[AlignType] = js.native
    
    /** @deprecated Please us `popupMotion` instead. */
    var popupAnimation: js.UndefOr[AnimationType] = js.native
    
    var popupClassName: js.UndefOr[String] = js.native
    
    /** Set popup motion. You can ref `rc-motion` for more info. */
    var popupMotion: js.UndefOr[CSSMotionProps] = js.native
    
    var popupPlacement: js.UndefOr[String] = js.native
    
    var popupStyle: js.UndefOr[CSSProperties] = js.native
    
    /** @deprecated Please us `popupMotion` instead. */
    var popupTransitionName: js.UndefOr[TransitionNameType] = js.native
    
    var popupVisible: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var showAction: js.UndefOr[js.Array[ActionType]] = js.native
    
    var stretch: js.UndefOr[String] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object TriggerProps {
    
    @scala.inline
    def apply(children: ReactElement, popup: ReactElement | js.Function0[ReactElement]): TriggerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ActionType | js.Array[ActionType]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setActionVarargs(value: ActionType*): Self = StObject.set(x, "action", js.Array(value :_*))
      
      @scala.inline
      def setAfterPopupVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "afterPopupVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterPopupVisibleChangeUndefined: Self = StObject.set(x, "afterPopupVisibleChange", js.undefined)
      
      @scala.inline
      def setAlignPoint(value: Boolean): Self = StObject.set(x, "alignPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignPointUndefined: Self = StObject.set(x, "alignPoint", js.undefined)
      
      @scala.inline
      def setArrow(value: Boolean | ArrowTypeOuter): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      @scala.inline
      def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      @scala.inline
      def setBlurDelay(value: Double): Self = StObject.set(x, "blurDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurDelayUndefined: Self = StObject.set(x, "blurDelay", js.undefined)
      
      @scala.inline
      def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultPopupVisible(value: Boolean): Self = StObject.set(x, "defaultPopupVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPopupVisibleUndefined: Self = StObject.set(x, "defaultPopupVisible", js.undefined)
      
      @scala.inline
      def setDestroyPopupOnHide(value: Boolean): Self = StObject.set(x, "destroyPopupOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyPopupOnHideUndefined: Self = StObject.set(x, "destroyPopupOnHide", js.undefined)
      
      @scala.inline
      def setFocusDelay(value: Double): Self = StObject.set(x, "focusDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusDelayUndefined: Self = StObject.set(x, "focusDelay", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
      
      @scala.inline
      def setGetPopupClassNameFromAlign(value: /* align */ AlignType => String): Self = StObject.set(x, "getPopupClassNameFromAlign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupClassNameFromAlignUndefined: Self = StObject.set(x, "getPopupClassNameFromAlign", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setGetTriggerDOMNode(value: /* node */ ReactInstance => HTMLElement): Self = StObject.set(x, "getTriggerDOMNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTriggerDOMNodeUndefined: Self = StObject.set(x, "getTriggerDOMNode", js.undefined)
      
      @scala.inline
      def setHideAction(value: js.Array[ActionType]): Self = StObject.set(x, "hideAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideActionUndefined: Self = StObject.set(x, "hideAction", js.undefined)
      
      @scala.inline
      def setHideActionVarargs(value: ActionType*): Self = StObject.set(x, "hideAction", js.Array(value :_*))
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskAnimation(value: AnimationType): Self = StObject.set(x, "maskAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskAnimationUndefined: Self = StObject.set(x, "maskAnimation", js.undefined)
      
      @scala.inline
      def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      @scala.inline
      def setMaskMotion(value: CSSMotionProps): Self = StObject.set(x, "maskMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskMotionUndefined: Self = StObject.set(x, "maskMotion", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: TransitionNameType): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      @scala.inline
      def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      @scala.inline
      def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = StObject.set(x, "onPopupAlign", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
      
      @scala.inline
      def setOnPopupClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPopupClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPopupClickUndefined: Self = StObject.set(x, "onPopupClick", js.undefined)
      
      @scala.inline
      def setOnPopupVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onPopupVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPopupVisibleChangeUndefined: Self = StObject.set(x, "onPopupVisibleChange", js.undefined)
      
      @scala.inline
      def setPopup(value: ReactElement | js.Function0[ReactElement]): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupAlign(value: AlignType): Self = StObject.set(x, "popupAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupAlignUndefined: Self = StObject.set(x, "popupAlign", js.undefined)
      
      @scala.inline
      def setPopupAnimation(value: AnimationType): Self = StObject.set(x, "popupAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupAnimationUndefined: Self = StObject.set(x, "popupAnimation", js.undefined)
      
      @scala.inline
      def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      @scala.inline
      def setPopupFunction0(value: () => ReactElement): Self = StObject.set(x, "popup", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPopupMotion(value: CSSMotionProps): Self = StObject.set(x, "popupMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupMotionUndefined: Self = StObject.set(x, "popupMotion", js.undefined)
      
      @scala.inline
      def setPopupPlacement(value: String): Self = StObject.set(x, "popupPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPlacementUndefined: Self = StObject.set(x, "popupPlacement", js.undefined)
      
      @scala.inline
      def setPopupReactElement(value: ReactElement): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      @scala.inline
      def setPopupTransitionName(value: TransitionNameType): Self = StObject.set(x, "popupTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupTransitionNameUndefined: Self = StObject.set(x, "popupTransitionName", js.undefined)
      
      @scala.inline
      def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShowAction(value: js.Array[ActionType]): Self = StObject.set(x, "showAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowActionUndefined: Self = StObject.set(x, "showAction", js.undefined)
      
      @scala.inline
      def setShowActionVarargs(value: ActionType*): Self = StObject.set(x, "showAction", js.Array(value :_*))
      
      @scala.inline
      def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait TriggerRef extends StObject {
    
    var forceAlign: VoidFunction = js.native
    
    var nativeElement: HTMLElement = js.native
  }
  object TriggerRef {
    
    @scala.inline
    def apply(forceAlign: () => Unit, nativeElement: HTMLElement): TriggerRef = {
      val __obj = js.Dynamic.literal(forceAlign = js.Any.fromFunction0(forceAlign), nativeElement = nativeElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TriggerRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceAlign(value: () => Unit): Self = StObject.set(x, "forceAlign", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNativeElement(value: HTMLElement): Self = StObject.set(x, "nativeElement", value.asInstanceOf[js.Any])
    }
  }
}
