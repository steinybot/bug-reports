package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esFormErrorListMod.ErrorListProps
import web.typings.antd.esFormFormItemMod.ValidateStatus
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorList {
  
  @JSImport("antd/es/form/ErrorList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errors(value: js.Array[ReactElement]): this.type = set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorsVarargs(value: ReactElement*): this.type = set("errors", js.Array(value :_*))
    
    @scala.inline
    def fieldId(value: String): this.type = set("fieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def help(value: ReactElement): this.type = set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def helpStatus(value: ValidateStatus): this.type = set("helpStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onVisibleChanged(value: /* visible */ Boolean => Unit): this.type = set("onVisibleChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def warnings(value: js.Array[ReactElement]): this.type = set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def warningsVarargs(value: ReactElement*): this.type = set("warnings", js.Array(value :_*))
  }
  
  type Props = ErrorListProps
  
  implicit def make(companion: ErrorList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ErrorListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
