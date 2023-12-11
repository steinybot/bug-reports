package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdInts.`1`
import web.typings.antd.antdInts.`2`
import web.typings.antd.antdInts.`3`
import web.typings.antd.antdInts.`4`
import web.typings.antd.antdInts.`5`
import web.typings.antd.antdStrings.`additions removals`
import web.typings.antd.antdStrings.`additions text`
import web.typings.antd.antdStrings.`inline`
import web.typings.antd.antdStrings.`removals additions`
import web.typings.antd.antdStrings.`removals text`
import web.typings.antd.antdStrings.`text additions`
import web.typings.antd.antdStrings.`text removals`
import web.typings.antd.antdStrings.additions
import web.typings.antd.antdStrings.all
import web.typings.antd.antdStrings.ascending
import web.typings.antd.antdStrings.assertive
import web.typings.antd.antdStrings.both
import web.typings.antd.antdStrings.copy
import web.typings.antd.antdStrings.date
import web.typings.antd.antdStrings.decimal
import web.typings.antd.antdStrings.descending
import web.typings.antd.antdStrings.dialog
import web.typings.antd.antdStrings.email
import web.typings.antd.antdStrings.execute
import web.typings.antd.antdStrings.grammar
import web.typings.antd.antdStrings.grid_
import web.typings.antd.antdStrings.horizontal
import web.typings.antd.antdStrings.inherit
import web.typings.antd.antdStrings.link
import web.typings.antd.antdStrings.list_
import web.typings.antd.antdStrings.listbox
import web.typings.antd.antdStrings.location
import web.typings.antd.antdStrings.menu_
import web.typings.antd.antdStrings.mixed
import web.typings.antd.antdStrings.move
import web.typings.antd.antdStrings.no
import web.typings.antd.antdStrings.none
import web.typings.antd.antdStrings.numeric
import web.typings.antd.antdStrings.off
import web.typings.antd.antdStrings.on
import web.typings.antd.antdStrings.other
import web.typings.antd.antdStrings.page
import web.typings.antd.antdStrings.polite
import web.typings.antd.antdStrings.popup
import web.typings.antd.antdStrings.removals
import web.typings.antd.antdStrings.search
import web.typings.antd.antdStrings.spelling
import web.typings.antd.antdStrings.step
import web.typings.antd.antdStrings.tel
import web.typings.antd.antdStrings.text_
import web.typings.antd.antdStrings.time
import web.typings.antd.antdStrings.tree_
import web.typings.antd.antdStrings.url
import web.typings.antd.antdStrings.vertical
import web.typings.antd.antdStrings.yes
import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.antd.esTypographyBaseMod.BaseType
import web.typings.antd.esTypographyBaseMod.CopyConfig
import web.typings.antd.esTypographyBaseMod.EditConfig
import web.typings.antd.esTypographyBaseMod.EllipsisConfig
import web.typings.antd.esTypographyLinkMod.LinkProps
import web.typings.antd.esTypographyParagraphMod.ParagraphProps
import web.typings.antd.esTypographyTextMod.TextProps
import web.typings.antd.esTypographyTitleMod.TitleProps
import web.typings.antd.esTypographyTypographyMod.InternalTypographyProps
import web.typings.react.anon.Html
import web.typings.react.mod.AriaRole
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.DragEvent
import web.typings.react.mod.RefAttributes
import web.typings.react.reactStrings.grid
import web.typings.react.reactStrings.list
import web.typings.react.reactStrings.menu
import web.typings.react.reactStrings.text
import web.typings.react.reactStrings.tree
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import slinky.core.SyntheticEvent
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

object Typography {
  
  object Link {
    
    @JSImport("antd", "Typography.Link")
    @js.native
    val component: js.Object = js.native
    
    type Props = LinkProps with RefAttributes[HTMLElement]
    
