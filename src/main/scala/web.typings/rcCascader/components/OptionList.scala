package web.typings.rcCascader.components

import web.typings.StBuildingComponent.Default
import web.typings.rcSelect.libOptionListMod.RefOptionListProps
import web.typings.react.mod.RefAttributes
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptionList {
  
  @JSImport("rc-cascader/es/OptionList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = RefAttributes[RefOptionListProps]
  
  implicit def make(companion: OptionList.type): Default[tag.type, RefOptionListProps] = new Default[tag.type, RefOptionListProps](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RefAttributes[RefOptionListProps]): Default[tag.type, RefOptionListProps] = new Default[tag.type, RefOptionListProps](js.Array(this.component, p.asInstanceOf[js.Any]))
}
