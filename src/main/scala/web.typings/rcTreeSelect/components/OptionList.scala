package web.typings.rcTreeSelect.components

import web.typings.StBuildingComponent.Default
import web.typings.rcTreeSelect.esOptionListMod.ReviseRefOptionListProps
import web.typings.react.mod.RefAttributes
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptionList {
  
  @JSImport("rc-tree-select/es/OptionList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = RefAttributes[ReviseRefOptionListProps]
  
  implicit def make(companion: OptionList.type): Default[tag.type, ReviseRefOptionListProps] = new Default[tag.type, ReviseRefOptionListProps](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RefAttributes[ReviseRefOptionListProps]): Default[tag.type, ReviseRefOptionListProps] = new Default[tag.type, ReviseRefOptionListProps](js.Array(this.component, p.asInstanceOf[js.Any]))
}
