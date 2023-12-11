package web.typings.antd

import web.typings.antd.anon.CancelBtn
import web.typings.antd.anon.X
import web.typings.antd.antdBooleans.`false`
import web.typings.antd.antdStrings.cancel
import web.typings.antd.antdStrings.confirm
import web.typings.antd.antdStrings.error
import web.typings.antd.antdStrings.info
import web.typings.antd.antdStrings.ok
import web.typings.antd.antdStrings.success
import web.typings.antd.antdStrings.warn
import web.typings.antd.antdStrings.warning
import web.typings.antd.antdStrings.wrapper
import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.rcDialog.esIdialogproptypesMod.ModalClassNames
import web.typings.rcDialog.esIdialogproptypesMod.ModalStyles
import web.typings.react.mod.CSSProperties
import web.typings.std.NonNullable
import web.typings.std.Omit
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalInterfaceMod {
  
  @js.native
  trait ModalCommonProps extends StObject {
    
    var styles: js.UndefOr[Omit[NonNullable[js.UndefOr[ModalStyles]], wrapper]] = js.native
  }
  object ModalCommonProps {
    
    @scala.inline
    def apply(): ModalCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalCommonProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ModalCommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: Omit[NonNullable[js.UndefOr[ModalStyles]], wrapper]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  type ModalFooterRender = js.Function2[/* originNode */ ReactElement, /* extra */ CancelBtn, ReactElement]
  
  @js.native
  trait ModalFuncProps
    extends StObject
       with ModalCommonProps {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var autoFocusButton: js.UndefOr[Null | ok | cancel] = js.native
    
    /** @deprecated Please use `styles.body` instead */
    var bodyStyle: js.UndefOr[CSSProperties] = js.native
    
    var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var cancelText: js.UndefOr[ReactElement] = js.native
    
    var centered: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var content: js.UndefOr[ReactElement] = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var focusTriggerAfterClose: js.UndefOr[Boolean] = js.native
    
    var footer: js.UndefOr[ModalFooterRender | ReactElement] = js.native
    
    var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false`] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
    
    var maskClosable: js.UndefOr[Boolean] = js.native
    
    /** @deprecated Please use `styles.mask` instead */
    var maskStyle: js.UndefOr[CSSProperties] = js.native
    
    var maskTransitionName: js.UndefOr[String] = js.native
    
    var modalRender: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var okButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var okCancel: js.UndefOr[Boolean] = js.native
    
    var okText: js.UndefOr[ReactElement] = js.native
    
    var okType: js.UndefOr[LegacyButtonType] = js.native
    
    var onCancel: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[info | success | error | warn | warning | confirm] = js.native
    
    /** @deprecated Please use `open` instead. */
    var visible: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[String | Double] = js.native
    
    var wrapClassName: js.UndefOr[String] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object ModalFuncProps {
    
    @scala.inline
    def apply(): ModalFuncProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalFuncProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ModalFuncProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      @scala.inline
      def setAutoFocusButton(value: ok | cancel): Self = StObject.set(x, "autoFocusButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusButtonNull: Self = StObject.set(x, "autoFocusButton", null)
      
      @scala.inline
      def setAutoFocusButtonUndefined: Self = StObject.set(x, "autoFocusButton", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      @scala.inline
      def setCancelText(value: ReactElement): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFocusTriggerAfterClose(value: Boolean): Self = StObject.set(x, "focusTriggerAfterClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusTriggerAfterCloseUndefined: Self = StObject.set(x, "focusTriggerAfterClose", js.undefined)
      
      @scala.inline
      def setFooter(value: ModalFooterRender | ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterFunction2(value: (/* originNode */ ReactElement, /* extra */ CancelBtn) => ReactElement): Self = StObject.set(x, "footer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFooterReactElement(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setGetContainer(value: String | HTMLElement | getContainerFunc | `false`): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      @scala.inline
      def setMaskStyle(value: CSSProperties): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setModalRender(value: /* node */ ReactElement => ReactElement): Self = StObject.set(x, "modalRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModalRenderUndefined: Self = StObject.set(x, "modalRender", js.undefined)
      
      @scala.inline
      def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      @scala.inline
      def setOkCancel(value: Boolean): Self = StObject.set(x, "okCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkCancelUndefined: Self = StObject.set(x, "okCancel", js.undefined)
      
      @scala.inline
      def setOkText(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      @scala.inline
      def setOnCancel(value: /* repeated */ Any => Any): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* repeated */ Any => Any): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setType(value: info | success | error | warn | warning | confirm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
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
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait ModalLocale extends StObject {
    
    var cancelText: String = js.native
    
    var justOkText: String = js.native
    
    var okText: String = js.native
  }
  object ModalLocale {
    
    @scala.inline
    def apply(cancelText: String, justOkText: String, okText: String): ModalLocale = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], justOkText = justOkText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalLocale]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ModalLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustOkText(value: String): Self = StObject.set(x, "justOkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModalProps
    extends StObject
       with ModalCommonProps {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Callback when the animation ends when Modal is turned on and off */
    var afterOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    /** @deprecated Please use `styles.body` instead */
    var bodyStyle: js.UndefOr[CSSProperties] = js.native
    
    var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
    
    /** Text of the Cancel button */
    var cancelText: js.UndefOr[ReactElement] = js.native
    
    /** Centered Modal */
    var centered: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[Omit[NonNullable[js.UndefOr[ModalClassNames]], wrapper]] = js.native
    
    /** Whether a close (x) button is visible on top right of the modal dialog or not. Recommend to use closeIcon instead. */
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[Boolean | ReactElement] = js.native
    
    /** Whether to apply loading visual effect for OK button or not */
    var confirmLoading: js.UndefOr[Boolean] = js.native
    
    var destroyOnClose: js.UndefOr[Boolean] = js.native
    
    var focusTriggerAfterClose: js.UndefOr[Boolean] = js.native
    
    /** Footer content */
    var footer: js.UndefOr[ModalFooterRender | ReactElement] = js.native
    
    /** Force render Modal */
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false`] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
    
    /** Whether to close the modal dialog when the mask (area outside the modal) is clicked */
    var maskClosable: js.UndefOr[Boolean] = js.native
    
    /** @deprecated Please use `styles.mask` instead */
    var maskStyle: js.UndefOr[CSSProperties] = js.native
    
    var maskTransitionName: js.UndefOr[String] = js.native
    
    var modalRender: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var mousePosition: js.UndefOr[MousePosition] = js.native
    
    var okButtonProps: js.UndefOr[ButtonProps] = js.native
    
    /** Text of the OK button */
    var okText: js.UndefOr[ReactElement] = js.native
    
    /** Button `type` of the OK button */
    var okType: js.UndefOr[LegacyButtonType] = js.native
    
    /** Specify a function that will be called when a user clicks mask, close button on top right or Cancel button */
    var onCancel: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.native
    
    /** Specify a function that will be called when a user clicks the OK button */
    var onOk: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.native
    
    /** Whether the modal dialog is visible or not */
    var open: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    /** The modal dialog's title */
    var title: js.UndefOr[ReactElement] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    /** @deprecated Please use `open` instead. */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Width of the modal dialog */
    var width: js.UndefOr[String | Double] = js.native
    
    var wrapClassName: js.UndefOr[String] = js.native
    
    var wrapProps: js.UndefOr[Any] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object ModalProps {
    
    @scala.inline
    def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      @scala.inline
      def setAfterOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "afterOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterOpenChangeUndefined: Self = StObject.set(x, "afterOpenChange", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      @scala.inline
      def setCancelText(value: ReactElement): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(value: Omit[NonNullable[js.UndefOr[ModalClassNames]], wrapper]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: Boolean | ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconReactElement(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setConfirmLoading(value: Boolean): Self = StObject.set(x, "confirmLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmLoadingUndefined: Self = StObject.set(x, "confirmLoading", js.undefined)
      
      @scala.inline
      def setDestroyOnClose(value: Boolean): Self = StObject.set(x, "destroyOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyOnCloseUndefined: Self = StObject.set(x, "destroyOnClose", js.undefined)
      
      @scala.inline
      def setFocusTriggerAfterClose(value: Boolean): Self = StObject.set(x, "focusTriggerAfterClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusTriggerAfterCloseUndefined: Self = StObject.set(x, "focusTriggerAfterClose", js.undefined)
      
      @scala.inline
      def setFooter(value: ModalFooterRender | ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterFunction2(value: (/* originNode */ ReactElement, /* extra */ CancelBtn) => ReactElement): Self = StObject.set(x, "footer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFooterReactElement(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setGetContainer(value: String | HTMLElement | getContainerFunc | `false`): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      @scala.inline
      def setMaskStyle(value: CSSProperties): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setModalRender(value: /* node */ ReactElement => ReactElement): Self = StObject.set(x, "modalRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModalRenderUndefined: Self = StObject.set(x, "modalRender", js.undefined)
      
      @scala.inline
      def setMousePosition(value: MousePosition): Self = StObject.set(x, "mousePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousePositionNull: Self = StObject.set(x, "mousePosition", null)
      
      @scala.inline
      def setMousePositionUndefined: Self = StObject.set(x, "mousePosition", js.undefined)
      
      @scala.inline
      def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      @scala.inline
      def setOkText(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      @scala.inline
      def setOnCancel(value: /* e */ SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* e */ SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
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
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type MousePosition = X | Null
  
  type getContainerFunc = js.Function0[HTMLElement]
}
