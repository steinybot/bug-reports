package web.typings.rcDrawer

import web.typings.rcDrawer.esDrawerPanelMod.DrawerPanelEvents
import web.typings.rcDrawer.esInterMod.DrawerClassNames
import web.typings.rcDrawer.esInterMod.DrawerStyles
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
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

object esDrawerPopupMod extends Shortcut {
  
  @JSImport("rc-drawer/es/DrawerPopup", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DrawerPopupProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait DrawerPopupProps
    extends StObject
       with DrawerPanelEvents {
    
    var afterOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[DrawerClassNames] = js.native
    
    var contentWrapperStyle: js.UndefOr[CSSProperties] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
    
    var maskClassName: js.UndefOr[String] = js.native
    
    var maskClosable: js.UndefOr[Boolean] = js.native
    
    var maskMotion: js.UndefOr[CSSMotionProps] = js.native
    
    var maskStyle: js.UndefOr[CSSProperties] = js.native
    
    var motion: js.UndefOr[CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])] = js.native
    
    var onClose: js.UndefOr[
        js.Function1[
          /* event */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement], 
          Unit
        ]
      ] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var prefixCls: String = js.native
    
    var push: js.UndefOr[Boolean | PushConfig] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var rootStyle: js.UndefOr[CSSProperties] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styles: js.UndefOr[DrawerStyles] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object DrawerPopupProps {
    
    @scala.inline
    def apply(prefixCls: String): DrawerPopupProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerPopupProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DrawerPopupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "afterOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterOpenChangeUndefined: Self = StObject.set(x, "afterOpenChange", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(value: DrawerClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setContentWrapperStyle(value: CSSProperties): Self = StObject.set(x, "contentWrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentWrapperStyleUndefined: Self = StObject.set(x, "contentWrapperStyle", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
      
      @scala.inline
      def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      @scala.inline
      def setMaskMotion(value: CSSMotionProps): Self = StObject.set(x, "maskMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskMotionUndefined: Self = StObject.set(x, "maskMotion", js.undefined)
      
      @scala.inline
      def setMaskStyle(value: CSSProperties): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMotion(value: CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionFunction1(value: /* placement */ Placement => CSSMotionProps): Self = StObject.set(x, "motion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* event */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPush(value: Boolean | PushConfig): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setRootStyle(value: CSSProperties): Self = StObject.set(x, "rootStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootStyleUndefined: Self = StObject.set(x, "rootStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: DrawerStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcDrawer.rcDrawerStrings.left
    - `web.typings`.rcDrawer.rcDrawerStrings.right
    - `web.typings`.rcDrawer.rcDrawerStrings.top
    - `web.typings`.rcDrawer.rcDrawerStrings.bottom
  */
  trait Placement extends StObject
  object Placement {
    
    @scala.inline
    def bottom: web.typings.rcDrawer.rcDrawerStrings.bottom = "bottom".asInstanceOf[web.typings.rcDrawer.rcDrawerStrings.bottom]
    
    @scala.inline
    def left: web.typings.rcDrawer.rcDrawerStrings.left = "left".asInstanceOf[web.typings.rcDrawer.rcDrawerStrings.left]
    
    @scala.inline
    def right: web.typings.rcDrawer.rcDrawerStrings.right = "right".asInstanceOf[web.typings.rcDrawer.rcDrawerStrings.right]
    
    @scala.inline
    def top: web.typings.rcDrawer.rcDrawerStrings.top = "top".asInstanceOf[web.typings.rcDrawer.rcDrawerStrings.top]
  }
  
  @js.native
  trait PushConfig extends StObject {
    
    var distance: js.UndefOr[Double | String] = js.native
  }
  object PushConfig {
    
    @scala.inline
    def apply(): PushConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PushConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PushConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double | String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DrawerPopupProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esDrawerPopupMod.foo` */
  override def _to: ReactComponentClass[DrawerPopupProps with RefAttributes[HTMLDivElement]] = default
}
