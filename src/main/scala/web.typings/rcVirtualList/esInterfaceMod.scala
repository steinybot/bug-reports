package web.typings.rcVirtualList

import web.typings.rcVirtualList.anon.Bottom
import web.typings.rcVirtualList.anon.Style
import web.typings.react.mod.Key
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  @js.native
  trait ExtraRenderInfo extends StObject {
    
    /** Virtual list end line */
    var end: Double = js.native
    
    var getSize: GetSize = js.native
    
    /** Used for `scrollWidth` tell the horizontal offset */
    var offsetX: Double = js.native
    
    var offsetY: Double = js.native
    
    var rtl: Boolean = js.native
    
    /** Virtual list start line */
    var start: Double = js.native
    
    /** Is current in virtual render */
    var virtual: Boolean = js.native
  }
  object ExtraRenderInfo {
    
    @scala.inline
    def apply(
      end: Double,
      getSize: (/* startKey */ Key, /* endKey */ js.UndefOr[Key]) => Bottom,
      offsetX: Double,
      offsetY: Double,
      rtl: Boolean,
      start: Double,
      virtual: Boolean
    ): ExtraRenderInfo = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], getSize = js.Any.fromFunction2(getSize), offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtraRenderInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ExtraRenderInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetSize(value: (/* startKey */ Key, /* endKey */ js.UndefOr[Key]) => Bottom): Self = StObject.set(x, "getSize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    }
  }
  
  type GetKey[T] = js.Function1[/* item */ T, Key]
  
  type GetSize = js.Function2[/* startKey */ Key, /* endKey */ js.UndefOr[Key], Bottom]
  
  type RenderFunc[T] = js.Function3[/* item */ T, /* index */ Double, /* props */ Style, ReactElement]
  
  @js.native
  trait SharedConfig[T] extends StObject {
    
    def getKey(item: T): Key = js.native
  }
  object SharedConfig {
    
    @scala.inline
    def apply[T](getKey: T => Key): SharedConfig[T] = {
      val __obj = js.Dynamic.literal(getKey = js.Any.fromFunction1(getKey))
      __obj.asInstanceOf[SharedConfig[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SharedConfig[_], T] (val x: Self with SharedConfig[T]) extends AnyVal {
      
      @scala.inline
      def setGetKey(value: T => Key): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    }
  }
}
