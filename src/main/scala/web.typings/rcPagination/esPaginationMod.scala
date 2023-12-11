package web.typings.rcPagination

import web.typings.rcPagination.esInterfaceMod.PaginationProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPaginationMod extends Shortcut {
  
  @JSImport("rc-pagination/es/Pagination", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PaginationProps] = js.native
  
  type _To = ReactComponentClass[PaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `esPaginationMod.foo` */
  override def _to: ReactComponentClass[PaginationProps] = default
}
