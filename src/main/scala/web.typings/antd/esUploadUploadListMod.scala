package web.typings.antd

import web.typings.antd.esUploadInterfaceMod.UploadFile
import web.typings.antd.esUploadInterfaceMod.UploadListProps
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUploadUploadListMod extends Shortcut {
  
  @JSImport("antd/es/upload/UploadList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UploadListProps[Any] with RefAttributes[UploadListRef]] = js.native
  
  @js.native
  trait UploadListRef extends StObject {
    
    def handleDownload(file: UploadFile[Any]): Unit = js.native
    
    def handlePreview(file: UploadFile[Any]): Unit = js.native
    def handlePreview(file: UploadFile[Any], e: SyntheticEvent[Event, HTMLElement]): Unit = js.native
  }
  
  type _To = ReactComponentClass[UploadListProps[Any] with RefAttributes[UploadListRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esUploadUploadListMod.foo` */
  override def _to: ReactComponentClass[UploadListProps[Any] with RefAttributes[UploadListRef]] = default
}
