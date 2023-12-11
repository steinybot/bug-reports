package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Download extends StObject {
  
  def download(): scala.Unit = js.native
  
  def preview(): scala.Unit = js.native
  
  def remove(): scala.Unit = js.native
}
object Download {
  
  @scala.inline
  def apply(download: () => scala.Unit, preview: () => scala.Unit, remove: () => scala.Unit): Download = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction0(download), preview = js.Any.fromFunction0(preview), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Download]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Download] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownload(value: () => scala.Unit): Self = StObject.set(x, "download", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreview(value: () => scala.Unit): Self = StObject.set(x, "preview", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => scala.Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