    implicit def make(companion: Link.type): SharedBuilder_LinkPropsRefAttributes_1058152575[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes_1058152575[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: LinkProps with RefAttributes[HTMLElement]): SharedBuilder_LinkPropsRefAttributes_1058152575[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes_1058152575[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Paragraph {
    
    @JSImport("antd", "Typography.Paragraph")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, HTMLElement] {
      
      @scala.inline
      def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-autocomplete`(value: none | `inline` | list_ | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-braillelabel`(value: String): this.type = set("aria-braillelabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-brailleroledescription`(value: String): this.type = set("aria-brailleroledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colindextext`(value: String): this.type = set("aria-colindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-description`(value: String): this.type = set("aria-description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-haspopup`(value: Boolean | menu_ | listbox | tree_ | grid_ | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
      ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowindextext`(value: String): this.type = set("aria-rowindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def code(value: Boolean): this.type = set("code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def copyable(value: Boolean | CopyConfig): this.type = set("copyable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
      
      @scala.inline
      def delete(value: Boolean): this.type = set("delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def editable(value: Boolean | EditConfig): this.type = set("editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ellipsis(value: Boolean | EllipsisConfig): this.type = set("ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputMode(value: none | text_ | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def italic(value: Boolean): this.type = set("italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mark(value: Boolean): this.type = set("mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAbort(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationEnd(value: SyntheticAnimationEvent[HTMLElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationIteration(value: SyntheticAnimationEvent[HTMLElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationStart(value: SyntheticAnimationEvent[HTMLElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAuxClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlay(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlayThrough(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChange(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionEnd(value: SyntheticCompositionEvent[HTMLElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionStart(value: SyntheticCompositionEvent[HTMLElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onContextMenu(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCopy(value: SyntheticClipboardEvent[HTMLElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCut(value: SyntheticClipboardEvent[HTMLElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDoubleClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDrag(value: DragEvent[HTMLElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEnd(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEnter(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragExit(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragLeave(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragOver(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragStart(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDrop(value: DragEvent[HTMLElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDurationChange(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEmptied(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEncrypted(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEnded(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def onError(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInput(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInvalid(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyDown(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyPress(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyUp(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoad(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadStart(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedData(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedMetadata(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseEnter(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseLeave(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseMove(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOut(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOver(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseUp(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPaste(value: SyntheticClipboardEvent[HTMLElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPause(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlay(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlaying(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerCancel(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerDown(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerEnter(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerLeave(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerMove(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOut(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOver(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerUp(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onProgress(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRateChange(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onReset(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResize(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def onScroll(value: SyntheticUIEvent[HTMLElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeeked(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeeking(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelect(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStalled(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSubmit(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSuspend(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTimeUpdate(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchCancel(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEnd(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchMove(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchStart(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTransitionEnd(value: SyntheticTransitionEvent[HTMLElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onVolumeChange(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWaiting(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWheel(value: SyntheticWheelEvent[HTMLElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rev(value: String): this.type = set("rev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def strong(value: Boolean): this.type = set("strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `type`(value: BaseType): this.type = set("type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def underline(value: Boolean): this.type = set("underline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    }
    
    type Props = ParagraphProps with RefAttributes[HTMLElement]
    
    implicit def make(companion: Paragraph.type): web.typings.antd.components.Typography.Paragraph.Builder = new web.typings.antd.components.Typography.Paragraph.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ParagraphProps with RefAttributes[HTMLElement]): web.typings.antd.components.Typography.Paragraph.Builder = new web.typings.antd.components.Typography.Paragraph.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Text {
    
    @JSImport("antd", "Typography.Text")
    @js.native
    val component: js.Object = js.native
    
    type Props = TextProps with RefAttributes[HTMLSpanElement]
    
    implicit def make(companion: Text.type): SharedBuilder_TextPropsRefAttributes1061540711[HTMLSpanElement] = new SharedBuilder_TextPropsRefAttributes1061540711[HTMLSpanElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TextProps with RefAttributes[HTMLSpanElement]): SharedBuilder_TextPropsRefAttributes1061540711[HTMLSpanElement] = new SharedBuilder_TextPropsRefAttributes1061540711[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @JSImport("antd", "Typography.Title")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, HTMLElement] {
      
      @scala.inline
      def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-autocomplete`(value: none | `inline` | list_ | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-braillelabel`(value: String): this.type = set("aria-braillelabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-brailleroledescription`(value: String): this.type = set("aria-brailleroledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colindextext`(value: String): this.type = set("aria-colindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-description`(value: String): this.type = set("aria-description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-haspopup`(value: Boolean | menu_ | listbox | tree_ | grid_ | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
      ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowindextext`(value: String): this.type = set("aria-rowindextext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def code(value: Boolean): this.type = set("code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def copyable(value: Boolean | CopyConfig): this.type = set("copyable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
      
      @scala.inline
      def delete(value: Boolean): this.type = set("delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def editable(value: Boolean | EditConfig): this.type = set("editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ellipsis(value: Boolean | EllipsisConfig): this.type = set("ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputMode(value: none | text_ | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def italic(value: Boolean): this.type = set("italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def level(value: `1` | `2` | `3` | `4` | `5`): this.type = set("level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mark(value: Boolean): this.type = set("mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAbort(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationEnd(value: SyntheticAnimationEvent[HTMLElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationIteration(value: SyntheticAnimationEvent[HTMLElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationStart(value: SyntheticAnimationEvent[HTMLElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAuxClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlay(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlayThrough(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChange(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionEnd(value: SyntheticCompositionEvent[HTMLElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionStart(value: SyntheticCompositionEvent[HTMLElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onContextMenu(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCopy(value: SyntheticClipboardEvent[HTMLElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCut(value: SyntheticClipboardEvent[HTMLElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDoubleClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDrag(value: DragEvent[HTMLElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEnd(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEnter(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragExit(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragLeave(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragOver(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragStart(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDrop(value: DragEvent[HTMLElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDurationChange(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEmptied(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEncrypted(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEnded(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def onError(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInput(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInvalid(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyDown(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyPress(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyUp(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoad(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadStart(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedData(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedMetadata(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseEnter(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseLeave(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseMove(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOut(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOver(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseUp(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPaste(value: SyntheticClipboardEvent[HTMLElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPause(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlay(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlaying(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerCancel(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerDown(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerEnter(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerLeave(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerMove(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOut(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOver(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerUp(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onProgress(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRateChange(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onReset(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResize(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def onScroll(value: SyntheticUIEvent[HTMLElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeeked(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeeking(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelect(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStalled(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSubmit(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSuspend(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTimeUpdate(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchCancel(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEnd(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchMove(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchStart(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTransitionEnd(value: SyntheticTransitionEvent[HTMLElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onVolumeChange(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWaiting(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWheel(value: SyntheticWheelEvent[HTMLElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rev(value: String): this.type = set("rev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `type`(value: BaseType): this.type = set("type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def underline(value: Boolean): this.type = set("underline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    }
    
    type Props = TitleProps with RefAttributes[HTMLElement]
    
    implicit def make(companion: Title.type): web.typings.antd.components.Typography.Title.Builder = new web.typings.antd.components.Typography.Title.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TitleProps with RefAttributes[HTMLElement]): web.typings.antd.components.Typography.Title.Builder = new web.typings.antd.components.Typography.Title.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Typography")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLElement] {
    
    @scala.inline
    def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-autocomplete`(
      value: web.typings.react.reactStrings.none | web.typings.react.reactStrings.`inline` | list | web.typings.react.reactStrings.both
    ): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-braillelabel`(value: String): this.type = set("aria-braillelabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-brailleroledescription`(value: String): this.type = set("aria-brailleroledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-checked`(value: Boolean | web.typings.react.reactStrings.mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colindextext`(value: String): this.type = set("aria-colindextext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-current`(
      value: Boolean | web.typings.react.reactStrings.page | web.typings.react.reactStrings.step | web.typings.react.reactStrings.location | web.typings.react.reactStrings.date | web.typings.react.reactStrings.time
    ): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-description`(value: String): this.type = set("aria-description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-dropeffect`(
      value: web.typings.react.reactStrings.none | web.typings.react.reactStrings.copy | web.typings.react.reactStrings.execute | web.typings.react.reactStrings.link | web.typings.react.reactStrings.move | web.typings.react.reactStrings.popup
    ): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-haspopup`(
      value: Boolean | menu | web.typings.react.reactStrings.listbox | tree | grid | web.typings.react.reactStrings.dialog
    ): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-invalid`(value: Boolean | web.typings.react.reactStrings.grammar | web.typings.react.reactStrings.spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-live`(
      value: web.typings.react.reactStrings.off | web.typings.react.reactStrings.assertive | web.typings.react.reactStrings.polite
    ): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-orientation`(value: web.typings.react.reactStrings.horizontal | web.typings.react.reactStrings.vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-pressed`(value: Boolean | web.typings.react.reactStrings.mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-relevant`(
      value: web.typings.react.reactStrings.additions | (web.typings.react.reactStrings.`additions removals`) | (web.typings.react.reactStrings.`additions text`) | web.typings.react.reactStrings.all | web.typings.react.reactStrings.removals | (web.typings.react.reactStrings.`removals additions`) | (web.typings.react.reactStrings.`removals text`) | text | (web.typings.react.reactStrings.`text additions`) | (web.typings.react.reactStrings.`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowindextext`(value: String): this.type = set("aria-rowindextext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-sort`(
      value: web.typings.react.reactStrings.none | web.typings.react.reactStrings.ascending | web.typings.react.reactStrings.descending | web.typings.react.reactStrings.other
    ): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentEditable(value: Booleanish | web.typings.react.reactStrings.inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputMode(
      value: web.typings.react.reactStrings.none | text | web.typings.react.reactStrings.tel | web.typings.react.reactStrings.url | web.typings.react.reactStrings.email | web.typings.react.reactStrings.numeric | web.typings.react.reactStrings.decimal | web.typings.react.reactStrings.search
    ): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAbort(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationEnd(value: SyntheticAnimationEvent[HTMLElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationIteration(value: SyntheticAnimationEvent[HTMLElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationStart(value: SyntheticAnimationEvent[HTMLElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAuxClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlay(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayThrough(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionEnd(value: SyntheticCompositionEvent[HTMLElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionStart(value: SyntheticCompositionEvent[HTMLElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCopy(value: SyntheticClipboardEvent[HTMLElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCut(value: SyntheticClipboardEvent[HTMLElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrag(value: DragEvent[HTMLElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnd(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnter(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragExit(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragLeave(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragOver(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(value: DragEvent[HTMLElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrop(value: DragEvent[HTMLElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDurationChange(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEmptied(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEncrypted(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnded(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def onError(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInput(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInvalid(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadStart(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedData(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedMetadata(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOut(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPaste(value: SyntheticClipboardEvent[HTMLElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPause(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlay(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlaying(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerCancel(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerDown(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerEnter(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerLeave(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerMove(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOut(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOver(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerUp(value: SyntheticPointerEvent[HTMLElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onProgress(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRateChange(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReset(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResize(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: SyntheticUIEvent[HTMLElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeked(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeking(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStalled(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSubmit(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSuspend(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTimeUpdate(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[HTMLElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransitionEnd(value: SyntheticTransitionEvent[HTMLElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVolumeChange(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWaiting(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWheel(value: SyntheticWheelEvent[HTMLElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rev(value: String): this.type = set("rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRef(value: /* node */ HTMLElement => Unit): this.type = set("setContentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translate(value: web.typings.react.reactStrings.yes | web.typings.react.reactStrings.no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unselectable(value: web.typings.react.reactStrings.on | web.typings.react.reactStrings.off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  }
  
  type Props = (InternalTypographyProps[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any
  ]) with RefAttributes[HTMLElement]
  
  implicit def make(companion: Typography.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (InternalTypographyProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any
    ]) with RefAttributes[HTMLElement]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
