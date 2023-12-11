package web.typings.antd

import web.typings.antd.anon.Download
import web.typings.antd.anon.UploadPropsanyheightnumbe
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
import web.typings.antd.esUploadInterfaceMod.ItemRender
import web.typings.antd.esUploadInterfaceMod.PreviewFileHandler
import web.typings.antd.esUploadInterfaceMod.RcFile
import web.typings.antd.esUploadInterfaceMod.ShowUploadListInterface
import web.typings.antd.esUploadInterfaceMod.TransformFileHandler
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
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Blob
import org.scalajs.dom.File
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUploadDraggerMod extends Shortcut {
  
  @JSImport("antd/es/upload/Dragger", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UploadPropsanyheightnumbe] = js.native
  
  /* Inlined parent antd.antd/es/upload/interface.UploadProps<any> */
  @js.native
  trait DraggerProps extends StObject {
    
    var accept: js.UndefOr[String] = js.native
    
    var action: js.UndefOr[String | (js.Function1[/* file */ RcFile, PromiseLike[String] | String])] = js.native
    
    var beforeUpload: js.UndefOr[
        js.Function2[
          /* file */ RcFile, 
          /* FileList */ js.Array[RcFile], 
          BeforeUploadValueType | js.Promise[BeforeUploadValueType]
        ]
      ] = js.native
    
    var capture: js.UndefOr[Boolean | user | environment] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var customRequest: js.UndefOr[js.Function1[/* options */ UploadRequestOption[Any], Unit]] = js.native
    
    var data: js.UndefOr[
        (Record[String, Any]) | (js.Function1[
          /* file */ UploadFile[Any], 
          (Record[String, Any]) | (js.Promise[Record[String, Any]])
        ])
      ] = js.native
    
    var defaultFileList: js.UndefOr[js.Array[UploadFile[Any]]] = js.native
    
    var directory: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var fileList: js.UndefOr[js.Array[UploadFile[Any]]] = js.native
    
    var headers: js.UndefOr[HttpRequestHeader] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var iconRender: js.UndefOr[
        js.Function2[/* file */ UploadFile[Any], /* listType */ js.UndefOr[UploadListType], ReactElement]
      ] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var isImageUrl: js.UndefOr[js.Function1[/* file */ UploadFile[Any], Boolean]] = js.native
    
    var itemRender: js.UndefOr[ItemRender[Any]] = js.native
    
    var listType: js.UndefOr[UploadListType] = js.native
    
    var locale: js.UndefOr[UploadLocale] = js.native
    
    /** Config max count of `fileList`. Will replace current one when `maxCount` is 1 */
    var maxCount: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[POST | PUT | PATCH | post_ | put_ | patch_] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* info */ UploadChangeParam[UploadFile[Any]], Unit]] = js.native
    
    var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[Any], Unit]] = js.native
    
    var onDrop: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLDivElement], Unit]] = js.native
    
    var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[Any], Unit]] = js.native
    
    var onRemove: js.UndefOr[
        js.Function1[/* file */ UploadFile[Any], Unit | Boolean | (js.Promise[Unit | Boolean])]
      ] = js.native
    
    var openFileDialogOnClick: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var previewFile: js.UndefOr[PreviewFileHandler] = js.native
    
    var progress: js.UndefOr[UploadListProgressProps] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var showUploadList: js.UndefOr[Boolean | ShowUploadListInterface[Any]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var supportServerRender: js.UndefOr[Boolean] = js.native
    
    /** @deprecated Please use `beforeUpload` directly */
    var transformFile: js.UndefOr[TransformFileHandler] = js.native
    
    var `type`: js.UndefOr[UploadType] = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object DraggerProps {
    
    @scala.inline
    def apply(): DraggerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DraggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAction(value: String | (js.Function1[/* file */ RcFile, PromiseLike[String] | String])): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionFunction1(value: /* file */ RcFile => PromiseLike[String] | String): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setBeforeUpload(
        value: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => BeforeUploadValueType | js.Promise[BeforeUploadValueType]
      ): Self = StObject.set(x, "beforeUpload", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeUploadUndefined: Self = StObject.set(x, "beforeUpload", js.undefined)
      
      @scala.inline
      def setCapture(value: Boolean | user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCustomRequest(value: /* options */ UploadRequestOption[Any] => Unit): Self = StObject.set(x, "customRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomRequestUndefined: Self = StObject.set(x, "customRequest", js.undefined)
      
      @scala.inline
      def setData(
        value: (Record[String, Any]) | (js.Function1[
              /* file */ UploadFile[Any], 
              (Record[String, Any]) | (js.Promise[Record[String, Any]])
            ])
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFunction1(value: /* file */ UploadFile[Any] => (Record[String, Any]) | (js.Promise[Record[String, Any]])): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDefaultFileList(value: js.Array[UploadFile[Any]]): Self = StObject.set(x, "defaultFileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFileListUndefined: Self = StObject.set(x, "defaultFileList", js.undefined)
      
      @scala.inline
      def setDefaultFileListVarargs(value: UploadFile[Any]*): Self = StObject.set(x, "defaultFileList", js.Array(value :_*))
      
      @scala.inline
      def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFileList(value: js.Array[UploadFile[Any]]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
      
      @scala.inline
      def setFileListVarargs(value: UploadFile[Any]*): Self = StObject.set(x, "fileList", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: HttpRequestHeader): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIconRender(value: (/* file */ UploadFile[Any], /* listType */ js.UndefOr[UploadListType]) => ReactElement): Self = StObject.set(x, "iconRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsImageUrl(value: /* file */ UploadFile[Any] => Boolean): Self = StObject.set(x, "isImageUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsImageUrlUndefined: Self = StObject.set(x, "isImageUrl", js.undefined)
      
      @scala.inline
      def setItemRender(
        value: (/* originNode */ ReactElement, /* file */ UploadFile[Any], /* fileList */ js.Array[UploadFile[Any]], /* actions */ Download) => ReactElement
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setListType(value: UploadListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      @scala.inline
      def setLocale(value: UploadLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      @scala.inline
      def setMethod(value: POST | PUT | PATCH | post_ | put_ | patch_): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* info */ UploadChangeParam[UploadFile[Any]] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnDownload(value: /* file */ UploadFile[Any] => Unit): Self = StObject.set(x, "onDownload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDownloadUndefined: Self = StObject.set(x, "onDownload", js.undefined)
      
      @scala.inline
      def setOnDrop(value: /* event */ DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnPreview(value: /* file */ UploadFile[Any] => Unit): Self = StObject.set(x, "onPreview", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPreviewUndefined: Self = StObject.set(x, "onPreview", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* file */ UploadFile[Any] => Unit | Boolean | (js.Promise[Unit | Boolean])): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setOpenFileDialogOnClick(value: Boolean): Self = StObject.set(x, "openFileDialogOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenFileDialogOnClickUndefined: Self = StObject.set(x, "openFileDialogOnClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPreviewFile(value: /* file */ File | Blob => PromiseLike[String]): Self = StObject.set(x, "previewFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreviewFileUndefined: Self = StObject.set(x, "previewFile", js.undefined)
      
      @scala.inline
      def setProgress(value: UploadListProgressProps): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setShowUploadList(value: Boolean | ShowUploadListInterface[Any]): Self = StObject.set(x, "showUploadList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUploadListUndefined: Self = StObject.set(x, "showUploadList", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSupportServerRender(value: Boolean): Self = StObject.set(x, "supportServerRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportServerRenderUndefined: Self = StObject.set(x, "supportServerRender", js.undefined)
      
      @scala.inline
      def setTransformFile(value: /* file */ RcFile => String | Blob | File | (PromiseLike[String | Blob | File])): Self = StObject.set(x, "transformFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformFileUndefined: Self = StObject.set(x, "transformFile", js.undefined)
      
      @scala.inline
      def setType(value: UploadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UploadPropsanyheightnumbe]
  
  /* This means you don't have to write `default`, but can instead just say `esUploadDraggerMod.foo` */
  override def _to: ReactComponentClass[UploadPropsanyheightnumbe] = default
}
