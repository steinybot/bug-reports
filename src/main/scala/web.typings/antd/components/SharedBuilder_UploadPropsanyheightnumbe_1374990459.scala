package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.Download
import web.typings.antd.antdStrings.PATCH
import web.typings.antd.antdStrings.POST
import web.typings.antd.antdStrings.PUT
import web.typings.antd.antdStrings.environment
import web.typings.antd.antdStrings.patch_
import web.typings.antd.antdStrings.post_
import web.typings.antd.antdStrings.put_
import web.typings.antd.antdStrings.user
import web.typings.antd.esUploadInterfaceMod.BeforeUploadValueType
import web.typings.antd.esUploadInterfaceMod.HttpRequestHeader
import web.typings.antd.esUploadInterfaceMod.RcFile
import web.typings.antd.esUploadInterfaceMod.ShowUploadListInterface
import web.typings.antd.esUploadInterfaceMod.UploadChangeParam
import web.typings.antd.esUploadInterfaceMod.UploadFile
import web.typings.antd.esUploadInterfaceMod.UploadListProgressProps
import web.typings.antd.esUploadInterfaceMod.UploadListType
import web.typings.antd.esUploadInterfaceMod.UploadLocale
import web.typings.antd.esUploadInterfaceMod.UploadType
import web.typings.rcUpload.esInterfaceMod.UploadRequestOption
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.DragEvent
import web.typings.std.PromiseLike
import web.typings.std.Record
import org.scalajs.dom.Blob
import org.scalajs.dom.File
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_UploadPropsanyheightnumbe_1374990459[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
  
  @scala.inline
  def action(value: String | (js.Function1[/* file */ RcFile, PromiseLike[String] | String])): this.type = set("action", value.asInstanceOf[js.Any])
  
  @scala.inline
  def actionFunction1(value: /* file */ RcFile => PromiseLike[String] | String): this.type = set("action", js.Any.fromFunction1(value))
  
  @scala.inline
  def beforeUpload(
    value: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => BeforeUploadValueType | js.Promise[BeforeUploadValueType]
  ): this.type = set("beforeUpload", js.Any.fromFunction2(value))
  
  @scala.inline
  def capture(value: Boolean | user | environment): this.type = set("capture", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def customRequest(value: /* options */ UploadRequestOption[Any] => Unit): this.type = set("customRequest", js.Any.fromFunction1(value))
  
  @scala.inline
  def data(
    value: (Record[String, Any]) | (js.Function1[
      /* file */ UploadFile[Any], 
      (Record[String, Any]) | (js.Promise[Record[String, Any]])
    ])
  ): this.type = set("data", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dataFunction1(value: /* file */ UploadFile[Any] => (Record[String, Any]) | (js.Promise[Record[String, Any]])): this.type = set("data", js.Any.fromFunction1(value))
  
  @scala.inline
  def defaultFileList(value: js.Array[UploadFile[Any]]): this.type = set("defaultFileList", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultFileListVarargs(value: UploadFile[Any]*): this.type = set("defaultFileList", js.Array(value :_*))
  
  @scala.inline
  def directory(value: Boolean): this.type = set("directory", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fileList(value: js.Array[UploadFile[Any]]): this.type = set("fileList", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fileListVarargs(value: UploadFile[Any]*): this.type = set("fileList", js.Array(value :_*))
  
  @scala.inline
  def headers(value: HttpRequestHeader): this.type = set("headers", value.asInstanceOf[js.Any])
  
  @scala.inline
  def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconRender(value: (/* file */ UploadFile[Any], /* listType */ js.UndefOr[UploadListType]) => ReactElement): this.type = set("iconRender", js.Any.fromFunction2(value))
  
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isImageUrl(value: /* file */ UploadFile[Any] => Boolean): this.type = set("isImageUrl", js.Any.fromFunction1(value))
  
  @scala.inline
  def itemRender(
    value: (/* originNode */ ReactElement, /* file */ UploadFile[Any], /* fileList */ js.Array[UploadFile[Any]], /* actions */ Download) => ReactElement
  ): this.type = set("itemRender", js.Any.fromFunction4(value))
  
  @scala.inline
  def listType(value: UploadListType): this.type = set("listType", value.asInstanceOf[js.Any])
  
  @scala.inline
  def locale(value: UploadLocale): this.type = set("locale", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxCount(value: Double): this.type = set("maxCount", value.asInstanceOf[js.Any])
  
  @scala.inline
  def method(value: POST | PUT | PATCH | post_ | put_ | patch_): this.type = set("method", value.asInstanceOf[js.Any])
  
  @scala.inline
  def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  
  @scala.inline
  def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: /* info */ UploadChangeParam[UploadFile[Any]] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDownload(value: /* file */ UploadFile[Any] => Unit): this.type = set("onDownload", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDrop(value: /* event */ DragEvent[HTMLDivElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPreview(value: /* file */ UploadFile[Any] => Unit): this.type = set("onPreview", js.Any.fromFunction1(value))
  
  @scala.inline
  def onRemove(value: /* file */ UploadFile[Any] => Unit | Boolean | (js.Promise[Unit | Boolean])): this.type = set("onRemove", js.Any.fromFunction1(value))
  
  @scala.inline
  def openFileDialogOnClick(value: Boolean): this.type = set("openFileDialogOnClick", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def previewFile(value: /* file */ File | Blob => PromiseLike[String]): this.type = set("previewFile", js.Any.fromFunction1(value))
  
  @scala.inline
  def progress(value: UploadListProgressProps): this.type = set("progress", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showUploadList(value: Boolean | ShowUploadListInterface[Any]): this.type = set("showUploadList", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def supportServerRender(value: Boolean): this.type = set("supportServerRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def transformFile(value: /* file */ RcFile => String | Blob | File | (PromiseLike[String | Blob | File])): this.type = set("transformFile", js.Any.fromFunction1(value))
  
  @scala.inline
  def `type`(value: UploadType): this.type = set("type", value.asInstanceOf[js.Any])
  
  @scala.inline
  def withCredentials(value: Boolean): this.type = set("withCredentials", value.asInstanceOf[js.Any])
}
