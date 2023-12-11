package web.typings.rcPagination

import web.typings.rcPagination.rcPaginationStrings.`additions removals`
import web.typings.rcPagination.rcPaginationStrings.`additions text`
import web.typings.rcPagination.rcPaginationStrings.`inline`
import web.typings.rcPagination.rcPaginationStrings.`jump-next`
import web.typings.rcPagination.rcPaginationStrings.`jump-prev`
import web.typings.rcPagination.rcPaginationStrings.`removals additions`
import web.typings.rcPagination.rcPaginationStrings.`removals text`
import web.typings.rcPagination.rcPaginationStrings.`text additions`
import web.typings.rcPagination.rcPaginationStrings.`text removals`
import web.typings.rcPagination.rcPaginationStrings.additions
import web.typings.rcPagination.rcPaginationStrings.all
import web.typings.rcPagination.rcPaginationStrings.ascending
import web.typings.rcPagination.rcPaginationStrings.assertive
import web.typings.rcPagination.rcPaginationStrings.both
import web.typings.rcPagination.rcPaginationStrings.copy
import web.typings.rcPagination.rcPaginationStrings.date
import web.typings.rcPagination.rcPaginationStrings.descending
import web.typings.rcPagination.rcPaginationStrings.dialog
import web.typings.rcPagination.rcPaginationStrings.execute
import web.typings.rcPagination.rcPaginationStrings.grammar
import web.typings.rcPagination.rcPaginationStrings.grid
import web.typings.rcPagination.rcPaginationStrings.horizontal
import web.typings.rcPagination.rcPaginationStrings.link
import web.typings.rcPagination.rcPaginationStrings.list
import web.typings.rcPagination.rcPaginationStrings.listbox
import web.typings.rcPagination.rcPaginationStrings.location
import web.typings.rcPagination.rcPaginationStrings.menu
import web.typings.rcPagination.rcPaginationStrings.mixed
import web.typings.rcPagination.rcPaginationStrings.move
import web.typings.rcPagination.rcPaginationStrings.next
import web.typings.rcPagination.rcPaginationStrings.none
import web.typings.rcPagination.rcPaginationStrings.off
import web.typings.rcPagination.rcPaginationStrings.other
import web.typings.rcPagination.rcPaginationStrings.page
import web.typings.rcPagination.rcPaginationStrings.polite
import web.typings.rcPagination.rcPaginationStrings.popup
import web.typings.rcPagination.rcPaginationStrings.prev
import web.typings.rcPagination.rcPaginationStrings.removals
import web.typings.rcPagination.rcPaginationStrings.spelling
import web.typings.rcPagination.rcPaginationStrings.step
import web.typings.rcPagination.rcPaginationStrings.text
import web.typings.rcPagination.rcPaginationStrings.time
import web.typings.rcPagination.rcPaginationStrings.tree
import web.typings.rcPagination.rcPaginationStrings.vertical
import web.typings.react.mod.AriaRole
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  @js.native
  trait PaginationData extends StObject {
    
    var className: String = js.native
    
    var current: Double = js.native
    
    var defaultCurrent: Double = js.native
    
    var defaultPageSize: Double = js.native
    
    var disabled: Boolean = js.native
    
    var hideOnSinglePage: Boolean = js.native
    
    var jumpNextIcon: ReactComponentClass[js.Object] | ReactElement = js.native
    
    var jumpPrevIcon: ReactComponentClass[js.Object] | ReactElement = js.native
    
    var locale: PaginationLocale = js.native
    
    var nextIcon: ReactComponentClass[js.Object] | ReactElement = js.native
    
    var pageSize: Double = js.native
    
    var pageSizeOptions: js.Array[Double | String] = js.native
    
    var prefixCls: String = js.native
    
    var prevIcon: ReactComponentClass[js.Object] | ReactElement = js.native
    
    var selectComponentClass: ReactComponentClass[js.Object] = js.native
    
    var selectPrefixCls: String = js.native
    
    var showLessItems: Boolean = js.native
    
    var showPrevNextJumpers: Boolean = js.native
    
    var showQuickJumper: Boolean | js.Object = js.native
    
    var showSizeChanger: Boolean = js.native
    
    var showTitle: Boolean = js.native
    
    var simple: Boolean = js.native
    
    var style: CSSProperties = js.native
    
    var total: Double = js.native
    
    var totalBoundaryShowSizeChanger: js.UndefOr[Double] = js.native
  }
  object PaginationData {
    
    @scala.inline
    def apply(
      className: String,
      current: Double,
      defaultCurrent: Double,
      defaultPageSize: Double,
      disabled: Boolean,
      hideOnSinglePage: Boolean,
      jumpNextIcon: ReactComponentClass[js.Object] | ReactElement,
      jumpPrevIcon: ReactComponentClass[js.Object] | ReactElement,
      locale: PaginationLocale,
      nextIcon: ReactComponentClass[js.Object] | ReactElement,
      pageSize: Double,
      pageSizeOptions: js.Array[Double | String],
      prefixCls: String,
      prevIcon: ReactComponentClass[js.Object] | ReactElement,
      selectComponentClass: ReactComponentClass[js.Object],
      selectPrefixCls: String,
      showLessItems: Boolean,
      showPrevNextJumpers: Boolean,
      showQuickJumper: Boolean | js.Object,
      showSizeChanger: Boolean,
      showTitle: Boolean,
      simple: Boolean,
      style: CSSProperties,
      total: Double
    ): PaginationData = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], defaultCurrent = defaultCurrent.asInstanceOf[js.Any], defaultPageSize = defaultPageSize.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hideOnSinglePage = hideOnSinglePage.asInstanceOf[js.Any], jumpNextIcon = jumpNextIcon.asInstanceOf[js.Any], jumpPrevIcon = jumpPrevIcon.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], nextIcon = nextIcon.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pageSizeOptions = pageSizeOptions.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], prevIcon = prevIcon.asInstanceOf[js.Any], selectComponentClass = selectComponentClass.asInstanceOf[js.Any], selectPrefixCls = selectPrefixCls.asInstanceOf[js.Any], showLessItems = showLessItems.asInstanceOf[js.Any], showPrevNextJumpers = showPrevNextJumpers.asInstanceOf[js.Any], showQuickJumper = showQuickJumper.asInstanceOf[js.Any], showSizeChanger = showSizeChanger.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any], simple = simple.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationData]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PaginationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPageSize(value: Double): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnSinglePage(value: Boolean): Self = StObject.set(x, "hideOnSinglePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconReactComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconReactElement(value: ReactElement): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconReactComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconReactElement(value: ReactElement): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: PaginationLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconReactComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconReactElement(value: ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeOptions(value: js.Array[Double | String]): Self = StObject.set(x, "pageSizeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeOptionsVarargs(value: (Double | String)*): Self = StObject.set(x, "pageSizeOptions", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconReactComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconReactElement(value: ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "selectComponentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectPrefixCls(value: String): Self = StObject.set(x, "selectPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLessItems(value: Boolean): Self = StObject.set(x, "showLessItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPrevNextJumpers(value: Boolean): Self = StObject.set(x, "showPrevNextJumpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowQuickJumper(value: Boolean | js.Object): Self = StObject.set(x, "showQuickJumper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBoundaryShowSizeChanger(value: Double): Self = StObject.set(x, "totalBoundaryShowSizeChanger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBoundaryShowSizeChangerUndefined: Self = StObject.set(x, "totalBoundaryShowSizeChanger", js.undefined)
    }
  }
  
  @js.native
  trait PaginationLocale extends StObject {
    
    var items_per_page: js.UndefOr[String] = js.native
    
    var jump_to: js.UndefOr[String] = js.native
    
    var jump_to_confirm: js.UndefOr[String] = js.native
    
    var next_3: js.UndefOr[String] = js.native
    
    var next_5: js.UndefOr[String] = js.native
    
    var next_page: js.UndefOr[String] = js.native
    
    var page: js.UndefOr[String] = js.native
    
    var page_size: js.UndefOr[String] = js.native
    
    var prev_3: js.UndefOr[String] = js.native
    
    var prev_5: js.UndefOr[String] = js.native
    
    var prev_page: js.UndefOr[String] = js.native
  }
  object PaginationLocale {
    
    @scala.inline
    def apply(): PaginationLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationLocale]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PaginationLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems_per_page(value: String): Self = StObject.set(x, "items_per_page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems_per_pageUndefined: Self = StObject.set(x, "items_per_page", js.undefined)
      
      @scala.inline
      def setJump_to(value: String): Self = StObject.set(x, "jump_to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJump_toUndefined: Self = StObject.set(x, "jump_to", js.undefined)
      
      @scala.inline
      def setJump_to_confirm(value: String): Self = StObject.set(x, "jump_to_confirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJump_to_confirmUndefined: Self = StObject.set(x, "jump_to_confirm", js.undefined)
      
      @scala.inline
      def setNext_3(value: String): Self = StObject.set(x, "next_3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_3Undefined: Self = StObject.set(x, "next_3", js.undefined)
      
      @scala.inline
      def setNext_5(value: String): Self = StObject.set(x, "next_5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_5Undefined: Self = StObject.set(x, "next_5", js.undefined)
      
      @scala.inline
      def setNext_page(value: String): Self = StObject.set(x, "next_page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_pageUndefined: Self = StObject.set(x, "next_page", js.undefined)
      
      @scala.inline
      def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setPage_size(value: String): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
      
      @scala.inline
      def setPrev_3(value: String): Self = StObject.set(x, "prev_3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev_3Undefined: Self = StObject.set(x, "prev_3", js.undefined)
      
      @scala.inline
      def setPrev_5(value: String): Self = StObject.set(x, "prev_5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev_5Undefined: Self = StObject.set(x, "prev_5", js.undefined)
      
      @scala.inline
      def setPrev_page(value: String): Self = StObject.set(x, "prev_page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev_pageUndefined: Self = StObject.set(x, "prev_page", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<rc-pagination.rc-pagination/es/interface.PaginationData> */
  /* Inlined parent react.react.AriaAttributes */
  @js.native
  trait PaginationProps extends StObject {
    
    /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
    var `aria-atomic`: js.UndefOr[Booleanish] = js.native
    
    /**
      * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
      * presented if they are made.
      */
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
    /**
      * Defines a string value that labels the current element, which is intended to be converted into Braille.
      * @see aria-label.
      */
    var `aria-braillelabel`: js.UndefOr[String] = js.native
    
    /**
      * Defines a human-readable, author-localized abbreviated description for the role of an element, which is intended to be converted into Braille.
      * @see aria-roledescription.
      */
    var `aria-brailleroledescription`: js.UndefOr[String] = js.native
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.native
    
    /**
      * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
      * @see aria-pressed @see aria-selected.
      */
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    /**
      * Defines the total number of columns in a table, grid, or treegrid.
      * @see aria-colindex.
      */
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    /**
      * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
      * @see aria-colcount @see aria-colspan.
      */
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    /**
      * Defines a human readable text alternative of aria-colindex.
      * @see aria-rowindextext.
      */
    var `aria-colindextext`: js.UndefOr[String] = js.native
    
    /**
      * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
      * @see aria-colindex @see aria-rowspan.
      */
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    /**
      * Identifies the element (or elements) whose contents or presence are controlled by the current element.
      * @see aria-owns.
      */
    var `aria-controls`: js.UndefOr[String] = js.native
    
    /** Indicates the element that represents the current item within a container or set of related elements. */
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    /**
      * Identifies the element (or elements) that describes the object.
      * @see aria-labelledby
      */
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    /**
      * Defines a string value that describes or annotates the current element.
      * @see related aria-describedby.
      */
    var `aria-description`: js.UndefOr[String] = js.native
    
    /**
      * Identifies the element that provides a detailed, extended description for the object.
      * @see aria-describedby.
      */
    var `aria-details`: js.UndefOr[String] = js.native
    
    /**
      * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
      * @see aria-hidden @see aria-readonly.
      */
    var `aria-disabled`: js.UndefOr[Booleanish] = js.native
    
    /**
      * Indicates what functions can be performed when a dragged object is released on the drop target.
      * @deprecated in ARIA 1.1
      */
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    /**
      * Identifies the element that provides an error message for the object.
      * @see aria-invalid @see aria-describedby.
      */
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
    var `aria-expanded`: js.UndefOr[Booleanish] = js.native
    
    /**
      * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
      * allows assistive technology to override the general default of reading in document source order.
      */
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    /**
      * Indicates an element's "grabbed" state in a drag-and-drop operation.
      * @deprecated in ARIA 1.1
      */
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.native
    
    /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    /**
      * Indicates whether the element is exposed to an accessibility API.
      * @see aria-disabled.
      */
    var `aria-hidden`: js.UndefOr[Booleanish] = js.native
    
    /**
      * Indicates the entered value does not conform to the format expected by the application.
      * @see aria-errormessage.
      */
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    /**
      * Defines a string value that labels the current element.
      * @see aria-labelledby.
      */
    var `aria-label`: js.UndefOr[String] = js.native
    
    /**
      * Identifies the element (or elements) that labels the current element.
      * @see aria-describedby.
      */
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    /** Defines the hierarchical level of an element within a structure. */
    var `aria-level`: js.UndefOr[Double] = js.native
    
    /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    /** Indicates whether an element is modal when displayed. */
    var `aria-modal`: js.UndefOr[Booleanish] = js.native
    
    /** Indicates whether a text box accepts multiple lines of input or only a single line. */
    var `aria-multiline`: js.UndefOr[Booleanish] = js.native
    
    /** Indicates that the user may select more than one item from the current selectable descendants. */
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.native
    
    /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
      * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
      * @see aria-controls.
      */
    var `aria-owns`: js.UndefOr[String] = js.native
    
    /**
      * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
      * A hint could be a sample value or a brief description of the expected format.
      */
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    /**
      * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
      * @see aria-setsize.
      */
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    /**
      * Indicates the current "pressed" state of toggle buttons.
      * @see aria-checked @see aria-selected.
      */
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    /**
      * Indicates that the element is not editable, but is otherwise operable.
      * @see aria-disabled.
      */
    var `aria-readonly`: js.UndefOr[Booleanish] = js.native
    
    /**
      * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
      * @see aria-atomic.
      */
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    /** Indicates that user input is required on the element before a form may be submitted. */
    var `aria-required`: js.UndefOr[Booleanish] = js.native
    
    /** Defines a human-readable, author-localized description for the role of an element. */
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    /**
      * Defines the total number of rows in a table, grid, or treegrid.
      * @see aria-rowindex.
      */
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    /**
      * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
      * @see aria-rowcount @see aria-rowspan.
      */
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    /**
      * Defines a human readable text alternative of aria-rowindex.
      * @see aria-colindextext.
      */
    var `aria-rowindextext`: js.UndefOr[String] = js.native
    
    /**
      * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
      * @see aria-rowindex @see aria-colspan.
      */
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    /**
      * Indicates the current "selected" state of various widgets.
      * @see aria-checked @see aria-pressed.
      */
    var `aria-selected`: js.UndefOr[Booleanish] = js.native
    
    /**
      * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
      * @see aria-posinset.
      */
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    /** Indicates if items in a table or grid are sorted in ascending or descending order. */
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    /** Defines the maximum allowed value for a range widget. */
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    /** Defines the minimum allowed value for a range widget. */
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    /**
      * Defines the current value for a range widget.
      * @see aria-valuetext.
      */
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    /** Defines the human readable text alternative of aria-valuenow for a range widget. */
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var current: js.UndefOr[Double] = js.native
    
    var defaultCurrent: js.UndefOr[Double] = js.native
    
    var defaultPageSize: js.UndefOr[Double] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var hideOnSinglePage: js.UndefOr[Boolean] = js.native
    
    var itemRender: js.UndefOr[
        js.Function3[
          /* page */ Double, 
          /* type */ page | prev | next | `jump-prev` | `jump-next`, 
          /* element */ ReactElement, 
          ReactElement
        ]
      ] = js.native
    
    var jumpNextIcon: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
    
    var jumpPrevIcon: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
    
    var locale: js.UndefOr[PaginationLocale] = js.native
    
    var nextIcon: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
    
    var onChange: js.UndefOr[js.Function2[/* page */ Double, /* pageSize */ Double, Unit]] = js.native
    
    var onShowSizeChange: js.UndefOr[js.Function2[/* current */ Double, /* size */ Double, Unit]] = js.native
    
    var pageSize: js.UndefOr[Double] = js.native
    
    var pageSizeOptions: js.UndefOr[js.Array[Double | String]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var prevIcon: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
    
    var role: js.UndefOr[AriaRole] = js.native
    
    var selectComponentClass: js.UndefOr[ReactComponentClass[js.Object]] = js.native
    
    var selectPrefixCls: js.UndefOr[String] = js.native
    
    var showLessItems: js.UndefOr[Boolean] = js.native
    
    var showPrevNextJumpers: js.UndefOr[Boolean] = js.native
    
    var showQuickJumper: js.UndefOr[Boolean | js.Object] = js.native
    
    var showSizeChanger: js.UndefOr[Boolean] = js.native
    
    var showTitle: js.UndefOr[Boolean] = js.native
    
    var showTotal: js.UndefOr[
        js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], ReactElement]
      ] = js.native
    
    var simple: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var total: js.UndefOr[Double] = js.native
    
    var totalBoundaryShowSizeChanger: js.UndefOr[Double] = js.native
  }
  object PaginationProps {
    
    @scala.inline
    def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
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
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCurrentUndefined: Self = StObject.set(x, "defaultCurrent", js.undefined)
      
      @scala.inline
      def setDefaultPageSize(value: Double): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPageSizeUndefined: Self = StObject.set(x, "defaultPageSize", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHideOnSinglePage(value: Boolean): Self = StObject.set(x, "hideOnSinglePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnSinglePageUndefined: Self = StObject.set(x, "hideOnSinglePage", js.undefined)
      
      @scala.inline
      def setItemRender(
        value: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* element */ ReactElement) => ReactElement
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setJumpNextIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconReactComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconReactElement(value: ReactElement): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconUndefined: Self = StObject.set(x, "jumpNextIcon", js.undefined)
      
      @scala.inline
      def setJumpPrevIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconReactComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconReactElement(value: ReactElement): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconUndefined: Self = StObject.set(x, "jumpPrevIcon", js.undefined)
      
      @scala.inline
      def setLocale(value: PaginationLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setNextIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconReactComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconReactElement(value: ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* page */ Double, /* pageSize */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnShowSizeChange(value: (/* current */ Double, /* size */ Double) => Unit): Self = StObject.set(x, "onShowSizeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnShowSizeChangeUndefined: Self = StObject.set(x, "onShowSizeChange", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeOptions(value: js.Array[Double | String]): Self = StObject.set(x, "pageSizeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeOptionsUndefined: Self = StObject.set(x, "pageSizeOptions", js.undefined)
      
      @scala.inline
      def setPageSizeOptionsVarargs(value: (Double | String)*): Self = StObject.set(x, "pageSizeOptions", js.Array(value :_*))
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPrevIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconReactComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconReactElement(value: ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      @scala.inline
      def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSelectComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "selectComponentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectComponentClassUndefined: Self = StObject.set(x, "selectComponentClass", js.undefined)
      
      @scala.inline
      def setSelectPrefixCls(value: String): Self = StObject.set(x, "selectPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectPrefixClsUndefined: Self = StObject.set(x, "selectPrefixCls", js.undefined)
      
      @scala.inline
      def setShowLessItems(value: Boolean): Self = StObject.set(x, "showLessItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLessItemsUndefined: Self = StObject.set(x, "showLessItems", js.undefined)
      
      @scala.inline
      def setShowPrevNextJumpers(value: Boolean): Self = StObject.set(x, "showPrevNextJumpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPrevNextJumpersUndefined: Self = StObject.set(x, "showPrevNextJumpers", js.undefined)
      
      @scala.inline
      def setShowQuickJumper(value: Boolean | js.Object): Self = StObject.set(x, "showQuickJumper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowQuickJumperUndefined: Self = StObject.set(x, "showQuickJumper", js.undefined)
      
      @scala.inline
      def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSizeChangerUndefined: Self = StObject.set(x, "showSizeChanger", js.undefined)
      
      @scala.inline
      def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
      
      @scala.inline
      def setShowTotal(value: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => ReactElement): Self = StObject.set(x, "showTotal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShowTotalUndefined: Self = StObject.set(x, "showTotal", js.undefined)
      
      @scala.inline
      def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBoundaryShowSizeChanger(value: Double): Self = StObject.set(x, "totalBoundaryShowSizeChanger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBoundaryShowSizeChangerUndefined: Self = StObject.set(x, "totalBoundaryShowSizeChanger", js.undefined)
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  @js.native
  trait PaginationState extends StObject {
    
    var current: Double = js.native
    
    var currentInputValue: Double = js.native
    
    var pageSize: Double = js.native
  }
  object PaginationState {
    
    @scala.inline
    def apply(current: Double, currentInputValue: Double, pageSize: Double): PaginationState = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], currentInputValue = currentInputValue.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationState]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PaginationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentInputValue(value: Double): Self = StObject.set(x, "currentInputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    }
  }
}
