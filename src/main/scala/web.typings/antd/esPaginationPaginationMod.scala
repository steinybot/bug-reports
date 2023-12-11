package web.typings.antd

import web.typings.antd.anon.GoButton
import web.typings.antd.antdStrings.`additions removals`
import web.typings.antd.antdStrings.`additions text`
import web.typings.antd.antdStrings.`inline`
import web.typings.antd.antdStrings.`jump-next`
import web.typings.antd.antdStrings.`jump-prev`
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
import web.typings.antd.antdStrings.descending
import web.typings.antd.antdStrings.dialog
import web.typings.antd.antdStrings.execute
import web.typings.antd.antdStrings.grammar
import web.typings.antd.antdStrings.grid_
import web.typings.antd.antdStrings.horizontal
import web.typings.antd.antdStrings.link
import web.typings.antd.antdStrings.list_
import web.typings.antd.antdStrings.listbox
import web.typings.antd.antdStrings.location
import web.typings.antd.antdStrings.menu_
import web.typings.antd.antdStrings.mixed
import web.typings.antd.antdStrings.move
import web.typings.antd.antdStrings.next
import web.typings.antd.antdStrings.none
import web.typings.antd.antdStrings.off
import web.typings.antd.antdStrings.other
import web.typings.antd.antdStrings.page
import web.typings.antd.antdStrings.polite
import web.typings.antd.antdStrings.popup
import web.typings.antd.antdStrings.prev
import web.typings.antd.antdStrings.removals
import web.typings.antd.antdStrings.small
import web.typings.antd.antdStrings.spelling
import web.typings.antd.antdStrings.step
import web.typings.antd.antdStrings.text_
import web.typings.antd.antdStrings.time
import web.typings.antd.antdStrings.tree_
import web.typings.antd.antdStrings.vertical
import web.typings.rcPagination.esInterfaceMod.PaginationLocale
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPaginationPaginationMod extends Shortcut {
  
  @JSImport("antd/es/pagination/Pagination", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PaginationProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.start
    - `web.typings`.antd.antdStrings.center
    - `web.typings`.antd.antdStrings.end
  */
  trait PaginationAlign extends StObject
  object PaginationAlign {
    
    @scala.inline
    def center: web.typings.antd.antdStrings.center = "center".asInstanceOf[web.typings.antd.antdStrings.center]
    
    @scala.inline
    def end: web.typings.antd.antdStrings.end = "end".asInstanceOf[web.typings.antd.antdStrings.end]
    
    @scala.inline
    def start: web.typings.antd.antdStrings.start = "start".asInstanceOf[web.typings.antd.antdStrings.start]
  }
  
  /* Inlined parent std.Omit<antd.antd/es/pagination/Pagination.PaginationProps, 'rootClassName'> */
  @js.native
  trait PaginationConfig extends StObject {
    
    var align: js.UndefOr[PaginationAlign] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list_ | both] = js.native
    
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
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu_ | listbox | tree_ | grid_ | dialog] = js.native
    
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
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
    
    var position: js.UndefOr[PaginationPosition] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var prevIcon: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
    
    var responsive: js.UndefOr[Boolean] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var selectComponentClass: js.UndefOr[ReactComponentClass[js.Object]] = js.native
    
    var selectPrefixCls: js.UndefOr[String] = js.native
    
    var showLessItems: js.UndefOr[Boolean] = js.native
    
    var showPrevNextJumpers: js.UndefOr[Boolean] = js.native
    
    var showQuickJumper: js.UndefOr[Boolean | GoButton] = js.native
    
    var showSizeChanger: js.UndefOr[Boolean] = js.native
    
    var showTitle: js.UndefOr[Boolean] = js.native
    
    var showTotal: js.UndefOr[
        js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], ReactElement]
      ] = js.native
    
    var simple: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[web.typings.antd.antdStrings.default | small] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var total: js.UndefOr[Double] = js.native
    
    var totalBoundaryShowSizeChanger: js.UndefOr[Double] = js.native
  }
  object PaginationConfig {
    
    @scala.inline
    def apply(): PaginationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PaginationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: PaginationAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list_ | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
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
      def `setAria-haspopup`(value: Boolean | menu_ | listbox | tree_ | grid_ | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
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
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`)
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
      def setPosition(value: PaginationPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
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
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
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
      def setShowQuickJumper(value: Boolean | GoButton): Self = StObject.set(x, "showQuickJumper", value.asInstanceOf[js.Any])
      
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
      def setSize(value: web.typings.antd.antdStrings.default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
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
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.top
    - `web.typings`.antd.antdStrings.bottom
    - `web.typings`.antd.antdStrings.both
  */
  trait PaginationPosition extends StObject
  object PaginationPosition {
    
    @scala.inline
    def both: web.typings.antd.antdStrings.both = "both".asInstanceOf[web.typings.antd.antdStrings.both]
    
    @scala.inline
    def bottom: web.typings.antd.antdStrings.bottom = "bottom".asInstanceOf[web.typings.antd.antdStrings.bottom]
    
    @scala.inline
    def top: web.typings.antd.antdStrings.top = "top".asInstanceOf[web.typings.antd.antdStrings.top]
  }
  
  @js.native
  trait PaginationProps
    extends StObject
       with web.typings.rcPagination.esInterfaceMod.PaginationProps {
    
    var responsive: js.UndefOr[Boolean] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[web.typings.antd.antdStrings.default | small] = js.native
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
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setSize(value: web.typings.antd.antdStrings.default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `esPaginationPaginationMod.foo` */
  override def _to: ReactComponentClass[PaginationProps] = default
}
