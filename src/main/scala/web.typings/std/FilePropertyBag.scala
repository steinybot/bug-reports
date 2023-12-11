package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePropertyBag
  extends StObject
     with BlobPropertyBag {
  
  /* standard dom */
  var lastModified: js.UndefOr[Double] = js.native
}
object FilePropertyBag {
  
  @scala.inline
  def apply(): FilePropertyBag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePropertyBag]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FilePropertyBag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
  }
}
