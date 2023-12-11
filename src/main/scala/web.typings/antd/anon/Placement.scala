package web.typings.antd.anon

import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esDatePickerGeneratePickerMod.DataPickerPlacement
import web.typings.antd.esDatePickerGeneratePickerMod.PickerLocale
import web.typings.antd.esUtilStatusUtilsMod.InputStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placement extends StObject {
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[PickerLocale] = js.native
  
  var placement: js.UndefOr[DataPickerPlacement] = js.native
  
  var size: js.UndefOr[SizeType] = js.native
  
  var status: js.UndefOr[InputStatus] = js.native
}
object Placement {
  
  @scala.inline
  def apply(): Placement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Placement]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Placement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    @scala.inline
    def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setPlacement(value: DataPickerPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
