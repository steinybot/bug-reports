package web.typings.antd.anon

import web.typings.antd.esFormFormItemMod.FeedbackIcons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icons extends StObject {
  
  var icons: FeedbackIcons = js.native
}
object Icons {
  
  @scala.inline
  def apply(
    icons: /* itemStatus */ Errors => /* import warning: importer.ImportType#apply Failed type conversion: {[ key in antd.antd/es/form/FormItem.ValidateStatus ]:? react.react.ReactNode} */ js.Any
  ): Icons = {
    val __obj = js.Dynamic.literal(icons = js.Any.fromFunction1(icons))
    __obj.asInstanceOf[Icons]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Icons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcons(
      value: /* itemStatus */ Errors => /* import warning: importer.ImportType#apply Failed type conversion: {[ key in antd.antd/es/form/FormItem.ValidateStatus ]:? react.react.ReactNode} */ js.Any
    ): Self = StObject.set(x, "icons", js.Any.fromFunction1(value))
  }
}
