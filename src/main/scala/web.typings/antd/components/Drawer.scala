package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.OmitDrawerPanelPropsprefi
import web.typings.antd.esDrawerDrawerPanelMod.DrawerClassNames
import web.typings.antd.esDrawerDrawerPanelMod.DrawerStyles
import web.typings.antd.esDrawerMod.DrawerProps
import web.typings.antd.esDrawerMod.sizeType
import web.typings.rcComponentPortal.esPortalMod.ContainerType
import web.typings.rcComponentPortal.esPortalMod.GetContainer
import web.typings.rcDrawer.esDrawerPopupMod.PushConfig
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Ref
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drawer {
  
  object InternalPanelDoNotUseOrYouWillBeFired {
    
    @JSImport("antd", "Drawer.InternalPanelDoNotUseOrYouWillBeFired")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def classNames(value: DrawerClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def closeIcon(value: Boolean | ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def closeIconReactElement(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def drawerStyle(value: CSSProperties): this.type = set("drawerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def footer(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def footerStyle(value: CSSProperties): this.type = set("footerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def headerStyle(value: CSSProperties): this.type = set("headerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onClose(
        value: /* e */ SyntheticMouseEvent[org.scalajs.dom.Element] | SyntheticKeyboardEvent[org.scalajs.dom.Element] => Unit
      ): this.type = set("onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def placement(value: web.typings.rcDrawer.esDrawerMod.Placement): this.type = set("placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def styles(value: DrawerStyles): this.type = set("styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    type Props = OmitDrawerPanelPropsprefi
    
    implicit def make(companion: InternalPanelDoNotUseOrYouWillBeFired.type): web.typings.antd.components.Drawer.InternalPanelDoNotUseOrYouWillBeFired.Builder = new web.typings.antd.components.Drawer.InternalPanelDoNotUseOrYouWillBeFired.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OmitDrawerPanelPropsprefi): web.typings.antd.components.Drawer.InternalPanelDoNotUseOrYouWillBeFired.Builder = new web.typings.antd.components.Drawer.InternalPanelDoNotUseOrYouWillBeFired.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Drawer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.div.tag.type, js.Object] {
    
    @scala.inline
    def afterOpenChange(value: /* open */ Boolean => Unit): this.type = set("afterOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def afterVisibleChange(value: /* open */ Boolean => Unit): this.type = set("afterVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNames(value: DrawerClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIcon(value: Boolean | ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIconReactElement(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentWrapperStyle(value: CSSProperties): this.type = set("contentWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def destroyOnClose(value: Boolean): this.type = set("destroyOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def drawerStyle(value: CSSProperties): this.type = set("drawerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerStyle(value: CSSProperties): this.type = set("footerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainer(value: GetContainer): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainerFunction0(value: () => ContainerType): this.type = set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def headerStyle(value: CSSProperties): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskClassName(value: String): this.type = set("maskClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskMotion(value: CSSMotionProps): this.type = set("maskMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskStyle(value: CSSProperties): this.type = set("maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motion(
      value: CSSMotionProps | (js.Function1[/* placement */ web.typings.rcDrawer.esDrawerPopupMod.Placement, CSSMotionProps])
    ): this.type = set("motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionFunction1(value: /* placement */ web.typings.rcDrawer.esDrawerPopupMod.Placement => CSSMotionProps): this.type = set("motion", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClose(
      value: /* e */ SyntheticMouseEvent[org.scalajs.dom.Element] | SyntheticKeyboardEvent[org.scalajs.dom.Element] => Unit
    ): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def panelRef(value: Ref[HTMLDivElement]): this.type = set("panelRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def panelRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): this.type = set("panelRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def panelRefNull: this.type = set("panelRef", null)
    
    @scala.inline
    def panelRefReactRef(value: ReactRef[HTMLDivElement]): this.type = set("panelRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: web.typings.rcDrawer.esDrawerPopupMod.Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def push(value: Boolean | PushConfig): this.type = set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootStyle(value: CSSProperties): this.type = set("rootStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: sizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: DrawerStyles): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  type Props = DrawerProps
  
  implicit def make(companion: Drawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
