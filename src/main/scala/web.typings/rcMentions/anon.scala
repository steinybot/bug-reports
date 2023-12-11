package web.typings.rcMentions

import web.typings.rcInput.esInterfaceMod.CountConfig
import web.typings.rcMentions.esMentionsMod.DataDrivenOptionProps
import web.typings.rcMentions.esMentionsMod.Direction
import web.typings.rcMentions.esMentionsMod.MentionsRef
import web.typings.rcMentions.esMentionsMod.Placement
import web.typings.rcMentions.esOptionMod.OptionProps
import web.typings.rcMentions.rcMentionsBooleans.`false`
import web.typings.rcMentions.rcMentionsStrings.`additions removals`
import web.typings.rcMentions.rcMentionsStrings.`additions text`
import web.typings.rcMentions.rcMentionsStrings.`inline`
import web.typings.rcMentions.rcMentionsStrings.`removals additions`
import web.typings.rcMentions.rcMentionsStrings.`removals text`
import web.typings.rcMentions.rcMentionsStrings.`text additions`
import web.typings.rcMentions.rcMentionsStrings.`text removals`
import web.typings.rcMentions.rcMentionsStrings.additions
import web.typings.rcMentions.rcMentionsStrings.all
import web.typings.rcMentions.rcMentionsStrings.ascending
import web.typings.rcMentions.rcMentionsStrings.assertive
import web.typings.rcMentions.rcMentionsStrings.both
import web.typings.rcMentions.rcMentionsStrings.copy
import web.typings.rcMentions.rcMentionsStrings.date
import web.typings.rcMentions.rcMentionsStrings.decimal
import web.typings.rcMentions.rcMentionsStrings.descending
import web.typings.rcMentions.rcMentionsStrings.dialog
import web.typings.rcMentions.rcMentionsStrings.email
import web.typings.rcMentions.rcMentionsStrings.execute
import web.typings.rcMentions.rcMentionsStrings.grammar
import web.typings.rcMentions.rcMentionsStrings.grid
import web.typings.rcMentions.rcMentionsStrings.horizontal
import web.typings.rcMentions.rcMentionsStrings.inherit
import web.typings.rcMentions.rcMentionsStrings.link
import web.typings.rcMentions.rcMentionsStrings.list
import web.typings.rcMentions.rcMentionsStrings.listbox
import web.typings.rcMentions.rcMentionsStrings.location
import web.typings.rcMentions.rcMentionsStrings.menu
import web.typings.rcMentions.rcMentionsStrings.mixed
import web.typings.rcMentions.rcMentionsStrings.move
import web.typings.rcMentions.rcMentionsStrings.no
import web.typings.rcMentions.rcMentionsStrings.none
import web.typings.rcMentions.rcMentionsStrings.numeric
import web.typings.rcMentions.rcMentionsStrings.off
import web.typings.rcMentions.rcMentionsStrings.on
import web.typings.rcMentions.rcMentionsStrings.other
import web.typings.rcMentions.rcMentionsStrings.page
import web.typings.rcMentions.rcMentionsStrings.polite
import web.typings.rcMentions.rcMentionsStrings.popup
import web.typings.rcMentions.rcMentionsStrings.removals
import web.typings.rcMentions.rcMentionsStrings.search
import web.typings.rcMentions.rcMentionsStrings.spelling
import web.typings.rcMentions.rcMentionsStrings.step
import web.typings.rcMentions.rcMentionsStrings.tel
import web.typings.rcMentions.rcMentionsStrings.text
import web.typings.rcMentions.rcMentionsStrings.time
import web.typings.rcMentions.rcMentionsStrings.tree
import web.typings.rcMentions.rcMentionsStrings.url
import web.typings.rcMentions.rcMentionsStrings.vertical
import web.typings.rcMentions.rcMentionsStrings.yes
import web.typings.rcTextarea.anon.AffixWrapper
import web.typings.rcTextarea.anon.Count
import web.typings.rcTextarea.anon.Height
import web.typings.rcTextarea.anon.Textarea
import web.typings.rcTextarea.esInterfaceMod.AutoSizeType
import web.typings.react.anon.Html
import web.typings.react.mod.AnimationEventHandler
import web.typings.react.mod.AriaRole
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.ClipboardEventHandler
import web.typings.react.mod.CompositionEventHandler
import web.typings.react.mod.DragEvent
import web.typings.react.mod.DragEventHandler
import web.typings.react.mod.FocusEventHandler
import web.typings.react.mod.FormEventHandler
import web.typings.react.mod.Key
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.PointerEventHandler
import web.typings.react.mod.ReactEventHandler
import web.typings.react.mod.Ref
import web.typings.react.mod.TouchEventHandler
import web.typings.react.mod.TransitionEventHandler
import web.typings.react.mod.UIEventHandler
import web.typings.react.mod.WheelEventHandler
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLTextAreaElement
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

