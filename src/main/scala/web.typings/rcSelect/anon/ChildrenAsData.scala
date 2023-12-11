package web.typings.rcSelect.anon

import web.typings.rcSelect.libSelectMod.FieldNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildrenAsData extends StObject {
  
  var childrenAsData: js.UndefOr[Boolean] = js.native
  
  var fieldNames: js.UndefOr[FieldNames] = js.native
}
object ChildrenAsData {
  
  @scala.inline
  def apply(): ChildrenAsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenAsData]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ChildrenAsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildrenAsData(value: Boolean): Self = StObject.set(x, "childrenAsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenAsDataUndefined: Self = StObject.set(x, "childrenAsData", js.undefined)
    
    @scala.inline
    def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
  }
}
