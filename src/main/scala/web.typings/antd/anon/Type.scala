package web.typings.antd.anon

import web.typings.antd.esTableInterfaceMod.RowSelectMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  var `type`: RowSelectMethod = js.native
}
object Type {
  
  @scala.inline
  def apply(`type`: RowSelectMethod): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: RowSelectMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
