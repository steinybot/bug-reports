package web.typings.antd

import web.typings.antd.anon.AdjustY
import web.typings.antd.anon.ArrowPointAtCenter
import web.typings.antd.anon.KeepParent
import web.typings.antd.esTooltipPurePanelMod.PurePanelProps
import web.typings.antd.esUtilColorsMod.PresetColorType
import web.typings.antd.esUtilGetRenderPropValueMod.RenderFunction
import web.typings.antd.esUtilPlacementsMod.AdjustOverflow
import web.typings.antd.esUtilTypeMod.LiteralUnion
import web.typings.rcComponentTrigger.esInterfaceMod.ActionType
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.AnimationType
import web.typings.rcComponentTrigger.esInterfaceMod.ArrowTypeOuter
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import web.typings.react.mod.WeakValidationMap
import web.typings.std.Partial
import web.typings.std.VoidFunction
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTooltipMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<antd.antd/es/tooltip.TooltipProps & react.react.RefAttributes<unknown>> & {  _InternalPanelDoNotUseOrYouWillBeFired :react.react.FC<antd.antd/es/tooltip/PurePanel.PurePanelProps>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    @scala.inline
    def apply(props: TooltipProps with RefAttributes[Any]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/tooltip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/tooltip", "default._InternalPanelDoNotUseOrYouWillBeFired")
    @js.native
    def InternalPanelDoNotUseOrYouWillBeFired: ReactComponentClass[PurePanelProps] = js.native
    
    @scala.inline
    def InternalPanelDoNotUseOrYouWillBeFired_=(x: ReactComponentClass[PurePanelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_InternalPanelDoNotUseOrYouWillBeFired")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/tooltip", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[Partial[TooltipProps with RefAttributes[Any]]] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[Partial[TooltipProps with RefAttributes[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/tooltip", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/tooltip", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMap[TooltipProps with RefAttributes[Any]]] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMap[TooltipProps with RefAttributes[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/tooltip", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  @js.native
  trait AbstractTooltipProps
    extends StObject
       with LegacyTooltipProps {
    
    var arrow: js.UndefOr[Boolean | ArrowPointAtCenter] = js.native
    
    /** @deprecated Please use `arrow={{ pointAtCenter: true }}` instead. */
    var arrowPointAtCenter: js.UndefOr[Boolean] = js.native
    
    var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[LiteralUnion[PresetColorType]] = js.native
    
    var destroyTooltipOnHide: js.UndefOr[Boolean | KeepParent] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
    
    var openClassName: js.UndefOr[String] = js.native
    
    @JSName("placement")
    var placement_AbstractTooltipProps: js.UndefOr[TooltipPlacement] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object AbstractTooltipProps {
    
    @scala.inline
    def apply(): AbstractTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractTooltipProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AbstractTooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrow(value: Boolean | ArrowPointAtCenter): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowPointAtCenter(value: Boolean): Self = StObject.set(x, "arrowPointAtCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowPointAtCenterUndefined: Self = StObject.set(x, "arrowPointAtCenter", js.undefined)
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      @scala.inline
      def setAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = StObject.set(x, "autoAdjustOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdjustOverflowUndefined: Self = StObject.set(x, "autoAdjustOverflow", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: LiteralUnion[PresetColorType]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDestroyTooltipOnHide(value: Boolean | KeepParent): Self = StObject.set(x, "destroyTooltipOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyTooltipOnHideUndefined: Self = StObject.set(x, "destroyTooltipOnHide", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
      
      @scala.inline
      def setPlacement(value: TooltipPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<std.Omit<rc-tooltip.rc-tooltip/es/Tooltip.TooltipProps, 'children' | 'visible' | 'defaultVisible' | 'onVisibleChange' | 'afterVisibleChange' | 'destroyTooltipOnHide'>> */
  @js.native
  trait LegacyTooltipProps extends StObject {
    
    var afterOpenChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    /** @deprecated Please use `afterOpenChange` instead. */
    var afterVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var align: js.UndefOr[AlignType] = js.native
    
    var animation: js.UndefOr[AnimationType] = js.native
    
    var arrowContent: js.UndefOr[ReactElement] = js.native
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.native
    
    var defaultOpen: js.UndefOr[Boolean] = js.native
    
    /** @deprecated Please use `defaultOpen` instead. */
    var defaultVisible: js.UndefOr[Boolean] = js.native
    
    var fresh: js.UndefOr[Boolean] = js.native
    
    var getTooltipContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var motion: js.UndefOr[CSSMotionProps] = js.native
    
    var mouseEnterDelay: js.UndefOr[Double] = js.native
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.native
    
    var onOpenChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.native
    
    /** @deprecated Please use `onOpenChange` instead. */
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var overlay: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.native
    
    var overlayClassName: js.UndefOr[String] = js.native
    
    var overlayInnerStyle: js.UndefOr[CSSProperties] = js.native
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.native
    
    var placement: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var showArrow: js.UndefOr[Boolean | ArrowTypeOuter] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var trigger: js.UndefOr[ActionType | js.Array[ActionType]] = js.native
    
    /** @deprecated Please use `open` instead. */
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object LegacyTooltipProps {
    
    @scala.inline
    def apply(): LegacyTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegacyTooltipProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: LegacyTooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterOpenChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "afterOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterOpenChangeUndefined: Self = StObject.set(x, "afterOpenChange", js.undefined)
      
      @scala.inline
      def setAfterVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "afterVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterVisibleChangeUndefined: Self = StObject.set(x, "afterVisibleChange", js.undefined)
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setArrowContent(value: ReactElement): Self = StObject.set(x, "arrowContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowContentUndefined: Self = StObject.set(x, "arrowContent", js.undefined)
      
      @scala.inline
      def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultVisible(value: Boolean): Self = StObject.set(x, "defaultVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVisibleUndefined: Self = StObject.set(x, "defaultVisible", js.undefined)
      
      @scala.inline
      def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
      
      @scala.inline
      def setGetTooltipContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getTooltipContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTooltipContainerUndefined: Self = StObject.set(x, "getTooltipContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      @scala.inline
      def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = StObject.set(x, "onPopupAlign", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOverlay(value: js.Function0[ReactElement] | ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayInnerStyle(value: CSSProperties): Self = StObject.set(x, "overlayInnerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayInnerStyleUndefined: Self = StObject.set(x, "overlayInnerStyle", js.undefined)
      
      @scala.inline
      def setOverlayReactElement(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShowArrow(value: Boolean | ArrowTypeOuter): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTrigger(value: ActionType | js.Array[ActionType]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setTriggerVarargs(value: ActionType*): Self = StObject.set(x, "trigger", js.Array(value :_*))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait TooltipAlignConfig extends StObject {
    
    var offset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
    
    var overflow: js.UndefOr[AdjustY] = js.native
    
    var points: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var targetOffset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
    
    var useCssBottom: js.UndefOr[Boolean] = js.native
    
    var useCssRight: js.UndefOr[Boolean] = js.native
    
    var useCssTransform: js.UndefOr[Boolean] = js.native
  }
  object TooltipAlignConfig {
    
    @scala.inline
    def apply(): TooltipAlignConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipAlignConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TooltipAlignConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOverflow(value: AdjustY): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPoints(value: js.Tuple2[String, String]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setTargetOffset(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
      
      @scala.inline
      def setUseCssBottom(value: Boolean): Self = StObject.set(x, "useCssBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssBottomUndefined: Self = StObject.set(x, "useCssBottom", js.undefined)
      
      @scala.inline
      def setUseCssRight(value: Boolean): Self = StObject.set(x, "useCssRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssRightUndefined: Self = StObject.set(x, "useCssRight", js.undefined)
      
      @scala.inline
      def setUseCssTransform(value: Boolean): Self = StObject.set(x, "useCssTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssTransformUndefined: Self = StObject.set(x, "useCssTransform", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.top
    - `web.typings`.antd.antdStrings.left
    - `web.typings`.antd.antdStrings.right
    - `web.typings`.antd.antdStrings.bottom
    - `web.typings`.antd.antdStrings.topLeft
    - `web.typings`.antd.antdStrings.topRight
    - `web.typings`.antd.antdStrings.bottomLeft
    - `web.typings`.antd.antdStrings.bottomRight
    - `web.typings`.antd.antdStrings.leftTop
    - `web.typings`.antd.antdStrings.leftBottom
    - `web.typings`.antd.antdStrings.rightTop
    - `web.typings`.antd.antdStrings.rightBottom
  */
  trait TooltipPlacement extends StObject
  object TooltipPlacement {
    
    @scala.inline
    def bottom: web.typings.antd.antdStrings.bottom = "bottom".asInstanceOf[web.typings.antd.antdStrings.bottom]
    
    @scala.inline
    def bottomLeft: web.typings.antd.antdStrings.bottomLeft = "bottomLeft".asInstanceOf[web.typings.antd.antdStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: web.typings.antd.antdStrings.bottomRight = "bottomRight".asInstanceOf[web.typings.antd.antdStrings.bottomRight]
    
    @scala.inline
    def left: web.typings.antd.antdStrings.left = "left".asInstanceOf[web.typings.antd.antdStrings.left]
    
    @scala.inline
    def leftBottom: web.typings.antd.antdStrings.leftBottom = "leftBottom".asInstanceOf[web.typings.antd.antdStrings.leftBottom]
    
    @scala.inline
    def leftTop: web.typings.antd.antdStrings.leftTop = "leftTop".asInstanceOf[web.typings.antd.antdStrings.leftTop]
    
    @scala.inline
    def right: web.typings.antd.antdStrings.right = "right".asInstanceOf[web.typings.antd.antdStrings.right]
    
    @scala.inline
    def rightBottom: web.typings.antd.antdStrings.rightBottom = "rightBottom".asInstanceOf[web.typings.antd.antdStrings.rightBottom]
    
    @scala.inline
    def rightTop: web.typings.antd.antdStrings.rightTop = "rightTop".asInstanceOf[web.typings.antd.antdStrings.rightTop]
    
    @scala.inline
    def top: web.typings.antd.antdStrings.top = "top".asInstanceOf[web.typings.antd.antdStrings.top]
    
    @scala.inline
    def topLeft: web.typings.antd.antdStrings.topLeft = "topLeft".asInstanceOf[web.typings.antd.antdStrings.topLeft]
    
    @scala.inline
    def topRight: web.typings.antd.antdStrings.topRight = "topRight".asInstanceOf[web.typings.antd.antdStrings.topRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.esTooltipMod.TooltipPropsWithTitle
    - `web.typings`.antd.esTooltipMod.TooltipPropsWithOverlay
  */
  trait TooltipProps extends StObject
  object TooltipProps {
    
    @scala.inline
    def TooltipPropsWithOverlay(): web.typings.antd.esTooltipMod.TooltipPropsWithOverlay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[web.typings.antd.esTooltipMod.TooltipPropsWithOverlay]
    }
    
    @scala.inline
    def TooltipPropsWithTitle(title: ReactElement | RenderFunction): web.typings.antd.esTooltipMod.TooltipPropsWithTitle = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.antd.esTooltipMod.TooltipPropsWithTitle]
    }
  }
  
  @js.native
  trait TooltipPropsWithOverlay
    extends StObject
       with AbstractTooltipProps
       with TooltipProps {
    
    @JSName("overlay")
    var overlay_TooltipPropsWithOverlay: js.UndefOr[ReactElement | RenderFunction] = js.native
    
    var title: js.UndefOr[ReactElement | RenderFunction] = js.native
  }
  object TooltipPropsWithOverlay {
    
    @scala.inline
    def apply(): TooltipPropsWithOverlay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipPropsWithOverlay]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TooltipPropsWithOverlay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverlay(value: ReactElement | RenderFunction): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayReactElement(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
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
  
  @js.native
  trait TooltipPropsWithTitle
    extends StObject
       with AbstractTooltipProps
       with TooltipProps {
    
    @JSName("overlay")
    var overlay_TooltipPropsWithTitle: js.UndefOr[ReactElement | RenderFunction] = js.native
    
    var title: ReactElement | RenderFunction = js.native
  }
  object TooltipPropsWithTitle {
    
    @scala.inline
    def apply(title: ReactElement | RenderFunction): TooltipPropsWithTitle = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipPropsWithTitle]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TooltipPropsWithTitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverlay(value: ReactElement | RenderFunction): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayReactElement(value: ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TooltipRef extends StObject {
    
    var forceAlign: VoidFunction = js.native
    
    /** @deprecated Please use `forceAlign` instead */
    var forcePopupAlign: VoidFunction = js.native
  }
  object TooltipRef {
    
    @scala.inline
    def apply(forceAlign: () => Unit, forcePopupAlign: () => Unit): TooltipRef = {
      val __obj = js.Dynamic.literal(forceAlign = js.Any.fromFunction0(forceAlign), forcePopupAlign = js.Any.fromFunction0(forcePopupAlign))
      __obj.asInstanceOf[TooltipRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TooltipRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceAlign(value: () => Unit): Self = StObject.set(x, "forceAlign", js.Any.fromFunction0(value))
      
      @scala.inline
      def setForcePopupAlign(value: () => Unit): Self = StObject.set(x, "forcePopupAlign", js.Any.fromFunction0(value))
    }
  }
}
