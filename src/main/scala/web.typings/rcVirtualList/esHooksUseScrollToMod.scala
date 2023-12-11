package web.typings.rcVirtualList

import web.typings.rcVirtualList.esInterfaceMod.GetKey
import web.typings.rcVirtualList.esListMod.ScrollConfig
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseScrollToMod {
  
  @JSImport("rc-virtual-list/es/hooks/useScrollTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](
    containerRef: ReactRef[HTMLDivElement],
    data: js.Array[T],
    heights: web.typings.rcVirtualList.esUtilsCacheMapMod.default,
    itemHeight: Double,
    getKey: GetKey[T],
    collectHeight: js.Function0[Unit],
    syncScrollTop: js.Function1[/* newTop */ Double, Unit],
    triggerFlash: js.Function0[Unit]
  ): js.Function1[/* arg */ Double | ScrollTarget, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(containerRef.asInstanceOf[js.Any], data.asInstanceOf[js.Any], heights.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], collectHeight.asInstanceOf[js.Any], syncScrollTop.asInstanceOf[js.Any], triggerFlash.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg */ Double | ScrollTarget, Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcVirtualList.rcVirtualListStrings.top
    - `web.typings`.rcVirtualList.rcVirtualListStrings.bottom
    - `web.typings`.rcVirtualList.rcVirtualListStrings.auto
  */
  trait ScrollAlign extends StObject
  object ScrollAlign {
    
    @scala.inline
    def auto: web.typings.rcVirtualList.rcVirtualListStrings.auto = "auto".asInstanceOf[web.typings.rcVirtualList.rcVirtualListStrings.auto]
    
    @scala.inline
    def bottom: web.typings.rcVirtualList.rcVirtualListStrings.bottom = "bottom".asInstanceOf[web.typings.rcVirtualList.rcVirtualListStrings.bottom]
    
    @scala.inline
    def top: web.typings.rcVirtualList.rcVirtualListStrings.top = "top".asInstanceOf[web.typings.rcVirtualList.rcVirtualListStrings.top]
  }
  
  @js.native
  trait ScrollPos
    extends StObject
       with ScrollConfig {
    
    var left: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object ScrollPos {
    
    @scala.inline
    def apply(): ScrollPos = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollPos]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ScrollPos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcVirtualList.anon.Align
    - `web.typings`.rcVirtualList.anon.Key
  */
  trait ScrollTarget
    extends StObject
       with ScrollConfig
  object ScrollTarget {
    
    @scala.inline
    def Align(index: Double): web.typings.rcVirtualList.anon.Align = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.rcVirtualList.anon.Align]
    }
    
    @scala.inline
    def Key(key: web.typings.react.mod.Key): web.typings.rcVirtualList.anon.Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[web.typings.rcVirtualList.anon.Key]
    }
  }
}
