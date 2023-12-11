package web.typings.rcFieldForm.components

import web.typings.StBuildingComponent
import web.typings.rcFieldForm.anon.Ref
import web.typings.rcFieldForm.esFieldMod.FieldProps
import web.typings.rcFieldForm.esFormContextMod.FormProviderProps
import web.typings.rcFieldForm.esFormMod.FormProps
import web.typings.rcFieldForm.esFormMod.RenderProps
import web.typings.rcFieldForm.esInterfaceMod.FieldData
import web.typings.rcFieldForm.esInterfaceMod.FormInstance
import web.typings.rcFieldForm.esInterfaceMod.Store
import web.typings.rcFieldForm.esInterfaceMod.ValidateErrorEntity
import web.typings.rcFieldForm.esInterfaceMod.ValidateMessages
import web.typings.rcFieldForm.rcFieldFormBooleans.`false`
import web.typings.rcFieldForm.rcFieldFormStrings.`additions removals`
import web.typings.rcFieldForm.rcFieldFormStrings.`additions text`
import web.typings.rcFieldForm.rcFieldFormStrings.`inline`
import web.typings.rcFieldForm.rcFieldFormStrings.`removals additions`
import web.typings.rcFieldForm.rcFieldFormStrings.`removals text`
import web.typings.rcFieldForm.rcFieldFormStrings.`text additions`
import web.typings.rcFieldForm.rcFieldFormStrings.`text removals`
import web.typings.rcFieldForm.rcFieldFormStrings.additions
import web.typings.rcFieldForm.rcFieldFormStrings.all
import web.typings.rcFieldForm.rcFieldFormStrings.ascending
import web.typings.rcFieldForm.rcFieldFormStrings.assertive
import web.typings.rcFieldForm.rcFieldFormStrings.both
import web.typings.rcFieldForm.rcFieldFormStrings.copy
import web.typings.rcFieldForm.rcFieldFormStrings.date
import web.typings.rcFieldForm.rcFieldFormStrings.decimal
import web.typings.rcFieldForm.rcFieldFormStrings.descending
import web.typings.rcFieldForm.rcFieldFormStrings.dialog
import web.typings.rcFieldForm.rcFieldFormStrings.email
import web.typings.rcFieldForm.rcFieldFormStrings.execute
import web.typings.rcFieldForm.rcFieldFormStrings.grammar
import web.typings.rcFieldForm.rcFieldFormStrings.grid
import web.typings.rcFieldForm.rcFieldFormStrings.horizontal
import web.typings.rcFieldForm.rcFieldFormStrings.inherit
import web.typings.rcFieldForm.rcFieldFormStrings.link
import web.typings.rcFieldForm.rcFieldFormStrings.list
import web.typings.rcFieldForm.rcFieldFormStrings.listbox
import web.typings.rcFieldForm.rcFieldFormStrings.location
import web.typings.rcFieldForm.rcFieldFormStrings.menu
import web.typings.rcFieldForm.rcFieldFormStrings.mixed
import web.typings.rcFieldForm.rcFieldFormStrings.move
import web.typings.rcFieldForm.rcFieldFormStrings.no
import web.typings.rcFieldForm.rcFieldFormStrings.none
import web.typings.rcFieldForm.rcFieldFormStrings.numeric
import web.typings.rcFieldForm.rcFieldFormStrings.off
import web.typings.rcFieldForm.rcFieldFormStrings.on
import web.typings.rcFieldForm.rcFieldFormStrings.other
import web.typings.rcFieldForm.rcFieldFormStrings.page
import web.typings.rcFieldForm.rcFieldFormStrings.polite
import web.typings.rcFieldForm.rcFieldFormStrings.popup
import web.typings.rcFieldForm.rcFieldFormStrings.removals
import web.typings.rcFieldForm.rcFieldFormStrings.search
import web.typings.rcFieldForm.rcFieldFormStrings.spelling
import web.typings.rcFieldForm.rcFieldFormStrings.step
import web.typings.rcFieldForm.rcFieldFormStrings.tel
import web.typings.rcFieldForm.rcFieldFormStrings.text
import web.typings.rcFieldForm.rcFieldFormStrings.time
import web.typings.rcFieldForm.rcFieldFormStrings.tree
import web.typings.rcFieldForm.rcFieldFormStrings.url
import web.typings.rcFieldForm.rcFieldFormStrings.vertical
import web.typings.rcFieldForm.rcFieldFormStrings.yes
import web.typings.react.anon.Html
import web.typings.react.mod.AriaRole
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.DragEvent
import web.typings.react.mod.global.JSX.Element
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLFormElement
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
import slinky.web.html.form.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  @scala.inline
  def apply[Values](): Builder[Values] = {
    val __props = js.Dynamic.literal()
    new Builder[Values](js.Array(this.component, __props.asInstanceOf[FormProps[Values] with Ref[Values]]))
  }
  
  object Component {
    
    @scala.inline
    def apply[Values](): SharedBuilder_FieldProps72386356[Values] = {
      val __props = js.Dynamic.literal()
      new SharedBuilder_FieldProps72386356[Values](js.Array(this.component, __props.asInstanceOf[FieldProps[Values]]))
    }
    
    @JSImport("rc-field-form", "default.Field")
    @js.native
    val component: js.Object = js.native
    
    type Props[Values] = FieldProps[Values]
    
    implicit def make[Values](companion: Component.type): SharedBuilder_FieldProps72386356[Values] = new SharedBuilder_FieldProps72386356[Values](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps[Values](p: FieldProps[Values]): SharedBuilder_FieldProps72386356[Values] = new SharedBuilder_FieldProps72386356[Values](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object FormProvider {
    
    @JSImport("rc-field-form", "default.FormProvider")
    @js.native
    val component: js.Object = js.native
    
    type Props = FormProviderProps
    
    implicit def make(companion: FormProvider.type): SharedBuilder_FormProviderProps_1047307747 = new SharedBuilder_FormProviderProps_1047307747(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: FormProviderProps): SharedBuilder_FormProviderProps_1047307747 = new SharedBuilder_FormProviderProps_1047307747(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-field-form", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[Values] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, FormInstance[Values]] {
    
    @scala.inline
    def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def acceptCharset(value: String): this.type = set("acceptCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def action(value: String | (js.Function1[/* formData */ FormData, Unit])): this.type = set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionFunction1(value: /* formData */ FormData => Unit): this.type = set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
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
    def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: RenderProps | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction2(value: (/* values */ Store, /* form */ FormInstance[Any]) => Element | ReactElement): this.type = set("children", js.Any.fromFunction2(value))
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: `false` | String | ReactComponentClass[Any]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentReactComponentClass(value: ReactComponentClass[Any]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
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
    def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def encType(value: String): this.type = set("encType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fields(value: js.Array[FieldData]): this.type = set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fieldsVarargs(value: FieldData*): this.type = set("fields", js.Array(value :_*))
    
    @scala.inline
    def form(value: FormInstance[Values]): this.type = set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialValues(value: Store): this.type = set("initialValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
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
    def method(value: String): this.type = set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noValidate(value: Boolean): this.type = set("noValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAbort(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationEnd(value: SyntheticAnimationEvent[HTMLFormElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationIteration(value: SyntheticAnimationEvent[HTMLFormElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationStart(value: SyntheticAnimationEvent[HTMLFormElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAuxClick(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLFormElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlay(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayThrough(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionEnd(value: SyntheticCompositionEvent[HTMLFormElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionStart(value: SyntheticCompositionEvent[HTMLFormElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLFormElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCopy(value: SyntheticClipboardEvent[HTMLFormElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCut(value: SyntheticClipboardEvent[HTMLFormElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrag(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnd(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnter(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragExit(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragLeave(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragOver(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrop(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDurationChange(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEmptied(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEncrypted(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnded(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def onError(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFieldsChange(value: (/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData]) => Unit): this.type = set("onFieldsChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onFinish(value: Values => Unit): this.type = set("onFinish", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFinishFailed(value: /* errorInfo */ ValidateErrorEntity[Values] => Unit): this.type = set("onFinishFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLFormElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInput(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInvalid(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLFormElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLFormElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLFormElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadStart(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedData(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedMetadata(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOut(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPaste(value: SyntheticClipboardEvent[HTMLFormElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPause(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlay(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlaying(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerCancel(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerDown(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerEnter(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerLeave(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerMove(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOut(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOver(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerUp(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onProgress(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRateChange(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReset(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResize(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: SyntheticUIEvent[HTMLFormElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeked(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeking(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStalled(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSuspend(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTimeUpdate(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: SyntheticTouchEvent[HTMLFormElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: SyntheticTouchEvent[HTMLFormElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: SyntheticTouchEvent[HTMLFormElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[HTMLFormElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransitionEnd(value: SyntheticTransitionEvent[HTMLFormElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValuesChange(value: (/* changedValues */ Any, Values) => Unit): this.type = set("onValuesChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onVolumeChange(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWaiting(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWheel(value: SyntheticWheelEvent[HTMLFormElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preserve(value: Boolean): this.type = set("preserve", value.asInstanceOf[js.Any])
    
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
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validateMessages(value: ValidateMessages): this.type = set("validateMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validateTrigger(value: String | js.Array[String] | `false`): this.type = set("validateTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validateTriggerVarargs(value: String*): this.type = set("validateTrigger", js.Array(value :_*))
    
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  }
  
  type Props[Values] = FormProps[Values] with Ref[Values]
  
  implicit def make[Values](companion: Component.type): Builder[Values] = new Builder[Values](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[Values](p: FormProps[Values] with Ref[Values]): Builder[Values] = new Builder[Values](js.Array(this.component, p.asInstanceOf[js.Any]))
}
