package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.esLocaleMod.LocaleProviderProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Locale {
  
  @scala.inline
  def apply(locale: web.typings.antd.esLocaleMod.Locale): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[LocaleProviderProps]))
  }
  
  @JSImport("antd/es/locale", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = LocaleProviderProps
  
  def withProps(p: LocaleProviderProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
