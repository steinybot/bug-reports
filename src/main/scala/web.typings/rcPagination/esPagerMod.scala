package web.typings.rcPagination

import web.typings.rcPagination.rcPaginationStrings.`jump-next`
import web.typings.rcPagination.rcPaginationStrings.`jump-prev`
import web.typings.rcPagination.rcPaginationStrings.next
import web.typings.rcPagination.rcPaginationStrings.page
import web.typings.rcPagination.rcPaginationStrings.prev
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLLIElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPagerMod extends Shortcut {
  
  @JSImport("rc-pagination/es/Pager", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PagerProps] = js.native
  
  /* Inlined parent std.Pick<rc-pagination.rc-pagination/es/interface.PaginationProps, 'itemRender'> */
  @js.native
  trait PagerProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var itemRender: js.UndefOr[
        js.Function3[
          /* page */ Double, 
          /* type */ page | prev | next | `jump-prev` | `jump-next`, 
          /* element */ ReactElement, 
          ReactElement
        ]
      ] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.native
    
    var onKeyPress: js.UndefOr[
        js.Function3[
          /* e */ SyntheticKeyboardEvent[HTMLLIElement], 
          /* onClick */ js.UndefOr[js.Function1[/* page */ Double, Unit]], 
          /* page */ Double, 
          Unit
        ]
      ] = js.native
    
    var page: Double = js.native
    
    var rootPrefixCls: String = js.native
    
    var showTitle: Boolean = js.native
  }
  object PagerProps {
    
    @scala.inline
    def apply(page: Double, rootPrefixCls: String, showTitle: Boolean): PagerProps = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], rootPrefixCls = rootPrefixCls.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[PagerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PagerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setItemRender(
        value: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* element */ ReactElement) => ReactElement
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* page */ Double => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyPress(
        value: (/* e */ SyntheticKeyboardEvent[HTMLLIElement], /* onClick */ js.UndefOr[js.Function1[/* page */ Double, Unit]], /* page */ Double) => Unit
      ): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[PagerProps]
  
  /* This means you don't have to write `default`, but can instead just say `esPagerMod.foo` */
  override def _to: ReactComponentClass[PagerProps] = default
}
