package web.typings.antd.components

import web.typings.antd.esInputSearchMod.SearchProps
import web.typings.rcInput.esInterfaceMod.InputRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Search {
  
  @JSImport("antd/es/input/Search", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = SearchProps with RefAttributes[InputRef]
  
  implicit def make(companion: Search.type): SharedBuilder_SearchPropsRefAttributes_15745704[InputRef] = new SharedBuilder_SearchPropsRefAttributes_15745704[InputRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SearchProps with RefAttributes[InputRef]): SharedBuilder_SearchPropsRefAttributes_15745704[InputRef] = new SharedBuilder_SearchPropsRefAttributes_15745704[InputRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
