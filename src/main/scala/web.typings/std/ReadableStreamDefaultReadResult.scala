package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - `web.typings`.std.ReadableStreamDefaultReadValueResult[T]
  - `web.typings`.std.ReadableStreamDefaultReadDoneResult
*/
trait ReadableStreamDefaultReadResult[T] extends StObject
object ReadableStreamDefaultReadResult {
  
  @scala.inline
  def ReadableStreamDefaultReadDoneResult(value: Unit): web.typings.std.ReadableStreamDefaultReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[web.typings.std.ReadableStreamDefaultReadDoneResult]
  }
  
  @scala.inline
  def ReadableStreamDefaultReadValueResult[T](value: T): web.typings.std.ReadableStreamDefaultReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[web.typings.std.ReadableStreamDefaultReadValueResult[T]]
  }
}
