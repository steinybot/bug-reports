package web.typings.rcImage

import web.typings.rcDialog.anon.X
import web.typings.rcDialog.esIdialogproptypesMod.ModalClassNames
import web.typings.rcDialog.esIdialogproptypesMod.ModalStyles
import web.typings.rcImage.anon.Action
import web.typings.rcImage.anon.Close
import web.typings.rcImage.anon.Current
import web.typings.rcImage.anon.FlipXIcon
import web.typings.rcImage.anon.OnFlipX
import web.typings.rcImage.libHooksUseImageTransformMod.TransformType
import web.typings.rcImage.rcImageBooleans.`false`
import web.typings.rcUtil.esPortalWrapperMod.GetContainer
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.ImgHTMLAttributes
import web.typings.react.mod.Ref
import web.typings.std.Record
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLImageElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPreviewMod extends Shortcut {
  
  @JSImport("rc-image/lib/Preview", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PreviewProps] = js.native
  
  /* Inlined parent std.Omit<rc-dialog.rc-dialog.DialogProps, 'onClose'> */
  @js.native
  trait PreviewProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Any]] = js.native
    
    var afterOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var alt: js.UndefOr[String] = js.native
    
    var animation: js.UndefOr[Any] = js.native
    
    var bodyProps: js.UndefOr[Any] = js.native
    
    var bodyStyle: js.UndefOr[Record[String, Any]] = js.native
    
    var children: js.UndefOr[Any] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[ModalClassNames] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var countRender: js.UndefOr[js.Function2[/* current */ Double, /* total */ Double, ReactElement]] = js.native
    
    var current: js.UndefOr[Double] = js.native
    
    var destroyOnClose: js.UndefOr[Boolean] = js.native
    
    var fallback: js.UndefOr[String] = js.native
    
    var focusTriggerAfterClose: js.UndefOr[Boolean] = js.native
    
    var footer: js.UndefOr[ReactElement] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var getContainer: js.UndefOr[GetContainer | `false`] = js.native
    
    var height: js.UndefOr[String | Double] = js.native
    
    var icons: js.UndefOr[Close] = js.native
    
    var imageRender: js.UndefOr[js.Function2[/* originalNode */ ReactElement, /* info */ Current, ReactElement]] = js.native
    
    var imgCommonProps: js.UndefOr[ImgHTMLAttributes[HTMLImageElement]] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
    
    var maskAnimation: js.UndefOr[Any] = js.native
    
    var maskClosable: js.UndefOr[Boolean] = js.native
    
    var maskProps: js.UndefOr[Any] = js.native
    
    var maskStyle: js.UndefOr[Record[String, Any]] = js.native
    
    var maskTransitionName: js.UndefOr[String] = js.native
    
    var maxScale: js.UndefOr[Double] = js.native
    
    var minScale: js.UndefOr[Double] = js.native
    
    var modalRender: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var mousePosition: js.UndefOr[X | Null] = js.native
    
    var movable: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[js.Function2[/* current */ Any, /* prev */ Any, Unit]] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onTransform: js.UndefOr[js.Function1[/* info */ Action, Unit]] = js.native
    
    var panelRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var scaleStep: js.UndefOr[Double] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styles: js.UndefOr[ModalStyles] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    var toolbarRender: js.UndefOr[
        js.Function2[/* originalNode */ ReactElement, /* info */ ToolbarRenderInfoType, ReactElement]
      ] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[String | Double] = js.native
    
    var wrapClassName: js.UndefOr[String] = js.native
    
    var wrapProps: js.UndefOr[Any] = js.native
    
    var wrapStyle: js.UndefOr[Record[String, Any]] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object PreviewProps {
    
    @scala.inline
    def apply(): PreviewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PreviewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: () => Any): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      @scala.inline
      def setAfterOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "afterOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterOpenChangeUndefined: Self = StObject.set(x, "afterOpenChange", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setAnimation(value: Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setBodyProps(value: Any): Self = StObject.set(x, "bodyProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyPropsUndefined: Self = StObject.set(x, "bodyProps", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: Record[String, Any]): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(value: ModalClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountRender(value: (/* current */ Double, /* total */ Double) => ReactElement): Self = StObject.set(x, "countRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCountRenderUndefined: Self = StObject.set(x, "countRender", js.undefined)
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setDestroyOnClose(value: Boolean): Self = StObject.set(x, "destroyOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyOnCloseUndefined: Self = StObject.set(x, "destroyOnClose", js.undefined)
      
      @scala.inline
      def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setFocusTriggerAfterClose(value: Boolean): Self = StObject.set(x, "focusTriggerAfterClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusTriggerAfterCloseUndefined: Self = StObject.set(x, "focusTriggerAfterClose", js.undefined)
      
      @scala.inline
      def setFooter(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setGetContainer(value: GetContainer | `false`): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIcons(value: Close): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setImageRender(value: (/* originalNode */ ReactElement, /* info */ Current) => ReactElement): Self = StObject.set(x, "imageRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImageRenderUndefined: Self = StObject.set(x, "imageRender", js.undefined)
      
      @scala.inline
      def setImgCommonProps(value: ImgHTMLAttributes[HTMLImageElement]): Self = StObject.set(x, "imgCommonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgCommonPropsUndefined: Self = StObject.set(x, "imgCommonProps", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskAnimation(value: Any): Self = StObject.set(x, "maskAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskAnimationUndefined: Self = StObject.set(x, "maskAnimation", js.undefined)
      
      @scala.inline
      def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      @scala.inline
      def setMaskProps(value: Any): Self = StObject.set(x, "maskProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskPropsUndefined: Self = StObject.set(x, "maskProps", js.undefined)
      
      @scala.inline
      def setMaskStyle(value: Record[String, Any]): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
      
      @scala.inline
      def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
      
      @scala.inline
      def setModalRender(value: /* node */ ReactElement => ReactElement): Self = StObject.set(x, "modalRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModalRenderUndefined: Self = StObject.set(x, "modalRender", js.undefined)
      
      @scala.inline
      def setMousePosition(value: X): Self = StObject.set(x, "mousePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousePositionNull: Self = StObject.set(x, "mousePosition", null)
      
      @scala.inline
      def setMousePositionUndefined: Self = StObject.set(x, "mousePosition", js.undefined)
      
      @scala.inline
      def setMovable(value: Boolean): Self = StObject.set(x, "movable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovableUndefined: Self = StObject.set(x, "movable", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* current */ Any, /* prev */ Any) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnTransform(value: /* info */ Action => Unit): Self = StObject.set(x, "onTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransformUndefined: Self = StObject.set(x, "onTransform", js.undefined)
      
      @scala.inline
      def setPanelRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "panelRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "panelRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanelRefNull: Self = StObject.set(x, "panelRef", null)
      
      @scala.inline
      def setPanelRefReactRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "panelRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelRefUndefined: Self = StObject.set(x, "panelRef", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setScaleStep(value: Double): Self = StObject.set(x, "scaleStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleStepUndefined: Self = StObject.set(x, "scaleStep", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: ModalStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToolbarRender(value: (/* originalNode */ ReactElement, /* info */ ToolbarRenderInfoType) => ReactElement): Self = StObject.set(x, "toolbarRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToolbarRenderUndefined: Self = StObject.set(x, "toolbarRender", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrapClassName(value: String): Self = StObject.set(x, "wrapClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapClassNameUndefined: Self = StObject.set(x, "wrapClassName", js.undefined)
      
      @scala.inline
      def setWrapProps(value: Any): Self = StObject.set(x, "wrapProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapPropsUndefined: Self = StObject.set(x, "wrapProps", js.undefined)
      
      @scala.inline
      def setWrapStyle(value: Record[String, Any]): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait ToolbarRenderInfoType extends StObject {
    
    var actions: OnFlipX = js.native
    
    var current: Double = js.native
    
    var icons: FlipXIcon = js.native
    
    var total: Double = js.native
    
    var transform: TransformType = js.native
  }
  object ToolbarRenderInfoType {
    
    @scala.inline
    def apply(actions: OnFlipX, current: Double, icons: FlipXIcon, total: Double, transform: TransformType): ToolbarRenderInfoType = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarRenderInfoType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ToolbarRenderInfoType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: OnFlipX): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcons(value: FlipXIcon): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: TransformType): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[PreviewProps]
  
  /* This means you don't have to write `default`, but can instead just say `libPreviewMod.foo` */
  override def _to: ReactComponentClass[PreviewProps] = default
}
