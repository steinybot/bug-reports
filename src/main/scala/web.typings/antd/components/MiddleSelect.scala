package web.typings.antd.components

import web.typings.antd.esSelectMod.SelectProps
import web.typings.rcSelect.libSelectMod.DefaultOptionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MiddleSelect {
  
  @JSImport("antd/es/pagination/Select", "MiddleSelect")
  @js.native
  val component: js.Object = js.native
  
  type Props = SelectProps[Any, DefaultOptionType]
  
  implicit def make(companion: MiddleSelect.type): SharedBuilder_SelectProps_1626111840 = new SharedBuilder_SelectProps_1626111840(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SelectProps[Any, DefaultOptionType]): SharedBuilder_SelectProps_1626111840 = new SharedBuilder_SelectProps_1626111840(js.Array(this.component, p.asInstanceOf[js.Any]))
}
