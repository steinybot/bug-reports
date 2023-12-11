package web.typings.rcFieldForm

import web.typings.rcFieldForm.esInterfaceMod.InternalNamePath
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsNameMapMod {
  
  /**
    * NameMap like a `Map` but accepts `string[]` as key.
    */
  @JSImport("rc-field-form/es/utils/NameMap", JSImport.Default)
  @js.native
  class default[T] ()
    extends StObject
       with NameMap[T]
  
  @js.native
  trait KV[T] extends StObject {
    
    var key: InternalNamePath = js.native
    
    var value: T = js.native
  }
  object KV {
    
    @scala.inline
    def apply[T](key: InternalNamePath, value: T): KV[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KV[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: KV[_], T] (val x: Self with KV[T]) extends AnyVal {
      
      @scala.inline
      def setKey(value: InternalNamePath): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyVarargs(value: (String | Double)*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * NameMap like a `Map` but accepts `string[]` as key.
    */
  @js.native
  trait NameMap[T] extends StObject {
    
    def delete(key: InternalNamePath): Unit = js.native
    
    def get(key: InternalNamePath): T = js.native
    
    /* private */ var kvs: Any = js.native
    
    def map[U](callback: js.Function1[/* kv */ KV[T], U]): js.Array[U] = js.native
    
    def set(key: InternalNamePath, value: T): Unit = js.native
    
    def toJSON(): Record[String, T] = js.native
    
    def update(key: InternalNamePath, updater: js.Function1[/* origin */ T, T | Null]): Unit = js.native
  }
  object NameMap {
    
    @scala.inline
    def apply[T](
      delete: InternalNamePath => Unit,
      get: InternalNamePath => T,
      kvs: Any,
      map: js.Function1[/* kv */ KV[T], Any] => js.Array[Any],
      set: (InternalNamePath, T) => Unit,
      toJSON: () => Record[String, T],
      update: (InternalNamePath, js.Function1[/* origin */ T, T | Null]) => Unit
    ): NameMap[T] = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), kvs = kvs.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), set = js.Any.fromFunction2(set), toJSON = js.Any.fromFunction0(toJSON), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[NameMap[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NameMap[_], T] (val x: Self with NameMap[T]) extends AnyVal {
      
      @scala.inline
      def setDelete(value: InternalNamePath => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: InternalNamePath => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKvs(value: Any): Self = StObject.set(x, "kvs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Function1[/* kv */ KV[T], Any] => js.Array[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (InternalNamePath, T) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToJSON(value: () => Record[String, T]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: (InternalNamePath, js.Function1[/* origin */ T, T | Null]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
}
