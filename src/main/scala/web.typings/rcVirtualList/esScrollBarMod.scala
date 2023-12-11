package web.typings.rcVirtualList

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esScrollBarMod extends Shortcut {
  
  @JSImport("rc-virtual-list/es/ScrollBar", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ScrollBarProps with RefAttributes[ScrollBarRef]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcVirtualList.rcVirtualListStrings.ltr
    - `web.typings`.rcVirtualList.rcVirtualListStrings.rtl
  */
  trait ScrollBarDirectionType extends StObject
  object ScrollBarDirectionType {
    
    @scala.inline
    def ltr: web.typings.rcVirtualList.rcVirtualListStrings.ltr = "ltr".asInstanceOf[web.typings.rcVirtualList.rcVirtualListStrings.ltr]
    
    @scala.inline
    def rtl: web.typings.rcVirtualList.rcVirtualListStrings.rtl = "rtl".asInstanceOf[web.typings.rcVirtualList.rcVirtualListStrings.rtl]
  }
  
  @js.native
  trait ScrollBarProps extends StObject {
    
    var containerSize: Double = js.native
    
    var horizontal: js.UndefOr[Boolean] = js.native
    
    def onScroll(scrollOffset: Double): Unit = js.native
    def onScroll(scrollOffset: Double, horizontal: Boolean): Unit = js.native
    
    def onStartMove(): Unit = js.native
    
    def onStopMove(): Unit = js.native
    
    var prefixCls: String = js.native
    
    var rtl: Boolean = js.native
    
    var scrollOffset: Double = js.native
    
    var scrollRange: Double = js.native
    
    var spinSize: Double = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var thumbStyle: js.UndefOr[CSSProperties] = js.native
  }
  
  @js.native
  trait ScrollBarRef extends StObject {
    
    def delayHidden(): Unit = js.native
  }
  object ScrollBarRef {
    
    @scala.inline
    def apply(delayHidden: () => Unit): ScrollBarRef = {
      val __obj = js.Dynamic.literal(delayHidden = js.Any.fromFunction0(delayHidden))
      __obj.asInstanceOf[ScrollBarRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ScrollBarRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelayHidden(value: () => Unit): Self = StObject.set(x, "delayHidden", js.Any.fromFunction0(value))
    }
  }
  
  type _To = ReactComponentClass[ScrollBarProps with RefAttributes[ScrollBarRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esScrollBarMod.foo` */
  override def _to: ReactComponentClass[ScrollBarProps with RefAttributes[ScrollBarRef]] = default
}
