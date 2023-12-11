package web.typings.antd.components

import web.typings.antd.esTransferOperationMod.TransferOperationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Operation {
  
  @JSImport("antd/es/transfer/operation", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = TransferOperationProps
  
  implicit def make(companion: Operation.type): SharedBuilder_TransferOperationProps502467532 = new SharedBuilder_TransferOperationProps502467532(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TransferOperationProps): SharedBuilder_TransferOperationProps502467532 = new SharedBuilder_TransferOperationProps502467532(js.Array(this.component, p.asInstanceOf[js.Any]))
}
