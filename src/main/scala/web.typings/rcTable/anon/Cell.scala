package web.typings.rcTable.anon

import web.typings.rcTable.libInterfaceMod.CustomizeComponent
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cell extends StObject {
  
  var cell: js.UndefOr[CustomizeComponent] = js.native
  
  var row: js.UndefOr[CustomizeComponent] = js.native
  
  var wrapper: js.UndefOr[CustomizeComponent] = js.native
}
object Cell {
  
  @scala.inline
  def apply(): Cell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: CustomizeComponent): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setRow(value: CustomizeComponent): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    @scala.inline
    def setWrapper(value: CustomizeComponent): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
