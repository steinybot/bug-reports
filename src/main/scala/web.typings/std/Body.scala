package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends StObject {
  
  /* standard dom */
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /* standard dom */
  def blob(): js.Promise[org.scalajs.dom.Blob] = js.native
  
  /* standard dom */
  val body: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array] | Null = js.native
  
  /* standard dom */
  val bodyUsed: scala.Boolean = js.native
  
  /* standard dom */
  def formData(): js.Promise[org.scalajs.dom.FormData] = js.native
  
  /* standard dom */
  def json(): js.Promise[Any] = js.native
  
  /* standard dom */
  def text(): js.Promise[java.lang.String] = js.native
}
object Body {
  
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[org.scalajs.dom.Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[org.scalajs.dom.FormData],
    json: () => js.Promise[Any],
    text: () => js.Promise[java.lang.String]
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text), body = null)
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlob(value: () => js.Promise[org.scalajs.dom.Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBody(value: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyNull: Self = StObject.set(x, "body", null)
    
    @scala.inline
    def setBodyUsed(value: scala.Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: () => js.Promise[org.scalajs.dom.FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: () => js.Promise[java.lang.String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
  }
}
