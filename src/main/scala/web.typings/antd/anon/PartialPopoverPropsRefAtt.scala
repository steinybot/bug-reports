package web.typings.antd.anon

import web.typings.antd.esTooltipMod.TooltipPlacement
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
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/es/popover.PopoverProps & react.react.RefAttributes<unknown>> */
@js.native
trait PartialPopoverPropsRefAtt extends StObject {
  
  var afterOpenChange: js.UndefOr[js.Function1[/* visible */ Boolean, scala.Unit]] = js.native
  
  var afterVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, scala.Unit]] = js.native
  
  var align: js.UndefOr[AlignType] = js.native
  
  var animation: js.UndefOr[AnimationType] = js.native
  
  var arrow: js.UndefOr[Boolean | ArrowPointAtCenter] = js.native
  
  var arrowContent: js.UndefOr[ReactElement] = js.native
  
  var arrowPointAtCenter: js.UndefOr[Boolean] = js.native
  
  var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.native
  
  var builtinPlacements: js.UndefOr[BuildInPlacements] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[LiteralUnion[PresetColorType]] = js.native
  
  var content: js.UndefOr[ReactElement | RenderFunction] = js.native
  
  var defaultOpen: js.UndefOr[Boolean] = js.native
  
  var defaultVisible: js.UndefOr[Boolean] = js.native
  
  var destroyTooltipOnHide: js.UndefOr[Boolean | KeepParent] = js.native
  
  var fresh: js.UndefOr[Boolean] = js.native
  
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  
  var getTooltipContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[web.typings.react.mod.Key | Null] = js.native
  
  var motion: js.UndefOr[CSSMotionProps] = js.native
  
  var mouseEnterDelay: js.UndefOr[Double] = js.native
  
  var mouseLeaveDelay: js.UndefOr[Double] = js.native
  
  var onOpenChange: js.UndefOr[js.Function1[/* visible */ Boolean, scala.Unit]] = js.native
  
  var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, scala.Unit]] = js.native
  
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, scala.Unit]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var openClassName: js.UndefOr[String] = js.native
  
  var overlay: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.native
  
  var overlayClassName: js.UndefOr[String] = js.native
  
  var overlayInnerStyle: js.UndefOr[CSSProperties] = js.native
  
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  
  var placement: js.UndefOr[TooltipPlacement] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var ref: js.UndefOr[web.typings.react.mod.Ref[Any]] = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
  
  var showArrow: js.UndefOr[Boolean | ArrowTypeOuter] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[ReactElement | RenderFunction] = js.native
  
  var transitionName: js.UndefOr[String] = js.native
  
  var trigger: js.UndefOr[ActionType | js.Array[ActionType]] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object PartialPopoverPropsRefAtt {
  
  @scala.inline
  def apply(): PartialPopoverPropsRefAtt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPopoverPropsRefAtt]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PartialPopoverPropsRefAtt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterOpenChange(value: /* visible */ Boolean => scala.Unit): Self = StObject.set(x, "afterOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterOpenChangeUndefined: Self = StObject.set(x, "afterOpenChange", js.undefined)
    
    @scala.inline
    def setAfterVisibleChange(value: /* visible */ Boolean => scala.Unit): Self = StObject.set(x, "afterVisibleChange", js.Any.fromFunction1(value))
    
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
    def setArrow(value: Boolean | ArrowPointAtCenter): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowContent(value: ReactElement): Self = StObject.set(x, "arrowContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowContentUndefined: Self = StObject.set(x, "arrowContent", js.undefined)
    
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
    def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
    
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
    def setContent(value: ReactElement | RenderFunction): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFunction0(value: () => ReactElement): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
    
    @scala.inline
    def setDefaultVisible(value: Boolean): Self = StObject.set(x, "defaultVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVisibleUndefined: Self = StObject.set(x, "defaultVisible", js.undefined)
    
    @scala.inline
    def setDestroyTooltipOnHide(value: Boolean | KeepParent): Self = StObject.set(x, "destroyTooltipOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyTooltipOnHideUndefined: Self = StObject.set(x, "destroyTooltipOnHide", js.undefined)
    
    @scala.inline
    def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
    
    @scala.inline
    def setGetTooltipContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getTooltipContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTooltipContainerUndefined: Self = StObject.set(x, "getTooltipContainer", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKey(value: web.typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
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
    def setOnOpenChange(value: /* visible */ Boolean => scala.Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
    
    @scala.inline
    def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => scala.Unit): Self = StObject.set(x, "onPopupAlign", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
    
    @scala.inline
    def setOnVisibleChange(value: /* visible */ Boolean => scala.Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
    
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
    def setPlacement(value: TooltipPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRef(value: web.typings.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ Any | Null => scala.Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    @scala.inline
    def setShowArrow(value: Boolean | ArrowTypeOuter): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactElement | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction0(value: () => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
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
