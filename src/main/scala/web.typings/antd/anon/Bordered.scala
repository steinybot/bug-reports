package web.typings.antd.anon

import web.typings.antd.antdStrings._empty
import web.typings.antd.antdStrings.bottomLeft
import web.typings.antd.antdStrings.bottomRight
import web.typings.antd.antdStrings.error
import web.typings.antd.antdStrings.topLeft
import web.typings.antd.antdStrings.topRight
import web.typings.antd.antdStrings.warning
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esDatePickerGeneratePickerMod.PickerLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bordered extends StObject {
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  var hashId: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[PickerLocale] = js.native
  
  var placement: js.UndefOr[bottomLeft | bottomRight | topLeft | topRight] = js.native
  
  var popupClassName: js.UndefOr[String] = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[SizeType] = js.native
  
  var status: js.UndefOr[_empty | error | warning] = js.native
}
object Bordered {
  
  @scala.inline
  def apply(): Bordered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bordered]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Bordered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    @scala.inline
    def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashIdUndefined: Self = StObject.set(x, "hashId", js.undefined)
    
    @scala.inline
    def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setPlacement(value: bottomLeft | bottomRight | topLeft | topRight): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
    
    @scala.inline
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStatus(value: _empty | error | warning): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
