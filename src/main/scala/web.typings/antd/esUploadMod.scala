package web.typings.antd

import web.typings.antd.anon.UploadPropsanyheightnumbe
import web.typings.antd.esUploadInterfaceMod.UploadProps
import web.typings.antd.esUploadUploadMod.UploadRef
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUploadMod extends Shortcut {
  
  @JSImport("antd/es/upload", JSImport.Default)
  @js.native
  val default: CompoundedComponent[Any] = js.native
  
  @js.native
  trait CompoundedComponent[T]
    extends StObject
       with ForwardRefExoticComponent[UploadProps[Any] with RefAttributes[UploadRef[Any]]] {
    
    var Dragger: ReactComponentClass[UploadPropsanyheightnumbe] = js.native
    
    var LIST_IGNORE: String = js.native
  }
  
  type InternalUploadType = ReactComponentClass[UploadProps[Any] with RefAttributes[UploadRef[Any]]]
  
  type _To = CompoundedComponent[Any]
  
  /* This means you don't have to write `default`, but can instead just say `esUploadMod.foo` */
  override def _to: CompoundedComponent[Any] = default
}
