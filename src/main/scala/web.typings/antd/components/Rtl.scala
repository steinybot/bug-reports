package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.esMenuStyleMod.MenuToken
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for `web.typings`.antd.esMenuStyleMod.MenuToken & (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssUtil * / scala.Any) because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssUtil * / scala.Any because couldn't resolve ClassTree.) */
object Rtl {
  
  def apply(
    p: MenuToken with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CssUtil */ Any)
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("antd/es/menu/style/rtl", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Rtl.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
