package web.typings.rcPagination.components

import web.typings.rcPagination.esInterfaceMod.PaginationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  @JSImport("rc-pagination/es/Pagination", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = PaginationProps
  
  implicit def make(companion: Pagination.type): SharedBuilder_PaginationProps1275571565 = new SharedBuilder_PaginationProps1275571565(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaginationProps): SharedBuilder_PaginationProps1275571565 = new SharedBuilder_PaginationProps1275571565(js.Array(this.component, p.asInstanceOf[js.Any]))
}
