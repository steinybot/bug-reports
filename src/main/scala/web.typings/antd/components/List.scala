package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdBooleans.`false`
import web.typings.antd.esListItemMod.ListItemMetaProps
import web.typings.antd.esListItemMod.ListItemProps
import web.typings.antd.esListMod.ListGridType
import web.typings.antd.esListMod.ListItemLayout
import web.typings.antd.esListMod.ListLocale
import web.typings.antd.esListMod.ListProps
import web.typings.antd.esListMod.ListSize
import web.typings.antd.esPaginationPaginationMod.PaginationConfig
import web.typings.antd.esSpinMod.SpinProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @scala.inline
  def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ListProps[T]]))
  }
  
  object Item {
    
    object Meta {
      
      @JSImport("antd", "List.Item.Meta")
      @js.native
      val component: js.Object = js.native
      
      type Props = ListItemMetaProps
      
      implicit def make(companion: Meta.type): SharedBuilder_ListItemMetaProps759292716 = new SharedBuilder_ListItemMetaProps759292716(js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: ListItemMetaProps): SharedBuilder_ListItemMetaProps759292716 = new SharedBuilder_ListItemMetaProps759292716(js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    @JSImport("antd", "List.Item")
    @js.native
    val component: js.Object = js.native
    
    type Props = ListItemProps with RefAttributes[HTMLElement]
    
    implicit def make(companion: Item.type): SharedBuilder_ListItemPropsRefAttributes1479316469[HTMLElement] = new SharedBuilder_ListItemPropsRefAttributes1479316469[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ListItemProps with RefAttributes[HTMLElement]): SharedBuilder_ListItemPropsRefAttributes1479316469[HTMLElement] = new SharedBuilder_ListItemPropsRefAttributes1479316469[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "List")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataSource(value: js.Array[T]): this.type = set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataSourceVarargs(value: T*): this.type = set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def grid(value: ListGridType): this.type = set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemLayout(value: ListItemLayout): this.type = set("itemLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadMore(value: ReactElement): this.type = set("loadMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean | SpinProps): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: ListLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pagination(value: PaginationConfig | `false`): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderItem(value: (T, /* index */ Double) => ReactElement): this.type = set("renderItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowKey(value: (js.Function1[T, Key]) | (/* keyof T */ String)): this.type = set("rowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowKeyFunction1(value: T => Key): this.type = set("rowKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def size(value: ListSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def split(value: Boolean): this.type = set("split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props[T] = ListProps[T]
  
  implicit def make[T](companion: List.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: ListProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
