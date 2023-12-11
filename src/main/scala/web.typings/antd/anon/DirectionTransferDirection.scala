package web.typings.antd.anon

import web.typings.antd.esTransferMod.TransferDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionTransferDirection extends StObject {
  
  var direction: TransferDirection = js.native
}
object DirectionTransferDirection {
  
  @scala.inline
  def apply(direction: TransferDirection): DirectionTransferDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionTransferDirection]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DirectionTransferDirection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: TransferDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
