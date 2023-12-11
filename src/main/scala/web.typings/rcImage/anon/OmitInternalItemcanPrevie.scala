package web.typings.rcImage.anon

import web.typings.rcImage.libInterfaceMod.ImageElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<rc-image.rc-image/lib/interface.InternalItem, 'canPreview'> */
@js.native
trait OmitInternalItemcanPrevie extends StObject {
  
  var data: ImageElementProps = js.native
  
  var id: js.UndefOr[String] = js.native
}
object OmitInternalItemcanPrevie {
  
  @scala.inline
  def apply(data: ImageElementProps): OmitInternalItemcanPrevie = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitInternalItemcanPrevie]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OmitInternalItemcanPrevie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ImageElementProps): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
