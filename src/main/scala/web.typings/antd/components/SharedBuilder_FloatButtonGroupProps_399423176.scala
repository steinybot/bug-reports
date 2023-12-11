package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esFloatButtonInterfaceMod.FloatButtonBadgeProps
import web.typings.antd.esFloatButtonInterfaceMod.FloatButtonElement
import web.typings.antd.esFloatButtonInterfaceMod.FloatButtonGroupTrigger
import web.typings.antd.esFloatButtonInterfaceMod.FloatButtonShape
import web.typings.antd.esFloatButtonInterfaceMod.FloatButtonType
import web.typings.antd.esUtilGetRenderPropValueMod.RenderFunction
import web.typings.react.anon.Html
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.DragEvent
import web.typings.react.mod.HTMLAttributeAnchorTarget
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
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
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_FloatButtonGroupProps_399423176 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
  
  @scala.inline
  def badge(value: FloatButtonBadgeProps): this.type = set("badge", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def closeIcon(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
  
  @scala.inline
  def description(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
  
  @scala.inline
  def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
  
  @scala.inline
  def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onAbort(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
  
  @scala.inline
  def onAnimationEnd(value: SyntheticAnimationEvent[FloatButtonElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onAnimationIteration(value: SyntheticAnimationEvent[FloatButtonElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
  
  @scala.inline
  def onAnimationStart(value: SyntheticAnimationEvent[FloatButtonElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onAuxClick(value: SyntheticMouseEvent[FloatButtonElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onBeforeInput(value: SyntheticEvent[EventTarget with FloatButtonElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
  
  @scala.inline
  def onBlur(value: SyntheticFocusEvent[FloatButtonElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCanPlay(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCanPlayThrough(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
  
  @scala.inline
  def onChange(value: SyntheticEvent[EventTarget with FloatButtonElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onClick(value: SyntheticMouseEvent[FloatButtonElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCompositionEnd(value: SyntheticCompositionEvent[FloatButtonElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCompositionStart(value: SyntheticCompositionEvent[FloatButtonElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCompositionUpdate(value: SyntheticCompositionEvent[FloatButtonElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
  
  @scala.inline
  def onContextMenu(value: SyntheticMouseEvent[FloatButtonElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCopy(value: SyntheticClipboardEvent[FloatButtonElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCut(value: SyntheticClipboardEvent[FloatButtonElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDoubleClick(value: SyntheticMouseEvent[FloatButtonElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDrag(value: DragEvent[FloatButtonElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragEnd(value: DragEvent[FloatButtonElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragEnter(value: DragEvent[FloatButtonElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragExit(value: DragEvent[FloatButtonElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragLeave(value: DragEvent[FloatButtonElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragOver(value: DragEvent[FloatButtonElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragStart(value: DragEvent[FloatButtonElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDrop(value: DragEvent[FloatButtonElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDurationChange(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onEmptied(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
  
  @scala.inline
  def onEncrypted(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
  
  @scala.inline
  def onEnded(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
  
  @scala.inline
  def onError(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
  
  @scala.inline
  def onFocus(value: SyntheticFocusEvent[FloatButtonElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  
  @scala.inline
  def onInput(value: SyntheticEvent[EventTarget with FloatButtonElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
  
  @scala.inline
  def onInvalid(value: SyntheticEvent[EventTarget with FloatButtonElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyDown(value: SyntheticKeyboardEvent[FloatButtonElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyPress(value: SyntheticKeyboardEvent[FloatButtonElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyUp(value: SyntheticKeyboardEvent[FloatButtonElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLoad(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLoadStart(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLoadedData(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLoadedMetadata(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseDown(value: SyntheticMouseEvent[FloatButtonElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseEnter(value: SyntheticMouseEvent[FloatButtonElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: SyntheticMouseEvent[FloatButtonElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseMove(value: SyntheticMouseEvent[FloatButtonElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseOut(value: SyntheticMouseEvent[FloatButtonElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseOver(value: SyntheticMouseEvent[FloatButtonElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseUp(value: SyntheticMouseEvent[FloatButtonElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
  
  @scala.inline
  def onOpenChange(value: /* open */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPaste(value: SyntheticClipboardEvent[FloatButtonElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPause(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPlay(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPlaying(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerCancel(value: SyntheticPointerEvent[FloatButtonElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerDown(value: SyntheticPointerEvent[FloatButtonElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerEnter(value: SyntheticPointerEvent[FloatButtonElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerLeave(value: SyntheticPointerEvent[FloatButtonElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerMove(value: SyntheticPointerEvent[FloatButtonElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerOut(value: SyntheticPointerEvent[FloatButtonElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerOver(value: SyntheticPointerEvent[FloatButtonElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerUp(value: SyntheticPointerEvent[FloatButtonElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
  
  @scala.inline
  def onProgress(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
  
  @scala.inline
  def onRateChange(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onReset(value: SyntheticEvent[EventTarget with FloatButtonElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
  
  @scala.inline
  def onResize(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
  
  @scala.inline
  def onScroll(value: SyntheticUIEvent[FloatButtonElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSeeked(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSeeking(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSelect(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
  
  @scala.inline
  def onStalled(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSubmit(value: SyntheticEvent[EventTarget with FloatButtonElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSuspend(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTimeUpdate(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTouchCancel(value: SyntheticTouchEvent[FloatButtonElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTouchEnd(value: SyntheticTouchEvent[FloatButtonElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTouchMove(value: SyntheticTouchEvent[FloatButtonElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTouchStart(value: SyntheticTouchEvent[FloatButtonElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTransitionEnd(value: SyntheticTransitionEvent[FloatButtonElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onVolumeChange(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onWaiting(value: SyntheticEvent[Event, FloatButtonElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
  
  @scala.inline
  def onWheel(value: SyntheticWheelEvent[FloatButtonElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
  
  @scala.inline
  def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def shape(value: FloatButtonShape): this.type = set("shape", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def target(value: HTMLAttributeAnchorTarget): this.type = set("target", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tooltip(value: ReactElement | RenderFunction): this.type = set("tooltip", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tooltipFunction0(value: () => ReactElement): this.type = set("tooltip", js.Any.fromFunction0(value))
  
  @scala.inline
  def tooltipReactElement(value: ReactElement): this.type = set("tooltip", value.asInstanceOf[js.Any])
  
  @scala.inline
  def trigger(value: FloatButtonGroupTrigger): this.type = set("trigger", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `type`(value: FloatButtonType): this.type = set("type", value.asInstanceOf[js.Any])
}
