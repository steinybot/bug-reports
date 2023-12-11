package web.typings.rcTree

import web.typings.rcTree.esInterfaceMod.DataEntity
import web.typings.rcTree.esInterfaceMod.Key
import web.typings.rcTree.esInterfaceMod.KeyEntities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsKeyUtilMod {
  
  @JSImport("rc-tree/es/utils/keyUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](keyEntities: KeyEntities[T], key: Key): DataEntity[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(keyEntities.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[DataEntity[T]]
}
