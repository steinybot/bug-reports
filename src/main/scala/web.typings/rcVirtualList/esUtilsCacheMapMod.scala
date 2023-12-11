package web.typings.rcVirtualList

import web.typings.react.mod.Key
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsCacheMapMod {
  
  @JSImport("rc-virtual-list/es/utils/CacheMap", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with CacheMap
  
  @js.native
  trait CacheMap extends StObject {
    
    def get(key: Key): Double = js.native
    
    var id: Double = js.native
    
    var maps: Record[String, Double] = js.native
    
    def set(key: Key, value: Double): Unit = js.native
  }
  object CacheMap {
    
    @scala.inline
    def apply(get: Key => Double, id: Double, maps: Record[String, Double], set: (Key, Double) => Unit): CacheMap = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), id = id.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[CacheMap]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CacheMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: Key => Double): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaps(value: Record[String, Double]): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: (Key, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
