package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.ArrowPointAtCenter
import web.typings.antd.anon.KeepParent
import web.typings.antd.esPopoverPurePanelMod.RawPurePanelProps
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
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RawPurePanel {
  
  @scala.inline
  def apply(hashId: String): Builder = {
    val __props = js.Dynamic.literal(hashId = hashId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RawPurePanelProps]))
  }
  
  @JSImport("antd/es/popover/PurePanel", "RawPurePanel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def afterOpenChange(value: /* visible */ Boolean => Unit): this.type = set("afterOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def afterVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("afterVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animation(value: AnimationType): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrow(value: Boolean | ArrowPointAtCenter): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrowContent(value: ReactElement): this.type = set("arrowContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrowPointAtCenter(value: Boolean): this.type = set("arrowPointAtCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoAdjustOverflow(value: Boolean | AdjustOverflow): this.type = set("autoAdjustOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def builtinPlacements(value: BuildInPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: LiteralUnion[PresetColorType]): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: ReactElement | RenderFunction): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentFunction0(value: () => ReactElement): this.type = set("content", js.Any.fromFunction0(value))
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultVisible(value: Boolean): this.type = set("defaultVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def destroyTooltipOnHide(value: Boolean | KeepParent): this.type = set("destroyTooltipOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fresh(value: Boolean): this.type = set("fresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def getTooltipContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getTooltipContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motion(value: CSSMotionProps): this.type = set("motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOpenChange(value: /* visible */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): this.type = set("onPopupAlign", js.Any.fromFunction2(value))
    
    @scala.inline
    def onVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlay(value: js.Function0[ReactElement] | ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayFunction0(value: () => ReactElement): this.type = set("overlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def overlayInnerStyle(value: CSSProperties): this.type = set("overlayInnerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: TooltipPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showArrow(value: Boolean | ArrowTypeOuter): this.type = set("showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement | RenderFunction): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleFunction0(value: () => ReactElement): this.type = set("title", js.Any.fromFunction0(value))
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trigger(value: ActionType | js.Array[ActionType]): this.type = set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerVarargs(value: ActionType*): this.type = set("trigger", js.Array(value :_*))
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  type Props = RawPurePanelProps
  
  def withProps(p: RawPurePanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
