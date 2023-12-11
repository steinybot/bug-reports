package web.typings.antd

import web.typings.antd.anon.Download
import web.typings.antd.anon.Percent
import web.typings.antd.antdStrings.PATCH
import web.typings.antd.antdStrings.POST
import web.typings.antd.antdStrings.PUT
import web.typings.antd.antdStrings._empty
import web.typings.antd.antdStrings.`use-credentials`
import web.typings.antd.antdStrings.active
import web.typings.antd.antdStrings.anonymous
import web.typings.antd.antdStrings.bottom
import web.typings.antd.antdStrings.butt
import web.typings.antd.antdStrings.environment
import web.typings.antd.antdStrings.exception
import web.typings.antd.antdStrings.left
import web.typings.antd.antdStrings.normal
import web.typings.antd.antdStrings.patch_
import web.typings.antd.antdStrings.post_
import web.typings.antd.antdStrings.put_
import web.typings.antd.antdStrings.right
import web.typings.antd.antdStrings.round
import web.typings.antd.antdStrings.select_
import web.typings.antd.antdStrings.square
import web.typings.antd.antdStrings.success
import web.typings.antd.antdStrings.text_
import web.typings.antd.antdStrings.top
import web.typings.antd.antdStrings.user
import web.typings.antd.esProgressProgressMod.ProgressAriaProps
import web.typings.antd.esProgressProgressMod.ProgressGradient
import web.typings.antd.esProgressProgressMod.ProgressSize
import web.typings.antd.esProgressProgressMod.SuccessProps
import web.typings.rcUpload.esInterfaceMod.UploadRequestOption
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.DragEvent
import web.typings.std.PromiseLike
import web.typings.std.Record
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import org.scalajs.dom.File
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUploadInterfaceMod {
  
  type BeforeUploadValueType = Unit | Boolean | String | Blob | File
  
  type HttpRequestHeader = StringDictionary[String]
  
  @js.native
  trait InternalUploadFile[T]
    extends StObject
       with UploadFile[T] {
    
    @JSName("originFileObj")
    var originFileObj_InternalUploadFile: RcFile = js.native
  }
  object InternalUploadFile {
    
    @scala.inline
    def apply[T](name: String, originFileObj: RcFile, uid: String): InternalUploadFile[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], originFileObj = originFileObj.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalUploadFile[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InternalUploadFile[_], T] (val x: Self with InternalUploadFile[T]) extends AnyVal {
      
      @scala.inline
      def setOriginFileObj(value: RcFile): Self = StObject.set(x, "originFileObj", value.asInstanceOf[js.Any])
    }
  }
  
  type ItemRender[T] = js.Function4[
    /* originNode */ ReactElement, 
    /* file */ UploadFile[T], 
    /* fileList */ js.Array[UploadFile[T]], 
    /* actions */ Download, 
    ReactElement
  ]
  
  type PreviewFileHandler = js.Function1[/* file */ File | Blob, PromiseLike[String]]
  
  @js.native
  trait RcFile
    extends StObject
       with web.typings.rcUpload.esInterfaceMod.RcFile {
    
    val lastModifiedDate: js.Date = js.native
  }
  
  @js.native
  trait ShowUploadListInterface[T] extends StObject {
    
    var downloadIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[T], ReactElement])] = js.native
    
    var previewIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[T], ReactElement])] = js.native
    
    var removeIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[T], ReactElement])] = js.native
    
    var showDownloadIcon: js.UndefOr[Boolean] = js.native
    
    var showPreviewIcon: js.UndefOr[Boolean] = js.native
    
    var showRemoveIcon: js.UndefOr[Boolean] = js.native
  }
  object ShowUploadListInterface {
    
    @scala.inline
    def apply[T](): ShowUploadListInterface[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowUploadListInterface[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ShowUploadListInterface[_], T] (val x: Self with ShowUploadListInterface[T]) extends AnyVal {
      
      @scala.inline
      def setDownloadIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[T], ReactElement])): Self = StObject.set(x, "downloadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadIconFunction1(value: /* file */ UploadFile[T] => ReactElement): Self = StObject.set(x, "downloadIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownloadIconReactElement(value: ReactElement): Self = StObject.set(x, "downloadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadIconUndefined: Self = StObject.set(x, "downloadIcon", js.undefined)
      
      @scala.inline
      def setPreviewIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[T], ReactElement])): Self = StObject.set(x, "previewIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewIconFunction1(value: /* file */ UploadFile[T] => ReactElement): Self = StObject.set(x, "previewIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreviewIconReactElement(value: ReactElement): Self = StObject.set(x, "previewIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewIconUndefined: Self = StObject.set(x, "previewIcon", js.undefined)
      
      @scala.inline
      def setRemoveIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[T], ReactElement])): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconFunction1(value: /* file */ UploadFile[T] => ReactElement): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveIconReactElement(value: ReactElement): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setShowDownloadIcon(value: Boolean): Self = StObject.set(x, "showDownloadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDownloadIconUndefined: Self = StObject.set(x, "showDownloadIcon", js.undefined)
      
      @scala.inline
      def setShowPreviewIcon(value: Boolean): Self = StObject.set(x, "showPreviewIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPreviewIconUndefined: Self = StObject.set(x, "showPreviewIcon", js.undefined)
      
      @scala.inline
      def setShowRemoveIcon(value: Boolean): Self = StObject.set(x, "showRemoveIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRemoveIconUndefined: Self = StObject.set(x, "showRemoveIcon", js.undefined)
    }
  }
  
  type TransformFileHandler = js.Function1[/* file */ RcFile, String | Blob | File | (PromiseLike[String | Blob | File])]
  
  @js.native
  trait UploadChangeParam[T] extends StObject {
    
    var event: js.UndefOr[Percent] = js.native
    
    var file: T = js.native
    
    var fileList: js.Array[T] = js.native
  }
  object UploadChangeParam {
    
    @scala.inline
    def apply[T](file: T, fileList: js.Array[T]): UploadChangeParam[T] = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadChangeParam[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: UploadChangeParam[_], T] (val x: Self with UploadChangeParam[T]) extends AnyVal {
      
      @scala.inline
      def setEvent(value: Percent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setFile(value: T): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileList(value: js.Array[T]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListVarargs(value: T*): Self = StObject.set(x, "fileList", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UploadFile[T]
    extends StObject
       with ProgressAriaProps {
    
    var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
    
    var error: js.UndefOr[Any] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var lastModified: js.UndefOr[Double] = js.native
    
    var lastModifiedDate: js.UndefOr[js.Date] = js.native
    
    var linkProps: js.UndefOr[Any] = js.native
    
    var name: String = js.native
    
    var originFileObj: js.UndefOr[RcFile] = js.native
    
    var percent: js.UndefOr[Double] = js.native
    
    var preview: js.UndefOr[String] = js.native
    
    var response: js.UndefOr[T] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var status: js.UndefOr[UploadFileStatus] = js.native
    
    var thumbUrl: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var uid: String = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var xhr: js.UndefOr[T] = js.native
  }
  object UploadFile {
    
    @scala.inline
    def apply[T](name: String, uid: String): UploadFile[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadFile[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: UploadFile[_], T] (val x: Self with UploadFile[T]) extends AnyVal {
      
      @scala.inline
      def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      @scala.inline
      def setLinkProps(value: Any): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginFileObj(value: RcFile): Self = StObject.set(x, "originFileObj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginFileObjUndefined: Self = StObject.set(x, "originFileObj", js.undefined)
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      @scala.inline
      def setResponse(value: T): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: UploadFileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setThumbUrl(value: String): Self = StObject.set(x, "thumbUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbUrlUndefined: Self = StObject.set(x, "thumbUrl", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setXhr(value: T): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.error
    - `web.typings`.antd.antdStrings.done
    - `web.typings`.antd.antdStrings.uploading
    - `web.typings`.antd.antdStrings.removed
  */
  trait UploadFileStatus extends StObject
  object UploadFileStatus {
    
    @scala.inline
    def done: web.typings.antd.antdStrings.done = "done".asInstanceOf[web.typings.antd.antdStrings.done]
    
    @scala.inline
    def error: web.typings.antd.antdStrings.error = "error".asInstanceOf[web.typings.antd.antdStrings.error]
    
    @scala.inline
    def removed: web.typings.antd.antdStrings.removed = "removed".asInstanceOf[web.typings.antd.antdStrings.removed]
    
    @scala.inline
    def uploading: web.typings.antd.antdStrings.uploading = "uploading".asInstanceOf[web.typings.antd.antdStrings.uploading]
  }
  
  /* Inlined std.Omit<antd.antd/es/progress.ProgressProps, 'percent' | 'type'> */
  @js.native
  trait UploadListProgressProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[
        js.Function2[
          /* percent */ js.UndefOr[Double], 
          /* successPercent */ js.UndefOr[Double], 
          ReactElement
        ]
      ] = js.native
    
    var gapDegree: js.UndefOr[Double] = js.native
    
    var gapPosition: js.UndefOr[top | bottom | left | right] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var showInfo: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Double | (js.Tuple2[Double | String, Double]) | ProgressSize] = js.native
    
    var status: js.UndefOr[normal | exception | active | success] = js.native
    
    var steps: js.UndefOr[Double] = js.native
    
    var strokeColor: js.UndefOr[String | js.Array[String] | ProgressGradient] = js.native
    
    var strokeLinecap: js.UndefOr[butt | square | round] = js.native
    
    var strokeWidth: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var success: js.UndefOr[SuccessProps] = js.native
    
    var successPercent: js.UndefOr[Double] = js.native
    
    var trailColor: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object UploadListProgressProps {
    
    @scala.inline
    def apply(): UploadListProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadListProgressProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: UploadListProgressProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFormat(value: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => ReactElement): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGapDegree(value: Double): Self = StObject.set(x, "gapDegree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapDegreeUndefined: Self = StObject.set(x, "gapDegree", js.undefined)
      
      @scala.inline
      def setGapPosition(value: top | bottom | left | right): Self = StObject.set(x, "gapPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapPositionUndefined: Self = StObject.set(x, "gapPosition", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setShowInfo(value: Boolean): Self = StObject.set(x, "showInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInfoUndefined: Self = StObject.set(x, "showInfo", js.undefined)
      
      @scala.inline
      def setSize(value: Double | (js.Tuple2[Double | String, Double]) | ProgressSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: normal | exception | active | success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: String | js.Array[String] | ProgressGradient): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeColorVarargs(value: String*): Self = StObject.set(x, "strokeColor", js.Array(value :_*))
      
      @scala.inline
      def setStrokeLinecap(value: butt | square | round): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuccess(value: SuccessProps): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessPercent(value: Double): Self = StObject.set(x, "successPercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessPercentUndefined: Self = StObject.set(x, "successPercent", js.undefined)
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setTrailColor(value: String): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait UploadListProps[T] extends StObject {
    
    var appendAction: js.UndefOr[ReactElement] = js.native
    
    var appendActionVisible: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var downloadIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[Any], ReactElement])] = js.native
    
    var iconRender: js.UndefOr[
        js.Function2[/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType], ReactElement]
      ] = js.native
    
    var isImageUrl: js.UndefOr[js.Function1[/* file */ UploadFile[T], Boolean]] = js.native
    
    var itemRender: js.UndefOr[ItemRender[T]] = js.native
    
    var items: js.UndefOr[js.Array[UploadFile[T]]] = js.native
    
    var listType: js.UndefOr[UploadListType] = js.native
    
    var locale: UploadLocale = js.native
    
    var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.native
    
    var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.native
    
    var onRemove: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit | Boolean]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var previewFile: js.UndefOr[PreviewFileHandler] = js.native
    
    var previewIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[Any], ReactElement])] = js.native
    
    var progress: js.UndefOr[UploadListProgressProps] = js.native
    
    var removeIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[Any], ReactElement])] = js.native
    
    var showDownloadIcon: js.UndefOr[Boolean] = js.native
    
    var showPreviewIcon: js.UndefOr[Boolean] = js.native
    
    var showRemoveIcon: js.UndefOr[Boolean] = js.native
  }
  object UploadListProps {
    
    @scala.inline
    def apply[T](locale: UploadLocale): UploadListProps[T] = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadListProps[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: UploadListProps[_], T] (val x: Self with UploadListProps[T]) extends AnyVal {
      
      @scala.inline
      def setAppendAction(value: ReactElement): Self = StObject.set(x, "appendAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendActionUndefined: Self = StObject.set(x, "appendAction", js.undefined)
      
      @scala.inline
      def setAppendActionVisible(value: Boolean): Self = StObject.set(x, "appendActionVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendActionVisibleUndefined: Self = StObject.set(x, "appendActionVisible", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDownloadIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[Any], ReactElement])): Self = StObject.set(x, "downloadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadIconFunction1(value: /* file */ UploadFile[Any] => ReactElement): Self = StObject.set(x, "downloadIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownloadIconReactElement(value: ReactElement): Self = StObject.set(x, "downloadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadIconUndefined: Self = StObject.set(x, "downloadIcon", js.undefined)
      
      @scala.inline
      def setIconRender(value: (/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType]) => ReactElement): Self = StObject.set(x, "iconRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
      
      @scala.inline
      def setIsImageUrl(value: /* file */ UploadFile[T] => Boolean): Self = StObject.set(x, "isImageUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsImageUrlUndefined: Self = StObject.set(x, "isImageUrl", js.undefined)
      
      @scala.inline
      def setItemRender(
        value: (/* originNode */ ReactElement, /* file */ UploadFile[T], /* fileList */ js.Array[UploadFile[T]], /* actions */ Download) => ReactElement
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: UploadFile[T]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setListType(value: UploadListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      @scala.inline
      def setLocale(value: UploadLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDownload(value: /* file */ UploadFile[T] => Unit): Self = StObject.set(x, "onDownload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDownloadUndefined: Self = StObject.set(x, "onDownload", js.undefined)
      
      @scala.inline
      def setOnPreview(value: /* file */ UploadFile[T] => Unit): Self = StObject.set(x, "onPreview", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPreviewUndefined: Self = StObject.set(x, "onPreview", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* file */ UploadFile[T] => Unit | Boolean): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPreviewFile(value: /* file */ File | Blob => PromiseLike[String]): Self = StObject.set(x, "previewFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreviewFileUndefined: Self = StObject.set(x, "previewFile", js.undefined)
      
      @scala.inline
      def setPreviewIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[Any], ReactElement])): Self = StObject.set(x, "previewIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewIconFunction1(value: /* file */ UploadFile[Any] => ReactElement): Self = StObject.set(x, "previewIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreviewIconReactElement(value: ReactElement): Self = StObject.set(x, "previewIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewIconUndefined: Self = StObject.set(x, "previewIcon", js.undefined)
      
      @scala.inline
      def setProgress(value: UploadListProgressProps): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setRemoveIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[Any], ReactElement])): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconFunction1(value: /* file */ UploadFile[Any] => ReactElement): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveIconReactElement(value: ReactElement): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setShowDownloadIcon(value: Boolean): Self = StObject.set(x, "showDownloadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDownloadIconUndefined: Self = StObject.set(x, "showDownloadIcon", js.undefined)
      
      @scala.inline
      def setShowPreviewIcon(value: Boolean): Self = StObject.set(x, "showPreviewIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPreviewIconUndefined: Self = StObject.set(x, "showPreviewIcon", js.undefined)
      
      @scala.inline
      def setShowRemoveIcon(value: Boolean): Self = StObject.set(x, "showRemoveIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRemoveIconUndefined: Self = StObject.set(x, "showRemoveIcon", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.text_
    - `web.typings`.antd.antdStrings.picture
    - `web.typings`.antd.antdStrings.`picture-card`
    - `web.typings`.antd.antdStrings.`picture-circle`
  */
  trait UploadListType extends StObject
  object UploadListType {
    
    @scala.inline
    def picture: web.typings.antd.antdStrings.picture = "picture".asInstanceOf[web.typings.antd.antdStrings.picture]
    
    @scala.inline
    def `picture-card`: web.typings.antd.antdStrings.`picture-card` = "picture-card".asInstanceOf[web.typings.antd.antdStrings.`picture-card`]
    
    @scala.inline
    def `picture-circle`: web.typings.antd.antdStrings.`picture-circle` = "picture-circle".asInstanceOf[web.typings.antd.antdStrings.`picture-circle`]
    
    @scala.inline
    def text: text_ = "text".asInstanceOf[text_]
  }
  
  @js.native
  trait UploadLocale extends StObject {
    
    var downloadFile: js.UndefOr[String] = js.native
    
    var previewFile: js.UndefOr[String] = js.native
    
    var removeFile: js.UndefOr[String] = js.native
    
    var uploadError: js.UndefOr[String] = js.native
    
    var uploading: js.UndefOr[String] = js.native
  }
  object UploadLocale {
    
    @scala.inline
    def apply(): UploadLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadLocale]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: UploadLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloadFile(value: String): Self = StObject.set(x, "downloadFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadFileUndefined: Self = StObject.set(x, "downloadFile", js.undefined)
      
      @scala.inline
      def setPreviewFile(value: String): Self = StObject.set(x, "previewFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewFileUndefined: Self = StObject.set(x, "previewFile", js.undefined)
      
      @scala.inline
      def setRemoveFile(value: String): Self = StObject.set(x, "removeFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveFileUndefined: Self = StObject.set(x, "removeFile", js.undefined)
      
      @scala.inline
      def setUploadError(value: String): Self = StObject.set(x, "uploadError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadErrorUndefined: Self = StObject.set(x, "uploadError", js.undefined)
      
      @scala.inline
      def setUploading(value: String): Self = StObject.set(x, "uploading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadingUndefined: Self = StObject.set(x, "uploading", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<rc-upload.rc-upload/es/interface.UploadProps, 'capture'> */
  @js.native
  trait UploadProps[T] extends StObject {
    
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
          /* file */ UploadFile[T], 
          (Record[String, Any]) | (js.Promise[Record[String, Any]])
        ])
      ] = js.native
    
    var defaultFileList: js.UndefOr[js.Array[UploadFile[T]]] = js.native
    
    var directory: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var fileList: js.UndefOr[js.Array[UploadFile[T]]] = js.native
    
    var headers: js.UndefOr[HttpRequestHeader] = js.native
    
    var iconRender: js.UndefOr[
        js.Function2[/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType], ReactElement]
      ] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var isImageUrl: js.UndefOr[js.Function1[/* file */ UploadFile[T], Boolean]] = js.native
    
    var itemRender: js.UndefOr[ItemRender[T]] = js.native
    
    var listType: js.UndefOr[UploadListType] = js.native
    
    var locale: js.UndefOr[UploadLocale] = js.native
    
    /** Config max count of `fileList`. Will replace current one when `maxCount` is 1 */
    var maxCount: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[POST | PUT | PATCH | post_ | put_ | patch_] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* info */ UploadChangeParam[UploadFile[T]], Unit]] = js.native
    
    var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.native
    
    var onDrop: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLDivElement], Unit]] = js.native
    
    var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.native
    
    var onRemove: js.UndefOr[
        js.Function1[/* file */ UploadFile[T], Unit | Boolean | (js.Promise[Unit | Boolean])]
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
  object UploadProps {
    
    @scala.inline
    def apply[T](): UploadProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadProps[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: UploadProps[_], T] (val x: Self with UploadProps[T]) extends AnyVal {
      
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
              /* file */ UploadFile[T], 
              (Record[String, Any]) | (js.Promise[Record[String, Any]])
            ])
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFunction1(value: /* file */ UploadFile[T] => (Record[String, Any]) | (js.Promise[Record[String, Any]])): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDefaultFileList(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "defaultFileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFileListUndefined: Self = StObject.set(x, "defaultFileList", js.undefined)
      
      @scala.inline
      def setDefaultFileListVarargs(value: UploadFile[T]*): Self = StObject.set(x, "defaultFileList", js.Array(value :_*))
      
      @scala.inline
      def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFileList(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
      
      @scala.inline
      def setFileListVarargs(value: UploadFile[T]*): Self = StObject.set(x, "fileList", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: HttpRequestHeader): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIconRender(value: (/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType]) => ReactElement): Self = StObject.set(x, "iconRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsImageUrl(value: /* file */ UploadFile[T] => Boolean): Self = StObject.set(x, "isImageUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsImageUrlUndefined: Self = StObject.set(x, "isImageUrl", js.undefined)
      
      @scala.inline
      def setItemRender(
        value: (/* originNode */ ReactElement, /* file */ UploadFile[T], /* fileList */ js.Array[UploadFile[T]], /* actions */ Download) => ReactElement
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
      def setOnChange(value: /* info */ UploadChangeParam[UploadFile[T]] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnDownload(value: /* file */ UploadFile[T] => Unit): Self = StObject.set(x, "onDownload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDownloadUndefined: Self = StObject.set(x, "onDownload", js.undefined)
      
      @scala.inline
      def setOnDrop(value: /* event */ DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnPreview(value: /* file */ UploadFile[T] => Unit): Self = StObject.set(x, "onPreview", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPreviewUndefined: Self = StObject.set(x, "onPreview", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* file */ UploadFile[T] => Unit | Boolean | (js.Promise[Unit | Boolean])): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
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
  
  @js.native
  trait UploadState[T] extends StObject {
    
    var dragState: String = js.native
    
    var fileList: js.Array[UploadFile[T]] = js.native
  }
  object UploadState {
    
    @scala.inline
    def apply[T](dragState: String, fileList: js.Array[UploadFile[T]]): UploadState[T] = {
      val __obj = js.Dynamic.literal(dragState = dragState.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadState[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: UploadState[_], T] (val x: Self with UploadState[T]) extends AnyVal {
      
      @scala.inline
      def setDragState(value: String): Self = StObject.set(x, "dragState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileList(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListVarargs(value: UploadFile[T]*): Self = StObject.set(x, "fileList", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.drag
    - `web.typings`.antd.antdStrings.select_
  */
  trait UploadType extends StObject
  object UploadType {
    
    @scala.inline
    def drag: web.typings.antd.antdStrings.drag = "drag".asInstanceOf[web.typings.antd.antdStrings.drag]
    
    @scala.inline
    def select: select_ = "select".asInstanceOf[select_]
  }
}
