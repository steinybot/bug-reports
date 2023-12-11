package web.typings.rcComponentTrigger

import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.ArrowPos
import web.typings.rcComponentTrigger.esInterfaceMod.ArrowTypeOuter
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.RefAttributes
import web.typings.std.VoidFunction
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopupMod extends Shortcut {
  
  @JSImport("@rc-component/trigger/es/Popup", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PopupProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait PopupProps extends StObject {
    
    var align: js.UndefOr[AlignType] = js.native
    
    var arrow: js.UndefOr[ArrowTypeOuter] = js.native
    
    var arrowPos: ArrowPos = js.native
    
    var autoDestroy: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var fresh: js.UndefOr[Boolean] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    /** Tell Portal that should keep in screen. e.g. should wait all motion end */
    var keepDom: Boolean = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
    
    var maskMotion: js.UndefOr[CSSMotionProps] = js.native
    
    var motion: js.UndefOr[CSSMotionProps] = js.native
    
    var offsetB: Double = js.native
    
    var offsetR: Double = js.native
    
    var offsetX: Double = js.native
    
    var offsetY: Double = js.native
    
    var onAlign: VoidFunction = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onPointerEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    def onPrepare(): js.Promise[Unit] = js.native
    
    def onVisibleChanged(visible: Boolean): Unit = js.native
    
    var open: Boolean = js.native
    
    var popup: js.UndefOr[ReactElement | js.Function0[ReactElement]] = js.native
    
    var portal: ReactComponentClass[Any] = js.native
    
    var prefixCls: String = js.native
    
    var ready: Boolean = js.native
    
    var stretch: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var target: HTMLElement = js.native
    
    var targetHeight: js.UndefOr[Double] = js.native
    
    var targetWidth: js.UndefOr[Double] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object PopupProps {
    
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
    ): PopupProps = {
      val __obj = js.Dynamic.literal(arrowPos = arrowPos.asInstanceOf[js.Any], keepDom = keepDom.asInstanceOf[js.Any], offsetB = offsetB.asInstanceOf[js.Any], offsetR = offsetR.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], onAlign = js.Any.fromFunction0(onAlign), onPrepare = js.Any.fromFunction0(onPrepare), onVisibleChanged = js.Any.fromFunction1(onVisibleChanged), open = open.asInstanceOf[js.Any], portal = portal.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PopupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setArrow(value: ArrowTypeOuter): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowPos(value: ArrowPos): Self = StObject.set(x, "arrowPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      @scala.inline
      def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setKeepDom(value: Boolean): Self = StObject.set(x, "keepDom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskMotion(value: CSSMotionProps): Self = StObject.set(x, "maskMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskMotionUndefined: Self = StObject.set(x, "maskMotion", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setOffsetB(value: Double): Self = StObject.set(x, "offsetB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetR(value: Double): Self = StObject.set(x, "offsetR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAlign(value: () => Unit): Self = StObject.set(x, "onAlign", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPrepare(value: () => js.Promise[Unit]): Self = StObject.set(x, "onPrepare", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnVisibleChanged(value: Boolean => Unit): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopup(value: ReactElement | js.Function0[ReactElement]): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupFunction0(value: () => ReactElement): Self = StObject.set(x, "popup", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPopupReactElement(value: ReactElement): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      @scala.inline
      def setPortal(value: ReactComponentClass[Any]): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetHeight(value: Double): Self = StObject.set(x, "targetHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetHeightUndefined: Self = StObject.set(x, "targetHeight", js.undefined)
      
      @scala.inline
      def setTargetWidth(value: Double): Self = StObject.set(x, "targetWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetWidthUndefined: Self = StObject.set(x, "targetWidth", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PopupProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esPopupMod.foo` */
  override def _to: ReactComponentClass[PopupProps with RefAttributes[HTMLDivElement]] = default
}
