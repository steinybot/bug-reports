package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.Download
import web.typings.antd.esUploadInterfaceMod.UploadFile
import web.typings.antd.esUploadInterfaceMod.UploadListProgressProps
import web.typings.antd.esUploadInterfaceMod.UploadListProps
import web.typings.antd.esUploadInterfaceMod.UploadListType
import web.typings.antd.esUploadInterfaceMod.UploadLocale
import web.typings.antd.esUploadUploadListMod.UploadListRef
import web.typings.react.mod.RefAttributes
import web.typings.std.PromiseLike
import org.scalajs.dom.Blob
import org.scalajs.dom.File
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UploadList {
  
  @scala.inline
  def apply(locale: UploadLocale): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[UploadListProps[Any] with RefAttributes[UploadListRef]]))
  }
  
  @JSImport("antd/es/upload/UploadList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, UploadListRef] {
    
    @scala.inline
    def appendAction(value: ReactElement): this.type = set("appendAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def appendActionVisible(value: Boolean): this.type = set("appendActionVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def downloadIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[Any], ReactElement])): this.type = set("downloadIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def downloadIconFunction1(value: /* file */ UploadFile[Any] => ReactElement): this.type = set("downloadIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def downloadIconReactElement(value: ReactElement): this.type = set("downloadIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconRender(value: (/* file */ UploadFile[Any], /* listType */ js.UndefOr[UploadListType]) => ReactElement): this.type = set("iconRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def isImageUrl(value: /* file */ UploadFile[Any] => Boolean): this.type = set("isImageUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def itemRender(
      value: (/* originNode */ ReactElement, /* file */ UploadFile[Any], /* fileList */ js.Array[UploadFile[Any]], /* actions */ Download) => ReactElement
    ): this.type = set("itemRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def items(value: js.Array[UploadFile[Any]]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsVarargs(value: UploadFile[Any]*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def listType(value: UploadListType): this.type = set("listType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDownload(value: /* file */ UploadFile[Any] => Unit): this.type = set("onDownload", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPreview(value: /* file */ UploadFile[Any] => Unit): this.type = set("onPreview", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRemove(value: /* file */ UploadFile[Any] => Unit | Boolean): this.type = set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previewFile(value: /* file */ File | Blob => PromiseLike[String]): this.type = set("previewFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def previewIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[Any], ReactElement])): this.type = set("previewIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previewIconFunction1(value: /* file */ UploadFile[Any] => ReactElement): this.type = set("previewIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def previewIconReactElement(value: ReactElement): this.type = set("previewIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progress(value: UploadListProgressProps): this.type = set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[Any], ReactElement])): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeIconFunction1(value: /* file */ UploadFile[Any] => ReactElement): this.type = set("removeIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def removeIconReactElement(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showDownloadIcon(value: Boolean): this.type = set("showDownloadIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showPreviewIcon(value: Boolean): this.type = set("showPreviewIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showRemoveIcon(value: Boolean): this.type = set("showRemoveIcon", value.asInstanceOf[js.Any])
  }
  
  type Props = UploadListProps[Any] with RefAttributes[UploadListRef]
  
  def withProps(p: UploadListProps[Any] with RefAttributes[UploadListRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
