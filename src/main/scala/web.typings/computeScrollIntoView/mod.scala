package web.typings.computeScrollIntoView

import web.typings.std.ScrollLogicalPosition
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("compute-scroll-into-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compute(target: Element, options: Options): js.Array[ScrollAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("compute")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ScrollAction]]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Control the logical scroll position on the y-axis. The spec states that the `block` direction is related to the [writing-mode](https://developer.mozilla.org/en-US/docs/Web/CSS/writing-mode), but this is not implemented yet in this library.
      * This means that `block: 'start'` aligns to the top edge and `block: 'end'` to the bottom.
      * @defaultValue 'center'
      */
    var block: js.UndefOr[ScrollLogicalPosition] = js.native
    
    /**
      * By default there is no boundary. All the parent elements of your target is checked until it reaches the viewport ([`document.scrollingElement`](https://developer.mozilla.org/en-US/docs/Web/API/document/scrollingElement)) when calculating layout and what to scroll.
      * By passing a boundary you can short-circuit this loop depending on your needs:
      *
      * - Prevent the browser window from scrolling.
      * - Scroll elements into view in a list, without scrolling container elements.
      *
      * You can also pass a function to do more dynamic checks to override the scroll scoping:
      *
      * ```js
      * let actions = compute(target, {
      *   boundary: (parent) => {
      *     // By default `overflow: hidden` elements are allowed, only `overflow: visible | clip` is skipped as
      *     // this is required by the CSSOM spec
      *     if (getComputedStyle(parent)['overflow'] === 'hidden') {
      *       return false
      *     }
      *     return true
      *   },
      * })
      * ```
      * @defaultValue null
      */
    var boundary: js.UndefOr[Element | (js.Function1[/* parent */ Element, Boolean]) | Null] = js.native
    
    /**
      * Like `block` this is affected by the [writing-mode](https://developer.mozilla.org/en-US/docs/Web/CSS/writing-mode). In left-to-right pages `inline: 'start'` will align to the left edge. In right-to-left it should be flipped. This will be supported in a future release.
      * @defaultValue 'nearest'
      */
    var `inline`: js.UndefOr[ScrollLogicalPosition] = js.native
    
    /**
      * This is a proposed addition to the spec that you can track here: https://github.com/w3c/csswg-drafts/pull/5677
      *
      * This library will be updated to reflect any changes to the spec and will provide a migration path.
      * To be backwards compatible with `Element.scrollIntoViewIfNeeded` if something is not 100% visible it will count as "needs scrolling". If you need a different visibility ratio your best option would be to implement an [Intersection Observer](https://developer.mozilla.org/en-US/docs/Web/API/Intersection_Observer_API).
      * @defaultValue 'always'
      */
    var scrollMode: js.UndefOr[ScrollMode] = js.native
    
    /**
      * New option that skips auto-scrolling all nodes with overflow: hidden set
      * See FF implementation: https://hg.mozilla.org/integration/fx-team/rev/c48c3ec05012#l7.18
      * @defaultValue false
      * @public
      */
    var skipOverflowHiddenElements: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: ScrollLogicalPosition): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setBoundary(value: Element | (js.Function1[/* parent */ Element, Boolean])): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryFunction1(value: /* parent */ Element => Boolean): Self = StObject.set(x, "boundary", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBoundaryNull: Self = StObject.set(x, "boundary", null)
      
      @scala.inline
      def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      @scala.inline
      def setInline(value: ScrollLogicalPosition): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setScrollMode(value: ScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      @scala.inline
      def setSkipOverflowHiddenElements(value: Boolean): Self = StObject.set(x, "skipOverflowHiddenElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipOverflowHiddenElementsUndefined: Self = StObject.set(x, "skipOverflowHiddenElements", js.undefined)
    }
  }
  
  @js.native
  trait ScrollAction extends StObject {
    
    var el: Element = js.native
    
    var left: Double = js.native
    
    var top: Double = js.native
  }
  object ScrollAction {
    
    @scala.inline
    def apply(el: Element, left: Double, top: Double): ScrollAction = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollAction]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ScrollAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.computeScrollIntoView.computeScrollIntoViewStrings.always
    - `web.typings`.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed`
  */
  trait ScrollMode extends StObject
  object ScrollMode {
    
    @scala.inline
    def always: web.typings.computeScrollIntoView.computeScrollIntoViewStrings.always = "always".asInstanceOf[web.typings.computeScrollIntoView.computeScrollIntoViewStrings.always]
    
    @scala.inline
    def `if-needed`: web.typings.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed` = "if-needed".asInstanceOf[web.typings.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed`]
  }
}