object anon {
  
  /* Inlined std.Partial<rc-mentions.rc-mentions/es/Mentions.MentionsProps & react.react.RefAttributes<rc-mentions.rc-mentions/es/Mentions.MentionsRef>> */
  @js.native
  trait PartialMentionsPropsRefAt extends StObject {
    
    var about: js.UndefOr[String] = js.native
    
    var accessKey: js.UndefOr[String] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-braillelabel`: js.UndefOr[String] = js.native
    
    var `aria-brailleroledescription`: js.UndefOr[String] = js.native
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colindextext`: js.UndefOr[String] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-description`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Booleanish] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowindextext`: js.UndefOr[String] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[Count] = js.native
    
    var classes: js.UndefOr[AffixWrapper] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var count: js.UndefOr[CountConfig] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var dirName: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[Direction] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var dropdownClassName: js.UndefOr[String] = js.native
    
    var filterOption: js.UndefOr[`false` | (js.Function2[/* input */ String, /* param1 */ OptionProps, Boolean])] = js.native
    
    var form: js.UndefOr[String] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[Any] = js.native
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    var is: js.UndefOr[String] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key | Null] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var minLength: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var notFoundContent: js.UndefOr[ReactElement] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLTextAreaElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLTextAreaElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLTextAreaElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLTextAreaElement]] = js.native
    
    var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.native
    
    var onResize: js.UndefOr[js.Function1[/* size */ Height, Unit]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLTextAreaElement]] = js.native
    
    var onSearch: js.UndefOr[js.Function2[/* text */ String, /* prefix */ String, Unit]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onSelect: js.UndefOr[js.Function2[/* option */ OptionProps, /* prefix */ String, Unit]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLTextAreaElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLTextAreaElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLTextAreaElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLTextAreaElement]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var options: js.UndefOr[js.Array[DataDrivenOptionProps]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var prefix: js.UndefOr[String | js.Array[String]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var radioGroup: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var ref: js.UndefOr[Ref[MentionsRef]] = js.native
    
    var rel: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var rev: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[AriaRole] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var split: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styles: js.UndefOr[Textarea] = js.native
    
    var suffix: js.UndefOr[ReactElement] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var validateSearch: js.UndefOr[js.Function2[/* text */ String, /* split */ js.UndefOr[String], Boolean]] = js.native
    
    var value: js.UndefOr[String] = js.native
    
    var vocab: js.UndefOr[String] = js.native
    
    var wrap: js.UndefOr[String] = js.native
  }
  object PartialMentionsPropsRefAt {
    
    @scala.inline
    def apply(): PartialMentionsPropsRefAt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMentionsPropsRefAt]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PartialMentionsPropsRefAt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-braillelabel`(value: String): Self = StObject.set(x, "aria-braillelabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-braillelabelUndefined`: Self = StObject.set(x, "aria-braillelabel", js.undefined)
      
      @scala.inline
      def `setAria-brailleroledescription`(value: String): Self = StObject.set(x, "aria-brailleroledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-brailleroledescriptionUndefined`: Self = StObject.set(x, "aria-brailleroledescription", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colindextext`(value: String): Self = StObject.set(x, "aria-colindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindextextUndefined`: Self = StObject.set(x, "aria-colindextext", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-description`(value: String): Self = StObject.set(x, "aria-description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-descriptionUndefined`: Self = StObject.set(x, "aria-description", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowindextext`(value: String): Self = StObject.set(x, "aria-rowindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindextextUndefined`: Self = StObject.set(x, "aria-rowindextext", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setAutoSize(value: Boolean | AutoSizeType): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(value: Count): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setClasses(value: AffixWrapper): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setCount(value: CountConfig): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirName(value: String): Self = StObject.set(x, "dirName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirNameUndefined: Self = StObject.set(x, "dirName", js.undefined)
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setFilterOption(value: `false` | (js.Function2[/* input */ String, /* param1 */ OptionProps, Boolean])): Self = StObject.set(x, "filterOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterOptionFunction2(value: (/* input */ String, /* param1 */ OptionProps) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: () => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setNotFoundContent(value: ReactElement): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* text */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: SyntheticClipboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: SyntheticClipboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: SyntheticPointerEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnPressEnter(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: SyntheticEvent[EventTarget with HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* size */ Height => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSearch(value: (/* text */ String, /* prefix */ String) => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* option */ OptionProps, /* prefix */ String) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLTextAreaElement, Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticTouchEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[Event, HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: SyntheticWheelEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[DataDrivenOptionProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: DataDrivenOptionProps*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefix(value: String | js.Array[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPrefixVarargs(value: String*): Self = StObject.set(x, "prefix", js.Array(value :_*))
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[MentionsRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ MentionsRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefReactRef(value: ReactRef[MentionsRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
      
      @scala.inline
      def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setSplit(value: String): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: Textarea): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setSuffix(value: ReactElement): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setValidateSearch(value: (/* text */ String, /* split */ js.UndefOr[String]) => Boolean): Self = StObject.set(x, "validateSearch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidateSearchUndefined: Self = StObject.set(x, "validateSearch", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      @scala.inline
      def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait SelectionLocation extends StObject {
    
    var selectionLocation: Double = js.native
    
    var text: String = js.native
  }
  object SelectionLocation {
    
    @scala.inline
    def apply(selectionLocation: Double, text: String): SelectionLocation = {
      val __obj = js.Dynamic.literal(selectionLocation = selectionLocation.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionLocation]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SelectionLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectionLocation(value: Double): Self = StObject.set(x, "selectionLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.WeakValidationMap<rc-mentions.rc-mentions/es/Mentions.MentionsProps & react.react.RefAttributes<rc-mentions.rc-mentions/es/Mentions.MentionsRef>> */
  @js.native
  trait WeakValidationMapMentions extends StObject {
    
    var about: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var accessKey: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-activedescendant`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-atomic`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-autocomplete`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'inline' | 'list' | 'both' | undefined | undefined | undefined ? react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | undefined | undefined | null | undefined> : undefined extends 'none' | 'inline' | 'list' | 'both' | undefined | undefined | undefined ? react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-braillelabel`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-brailleroledescription`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-busy`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-checked`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-colcount`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-colindex`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-colindextext`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-colspan`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-controls`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-current`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-describedby`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-description`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-details`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-disabled`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-dropeffect`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | undefined ? react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | undefined | null | undefined> : undefined extends 'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | undefined ? react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-errormessage`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-expanded`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-flowto`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-grabbed`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-haspopup`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-hidden`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-invalid`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-label`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-labelledby`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-level`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-live`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'off' | 'assertive' | 'polite' | undefined | undefined | undefined ? react.react.Validator<'off' | 'assertive' | 'polite' | undefined | undefined | undefined | null | undefined> : undefined extends 'off' | 'assertive' | 'polite' | undefined | undefined | undefined ? react.react.Validator<'off' | 'assertive' | 'polite' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'off' | 'assertive' | 'polite' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-modal`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-multiline`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-multiselectable`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-orientation`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'horizontal' | 'vertical' | undefined | undefined | undefined ? react.react.Validator<'horizontal' | 'vertical' | undefined | undefined | undefined | null | undefined> : undefined extends 'horizontal' | 'vertical' | undefined | undefined | undefined ? react.react.Validator<'horizontal' | 'vertical' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'horizontal' | 'vertical' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-owns`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-placeholder`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-posinset`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-pressed`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-readonly`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-relevant`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | undefined ? react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | undefined | null | undefined> : undefined extends 'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | undefined ? react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-required`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-roledescription`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-rowcount`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-rowindex`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-rowindextext`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-rowspan`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-selected`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-setsize`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-sort`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | undefined ? react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | undefined | null | undefined> : undefined extends 'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | undefined ? react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-valuemax`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-valuemin`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-valuenow`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var `aria-valuetext`: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var autoCapitalize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var autoComplete: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var autoCorrect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var autoFocus: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.native
    
    var autoSave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var autoSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | rc-textarea.rc-textarea/es/interface.AutoSizeType | undefined | undefined ? react.react.Validator<boolean | rc-textarea.rc-textarea/es/interface.AutoSizeType | undefined | undefined | null | undefined> : undefined extends boolean | rc-textarea.rc-textarea/es/interface.AutoSizeType | undefined | undefined ? react.react.Validator<boolean | rc-textarea.rc-textarea/es/interface.AutoSizeType | undefined | undefined | null | undefined> : react.react.Validator<boolean | rc-textarea.rc-textarea/es/interface.AutoSizeType | undefined | undefined> */ js.Any
      ] = js.native
    
    var children: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
      ] = js.native
    
    var className: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.native
    
    var classNames: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-textarea.anon.Count | undefined | undefined ? react.react.Validator<rc-textarea.anon.Count | undefined | undefined | null | undefined> : undefined extends rc-textarea.anon.Count | undefined | undefined ? react.react.Validator<rc-textarea.anon.Count | undefined | undefined | null | undefined> : react.react.Validator<rc-textarea.anon.Count | undefined | undefined> */ js.Any
      ] = js.native
    
    var classes: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-textarea.anon.AffixWrapper | undefined | undefined ? react.react.Validator<rc-textarea.anon.AffixWrapper | undefined | undefined | null | undefined> : undefined extends rc-textarea.anon.AffixWrapper | undefined | undefined ? react.react.Validator<rc-textarea.anon.AffixWrapper | undefined | undefined | null | undefined> : react.react.Validator<rc-textarea.anon.AffixWrapper | undefined | undefined> */ js.Any
      ] = js.native
    
    var color: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var cols: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var content: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var contentEditable: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | 'inherit' | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | 'inherit' | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | 'inherit' | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | 'inherit' | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | 'inherit' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var contextMenu: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var count: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-input.rc-input/es/interface.CountConfig | undefined | undefined ? react.react.Validator<rc-input.rc-input/es/interface.CountConfig | undefined | undefined | null | undefined> : undefined extends rc-input.rc-input/es/interface.CountConfig | undefined | undefined ? react.react.Validator<rc-input.rc-input/es/interface.CountConfig | undefined | undefined | null | undefined> : react.react.Validator<rc-input.rc-input/es/interface.CountConfig | undefined | undefined> */ js.Any
      ] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.anon.Html | undefined | undefined | undefined ? react.react.Validator<react.anon.Html | undefined | undefined | undefined | null | undefined> : undefined extends react.anon.Html | undefined | undefined | undefined ? react.react.Validator<react.anon.Html | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.anon.Html | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var datatype: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var defaultChecked: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var defaultValue: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.native
    
    var dir: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var dirName: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var direction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-mentions.rc-mentions/es/Mentions.Direction | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Direction | undefined | null | undefined> : undefined extends rc-mentions.rc-mentions/es/Mentions.Direction | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Direction | undefined | null | undefined> : react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Direction | undefined> */ js.Any
      ] = js.native
    
    var disabled: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var draggable: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var dropdownClassName: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.native
    
    var filterOption: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined ? react.react.Validator<false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined | null | undefined> : undefined extends false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined ? react.react.Validator<false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined | null | undefined> : react.react.Validator<false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined> */ js.Any
      ] = js.native
    
    var form: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var getPopupContainer: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (): std.HTMLElement | undefined ? react.react.Validator<(): std.HTMLElement | undefined | null | undefined> : undefined extends (): std.HTMLElement | undefined ? react.react.Validator<(): std.HTMLElement | undefined | null | undefined> : react.react.Validator<(): std.HTMLElement | undefined> */ js.Any
      ] = js.native
    
    var hidden: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var id: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var inlist: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends any | undefined | undefined | undefined ? react.react.Validator<any | undefined | undefined | undefined | null | undefined> : undefined extends any | undefined | undefined | undefined ? react.react.Validator<any | undefined | undefined | undefined | null | undefined> : react.react.Validator<any | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var inputMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | undefined ? react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | undefined | null | undefined> : undefined extends 'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | undefined ? react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var is: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var itemID: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var itemProp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var itemRef: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var itemScope: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var itemType: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var key: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : undefined extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : react.react.Validator<react.react.Key | null | undefined> */ js.Any
      ] = js.native
    
    var lang: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var maxLength: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var minLength: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var name: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var nonce: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var notFoundContent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
      ] = js.native
    
    var onAbort: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onAnimationEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onAnimationIteration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onAnimationStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onAuxClick: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onBeforeInput: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onBlur: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : undefined extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined> */ js.Any
      ] = js.native
    
    var onCanPlay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onCanPlayThrough: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (text : string): void | undefined ? react.react.Validator<(text : string): void | undefined | null | undefined> : undefined extends (text : string): void | undefined ? react.react.Validator<(text : string): void | undefined | null | undefined> : react.react.Validator<(text : string): void | undefined> */ js.Any
      ] = js.native
    
    var onClick: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onCompositionEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onCompositionStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onCompositionUpdate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onContextMenu: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onCopy: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onCut: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onDoubleClick: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onDrag: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onDragEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onDragEnter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onDragExit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onDragLeave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onDragOver: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onDragStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onDrop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onDurationChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onEmptied: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onEncrypted: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onEnded: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onError: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onFocus: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : undefined extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined> */ js.Any
      ] = js.native
    
    var onInput: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onInvalid: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onKeyDown: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onKeyPress: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onKeyUp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onLoad: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onLoadStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onLoadedData: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onLoadedMetadata: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onMouseDown: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onMouseEnter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onMouseLeave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onMouseMove: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onMouseOut: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onMouseOver: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onMouseUp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPaste: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPause: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPlay: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPlaying: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPointerCancel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPointerDown: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPointerEnter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPointerLeave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPointerMove: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPointerOut: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPointerOver: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPointerUp: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onPressEnter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ] = js.native
    
    var onProgress: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onRateChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onReset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onResize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (size : rc-textarea.anon.Height): void | undefined | undefined ? react.react.Validator<(size : rc-textarea.anon.Height): void | undefined | undefined | null | undefined> : undefined extends (size : rc-textarea.anon.Height): void | undefined | undefined ? react.react.Validator<(size : rc-textarea.anon.Height): void | undefined | undefined | null | undefined> : react.react.Validator<(size : rc-textarea.anon.Height): void | undefined | undefined> */ js.Any
      ] = js.native
    
    var onScroll: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onSearch: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (text : string, prefix : string): void | undefined ? react.react.Validator<(text : string, prefix : string): void | undefined | null | undefined> : undefined extends (text : string, prefix : string): void | undefined ? react.react.Validator<(text : string, prefix : string): void | undefined | null | undefined> : react.react.Validator<(text : string, prefix : string): void | undefined> */ js.Any
      ] = js.native
    
    var onSeeked: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onSeeking: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onSelect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined ? react.react.Validator<(option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined | null | undefined> : undefined extends (option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined ? react.react.Validator<(option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined | null | undefined> : react.react.Validator<(option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined> */ js.Any
      ] = js.native
    
    var onStalled: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onSubmit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onSuspend: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onTimeUpdate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onTouchCancel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onTouchEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onTouchMove: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onTouchStart: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onTransitionEnd: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onVolumeChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onWaiting: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var onWheel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var open: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.native
    
    var options: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends std.Array<rc-mentions.rc-mentions/es/Mentions.DataDrivenOptionProps> | undefined ? react.react.Validator<std.Array<rc-mentions.rc-mentions/es/Mentions.DataDrivenOptionProps> | undefined | null | undefined> : undefined extends std.Array<rc-mentions.rc-mentions/es/Mentions.DataDrivenOptionProps> | undefined ? react.react.Validator<std.Array<rc-mentions.rc-mentions/es/Mentions.DataDrivenOptionProps> | undefined | null | undefined> : react.react.Validator<std.Array<rc-mentions.rc-mentions/es/Mentions.DataDrivenOptionProps> | undefined> */ js.Any
      ] = js.native
    
    var placeholder: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var placement: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-mentions.rc-mentions/es/Mentions.Placement | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Placement | undefined | null | undefined> : undefined extends rc-mentions.rc-mentions/es/Mentions.Placement | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Placement | undefined | null | undefined> : react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Placement | undefined> */ js.Any
      ] = js.native
    
    var prefix: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | std.Array<string> | undefined ? react.react.Validator<string | std.Array<string> | undefined | null | undefined> : undefined extends string | std.Array<string> | undefined ? react.react.Validator<string | std.Array<string> | undefined | null | undefined> : react.react.Validator<string | std.Array<string> | undefined> */ js.Any
      ] = js.native
    
    var prefixCls: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.native
    
    var property: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var radioGroup: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var readOnly: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined ? react.react.Validator<react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined | null | undefined> : undefined extends react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined ? react.react.Validator<react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined | null | undefined> : react.react.Validator<react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined> */ js.Any
      ] = js.native
    
    var rel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var required: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var resource: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var results: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var rev: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var role: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AriaRole | undefined | undefined | undefined ? react.react.Validator<react.react.AriaRole | undefined | undefined | undefined | null | undefined> : undefined extends react.react.AriaRole | undefined | undefined | undefined ? react.react.Validator<react.react.AriaRole | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.AriaRole | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var rows: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var security: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var slot: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var spellCheck: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var split: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.native
    
    var style: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CSSProperties | undefined ? react.react.Validator<react.react.CSSProperties | undefined | null | undefined> : undefined extends react.react.CSSProperties | undefined ? react.react.Validator<react.react.CSSProperties | undefined | null | undefined> : react.react.Validator<react.react.CSSProperties | undefined> */ js.Any
      ] = js.native
    
    var styles: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-textarea.anon.Textarea | undefined | undefined ? react.react.Validator<rc-textarea.anon.Textarea | undefined | undefined | null | undefined> : undefined extends rc-textarea.anon.Textarea | undefined | undefined ? react.react.Validator<rc-textarea.anon.Textarea | undefined | undefined | null | undefined> : react.react.Validator<rc-textarea.anon.Textarea | undefined | undefined> */ js.Any
      ] = js.native
    
    var suffix: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined | undefined ? react.react.Validator<react.react.ReactNode | undefined | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined | undefined ? react.react.Validator<react.react.ReactNode | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined | undefined> */ js.Any
      ] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var suppressHydrationWarning: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var tabIndex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var title: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var transitionName: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.native
    
    var translate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'yes' | 'no' | undefined | undefined | undefined ? react.react.Validator<'yes' | 'no' | undefined | undefined | undefined | null | undefined> : undefined extends 'yes' | 'no' | undefined | undefined | undefined ? react.react.Validator<'yes' | 'no' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'yes' | 'no' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var typeof: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var unselectable: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'on' | 'off' | undefined | undefined | undefined ? react.react.Validator<'on' | 'off' | undefined | undefined | undefined | null | undefined> : undefined extends 'on' | 'off' | undefined | undefined | undefined ? react.react.Validator<'on' | 'off' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'on' | 'off' | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var validateSearch: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (text : string, split : string | undefined): boolean | undefined ? react.react.Validator<(text : string, split : string | undefined): boolean | undefined | null | undefined> : undefined extends (text : string, split : string | undefined): boolean | undefined ? react.react.Validator<(text : string, split : string | undefined): boolean | undefined | null | undefined> : react.react.Validator<(text : string, split : string | undefined): boolean | undefined> */ js.Any
      ] = js.native
    
    var value: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.native
    
    var vocab: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
    
    var wrap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ] = js.native
  }
  object WeakValidationMapMentions {
    
    @scala.inline
    def apply(): WeakValidationMapMentions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WeakValidationMapMentions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: WeakValidationMapMentions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'inline' | 'list' | 'both' | undefined | undefined | undefined ? react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | undefined | undefined | null | undefined> : undefined extends 'none' | 'inline' | 'list' | 'both' | undefined | undefined | undefined ? react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'inline' | 'list' | 'both' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-braillelabel`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-braillelabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-braillelabelUndefined`: Self = StObject.set(x, "aria-braillelabel", js.undefined)
      
      @scala.inline
      def `setAria-brailleroledescription`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-brailleroledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-brailleroledescriptionUndefined`: Self = StObject.set(x, "aria-brailleroledescription", js.undefined)
      
      @scala.inline
      def `setAria-busy`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colindextext`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-colindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindextextUndefined`: Self = StObject.set(x, "aria-colindextext", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-description`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-descriptionUndefined`: Self = StObject.set(x, "aria-description", js.undefined)
      
      @scala.inline
      def `setAria-details`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | undefined ? react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | undefined | null | undefined> : undefined extends 'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | undefined ? react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'off' | 'assertive' | 'polite' | undefined | undefined | undefined ? react.react.Validator<'off' | 'assertive' | 'polite' | undefined | undefined | undefined | null | undefined> : undefined extends 'off' | 'assertive' | 'polite' | undefined | undefined | undefined ? react.react.Validator<'off' | 'assertive' | 'polite' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'off' | 'assertive' | 'polite' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'horizontal' | 'vertical' | undefined | undefined | undefined ? react.react.Validator<'horizontal' | 'vertical' | undefined | undefined | undefined | null | undefined> : undefined extends 'horizontal' | 'vertical' | undefined | undefined | undefined ? react.react.Validator<'horizontal' | 'vertical' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'horizontal' | 'vertical' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined | null | undefined> : undefined extends boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined ? react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | 'false' | 'mixed' | 'true' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | undefined ? react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | undefined | null | undefined> : undefined extends 'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | undefined ? react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowindextext`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-rowindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindextextUndefined`: Self = StObject.set(x, "aria-rowindextext", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | undefined ? react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | undefined | null | undefined> : undefined extends 'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | undefined ? react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'ascending' | 'descending' | 'other' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoComplete(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoCorrect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoFocus(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoSave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setAutoSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | rc-textarea.rc-textarea/es/interface.AutoSizeType | undefined | undefined ? react.react.Validator<boolean | rc-textarea.rc-textarea/es/interface.AutoSizeType | undefined | undefined | null | undefined> : undefined extends boolean | rc-textarea.rc-textarea/es/interface.AutoSizeType | undefined | undefined ? react.react.Validator<boolean | rc-textarea.rc-textarea/es/interface.AutoSizeType | undefined | undefined | null | undefined> : react.react.Validator<boolean | rc-textarea.rc-textarea/es/interface.AutoSizeType | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      @scala.inline
      def setChildren(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-textarea.anon.Count | undefined | undefined ? react.react.Validator<rc-textarea.anon.Count | undefined | undefined | null | undefined> : undefined extends rc-textarea.anon.Count | undefined | undefined ? react.react.Validator<rc-textarea.anon.Count | undefined | undefined | null | undefined> : react.react.Validator<rc-textarea.anon.Count | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setClasses(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-textarea.anon.AffixWrapper | undefined | undefined ? react.react.Validator<rc-textarea.anon.AffixWrapper | undefined | undefined | null | undefined> : undefined extends rc-textarea.anon.AffixWrapper | undefined | undefined ? react.react.Validator<rc-textarea.anon.AffixWrapper | undefined | undefined | null | undefined> : react.react.Validator<rc-textarea.anon.AffixWrapper | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCols(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setContent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditable(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | 'inherit' | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | 'inherit' | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | 'inherit' | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | 'inherit' | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | 'inherit' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContextMenu(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setCount(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-input.rc-input/es/interface.CountConfig | undefined | undefined ? react.react.Validator<rc-input.rc-input/es/interface.CountConfig | undefined | undefined | null | undefined> : undefined extends rc-input.rc-input/es/interface.CountConfig | undefined | undefined ? react.react.Validator<rc-input.rc-input/es/interface.CountConfig | undefined | undefined | null | undefined> : react.react.Validator<rc-input.rc-input/es/interface.CountConfig | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.anon.Html | undefined | undefined | undefined ? react.react.Validator<react.anon.Html | undefined | undefined | undefined | null | undefined> : undefined extends react.anon.Html | undefined | undefined | undefined ? react.react.Validator<react.anon.Html | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.anon.Html | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setDatatype(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDefaultChecked(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDir(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "dirName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirNameUndefined: Self = StObject.set(x, "dirName", js.undefined)
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDirection(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-mentions.rc-mentions/es/Mentions.Direction | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Direction | undefined | null | undefined> : undefined extends rc-mentions.rc-mentions/es/Mentions.Direction | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Direction | undefined | null | undefined> : react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Direction | undefined> */ js.Any
      ): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDraggable(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setDropdownClassName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setFilterOption(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined ? react.react.Validator<false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined | null | undefined> : undefined extends false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined ? react.react.Validator<false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined | null | undefined> : react.react.Validator<false | (input : string, param1 : rc-mentions.rc-mentions/es/Option.OptionProps): boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "filterOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      @scala.inline
      def setForm(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (): std.HTMLElement | undefined ? react.react.Validator<(): std.HTMLElement | undefined | null | undefined> : undefined extends (): std.HTMLElement | undefined ? react.react.Validator<(): std.HTMLElement | undefined | null | undefined> : react.react.Validator<(): std.HTMLElement | undefined> */ js.Any
      ): Self = StObject.set(x, "getPopupContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setHidden(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlist(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends any | undefined | undefined | undefined ? react.react.Validator<any | undefined | undefined | undefined | null | undefined> : undefined extends any | undefined | undefined | undefined ? react.react.Validator<any | undefined | undefined | undefined | null | undefined> : react.react.Validator<any | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | undefined ? react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | undefined | null | undefined> : undefined extends 'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | undefined ? react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIs(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : undefined extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : react.react.Validator<react.react.Key | null | undefined> */ js.Any
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLang(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setMaxLength(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMinLength(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNonce(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setNotFoundContent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
      ): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setOnAbort(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onAnimationIteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.AnimationEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onAuxClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onBeforeInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : undefined extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCanPlayThrough(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (text : string): void | undefined ? react.react.Validator<(text : string): void | undefined | null | undefined> : undefined extends (text : string): void | undefined ? react.react.Validator<(text : string): void | undefined | null | undefined> : react.react.Validator<(text : string): void | undefined> */ js.Any
      ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCompositionEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCompositionStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.CompositionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCompositionUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDoubleClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.DragEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : undefined extends react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined ? react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined | null | undefined> : react.react.Validator<react.react.FocusEventHandler<std.HTMLTextAreaElement> | undefined> */ js.Any
      ): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.MouseEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ClipboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.PointerEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnPressEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : undefined extends react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined ? react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined | null | undefined> : react.react.Validator<react.react.KeyboardEventHandler<std.HTMLTextAreaElement> | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onPressEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      @scala.inline
      def setOnProgress(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnResize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (size : rc-textarea.anon.Height): void | undefined | undefined ? react.react.Validator<(size : rc-textarea.anon.Height): void | undefined | undefined | null | undefined> : undefined extends (size : rc-textarea.anon.Height): void | undefined | undefined ? react.react.Validator<(size : rc-textarea.anon.Height): void | undefined | undefined | null | undefined> : react.react.Validator<(size : rc-textarea.anon.Height): void | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOnScroll(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.UIEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSearch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (text : string, prefix : string): void | undefined ? react.react.Validator<(text : string, prefix : string): void | undefined | null | undefined> : undefined extends (text : string, prefix : string): void | undefined ? react.react.Validator<(text : string, prefix : string): void | undefined | null | undefined> : react.react.Validator<(text : string, prefix : string): void | undefined> */ js.Any
      ): Self = StObject.set(x, "onSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setOnSeeked(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined ? react.react.Validator<(option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined | null | undefined> : undefined extends (option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined ? react.react.Validator<(option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined | null | undefined> : react.react.Validator<(option : rc-mentions.rc-mentions/es/Option.OptionProps, prefix : string): void | undefined> */ js.Any
      ): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.FormEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.TouchEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.TransitionEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onTransitionEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : undefined extends react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined ? react.react.Validator<react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.WheelEventHandler<std.HTMLTextAreaElement> | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setOpen(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptions(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends std.Array<rc-mentions.rc-mentions/es/Mentions.DataDrivenOptionProps> | undefined ? react.react.Validator<std.Array<rc-mentions.rc-mentions/es/Mentions.DataDrivenOptionProps> | undefined | null | undefined> : undefined extends std.Array<rc-mentions.rc-mentions/es/Mentions.DataDrivenOptionProps> | undefined ? react.react.Validator<std.Array<rc-mentions.rc-mentions/es/Mentions.DataDrivenOptionProps> | undefined | null | undefined> : react.react.Validator<std.Array<rc-mentions.rc-mentions/es/Mentions.DataDrivenOptionProps> | undefined> */ js.Any
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPlaceholder(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlacement(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-mentions.rc-mentions/es/Mentions.Placement | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Placement | undefined | null | undefined> : undefined extends rc-mentions.rc-mentions/es/Mentions.Placement | undefined ? react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Placement | undefined | null | undefined> : react.react.Validator<rc-mentions.rc-mentions/es/Mentions.Placement | undefined> */ js.Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefix(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | std.Array<string> | undefined ? react.react.Validator<string | std.Array<string> | undefined | null | undefined> : undefined extends string | std.Array<string> | undefined ? react.react.Validator<string | std.Array<string> | undefined | null | undefined> : react.react.Validator<string | std.Array<string> | undefined> */ js.Any
      ): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setProperty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setReadOnly(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined ? react.react.Validator<react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined | null | undefined> : undefined extends react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined ? react.react.Validator<react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined | null | undefined> : react.react.Validator<react.react.Ref<rc-mentions.rc-mentions/es/Mentions.MentionsRef> | undefined> */ js.Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setRequired(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResource(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRev(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
      
      @scala.inline
      def setRole(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.AriaRole | undefined | undefined | undefined ? react.react.Validator<react.react.AriaRole | undefined | undefined | undefined | null | undefined> : undefined extends react.react.AriaRole | undefined | undefined | undefined ? react.react.Validator<react.react.AriaRole | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.AriaRole | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRows(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSecurity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSlot(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpellCheck(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : undefined extends react.react.Booleanish | undefined | undefined | undefined ? react.react.Validator<react.react.Booleanish | undefined | undefined | undefined | null | undefined> : react.react.Validator<react.react.Booleanish | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setSplit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.CSSProperties | undefined ? react.react.Validator<react.react.CSSProperties | undefined | null | undefined> : undefined extends react.react.CSSProperties | undefined ? react.react.Validator<react.react.CSSProperties | undefined | null | undefined> : react.react.Validator<react.react.CSSProperties | undefined> */ js.Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends rc-textarea.anon.Textarea | undefined | undefined ? react.react.Validator<rc-textarea.anon.Textarea | undefined | undefined | null | undefined> : undefined extends rc-textarea.anon.Textarea | undefined | undefined ? react.react.Validator<rc-textarea.anon.Textarea | undefined | undefined | null | undefined> : react.react.Validator<rc-textarea.anon.Textarea | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setSuffix(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined | undefined ? react.react.Validator<react.react.ReactNode | undefined | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined | undefined ? react.react.Validator<react.react.ReactNode | undefined | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : undefined extends boolean | undefined | undefined | undefined ? react.react.Validator<boolean | undefined | undefined | undefined | null | undefined> : react.react.Validator<boolean | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : undefined extends number | undefined | undefined | undefined ? react.react.Validator<number | undefined | undefined | undefined | null | undefined> : react.react.Validator<number | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTranslate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'yes' | 'no' | undefined | undefined | undefined ? react.react.Validator<'yes' | 'no' | undefined | undefined | undefined | null | undefined> : undefined extends 'yes' | 'no' | undefined | undefined | undefined ? react.react.Validator<'yes' | 'no' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'yes' | 'no' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTypeof(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'on' | 'off' | undefined | undefined | undefined ? react.react.Validator<'on' | 'off' | undefined | undefined | undefined | null | undefined> : undefined extends 'on' | 'off' | undefined | undefined | undefined ? react.react.Validator<'on' | 'off' | undefined | undefined | undefined | null | undefined> : react.react.Validator<'on' | 'off' | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setValidateSearch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (text : string, split : string | undefined): boolean | undefined ? react.react.Validator<(text : string, split : string | undefined): boolean | undefined | null | undefined> : undefined extends (text : string, split : string | undefined): boolean | undefined ? react.react.Validator<(text : string, split : string | undefined): boolean | undefined | null | undefined> : react.react.Validator<(text : string, split : string | undefined): boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "validateSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateSearchUndefined: Self = StObject.set(x, "validateSearch", js.undefined)
      
      @scala.inline
      def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVocab(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      @scala.inline
      def setWrap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : undefined extends string | undefined | undefined | undefined ? react.react.Validator<string | undefined | undefined | undefined | null | undefined> : react.react.Validator<string | undefined | undefined | undefined> */ js.Any
      ): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
