package web.typings.rcCollapse

import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.anon.Html
import web.typings.react.mod.AnimationEventHandler
import web.typings.react.mod.ClipboardEventHandler
import web.typings.react.mod.CompositionEventHandler
import web.typings.react.mod.DOMAttributes
import web.typings.react.mod.DragEvent
import web.typings.react.mod.DragEventHandler
import web.typings.react.mod.FocusEventHandler
import web.typings.react.mod.FormEventHandler
import web.typings.react.mod.Key
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.PointerEventHandler
import web.typings.react.mod.ReactEventHandler
import web.typings.react.mod.TouchEventHandler
import web.typings.react.mod.TransitionEventHandler
import web.typings.react.mod.UIEventHandler
import web.typings.react.mod.WheelEventHandler
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
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

object esInterfaceMod {
  
  @js.native
  trait CollapsePanelProps
    extends StObject
       with DOMAttributes[HTMLDivElement] {
    
    var accordion: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var collapsible: js.UndefOr[CollapsibleType] = js.native
    
    var destroyInactivePanel: js.UndefOr[Boolean] = js.native
    
    var expandIcon: js.UndefOr[js.Function1[/* props */ js.Object, ReactElement]] = js.native
    
    var extra: js.UndefOr[String | ReactElement] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var header: js.UndefOr[String | ReactElement] = js.native
    
    var headerClass: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var isActive: js.UndefOr[Boolean] = js.native
    
    var onItemClick: js.UndefOr[js.Function1[/* panelKey */ Key, Unit]] = js.native
    
    var openMotion: js.UndefOr[CSSMotionProps] = js.native
    
    var panelKey: js.UndefOr[Key] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var showArrow: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object CollapsePanelProps {
    
    @scala.inline
    def apply(): CollapsePanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsePanelProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CollapsePanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsible(value: CollapsibleType): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setDestroyInactivePanel(value: Boolean): Self = StObject.set(x, "destroyInactivePanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyInactivePanelUndefined: Self = StObject.set(x, "destroyInactivePanel", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: /* props */ js.Object => ReactElement): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setExtra(value: String | ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setHeader(value: String | ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClass(value: String): Self = StObject.set(x, "headerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassUndefined: Self = StObject.set(x, "headerClass", js.undefined)
      
      @scala.inline
      def setHeaderReactElement(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setOnItemClick(value: /* panelKey */ Key => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOpenMotion(value: CSSMotionProps): Self = StObject.set(x, "openMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMotionUndefined: Self = StObject.set(x, "openMotion", js.undefined)
      
      @scala.inline
      def setPanelKey(value: Key): Self = StObject.set(x, "panelKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelKeyUndefined: Self = StObject.set(x, "panelKey", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait CollapseProps extends StObject {
    
    var accordion: js.UndefOr[Boolean] = js.native
    
    var activeKey: js.UndefOr[Key | js.Array[Key]] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var collapsible: js.UndefOr[CollapsibleType] = js.native
    
    var defaultActiveKey: js.UndefOr[Key | js.Array[Key]] = js.native
    
    var destroyInactivePanel: js.UndefOr[Boolean] = js.native
    
    var expandIcon: js.UndefOr[js.Function1[/* props */ js.Object, ReactElement]] = js.native
    
    /**
      * Collapse items content
      * @since 3.6.0
      */
    var items: js.UndefOr[js.Array[ItemType]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* key */ Key | js.Array[Key], Unit]] = js.native
    
    var openMotion: js.UndefOr[CSSMotionProps] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object CollapseProps {
    
    @scala.inline
    def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CollapseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      @scala.inline
      def setActiveKey(value: Key | js.Array[Key]): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setActiveKeyVarargs(value: Key*): Self = StObject.set(x, "activeKey", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsible(value: CollapsibleType): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setDefaultActiveKey(value: Key | js.Array[Key]): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      @scala.inline
      def setDefaultActiveKeyVarargs(value: Key*): Self = StObject.set(x, "defaultActiveKey", js.Array(value :_*))
      
      @scala.inline
      def setDestroyInactivePanel(value: Boolean): Self = StObject.set(x, "destroyInactivePanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyInactivePanelUndefined: Self = StObject.set(x, "destroyInactivePanel", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: /* props */ js.Object => ReactElement): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[ItemType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: ItemType*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOnChange(value: /* key */ Key | js.Array[Key] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOpenMotion(value: CSSMotionProps): Self = StObject.set(x, "openMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMotionUndefined: Self = StObject.set(x, "openMotion", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcCollapse.rcCollapseStrings.header
    - `web.typings`.rcCollapse.rcCollapseStrings.icon
    - `web.typings`.rcCollapse.rcCollapseStrings.disabled
  */
  trait CollapsibleType extends StObject
  object CollapsibleType {
    
    @scala.inline
    def disabled: web.typings.rcCollapse.rcCollapseStrings.disabled = "disabled".asInstanceOf[web.typings.rcCollapse.rcCollapseStrings.disabled]
    
    @scala.inline
    def header: web.typings.rcCollapse.rcCollapseStrings.header = "header".asInstanceOf[web.typings.rcCollapse.rcCollapseStrings.header]
    
    @scala.inline
    def icon: web.typings.rcCollapse.rcCollapseStrings.icon = "icon".asInstanceOf[web.typings.rcCollapse.rcCollapseStrings.icon]
  }
  
  /* Inlined parent std.Omit<rc-collapse.rc-collapse/es/interface.CollapsePanelProps, 'header' | 'prefixCls' | 'panelKey' | 'isActive' | 'accordion' | 'openMotion' | 'expandIcon'> */
  @js.native
  trait ItemType extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var collapsible: js.UndefOr[CollapsibleType] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var destroyInactivePanel: js.UndefOr[Boolean] = js.native
    
    var extra: js.UndefOr[String | ReactElement] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var headerClass: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[String | ReactElement] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onItemClick: js.UndefOr[js.Function1[/* panelKey */ Key, Unit]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onResize: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.native
    
    var ref: js.UndefOr[ReactRef[HTMLDivElement]] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var showArrow: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object ItemType {
    
    @scala.inline
    def apply(): ItemType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ItemType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsible(value: CollapsibleType): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setDestroyInactivePanel(value: Boolean): Self = StObject.set(x, "destroyInactivePanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyInactivePanelUndefined: Self = StObject.set(x, "destroyInactivePanel", js.undefined)
      
      @scala.inline
      def setExtra(value: String | ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setHeaderClass(value: String): Self = StObject.set(x, "headerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassUndefined: Self = StObject.set(x, "headerClass", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: String | ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnItemClick(value: /* panelKey */ Key => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnResize(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
