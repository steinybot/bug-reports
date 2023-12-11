package web.typings.antd.esTableInterfaceMod

import web.typings.antd.esPaginationPaginationMod.PaginationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablePaginationConfig
  extends StObject
     with PaginationProps {
  
  var position: js.UndefOr[js.Array[TablePaginationPosition]] = js.native
}
object TablePaginationConfig {
  
  @scala.inline
  def apply(): TablePaginationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablePaginationConfig]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: TablePaginationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: js.Array[TablePaginationPosition]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPositionVarargs(value: TablePaginationPosition*): Self = StObject.set(x, "position", js.Array(value :_*))
  }
}
