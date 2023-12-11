package web.typings.rcSelect

import web.typings.rcSelect.libBaseSelectMod.CustomTagProps
import web.typings.rcSelect.libInterfaceMod.DisplayValueType
import web.typings.rcSelect.libInterfaceMod.Mode
import web.typings.rcSelect.libInterfaceMod.RenderNode
import web.typings.rcSelect.rcSelectStrings.responsive
import web.typings.rcVirtualList.esListMod.ScrollConfig
import web.typings.rcVirtualList.esListMod.ScrollTo
import web.typings.react.mod.ChangeEvent
import web.typings.react.mod.ChangeEventHandler
import web.typings.react.mod.ClipboardEventHandler
import web.typings.react.mod.CompositionEventHandler
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.Ref
import web.typings.react.mod.RefAttributes
import web.typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectorMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SelectorProps with RefAttributes[RefSelectorProps]] = js.native
  
  @js.native
  trait InnerSelectorProps extends StObject {
    
    var activeDescendantId: js.UndefOr[String] = js.native
    
    var autoClearSearchValue: js.UndefOr[Boolean] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var inputRef: Ref[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var mode: Mode = js.native
    
    var onInputChange: ChangeEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var onInputCompositionEnd: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var onInputCompositionStart: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var onInputKeyDown: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var onInputMouseDown: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var onInputPaste: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var open: Boolean = js.native
    
    var placeholder: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: String = js.native
    
    var searchValue: String = js.native
    
    var showSearch: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var values: js.Array[DisplayValueType] = js.native
  }
  object InnerSelectorProps {
    
    @scala.inline
    def apply(
      id: String,
      mode: Mode,
      onInputChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputCompositionEnd: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputCompositionStart: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputKeyDown: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputMouseDown: SyntheticMouseEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputPaste: SyntheticClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      open: Boolean,
      prefixCls: String,
      searchValue: String,
      values: js.Array[DisplayValueType]
    ): InnerSelectorProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], inputRef = null)
      __obj.asInstanceOf[InnerSelectorProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InnerSelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveDescendantId(value: String): Self = StObject.set(x, "activeDescendantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDescendantIdUndefined: Self = StObject.set(x, "activeDescendantId", js.undefined)
      
      @scala.inline
      def setAutoClearSearchValue(value: Boolean): Self = StObject.set(x, "autoClearSearchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoClearSearchValueUndefined: Self = StObject.set(x, "autoClearSearchValue", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRef(value: Ref[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefFunction1(value: /* instance */ (HTMLInputElement | HTMLTextAreaElement) | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      @scala.inline
      def setInputRefReactRef(value: ReactRef[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInputChange(value: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputCompositionEnd(value: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputCompositionStart(value: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputMouseDown(value: SyntheticMouseEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputPaste(value: SyntheticClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholder(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[DisplayValueType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: DisplayValueType*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RefSelectorProps extends StObject {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var scrollTo: js.UndefOr[ScrollTo] = js.native
  }
  object RefSelectorProps {
    
    @scala.inline
    def apply(blur: () => Unit, focus: () => Unit): RefSelectorProps = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[RefSelectorProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RefSelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScrollTo(value: /* arg */ Double | ScrollConfig => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    }
  }
  
  @js.native
  trait SelectorProps extends StObject {
    
    var activeDescendantId: js.UndefOr[String] = js.native
    
    var activeValue: String = js.native
    
    var autoClearSearchValue: Boolean = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var choiceTransitionName: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * @private get real dom for trigger align.
      * This may be removed after React provides replacement of `findDOMNode`
      */
    var domRef: Ref[HTMLDivElement] = js.native
    
    var id: String = js.native
    
    var inputElement: Element = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var maxTagCount: js.UndefOr[Double | responsive] = js.native
    
    var maxTagPlaceholder: js.UndefOr[
        ReactElement | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], ReactElement])
      ] = js.native
    
    var maxTagTextLength: js.UndefOr[Double] = js.native
    
    var mode: Mode = js.native
    
    var onInputKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.native
    
    def onRemove(value: DisplayValueType): Unit = js.native
    
    /** `onSearch` returns go next step boolean to check if need do toggle open */
    def onSearch(searchText: String, fromTyping: Boolean, isCompositing: Boolean): Boolean = js.native
    
    var onSearchSubmit: js.UndefOr[js.Function1[/* searchText */ String, Unit]] = js.native
    
    def onToggleOpen(): Unit = js.native
    def onToggleOpen(open: Boolean): Unit = js.native
    
    var open: Boolean = js.native
    
    var placeholder: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: String = js.native
    
    var removeIcon: js.UndefOr[RenderNode] = js.native
    
    var searchValue: String = js.native
    
    var showSearch: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.native
    
    /** Check if `tokenSeparators` contains `\n` or `\r\n` */
    var tokenWithEnter: js.UndefOr[Boolean] = js.native
    
    /** Display in the Selector value, it's not same as `value` prop */
    var values: js.Array[DisplayValueType] = js.native
  }
  
  type _To = ReactComponentClass[SelectorProps with RefAttributes[RefSelectorProps]]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectorMod.foo` */
  override def _to: ReactComponentClass[SelectorProps with RefAttributes[RefSelectorProps]] = default
}
