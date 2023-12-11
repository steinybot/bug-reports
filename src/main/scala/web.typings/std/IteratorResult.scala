package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - `web.typings`.std.IteratorYieldResult[T]
  - `web.typings`.std.IteratorReturnResult[TReturn]
*/
trait IteratorResult[T, TReturn] extends StObject
object IteratorResult {
  
  @scala.inline
  def IteratorReturnResult[TReturn](value: TReturn): web.typings.std.IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[web.typings.std.IteratorReturnResult[TReturn]]
  }
  
  @scala.inline
  def IteratorYieldResult[T](value: T): web.typings.std.IteratorYieldResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[web.typings.std.IteratorYieldResult[T]]
  }
}
