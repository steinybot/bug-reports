package web.typings.antd

import web.typings.antd.anon.Config
import web.typings.antd.esModalConfirmMod.ModalStaticFunctions
import web.typings.antd.esModalInterfaceMod.ModalProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalMod extends Shortcut {
  
  @JSImport("antd/es/modal", JSImport.Default)
  @js.native
  val default: ModalType = js.native
  
  type ModalType = ReactComponentClass[ModalProps] with ModalStaticFunctions with Config
  
  type _To = ModalType
  
  /* This means you don't have to write `default`, but can instead just say `esModalMod.foo` */
  override def _to: ModalType = default
}
