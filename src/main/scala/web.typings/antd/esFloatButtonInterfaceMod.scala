package web.typings.antd

import web.typings.antd.anon.Indicator
import web.typings.antd.anon.Root
import web.typings.antd.antdStrings.default
import web.typings.antd.antdStrings.small
import web.typings.antd.esFloatButtonPurePanelMod.PurePanelProps
import web.typings.antd.esThemeInterfacePresetColorsMod.PresetColorKey
import web.typings.antd.esUtilGetRenderPropValueMod.RenderFunction
import web.typings.antd.esUtilTypeMod.LiteralUnion
import web.typings.react.anon.Html
import web.typings.react.mod.AnimationEventHandler
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.ClipboardEventHandler
import web.typings.react.mod.CompositionEventHandler
import web.typings.react.mod.DOMAttributes
import web.typings.react.mod.DragEvent
import web.typings.react.mod.DragEventHandler
import web.typings.react.mod.FocusEventHandler
import web.typings.react.mod.FormEventHandler
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.HTMLAttributeAnchorTarget
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.PointerEventHandler
import web.typings.react.mod.ReactEventHandler
import web.typings.react.mod.RefAttributes
import web.typings.react.mod.TouchEventHandler
import web.typings.react.mod.TransitionEventHandler
import web.typings.react.mod.UIEventHandler
import web.typings.react.mod.WheelEventHandler
import web.typings.std.AddEventListenerOptions
import web.typings.std.EventListenerOrEventListenerObject
import web.typings.std.HTMLAnchorElement
import org.scalajs.dom.Document
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLLabelElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.ValidityState
import org.scalajs.dom.Window
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFloatButtonInterfaceMod {
  
  /* Inlined parent std.Omit<antd.antd/es/float-button/interface.FloatButtonProps, 'target'> */
  @js.native
  trait BackTopProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var badge: js.UndefOr[FloatButtonBadgeProps] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[FloatButtonElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[FloatButtonElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[FloatButtonElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[FloatButtonElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[FloatButtonElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[FloatButtonElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[FloatButtonElement]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[FloatButtonElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[FloatButtonElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[FloatButtonElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[FloatButtonElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[FloatButtonElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[FloatButtonElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[FloatButtonElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[FloatButtonElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[FloatButtonElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[FloatButtonElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[FloatButtonElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[FloatButtonElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[FloatButtonElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[FloatButtonElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[FloatButtonElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[FloatButtonElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[FloatButtonElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[FloatButtonElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[FloatButtonElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[FloatButtonElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[FloatButtonElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[FloatButtonElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[FloatButtonElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[FloatButtonElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[FloatButtonElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[FloatButtonElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[FloatButtonElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[FloatButtonElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[FloatButtonElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[FloatButtonElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[FloatButtonElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[FloatButtonElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[FloatButtonElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[FloatButtonElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[FloatButtonElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[FloatButtonElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[FloatButtonElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[FloatButtonElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[FloatButtonElement]] = js.native
    
    var onResize: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[FloatButtonElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[FloatButtonElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[FloatButtonElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[FloatButtonElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[FloatButtonElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[FloatButtonElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[FloatButtonElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[FloatButtonElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[FloatButtonElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var shape: js.UndefOr[FloatButtonShape] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var target: js.UndefOr[js.Function0[HTMLElement | Window | Document]] = js.native
    
    var tooltip: js.UndefOr[ReactElement | RenderFunction] = js.native
    
    var `type`: js.UndefOr[FloatButtonType] = js.native
    
    var visibilityHeight: js.UndefOr[Double] = js.native
  }
  object BackTopProps {
    
    @scala.inline
    def apply(): BackTopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackTopProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BackTopProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def setBadge(value: FloatButtonBadgeProps): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: SyntheticAnimationEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: SyntheticAnimationEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: SyntheticAnimationEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: SyntheticMouseEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: SyntheticEvent[EventTarget with FloatButtonElement, Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[EventTarget with FloatButtonElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: SyntheticCompositionEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: SyntheticClipboardEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: SyntheticClipboardEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: SyntheticMouseEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with FloatButtonElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: SyntheticEvent[EventTarget with FloatButtonElement, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: SyntheticMouseEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: SyntheticPointerEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: SyntheticPointerEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticPointerEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: SyntheticPointerEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: SyntheticPointerEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: SyntheticPointerEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: SyntheticPointerEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: SyntheticPointerEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: SyntheticEvent[EventTarget with FloatButtonElement, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnResize(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: SyntheticEvent[EventTarget with FloatButtonElement, Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticTouchEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: SyntheticTransitionEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[Event, FloatButtonElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: SyntheticWheelEvent[FloatButtonElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setShape(value: FloatButtonShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTarget(value: () => HTMLElement | Window | Document): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTooltip(value: ReactElement | RenderFunction): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipFunction0(value: () => ReactElement): Self = StObject.set(x, "tooltip", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTooltipReactElement(value: ReactElement): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setType(value: FloatButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisibilityHeight(value: Double): Self = StObject.set(x, "visibilityHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityHeightUndefined: Self = StObject.set(x, "visibilityHeight", js.undefined)
    }
  }
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[FloatButtonProps with RefAttributes[FloatButtonElement]] {
    
    var BackTop: ReactComponentClass[BackTopProps with RefAttributes[FloatButtonRef]] = js.native
    
    var Group: ReactComponentClass[FloatButtonGroupProps] = js.native
    
    var _InternalPanelDoNotUseOrYouWillBeFired: ReactComponentClass[PurePanelProps] = js.native
  }
  
  /* Inlined std.Omit<antd.antd/es/badge.BadgeProps, 'status' | 'text' | 'title' | 'children'> */
  @js.native
  trait FloatButtonBadgeProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[Indicator] = js.native
    
    var color: js.UndefOr[LiteralUnion[PresetColorKey]] = js.native
    
    var count: js.UndefOr[ReactElement] = js.native
    
    var dot: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
    
    var overflowCount: js.UndefOr[Double] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var scrollNumberPrefixCls: js.UndefOr[String] = js.native
    
    var showZero: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[default | small] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styles: js.UndefOr[Root] = js.native
  }
  object FloatButtonBadgeProps {
    
    @scala.inline
    def apply(): FloatButtonBadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FloatButtonBadgeProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FloatButtonBadgeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(value: Indicator): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setColor(value: LiteralUnion[PresetColorKey]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCount(value: ReactElement): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOverflowCount(value: Double): Self = StObject.set(x, "overflowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowCountUndefined: Self = StObject.set(x, "overflowCount", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setScrollNumberPrefixCls(value: String): Self = StObject.set(x, "scrollNumberPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollNumberPrefixClsUndefined: Self = StObject.set(x, "scrollNumberPrefixCls", js.undefined)
      
      @scala.inline
      def setShowZero(value: Boolean): Self = StObject.set(x, "showZero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowZeroUndefined: Self = StObject.set(x, "showZero", js.undefined)
      
      @scala.inline
      def setSize(value: default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: Root): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait FloatButtonContentProps
    extends StObject
       with DOMAttributes[HTMLDivElement] {
    
    var className: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object FloatButtonContentProps {
    
    @scala.inline
    def apply(): FloatButtonContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FloatButtonContentProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FloatButtonContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `web.typings`.std.EventTarget because Already inherited
  - `web.typings`.std.Node because Already inherited
  - `web.typings`.std.Slottable because Already inherited
  - `web.typings`.std.ParentNode because Already inherited
  - `web.typings`.std.NonDocumentTypeChildNode because Already inherited
  - `web.typings`.std.InnerHTML because Already inherited
  - `web.typings`.std.ChildNode because Already inherited
  - `web.typings`.std.Animatable because Already inherited
  - `web.typings`.std.HTMLOrSVGElement because Already inherited
  - `web.typings`.std.GlobalEventHandlers because Already inherited
  - `web.typings`.std.ElementContentEditable because Already inherited
  - `web.typings`.std.ElementCSSInlineStyle because Already inherited
  - `web.typings`.std.DocumentAndElementEventHandlers because Already inherited
  - `web.typings`.std.Element because Already inherited
  - `web.typings`.std.HTMLElement because Already inherited
  - `web.typings`.std.HTMLButtonElement because var conflicts: accessKey, autocapitalize, autofocus, className, contentEditable, dir, draggable, enterKeyHint, hidden, id, innerHTML, innerText, inputMode, lang, name, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onblur, oncancel, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextmenu, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragexit, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwheel, outerHTML, scrollLeft, scrollTop, slot, spellcheck, tabIndex, textContent, title, translate, `type`. Inlined formAction, labels, form, willValidate, value, validity, disabled, formMethod, formEnctype, formTarget, validationMessage, formNoValidate, checkValidity, reportValidity, setCustomValidity */ @js.native
  trait FloatButtonElement
    extends StObject
       with HTMLAnchorElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    /**
      * Returns whether a form will validate when it is submitted, without having to submit it.
      */
    /* standard dom */
    def checkValidity(): Boolean = js.native
    
    /* standard dom */
    var disabled: Boolean = js.native
    
    /**
      * Retrieves a reference to the form that the object is embedded in.
      */
    /* standard dom */
    val form: HTMLFormElement | Null = js.native
    
    /**
      * Overrides the action attribute (where the data on a form is sent) on the parent form element.
      */
    /* standard dom */
    var formAction: String = js.native
    
    /**
      * Used to override the encoding (formEnctype attribute) specified on the form element.
      */
    /* standard dom */
    var formEnctype: String = js.native
    
    /**
      * Overrides the submit method attribute previously specified on a form element.
      */
    /* standard dom */
    var formMethod: String = js.native
    
    /**
      * Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option.
      */
    /* standard dom */
    var formNoValidate: Boolean = js.native
    
    /**
      * Overrides the target attribute on a form element.
      */
    /* standard dom */
    var formTarget: String = js.native
    
    /* standard dom */
    val labels: NodeList[HTMLLabelElement with Node] = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    /* standard dom */
    def reportValidity(): Boolean = js.native
    
    /**
      * Sets a custom error message that is displayed when a form is submitted.
      * @param error Sets a custom error message that is displayed when a form is submitted.
      */
    /* standard dom */
    def setCustomValidity(error: String): Unit = js.native
    
    /**
      * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
      */
    /* standard dom */
    val validationMessage: String = js.native
    
    /**
      * Returns a  ValidityState object that represents the validity states of an element.
      */
    /* standard dom */
    val validity: ValidityState = js.native
    
    /**
      * Sets or retrieves the default or selected value of the control.
      */
    /* standard dom */
    var value: String = js.native
    
    /**
      * Returns whether an element will successfully validate based on forms validation rules and constraints.
      */
    /* standard dom */
    val willValidate: Boolean = js.native
  }
  
  @js.native
  trait FloatButtonGroupProps
    extends StObject
       with FloatButtonProps {
    
    @JSName("children")
    var children_FloatButtonGroupProps: ReactElement = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var trigger: js.UndefOr[FloatButtonGroupTrigger] = js.native
  }
  object FloatButtonGroupProps {
    
    @scala.inline
    def apply(children: ReactElement): FloatButtonGroupProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[FloatButtonGroupProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FloatButtonGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setTrigger(value: FloatButtonGroupTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.click
    - `web.typings`.antd.antdStrings.hover
  */
  trait FloatButtonGroupTrigger extends StObject
  object FloatButtonGroupTrigger {
    
    @scala.inline
    def click: web.typings.antd.antdStrings.click = "click".asInstanceOf[web.typings.antd.antdStrings.click]
    
    @scala.inline
    def hover: web.typings.antd.antdStrings.hover = "hover".asInstanceOf[web.typings.antd.antdStrings.hover]
  }
  
  @js.native
  trait FloatButtonProps
    extends StObject
       with DOMAttributes[FloatButtonElement] {
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var badge: js.UndefOr[FloatButtonBadgeProps] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var shape: js.UndefOr[FloatButtonShape] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var target: js.UndefOr[HTMLAttributeAnchorTarget] = js.native
    
    var tooltip: js.UndefOr[ReactElement | RenderFunction] = js.native
    
    var `type`: js.UndefOr[FloatButtonType] = js.native
  }
  object FloatButtonProps {
    
    @scala.inline
    def apply(): FloatButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FloatButtonProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FloatButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def setBadge(value: FloatButtonBadgeProps): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setShape(value: FloatButtonShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLAttributeAnchorTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTooltip(value: ReactElement | RenderFunction): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipFunction0(value: () => ReactElement): Self = StObject.set(x, "tooltip", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTooltipReactElement(value: ReactElement): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setType(value: FloatButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait FloatButtonRef extends StObject {
    
    var nativeElement: FloatButtonElement | Null = js.native
  }
  object FloatButtonRef {
    
    @scala.inline
    def apply(): FloatButtonRef = {
      val __obj = js.Dynamic.literal(nativeElement = null)
      __obj.asInstanceOf[FloatButtonRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FloatButtonRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeElement(value: FloatButtonElement): Self = StObject.set(x, "nativeElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeElementNull: Self = StObject.set(x, "nativeElement", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.circle
    - `web.typings`.antd.antdStrings.square
  */
  trait FloatButtonShape extends StObject
  object FloatButtonShape {
    
    @scala.inline
    def circle: web.typings.antd.antdStrings.circle = "circle".asInstanceOf[web.typings.antd.antdStrings.circle]
    
    @scala.inline
    def square: web.typings.antd.antdStrings.square = "square".asInstanceOf[web.typings.antd.antdStrings.square]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.default
    - `web.typings`.antd.antdStrings.primary
  */
  trait FloatButtonType extends StObject
  object FloatButtonType {
    
    @scala.inline
    def default: web.typings.antd.antdStrings.default = "default".asInstanceOf[web.typings.antd.antdStrings.default]
    
    @scala.inline
    def primary: web.typings.antd.antdStrings.primary = "primary".asInstanceOf[web.typings.antd.antdStrings.primary]
  }
}
