package web.typings.antd.anon

import web.typings.std.Record
import web.typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flush[T /* <: js.Object */] extends StObject {
  
  def flush(componentName: String, componentToken: Record[String, String | Double]): scala.Unit = js.native
  
  var keys: js.UndefOr[Set[String]] = js.native
  
  var token: T = js.native
}
object Flush {
  
  @scala.inline
  def apply[T /* <: js.Object */](flush: (String, Record[String, String | Double]) => scala.Unit, token: T): Flush[T] = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction2(flush), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flush[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Flush[_], T /* <: js.Object */] (val x: Self with Flush[T]) extends AnyVal {
    
    @scala.inline
    def setFlush(value: (String, Record[String, String | Double]) => scala.Unit): Self = StObject.set(x, "flush", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKeys(value: Set[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setToken(value: T): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
