package web.typings.antd.anon

import web.typings.antd.antdStrings.default
import web.typings.antd.antdStrings.large
import web.typings.antd.antdStrings.small
import web.typings.antd.esDatePickerGeneratePickerMod.PickerLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends StObject {
  
  var locale: js.UndefOr[PickerLocale] = js.native
  
  var size: js.UndefOr[large | default | small] = js.native
}
object Locale {
  
  @scala.inline
  def apply(): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setSize(value: large | default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
