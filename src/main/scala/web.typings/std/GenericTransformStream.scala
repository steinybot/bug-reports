package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericTransformStream extends StObject {
  
  /* standard dom */
  val readable: org.scalajs.dom.ReadableStream[Any] = js.native
  
  /* standard dom */
  val writable: WritableStream[Any] = js.native
}
object GenericTransformStream {
  
  @scala.inline
  def apply(readable: org.scalajs.dom.ReadableStream[Any], writable: WritableStream[Any]): GenericTransformStream = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTransformStream]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: GenericTransformStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadable(value: org.scalajs.dom.ReadableStream[Any]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritable(value: WritableStream[Any]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
