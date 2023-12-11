package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.StBuildingComponent.Default
import web.typings.antd.anon.`0`
import web.typings.antd.esBreadcrumbBreadcrumbItemMod.BreadcrumbItemProps
import web.typings.antd.esBreadcrumbBreadcrumbMod.BreadcrumbProps
import web.typings.antd.esBreadcrumbBreadcrumbMod.ItemType
import web.typings.antd.esUtilTypeMod.AnyObject
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumb {
  
  @scala.inline
  def apply[T /* <: AnyObject */](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[BreadcrumbProps[T]]))
  }
  
  object Item {
    
    @JSImport("antd", "Breadcrumb.Item")
    @js.native
    val component: js.Object = js.native
    
    type Props = BreadcrumbItemProps
    
    implicit def make(companion: Item.type): SharedBuilder_BreadcrumbItemProps21342310 = new SharedBuilder_BreadcrumbItemProps21342310(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BreadcrumbItemProps): SharedBuilder_BreadcrumbItemProps21342310 = new SharedBuilder_BreadcrumbItemProps21342310(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Separator {
    
    @JSImport("antd", "Breadcrumb.Separator")
    @js.native
    val component: js.Object = js.native
    
    type Props = `0`
    
    implicit def make(companion: Separator.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: `0`): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Breadcrumb")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T /* <: AnyObject */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemRender(
      value: (/* route */ ItemType, T, /* routes */ js.Array[ItemType], /* paths */ js.Array[String]) => ReactElement
    ): this.type = set("itemRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def items(value: js.Array[ItemType]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsVarargs(value: ItemType*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def params(value: T): this.type = set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def routes(value: js.Array[ItemType]): this.type = set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def routesVarargs(value: ItemType*): this.type = set("routes", js.Array(value :_*))
    
    @scala.inline
    def separator(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props[T /* <: AnyObject */] = BreadcrumbProps[T]
  
  implicit def make[T /* <: AnyObject */](companion: Breadcrumb.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T /* <: AnyObject */](p: BreadcrumbProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
