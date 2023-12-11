package web.typings.antd

import web.typings.antd.antdBooleans.`false`
import web.typings.antd.esGridRowMod.Gutter
import web.typings.antd.esListItemMod.ListItemTypeProps
import web.typings.antd.esPaginationPaginationMod.PaginationConfig
import web.typings.antd.esSpinMod.SpinProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esListMod {
  
  object default {
    
    @scala.inline
    def apply[T](param0: ListProps[T]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/list", "default.Item")
    @js.native
    def Item: ListItemTypeProps = js.native
    @scala.inline
    def Item_=(x: ListItemTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/list", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type ColumnCount = Double
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.gutter
    - `web.typings`.antd.antdStrings.column
    - `web.typings`.antd.antdStrings.xs
    - `web.typings`.antd.antdStrings.sm
    - `web.typings`.antd.antdStrings.md
    - `web.typings`.antd.antdStrings.lg
    - `web.typings`.antd.antdStrings.xl
    - `web.typings`.antd.antdStrings.xxl
  */
  trait ColumnType extends StObject
  object ColumnType {
    
    @scala.inline
    def column: web.typings.antd.antdStrings.column = "column".asInstanceOf[web.typings.antd.antdStrings.column]
    
    @scala.inline
    def gutter: web.typings.antd.antdStrings.gutter = "gutter".asInstanceOf[web.typings.antd.antdStrings.gutter]
    
    @scala.inline
    def lg: web.typings.antd.antdStrings.lg = "lg".asInstanceOf[web.typings.antd.antdStrings.lg]
    
    @scala.inline
    def md: web.typings.antd.antdStrings.md = "md".asInstanceOf[web.typings.antd.antdStrings.md]
    
    @scala.inline
    def sm: web.typings.antd.antdStrings.sm = "sm".asInstanceOf[web.typings.antd.antdStrings.sm]
    
    @scala.inline
    def xl: web.typings.antd.antdStrings.xl = "xl".asInstanceOf[web.typings.antd.antdStrings.xl]
    
    @scala.inline
    def xs: web.typings.antd.antdStrings.xs = "xs".asInstanceOf[web.typings.antd.antdStrings.xs]
    
    @scala.inline
    def xxl: web.typings.antd.antdStrings.xxl = "xxl".asInstanceOf[web.typings.antd.antdStrings.xxl]
  }
  
  @js.native
  trait ListGridType extends StObject {
    
    var column: js.UndefOr[ColumnCount] = js.native
    
    var gutter: js.UndefOr[Gutter | (js.Tuple2[Gutter, Gutter])] = js.native
    
    var lg: js.UndefOr[ColumnCount] = js.native
    
    var md: js.UndefOr[ColumnCount] = js.native
    
    var sm: js.UndefOr[ColumnCount] = js.native
    
    var xl: js.UndefOr[ColumnCount] = js.native
    
    var xs: js.UndefOr[ColumnCount] = js.native
    
    var xxl: js.UndefOr[ColumnCount] = js.native
  }
  object ListGridType {
    
    @scala.inline
    def apply(): ListGridType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGridType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ListGridType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ColumnCount): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setGutter(value: Gutter | (js.Tuple2[Gutter, Gutter])): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setLg(value: ColumnCount): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: ColumnCount): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: ColumnCount): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: ColumnCount): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: ColumnCount): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      @scala.inline
      def setXxl(value: ColumnCount): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.horizontal
    - `web.typings`.antd.antdStrings.vertical
  */
  trait ListItemLayout extends StObject
  object ListItemLayout {
    
    @scala.inline
    def horizontal: web.typings.antd.antdStrings.horizontal = "horizontal".asInstanceOf[web.typings.antd.antdStrings.horizontal]
    
    @scala.inline
    def vertical: web.typings.antd.antdStrings.vertical = "vertical".asInstanceOf[web.typings.antd.antdStrings.vertical]
  }
  
  @js.native
  trait ListLocale extends StObject {
    
    var emptyText: ReactElement = js.native
  }
  object ListLocale {
    
    @scala.inline
    def apply(emptyText: ReactElement): ListLocale = {
      val __obj = js.Dynamic.literal(emptyText = emptyText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListLocale]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ListLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmptyText(value: ReactElement): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListProps[T] extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dataSource: js.UndefOr[js.Array[T]] = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var footer: js.UndefOr[ReactElement] = js.native
    
    var grid: js.UndefOr[ListGridType] = js.native
    
    var header: js.UndefOr[ReactElement] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var itemLayout: js.UndefOr[ListItemLayout] = js.native
    
    var loadMore: js.UndefOr[ReactElement] = js.native
    
    var loading: js.UndefOr[Boolean | SpinProps] = js.native
    
    var locale: js.UndefOr[ListLocale] = js.native
    
    var pagination: js.UndefOr[PaginationConfig | `false`] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var renderItem: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, ReactElement]] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var rowKey: js.UndefOr[(js.Function1[/* item */ T, Key]) | (/* keyof T */ String)] = js.native
    
    var size: js.UndefOr[ListSize] = js.native
    
    var split: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ListProps {
    
    @scala.inline
    def apply[T](): ListProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ListProps[_], T] (val x: Self with ListProps[T]) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Array[T]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDataSourceVarargs(value: T*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFooter(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setGrid(value: ListGridType): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHeader(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setItemLayout(value: ListItemLayout): Self = StObject.set(x, "itemLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLayoutUndefined: Self = StObject.set(x, "itemLayout", js.undefined)
      
      @scala.inline
      def setLoadMore(value: ReactElement): Self = StObject.set(x, "loadMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean | SpinProps): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setLocale(value: ListLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPagination(value: PaginationConfig | `false`): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderItem(value: (/* item */ T, /* index */ Double) => ReactElement): Self = StObject.set(x, "renderItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setRowKey(value: (js.Function1[/* item */ T, Key]) | (/* keyof T */ String)): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowKeyFunction1(value: /* item */ T => Key): Self = StObject.set(x, "rowKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      @scala.inline
      def setSize(value: ListSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.small
    - `web.typings`.antd.antdStrings.default
    - `web.typings`.antd.antdStrings.large
  */
  trait ListSize extends StObject
  object ListSize {
    
    @scala.inline
    def default: web.typings.antd.antdStrings.default = "default".asInstanceOf[web.typings.antd.antdStrings.default]
    
    @scala.inline
    def large: web.typings.antd.antdStrings.large = "large".asInstanceOf[web.typings.antd.antdStrings.large]
    
    @scala.inline
    def small: web.typings.antd.antdStrings.small = "small".asInstanceOf[web.typings.antd.antdStrings.small]
  }
}
