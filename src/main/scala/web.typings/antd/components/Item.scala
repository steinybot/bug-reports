package web.typings.antd.components

import web.typings.antd.esListItemMod.ListItemMetaProps
import web.typings.antd.esListItemMod.ListItemProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  object Meta {
    
    @JSImport("antd/es/list/Item", "default.Meta")
    @js.native
    val component: js.Object = js.native
    
    type Props = ListItemMetaProps
    
    implicit def make(companion: Meta.type): SharedBuilder_ListItemMetaProps759292716 = new SharedBuilder_ListItemMetaProps759292716(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ListItemMetaProps): SharedBuilder_ListItemMetaProps759292716 = new SharedBuilder_ListItemMetaProps759292716(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd/es/list/Item", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = ListItemProps with RefAttributes[HTMLElement]
  
  implicit def make(companion: Item.type): SharedBuilder_ListItemPropsRefAttributes1479316469[HTMLElement] = new SharedBuilder_ListItemPropsRefAttributes1479316469[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemProps with RefAttributes[HTMLElement]): SharedBuilder_ListItemPropsRefAttributes1479316469[HTMLElement] = new SharedBuilder_ListItemPropsRefAttributes1479316469[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
