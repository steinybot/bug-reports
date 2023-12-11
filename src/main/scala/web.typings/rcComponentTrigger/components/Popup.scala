package web.typings.rcComponentTrigger.components

import web.typings.StBuildingComponent
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.ArrowPos
import web.typings.rcComponentTrigger.esInterfaceMod.ArrowTypeOuter
import web.typings.rcComponentTrigger.esPopupMod.PopupProps
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popup {
  
  @scala.inline
  def apply(
    arrowPos: ArrowPos,
    keepDom: Boolean,
    offsetB: Double,
    offsetR: Double,
    offsetX: Double,
    offsetY: Double,
    onAlign: () => Unit,
    onPrepare: () => js.Promise[Unit],
    onVisibleChanged: Boolean => Unit,
    open: Boolean,
    portal: ReactComponentClass[Any],
    prefixCls: String,
    ready: Boolean,
    target: HTMLElement
  ): Builder = {
    val __props = js.Dynamic.literal(arrowPos = arrowPos.asInstanceOf[js.Any], keepDom = keepDom.asInstanceOf[js.Any], offsetB = offsetB.asInstanceOf[js.Any], offsetR = offsetR.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], onAlign = js.Any.fromFunction0(onAlign), onPrepare = js.Any.fromFunction0(onPrepare), onVisibleChanged = js.Any.fromFunction1(onVisibleChanged), open = open.asInstanceOf[js.Any], portal = portal.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PopupProps with RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("@rc-component/trigger/es/Popup", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrow(value: ArrowTypeOuter): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoDestroy(value: Boolean): this.type = set("autoDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fresh(value: Boolean): this.type = set("fresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskMotion(value: CSSMotionProps): this.type = set("maskMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motion(value: CSSMotionProps): this.type = set("motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def popup(value: ReactElement | js.Function0[ReactElement]): this.type = set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupFunction0(value: () => ReactElement): this.type = set("popup", js.Any.fromFunction0(value))
    
    @scala.inline
    def popupReactElement(value: ReactElement): this.type = set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stretch(value: String): this.type = set("stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetHeight(value: Double): this.type = set("targetHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetWidth(value: Double): this.type = set("targetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  type Props = PopupProps with RefAttributes[HTMLDivElement]
  
  def withProps(p: PopupProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
