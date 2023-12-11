package web.typings.antd

import web.typings.antd.anon.Column
import web.typings.antd.esTableInterfaceMod.RefTable
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableMod extends Shortcut {
  
  @JSImport("antd/es/table", JSImport.Default)
  @js.native
  val default: RefTable with Column = js.native
  
  type _To = RefTable with Column
  
  /* This means you don't have to write `default`, but can instead just say `esTableMod.foo` */
  override def _to: RefTable with Column = default
}
