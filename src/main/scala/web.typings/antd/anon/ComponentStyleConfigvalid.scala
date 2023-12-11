package web.typings.antd.anon

import web.typings.antd.esFormFormMod.RequiredMark
import web.typings.rcFieldForm.esInterfaceMod.ValidateMessages
import web.typings.react.mod.CSSProperties
import web.typings.scrollIntoViewIfNeeded.mod.Options
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/es/config-provider/context.ComponentStyleConfig & {  validateMessages :rc-field-form.rc-field-form/es/interface.ValidateMessages | undefined,   requiredMark :antd.antd/es/form/Form.RequiredMark | undefined,   colon :boolean | undefined,   scrollToFirstError :scroll-into-view-if-needed.scroll-into-view-if-needed.Options<unknown> | boolean | undefined} */
@js.native
trait ComponentStyleConfigvalid extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var colon: js.UndefOr[Boolean] = js.native
  
  var requiredMark: js.UndefOr[RequiredMark] = js.native
  
  var scrollToFirstError: js.UndefOr[Options[Any] | Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var validateMessages: js.UndefOr[ValidateMessages] = js.native
}
object ComponentStyleConfigvalid {
  
  @scala.inline
  def apply(): ComponentStyleConfigvalid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentStyleConfigvalid]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ComponentStyleConfigvalid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
    
    @scala.inline
    def setRequiredMark(value: RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredMarkFunction2(value: (/* labelNode */ ReactElement, /* info */ Required) => ReactElement): Self = StObject.set(x, "requiredMark", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
    
    @scala.inline
    def setScrollToFirstError(value: Options[Any] | Boolean): Self = StObject.set(x, "scrollToFirstError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToFirstErrorUndefined: Self = StObject.set(x, "scrollToFirstError", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setValidateMessages(value: ValidateMessages): Self = StObject.set(x, "validateMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateMessagesUndefined: Self = StObject.set(x, "validateMessages", js.undefined)
  }
}
