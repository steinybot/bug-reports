package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdStrings.default
import web.typings.antd.antdStrings.small
import web.typings.antd.esPaginationPaginationMod.PaginationProps
import web.typings.rcPagination.esInterfaceMod.PaginationLocale
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
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  @JSImport("antd", "Pagination")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
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
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultCurrent(value: Double): this.type = set("defaultCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultPageSize(value: Double): this.type = set("defaultPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideOnSinglePage(value: Boolean): this.type = set("hideOnSinglePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemRender(
      value: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* element */ ReactElement) => ReactElement
    ): this.type = set("itemRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def jumpNextIcon(value: ReactComponentClass[js.Object] | ReactElement): this.type = set("jumpNextIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def jumpNextIconReactComponentClass(value: ReactComponentClass[js.Object]): this.type = set("jumpNextIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def jumpNextIconReactElement(value: ReactElement): this.type = set("jumpNextIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def jumpPrevIcon(value: ReactComponentClass[js.Object] | ReactElement): this.type = set("jumpPrevIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def jumpPrevIconReactComponentClass(value: ReactComponentClass[js.Object]): this.type = set("jumpPrevIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def jumpPrevIconReactElement(value: ReactElement): this.type = set("jumpPrevIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: PaginationLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextIcon(value: ReactComponentClass[js.Object] | ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextIconReactComponentClass(value: ReactComponentClass[js.Object]): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextIconReactElement(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* page */ Double, /* pageSize */ Double) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onShowSizeChange(value: (/* current */ Double, /* size */ Double) => Unit): this.type = set("onShowSizeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def pageSize(value: Double): this.type = set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageSizeOptions(value: js.Array[Double | String]): this.type = set("pageSizeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageSizeOptionsVarargs(value: (Double | String)*): this.type = set("pageSizeOptions", js.Array(value :_*))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prevIcon(value: ReactComponentClass[js.Object] | ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prevIconReactComponentClass(value: ReactComponentClass[js.Object]): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prevIconReactElement(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectComponentClass(value: ReactComponentClass[js.Object]): this.type = set("selectComponentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectPrefixCls(value: String): this.type = set("selectPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showLessItems(value: Boolean): this.type = set("showLessItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showPrevNextJumpers(value: Boolean): this.type = set("showPrevNextJumpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showQuickJumper(value: Boolean | js.Object): this.type = set("showQuickJumper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSizeChanger(value: Boolean): this.type = set("showSizeChanger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTitle(value: Boolean): this.type = set("showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTotal(value: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => ReactElement): this.type = set("showTotal", js.Any.fromFunction2(value))
    
    @scala.inline
    def simple(value: Boolean): this.type = set("simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: default | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def total(value: Double): this.type = set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def totalBoundaryShowSizeChanger(value: Double): this.type = set("totalBoundaryShowSizeChanger", value.asInstanceOf[js.Any])
  }
  
  type Props = PaginationProps
  
  implicit def make(companion: Pagination.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
