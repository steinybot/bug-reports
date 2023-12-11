package web.typings.antd.anon

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
import web.typings.antd.esConfigProviderContextMod.ThemeConfig
import web.typings.antd.esModalInterfaceMod.ModalFooterRender
import web.typings.antd.esModalInterfaceMod.ModalLocale
import web.typings.antd.esModalInterfaceMod.getContainerFunc
import web.typings.rcDialog.esIdialogproptypesMod.ModalStyles
import web.typings.react.mod.CSSProperties
import web.typings.std.NonNullable
import web.typings.std.Omit
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/es/modal/ConfirmDialog.ConfirmDialogProps & {  confirmPrefixCls :string} */
@js.native
trait ConfirmDialogPropsconfirm extends StObject {
  
  var afterClose: js.UndefOr[js.Function0[scala.Unit]] = js.native
  
  var autoFocusButton: js.UndefOr[Null | ok | cancel] = js.native
  
  /** @deprecated Please use `styles.body` instead */
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  
  var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
  
  var cancelText: js.UndefOr[ReactElement] = js.native
  
  var centered: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closable: js.UndefOr[Boolean] = js.native
  
  var close: js.UndefOr[js.Function1[/* repeated */ Any, scala.Unit]] = js.native
  
  var closeIcon: js.UndefOr[ReactElement] = js.native
  
  var confirmPrefixCls: String = js.native
  
  var content: js.UndefOr[ReactElement] = js.native
  
  var direction: js.UndefOr[DirectionType] = js.native
  
  var focusTriggerAfterClose: js.UndefOr[Boolean] = js.native
  
  var footer: js.UndefOr[ModalFooterRender | ReactElement] = js.native
  
  var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false`] = js.native
  
  var icon: js.UndefOr[ReactElement] = js.native
  
  var iconPrefixCls: js.UndefOr[String] = js.native
  
  /**
    * Do not throw if is await mode
    */
  var isSilent: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var keyboard: js.UndefOr[Boolean] = js.native
  
  /** @private Internal Usage. Do not override this */
  var locale: js.UndefOr[ModalLocale] = js.native
  
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
  
  /**
    * `close` prop support `...args` that pass to the developer
    * that we can not break this.
    * Provider `onClose` for internal usage
    */
  var onConfirm: js.UndefOr[js.Function1[/* confirmed */ Boolean, scala.Unit]] = js.native
  
  var onOk: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var prefixCls: String = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
  
  var rootPrefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var styles: js.UndefOr[Omit[NonNullable[js.UndefOr[ModalStyles]], wrapper]] = js.native
  
  /**
    * Only passed by static method
    */
  var theme: js.UndefOr[ThemeConfig] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
  
  var transitionName: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[info | success | error | warn | warning | confirm] = js.native
  
  /** @deprecated Please use `open` instead. */
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
  
  var wrapClassName: js.UndefOr[String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object ConfirmDialogPropsconfirm {
  
  @scala.inline
  def apply(confirmPrefixCls: String, prefixCls: String): ConfirmDialogPropsconfirm = {
    val __obj = js.Dynamic.literal(confirmPrefixCls = confirmPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDialogPropsconfirm]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ConfirmDialogPropsconfirm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterClose(value: () => scala.Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
    
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
    def setClose(value: /* repeated */ Any => scala.Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setConfirmPrefixCls(value: String): Self = StObject.set(x, "confirmPrefixCls", value.asInstanceOf[js.Any])
    
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
    def setIconPrefixCls(value: String): Self = StObject.set(x, "iconPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPrefixClsUndefined: Self = StObject.set(x, "iconPrefixCls", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIsSilent(value: () => Boolean): Self = StObject.set(x, "isSilent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSilentUndefined: Self = StObject.set(x, "isSilent", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setLocale(value: ModalLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
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
    def setOnConfirm(value: /* confirmed */ Boolean => scala.Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    
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
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    @scala.inline
    def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootPrefixClsUndefined: Self = StObject.set(x, "rootPrefixCls", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyles(value: Omit[NonNullable[js.UndefOr[ModalStyles]], wrapper]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ThemeConfig): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
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
