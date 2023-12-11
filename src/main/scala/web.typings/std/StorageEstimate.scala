package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageEstimate extends StObject {
  
  /* standard dom */
  var quota: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var usage: js.UndefOr[Double] = js.native
}
object StorageEstimate {
  
  @scala.inline
  def apply(): StorageEstimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageEstimate]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: StorageEstimate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuota(value: Double): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    @scala.inline
    def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
