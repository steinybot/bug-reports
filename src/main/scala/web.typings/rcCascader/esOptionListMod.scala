package web.typings.rcCascader

import web.typings.rcSelect.libOptionListMod.RefOptionListProps
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionListMod extends Shortcut {
  
  @JSImport("rc-cascader/es/OptionList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RefAttributes[RefOptionListProps]] = js.native
  
  type _To = ReactComponentClass[RefAttributes[RefOptionListProps]]
  
  /* This means you don't have to write `default`, but can instead just say `esOptionListMod.foo` */
  override def _to: ReactComponentClass[RefAttributes[RefOptionListProps]] = default
}
