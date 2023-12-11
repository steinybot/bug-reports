package web.typings.antd.anon

import web.typings.antd.esFormFormItemMod.FeedbackIcons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends StObject {
  
  var icons: js.UndefOr[FeedbackIcons] = js.native
}
object `3` {
  
  @scala.inline
  def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcons(
      value: /* itemStatus */ Errors => /* import warning: importer.ImportType#apply Failed type conversion: {[ key in antd.antd/es/form/FormItem.ValidateStatus ]:? react.react.ReactNode} */ js.Any
    ): Self = StObject.set(x, "icons", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
  }
}
