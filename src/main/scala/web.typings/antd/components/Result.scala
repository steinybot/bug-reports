package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.StBuildingComponent.Default
import web.typings.antd.esResultMod.ResultProps
import web.typings.antd.esResultMod.ResultStatusType
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Result {
  
  object PRESENTED_IMAGE_403 {
    
    @JSImport("antd", "Result.PRESENTED_IMAGE_403")
    @js.native
    val component: js.Object = js.native
    
    type Props = js.Object
    
    implicit def make(companion: PRESENTED_IMAGE_403.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PRESENTED_IMAGE_404 {
    
    @JSImport("antd", "Result.PRESENTED_IMAGE_404")
    @js.native
    val component: js.Object = js.native
    
    type Props = js.Object
    
    implicit def make(companion: PRESENTED_IMAGE_404.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PRESENTED_IMAGE_500 {
    
    @JSImport("antd", "Result.PRESENTED_IMAGE_500")
    @js.native
    val component: js.Object = js.native
    
    type Props = js.Object
    
    implicit def make(companion: PRESENTED_IMAGE_500.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Result")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: ResultStatusType): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitle(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  type Props = ResultProps
  
  implicit def make(companion: Result.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ResultProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
