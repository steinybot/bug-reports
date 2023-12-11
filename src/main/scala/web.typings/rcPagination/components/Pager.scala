package web.typings.rcPagination.components

import web.typings.StBuildingComponent
import web.typings.rcPagination.esPagerMod.PagerProps
import web.typings.rcPagination.rcPaginationStrings.`jump-next`
import web.typings.rcPagination.rcPaginationStrings.`jump-prev`
import web.typings.rcPagination.rcPaginationStrings.next
import web.typings.rcPagination.rcPaginationStrings.page
import web.typings.rcPagination.rcPaginationStrings.prev
import org.scalajs.dom.HTMLLIElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.li.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pager {
  
  @scala.inline
  def apply(page: Double, rootPrefixCls: String, showTitle: Boolean): Builder = {
    val __props = js.Dynamic.literal(page = page.asInstanceOf[js.Any], rootPrefixCls = rootPrefixCls.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PagerProps]))
  }
  
  @JSImport("rc-pagination/es/Pager", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemRender(
      value: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* element */ ReactElement) => ReactElement
    ): this.type = set("itemRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def onClick(value: /* page */ Double => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(
      value: (/* e */ SyntheticKeyboardEvent[HTMLLIElement], /* onClick */ js.UndefOr[js.Function1[/* page */ Double, Unit]], /* page */ Double) => Unit
    ): this.type = set("onKeyPress", js.Any.fromFunction3(value))
  }
  
  type Props = PagerProps
  
  def withProps(p: PagerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
