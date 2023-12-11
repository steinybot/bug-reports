package web.typings.antDesignIcons.components

import web.typings.StBuildingComponent
import web.typings.antDesignIcons.antDesignIconsStrings._empty
import web.typings.antDesignIcons.antDesignIconsStrings.`additions removals`
import web.typings.antDesignIcons.antDesignIconsStrings.`additions text`
import web.typings.antDesignIcons.antDesignIconsStrings.`inline`
import web.typings.antDesignIcons.antDesignIconsStrings.`removals additions`
import web.typings.antDesignIcons.antDesignIconsStrings.`removals text`
import web.typings.antDesignIcons.antDesignIconsStrings.`text additions`
import web.typings.antDesignIcons.antDesignIconsStrings.`text removals`
import web.typings.antDesignIcons.antDesignIconsStrings.`use-credentials`
import web.typings.antDesignIcons.antDesignIconsStrings.additions
import web.typings.antDesignIcons.antDesignIconsStrings.all
import web.typings.antDesignIcons.antDesignIconsStrings.anonymous
import web.typings.antDesignIcons.antDesignIconsStrings.ascending
import web.typings.antDesignIcons.antDesignIconsStrings.assertive
import web.typings.antDesignIcons.antDesignIconsStrings.both
import web.typings.antDesignIcons.antDesignIconsStrings.copy
import web.typings.antDesignIcons.antDesignIconsStrings.date
import web.typings.antDesignIcons.antDesignIconsStrings.decimal
import web.typings.antDesignIcons.antDesignIconsStrings.descending
import web.typings.antDesignIcons.antDesignIconsStrings.dialog
import web.typings.antDesignIcons.antDesignIconsStrings.email
import web.typings.antDesignIcons.antDesignIconsStrings.environment
import web.typings.antDesignIcons.antDesignIconsStrings.execute
import web.typings.antDesignIcons.antDesignIconsStrings.grammar
import web.typings.antDesignIcons.antDesignIconsStrings.grid
import web.typings.antDesignIcons.antDesignIconsStrings.horizontal
import web.typings.antDesignIcons.antDesignIconsStrings.inherit
import web.typings.antDesignIcons.antDesignIconsStrings.link
import web.typings.antDesignIcons.antDesignIconsStrings.list
import web.typings.antDesignIcons.antDesignIconsStrings.listbox
import web.typings.antDesignIcons.antDesignIconsStrings.location
import web.typings.antDesignIcons.antDesignIconsStrings.menu
import web.typings.antDesignIcons.antDesignIconsStrings.mixed
import web.typings.antDesignIcons.antDesignIconsStrings.move
import web.typings.antDesignIcons.antDesignIconsStrings.no
import web.typings.antDesignIcons.antDesignIconsStrings.none
import web.typings.antDesignIcons.antDesignIconsStrings.numeric
import web.typings.antDesignIcons.antDesignIconsStrings.off
import web.typings.antDesignIcons.antDesignIconsStrings.on
import web.typings.antDesignIcons.antDesignIconsStrings.other
import web.typings.antDesignIcons.antDesignIconsStrings.page
import web.typings.antDesignIcons.antDesignIconsStrings.polite
import web.typings.antDesignIcons.antDesignIconsStrings.popup
import web.typings.antDesignIcons.antDesignIconsStrings.removals
import web.typings.antDesignIcons.antDesignIconsStrings.search
import web.typings.antDesignIcons.antDesignIconsStrings.spelling
import web.typings.antDesignIcons.antDesignIconsStrings.step
import web.typings.antDesignIcons.antDesignIconsStrings.tel
import web.typings.antDesignIcons.antDesignIconsStrings.text
import web.typings.antDesignIcons.antDesignIconsStrings.time
import web.typings.antDesignIcons.antDesignIconsStrings.tree
import web.typings.antDesignIcons.antDesignIconsStrings.url
import web.typings.antDesignIcons.antDesignIconsStrings.user
import web.typings.antDesignIcons.antDesignIconsStrings.vertical
import web.typings.antDesignIcons.antDesignIconsStrings.yes
import web.typings.antDesignIcons.esComponentsIconMod.CustomIconComponentProps
import web.typings.react.anon.Html
import web.typings.react.mod.AriaRole
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.DragEvent
import web.typings.react.mod.SVGProps
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.SVGSVGElement
import slinky.core.ReactComponentClass
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
import slinky.web.html.span.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_PickIconComponentPropssta_1452480601[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def default(value: Boolean): this.type = set("default", value.asInstanceOf[js.Any])
  
  @scala.inline
  def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
  
  @scala.inline
  def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
  
  @scala.inline
  def acceptCharset(value: String): this.type = set("acceptCharset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
  
  @scala.inline
  def action(value: String | (js.Function1[/* formData */ FormData, Unit])): this.type = set("action", value.asInstanceOf[js.Any])
  
  @scala.inline
  def actionFunction1(value: /* formData */ FormData => Unit): this.type = set("action", js.Any.fromFunction1(value))
  
  @scala.inline
  def allowFullScreen(value: Boolean): this.type = set("allowFullScreen", value.asInstanceOf[js.Any])
  
  @scala.inline
  def allowTransparency(value: Boolean): this.type = set("allowTransparency", value.asInstanceOf[js.Any])
  
  @scala.inline
  def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
  
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
  def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
  
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
    value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
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
  def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
  
  @scala.inline
  def as(value: String): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def async(value: Boolean): this.type = set("async", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
  
  @scala.inline
  def capture(value: Boolean | user | environment): this.type = set("capture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def cellPadding(value: Double | String): this.type = set("cellPadding", value.asInstanceOf[js.Any])
  
  @scala.inline
  def cellSpacing(value: Double | String): this.type = set("cellSpacing", value.asInstanceOf[js.Any])
  
  @scala.inline
  def challenge(value: String): this.type = set("challenge", value.asInstanceOf[js.Any])
  
  @scala.inline
  def charSet(value: String): this.type = set("charSet", value.asInstanceOf[js.Any])
  
  @scala.inline
  def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
  
  @scala.inline
  def cite(value: String): this.type = set("cite", value.asInstanceOf[js.Any])
  
  @scala.inline
  def classID(value: String): this.type = set("classID", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
  
  @scala.inline
  def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  
  @scala.inline
  def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
  
  @scala.inline
  def component(value: ReactComponentClass[CustomIconComponentProps | SVGProps[SVGSVGElement]]): this.type = set("component", value.asInstanceOf[js.Any])
  
  @scala.inline
  def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
  
  @scala.inline
  def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def coords(value: String): this.type = set("coords", value.asInstanceOf[js.Any])
  
  @scala.inline
  def crossOrigin(value: anonymous | `use-credentials` | _empty): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
  
  @scala.inline
  def data(value: String): this.type = set("data", value.asInstanceOf[js.Any])
  
  @scala.inline
  def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dateTime(value: String): this.type = set("dateTime", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
  
  @scala.inline
  def defer(value: Boolean): this.type = set("defer", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def download(value: Any): this.type = set("download", value.asInstanceOf[js.Any])
  
  @scala.inline
  def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def encType(value: String): this.type = set("encType", value.asInstanceOf[js.Any])
  
  @scala.inline
  def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
  
  @scala.inline
  def formAction(value: String | (js.Function1[/* formData */ FormData, Unit])): this.type = set("formAction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def formActionFunction1(value: /* formData */ FormData => Unit): this.type = set("formAction", js.Any.fromFunction1(value))
  
  @scala.inline
  def formEncType(value: String): this.type = set("formEncType", value.asInstanceOf[js.Any])
  
  @scala.inline
  def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
  
  @scala.inline
  def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
  
  @scala.inline
  def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
  
  @scala.inline
  def frameBorder(value: Double | String): this.type = set("frameBorder", value.asInstanceOf[js.Any])
  
  @scala.inline
  def headers(value: String): this.type = set("headers", value.asInstanceOf[js.Any])
  
  @scala.inline
  def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
  
  @scala.inline
  def high(value: Double): this.type = set("high", value.asInstanceOf[js.Any])
  
  @scala.inline
  def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hrefLang(value: String): this.type = set("hrefLang", value.asInstanceOf[js.Any])
  
  @scala.inline
  def htmlFor(value: String): this.type = set("htmlFor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def httpEquiv(value: String): this.type = set("httpEquiv", value.asInstanceOf[js.Any])
  
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  @scala.inline
  def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
  
  @scala.inline
  def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def integrity(value: String): this.type = set("integrity", value.asInstanceOf[js.Any])
  
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
  def keyParams(value: String): this.type = set("keyParams", value.asInstanceOf[js.Any])
  
  @scala.inline
  def keyType(value: String): this.type = set("keyType", value.asInstanceOf[js.Any])
  
  @scala.inline
  def kind(value: String): this.type = set("kind", value.asInstanceOf[js.Any])
  
  @scala.inline
  def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
  
  @scala.inline
  def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
  
  @scala.inline
  def list(value: String): this.type = set("list", value.asInstanceOf[js.Any])
  
  @scala.inline
  def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
  
  @scala.inline
  def low(value: Double): this.type = set("low", value.asInstanceOf[js.Any])
  
  @scala.inline
  def manifest(value: String): this.type = set("manifest", value.asInstanceOf[js.Any])
  
  @scala.inline
  def marginHeight(value: Double): this.type = set("marginHeight", value.asInstanceOf[js.Any])
  
  @scala.inline
  def marginWidth(value: Double): this.type = set("marginWidth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def max(value: Double | String): this.type = set("max", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
  
  @scala.inline
  def media(value: String): this.type = set("media", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mediaGroup(value: String): this.type = set("mediaGroup", value.asInstanceOf[js.Any])
  
  @scala.inline
  def method(value: String): this.type = set("method", value.asInstanceOf[js.Any])
  
  @scala.inline
  def min(value: Double | String): this.type = set("min", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
  
  @scala.inline
  def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  
  @scala.inline
  def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
  
  @scala.inline
  def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  @scala.inline
  def noValidate(value: Boolean): this.type = set("noValidate", value.asInstanceOf[js.Any])
  
  @scala.inline
  def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onAbort(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
  
  @scala.inline
  def onAbortCapture(value: Any): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onAnimationEnd(value: SyntheticAnimationEvent[HTMLSpanElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onAnimationEndCapture(value: Any): this.type = set("onAnimationEndCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onAnimationIteration(value: SyntheticAnimationEvent[HTMLSpanElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
  
  @scala.inline
  def onAnimationIterationCapture(value: Any): this.type = set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onAnimationStart(value: SyntheticAnimationEvent[HTMLSpanElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onAnimationStartCapture(value: Any): this.type = set("onAnimationStartCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onAuxClick(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onAuxClickCapture(value: Any): this.type = set("onAuxClickCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLSpanElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
  
  @scala.inline
  def onBeforeInputCapture(value: Any): this.type = set("onBeforeInputCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onBlur(value: SyntheticFocusEvent[HTMLSpanElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  
  @scala.inline
  def onBlurCapture(value: Any): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onCanPlay(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCanPlayCapture(value: Any): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onCanPlayThrough(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCanPlayThroughCapture(value: Any): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: SyntheticEvent[EventTarget with HTMLSpanElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onChangeCapture(value: Any): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onClickCapture(value: Any): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onCompositionEnd(value: SyntheticCompositionEvent[HTMLSpanElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCompositionEndCapture(value: Any): this.type = set("onCompositionEndCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onCompositionStart(value: SyntheticCompositionEvent[HTMLSpanElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCompositionStartCapture(value: Any): this.type = set("onCompositionStartCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLSpanElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCompositionUpdateCapture(value: Any): this.type = set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onContextMenu(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
  
  @scala.inline
  def onContextMenuCapture(value: Any): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onCopy(value: SyntheticClipboardEvent[HTMLSpanElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCopyCapture(value: Any): this.type = set("onCopyCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onCut(value: SyntheticClipboardEvent[HTMLSpanElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCutCapture(value: Any): this.type = set("onCutCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onDoubleClick(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDoubleClickCapture(value: Any): this.type = set("onDoubleClickCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onDrag(value: DragEvent[HTMLSpanElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragCapture(value: Any): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onDragEnd(value: DragEvent[HTMLSpanElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragEndCapture(value: Any): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onDragEnter(value: DragEvent[HTMLSpanElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragEnterCapture(value: Any): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onDragExit(value: DragEvent[HTMLSpanElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragExitCapture(value: Any): this.type = set("onDragExitCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onDragLeave(value: DragEvent[HTMLSpanElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragLeaveCapture(value: Any): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onDragOver(value: DragEvent[HTMLSpanElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragOverCapture(value: Any): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onDragStart(value: DragEvent[HTMLSpanElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragStartCapture(value: Any): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onDrop(value: DragEvent[HTMLSpanElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDropCapture(value: Any): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onDurationChange(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDurationChangeCapture(value: Any): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onEmptied(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
  
  @scala.inline
  def onEmptiedCapture(value: Any): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onEncrypted(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
  
  @scala.inline
  def onEncryptedCapture(value: Any): this.type = set("onEncryptedCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onEnded(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
  
  @scala.inline
  def onEndedCapture(value: Any): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onError(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
  
  @scala.inline
  def onErrorCapture(value: Any): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onFocus(value: SyntheticFocusEvent[HTMLSpanElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  
  @scala.inline
  def onFocusCapture(value: Any): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onGotPointerCapture(value: Any): this.type = set("onGotPointerCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onGotPointerCaptureCapture(value: Any): this.type = set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onInput(value: SyntheticEvent[EventTarget with HTMLSpanElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
  
  @scala.inline
  def onInputCapture(value: Any): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onInvalid(value: SyntheticEvent[EventTarget with HTMLSpanElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
  
  @scala.inline
  def onInvalidCapture(value: Any): this.type = set("onInvalidCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onKeyDown(value: SyntheticKeyboardEvent[HTMLSpanElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyDownCapture(value: Any): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onKeyPress(value: SyntheticKeyboardEvent[HTMLSpanElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyPressCapture(value: Any): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onKeyUp(value: SyntheticKeyboardEvent[HTMLSpanElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyUpCapture(value: Any): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onLoad(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLoadCapture(value: Any): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onLoadStart(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLoadStartCapture(value: Any): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onLoadedData(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLoadedDataCapture(value: Any): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onLoadedMetadata(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLoadedMetadataCapture(value: Any): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onLostPointerCapture(value: Any): this.type = set("onLostPointerCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onLostPointerCaptureCapture(value: Any): this.type = set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onMouseDown(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseDownCapture(value: Any): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onMouseEnter(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseMove(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseMoveCapture(value: Any): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onMouseOut(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseOutCapture(value: Any): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onMouseOver(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseOverCapture(value: Any): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onMouseUp(value: SyntheticMouseEvent[HTMLSpanElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseUpCapture(value: Any): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPaste(value: SyntheticClipboardEvent[HTMLSpanElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPasteCapture(value: Any): this.type = set("onPasteCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPause(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPauseCapture(value: Any): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPlay(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPlayCapture(value: Any): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPlaying(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPlayingCapture(value: Any): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPointerCancel(value: SyntheticPointerEvent[HTMLSpanElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerCancelCapture(value: Any): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPointerDown(value: SyntheticPointerEvent[HTMLSpanElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerDownCapture(value: Any): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPointerEnter(value: SyntheticPointerEvent[HTMLSpanElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerEnterCapture(value: Any): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPointerLeave(value: SyntheticPointerEvent[HTMLSpanElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerLeaveCapture(value: Any): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPointerMove(value: SyntheticPointerEvent[HTMLSpanElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerMoveCapture(value: Any): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPointerOut(value: SyntheticPointerEvent[HTMLSpanElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerOutCapture(value: Any): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPointerOver(value: SyntheticPointerEvent[HTMLSpanElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerOverCapture(value: Any): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPointerUp(value: SyntheticPointerEvent[HTMLSpanElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPointerUpCapture(value: Any): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onProgress(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
  
  @scala.inline
  def onProgressCapture(value: Any): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onRateChange(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onRateChangeCapture(value: Any): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onReset(value: SyntheticEvent[EventTarget with HTMLSpanElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
  
  @scala.inline
  def onResetCapture(value: Any): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onScroll(value: SyntheticUIEvent[HTMLSpanElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
  
  @scala.inline
  def onScrollCapture(value: Any): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onSeeked(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSeekedCapture(value: Any): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onSeeking(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSeekingCapture(value: Any): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onSelect(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSelectCapture(value: Any): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onStalled(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
  
  @scala.inline
  def onStalledCapture(value: Any): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onSubmit(value: SyntheticEvent[EventTarget with HTMLSpanElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSubmitCapture(value: Any): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onSuspend(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSuspendCapture(value: Any): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onTimeUpdate(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTimeUpdateCapture(value: Any): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onTouchCancel(value: SyntheticTouchEvent[HTMLSpanElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTouchCancelCapture(value: Any): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onTouchEnd(value: SyntheticTouchEvent[HTMLSpanElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTouchEndCapture(value: Any): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onTouchMove(value: SyntheticTouchEvent[HTMLSpanElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTouchMoveCapture(value: Any): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onTouchStart(value: SyntheticTouchEvent[HTMLSpanElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTouchStartCapture(value: Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onTransitionEnd(value: SyntheticTransitionEvent[HTMLSpanElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTransitionEndCapture(value: Any): this.type = set("onTransitionEndCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onVolumeChange(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onVolumeChangeCapture(value: Any): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onWaiting(value: SyntheticEvent[Event, HTMLSpanElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
  
  @scala.inline
  def onWaitingCapture(value: Any): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onWheel(value: SyntheticWheelEvent[HTMLSpanElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
  
  @scala.inline
  def onWheelCapture(value: Any): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  @scala.inline
  def optimum(value: Double): this.type = set("optimum", value.asInstanceOf[js.Any])
  
  @scala.inline
  def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
  
  @scala.inline
  def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  @scala.inline
  def playsInline(value: Boolean): this.type = set("playsInline", value.asInstanceOf[js.Any])
  
  @scala.inline
  def poster(value: String): this.type = set("poster", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
  
  @scala.inline
  def preload(value: String): this.type = set("preload", value.asInstanceOf[js.Any])
  
  @scala.inline
  def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
  
  @scala.inline
  def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
  
  @scala.inline
  def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
  
  @scala.inline
  def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  
  @scala.inline
  def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
  
  @scala.inline
  def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rev(value: String): this.type = set("rev", value.asInstanceOf[js.Any])
  
  @scala.inline
  def reversed(value: Boolean): this.type = set("reversed", value.asInstanceOf[js.Any])
  
  @scala.inline
  def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
  
  @scala.inline
  def sandbox(value: String): this.type = set("sandbox", value.asInstanceOf[js.Any])
  
  @scala.inline
  def scope(value: String): this.type = set("scope", value.asInstanceOf[js.Any])
  
  @scala.inline
  def scoped(value: Boolean): this.type = set("scoped", value.asInstanceOf[js.Any])
  
  @scala.inline
  def scrolling(value: String): this.type = set("scrolling", value.asInstanceOf[js.Any])
  
  @scala.inline
  def seamless(value: Boolean): this.type = set("seamless", value.asInstanceOf[js.Any])
  
  @scala.inline
  def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  
  @scala.inline
  def shape(value: String): this.type = set("shape", value.asInstanceOf[js.Any])
  
  @scala.inline
  def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  
  @scala.inline
  def sizes(value: String): this.type = set("sizes", value.asInstanceOf[js.Any])
  
  @scala.inline
  def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
  
  @scala.inline
  def span(value: Double): this.type = set("span", value.asInstanceOf[js.Any])
  
  @scala.inline
  def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
  
  @scala.inline
  def spin(value: Boolean): this.type = set("spin", value.asInstanceOf[js.Any])
  
  @scala.inline
  def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
  
  @scala.inline
  def srcDoc(value: String): this.type = set("srcDoc", value.asInstanceOf[js.Any])
  
  @scala.inline
  def srcLang(value: String): this.type = set("srcLang", value.asInstanceOf[js.Any])
  
  @scala.inline
  def srcSet(value: String): this.type = set("srcSet", value.asInstanceOf[js.Any])
  
  @scala.inline
  def start(value: Double): this.type = set("start", value.asInstanceOf[js.Any])
  
  @scala.inline
  def step(value: Double | String): this.type = set("step", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def summary(value: String): this.type = set("summary", value.asInstanceOf[js.Any])
  
  @scala.inline
  def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
  
  @scala.inline
  def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
  
  @scala.inline
  def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  
  @scala.inline
  def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
  
  @scala.inline
  def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def useMap(value: String): this.type = set("useMap", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
  
  @scala.inline
  def valueVarargs(value: String*): this.type = set("value", js.Array(value :_*))
  
  @scala.inline
  def viewBox(value: String): this.type = set("viewBox", value.asInstanceOf[js.Any])
  
  @scala.inline
  def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  
  @scala.inline
  def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  
  @scala.inline
  def wmode(value: String): this.type = set("wmode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def wrap(value: String): this.type = set("wrap", value.asInstanceOf[js.Any])
}
