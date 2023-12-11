package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.ArrowPointAtCenter
import web.typings.antd.anon.KeepParent
import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import web.typings.antd.esPopconfirmMod.PopconfirmProps
import web.typings.antd.esPopconfirmPurePanelMod.PurePanelProps
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
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popconfirm {
  
  @scala.inline
  def apply(title: ReactElement | RenderFunction): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PopconfirmProps with RefAttributes[Any]]))
  }
  
  object InternalPanelDoNotUseOrYouWillBeFired {
    
    @scala.inline
    def apply(title: ReactElement | RenderFunction): web.typings.antd.components.Popconfirm.InternalPanelDoNotUseOrYouWillBeFired.Builder = {
      val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      new web.typings.antd.components.Popconfirm.InternalPanelDoNotUseOrYouWillBeFired.Builder(js.Array(this.component, __props.asInstanceOf[PurePanelProps]))
    }
    
    @JSImport("antd", "Popconfirm.InternalPanelDoNotUseOrYouWillBeFired")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def cancelButtonProps(value: ButtonProps): this.type = set("cancelButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def cancelText(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def close(value: js.Function): this.type = set("close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def description(value: ReactElement | RenderFunction): this.type = set("description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def descriptionFunction0(value: () => ReactElement): this.type = set("description", js.Any.fromFunction0(value))
      
      @scala.inline
      def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def okButtonProps(value: ButtonProps): this.type = set("okButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def okText(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def okType(value: LegacyButtonType): this.type = set("okType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCancel(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): this.type = set("onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onConfirm(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): this.type = set("onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPopupClick(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onPopupClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def placement(value: TooltipPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showCancel(value: Boolean): this.type = set("showCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    type Props = PurePanelProps
    
    def withProps(p: PurePanelProps): web.typings.antd.components.Popconfirm.InternalPanelDoNotUseOrYouWillBeFired.Builder = new web.typings.antd.components.Popconfirm.InternalPanelDoNotUseOrYouWillBeFired.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Popconfirm")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.div.tag.type, js.Object] {
    
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
    def cancelButtonProps(value: ButtonProps): this.type = set("cancelButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelText(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: LiteralUnion[PresetColorType]): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultVisible(value: Boolean): this.type = set("defaultVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: ReactElement | RenderFunction): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descriptionFunction0(value: () => ReactElement): this.type = set("description", js.Any.fromFunction0(value))
    
    @scala.inline
    def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def destroyTooltipOnHide(value: Boolean | KeepParent): this.type = set("destroyTooltipOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fresh(value: Boolean): this.type = set("fresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def getTooltipContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getTooltipContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motion(value: CSSMotionProps): this.type = set("motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okButtonProps(value: ButtonProps): this.type = set("okButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okText(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okType(value: LegacyButtonType): this.type = set("okType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCancel(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): this.type = set("onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onConfirm(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): this.type = set("onConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOpenChange(
      value: (/* open */ Boolean, /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLDivElement]]) => Unit
    ): this.type = set("onOpenChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): this.type = set("onPopupAlign", js.Any.fromFunction2(value))
    
    @scala.inline
    def onPopupClick(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onPopupClick", js.Any.fromFunction1(value))
    
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
    def showCancel(value: Boolean): this.type = set("showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
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
  
  type Props = PopconfirmProps with RefAttributes[Any]
  
  def withProps(p: PopconfirmProps with RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
