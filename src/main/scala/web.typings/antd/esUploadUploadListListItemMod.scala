package web.typings.antd

import web.typings.antd.esUploadInterfaceMod.ItemRender
import web.typings.antd.esUploadInterfaceMod.UploadFile
import web.typings.antd.esUploadInterfaceMod.UploadListProgressProps
import web.typings.antd.esUploadInterfaceMod.UploadListType
import web.typings.antd.esUploadInterfaceMod.UploadLocale
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUploadUploadListListItemMod extends Shortcut {
  
  @JSImport("antd/es/upload/UploadList/ListItem", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ListItemProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait ListItemProps extends StObject {
    
    def actionIconRender(customIcon: ReactElement, callback: js.Function0[Unit], prefixCls: String): ReactElement = js.native
    def actionIconRender(customIcon: ReactElement, callback: js.Function0[Unit], prefixCls: String, title: String): ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var downloadIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[Any], ReactElement])] = js.native
    
    var file: UploadFile[Any] = js.native
    
    def iconRender(file: UploadFile[Any]): ReactElement = js.native
    
    var isImgUrl: js.UndefOr[js.Function1[/* file */ UploadFile[Any], Boolean]] = js.native
    
    var itemRender: js.UndefOr[ItemRender[Any]] = js.native
    
    var items: js.Array[UploadFile[Any]] = js.native
    
    var listType: js.UndefOr[UploadListType] = js.native
    
    var locale: UploadLocale = js.native
    
    def onClose(file: UploadFile[Any]): Unit = js.native
    
    def onDownload(file: UploadFile[Any]): Unit = js.native
    
    def onPreview(file: UploadFile[Any], e: SyntheticEvent[Event, HTMLElement]): Unit = js.native
    
    var prefixCls: String = js.native
    
    var previewIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[Any], ReactElement])] = js.native
    
    var progress: js.UndefOr[UploadListProgressProps] = js.native
    
    var removeIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[Any], ReactElement])] = js.native
    
    var showDownloadIcon: js.UndefOr[Boolean] = js.native
    
    var showPreviewIcon: js.UndefOr[Boolean] = js.native
    
    var showRemoveIcon: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  
  type _To = ReactComponentClass[ListItemProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esUploadUploadListListItemMod.foo` */
  override def _to: ReactComponentClass[ListItemProps with RefAttributes[HTMLDivElement]] = default
}
