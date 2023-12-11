package web.typings.rcMenu

import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLUListElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSubMenuSubMenuListMod extends Shortcut {
  
  @JSImport("rc-menu/es/SubMenu/SubMenuList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SubMenuListProps with RefAttributes[HTMLUListElement]] = js.native
  
  @js.native
  trait SubMenuListProps
    extends StObject
       with HTMLAttributes[HTMLUListElement]
  object SubMenuListProps {
    
    @scala.inline
    def apply(): SubMenuListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubMenuListProps]
    }
  }
  
  type _To = ReactComponentClass[SubMenuListProps with RefAttributes[HTMLUListElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esSubMenuSubMenuListMod.foo` */
  override def _to: ReactComponentClass[SubMenuListProps with RefAttributes[HTMLUListElement]] = default
}
