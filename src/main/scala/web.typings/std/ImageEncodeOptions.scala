package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEncodeOptions extends StObject {
  
  /* standard dom */
  var quality: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var `type`: js.UndefOr[java.lang.String] = js.native
}
object ImageEncodeOptions {
  
  @scala.inline
  def apply(): ImageEncodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEncodeOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ImageEncodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
