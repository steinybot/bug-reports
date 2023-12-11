package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncoderStream
  extends StObject
     with GenericTransformStream
     with TextEncoderCommon {
  
  /* standard dom */
  @JSName("readable")
  val readable_TextEncoderStream: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array] = js.native
  
  /* standard dom */
  @JSName("writable")
  val writable_TextEncoderStream: WritableStream[java.lang.String] = js.native
}
object TextEncoderStream {
  
  @scala.inline
  def apply(
    encoding: java.lang.String,
    readable: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array],
    writable: WritableStream[java.lang.String]
  ): TextEncoderStream = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderStream]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: TextEncoderStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadable(value: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritable(value: WritableStream[java.lang.String]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
