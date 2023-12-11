package web.typings.antd.anon

import web.typings.antd.antdStrings._empty
import web.typings.antd.antdStrings.`use-credentials`
import web.typings.antd.antdStrings.anonymous
import web.typings.antd.esUploadInterfaceMod.RcFile
import web.typings.antd.esUploadInterfaceMod.UploadFileStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<antd.antd/es/upload/interface.UploadFile<any>> */
@js.native
trait ReadonlyUploadFileany extends StObject {
  
  val `aria-label`: js.UndefOr[String] = js.native
  
  val `aria-labelledby`: js.UndefOr[String] = js.native
  
  val crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
  
  val error: js.UndefOr[Any] = js.native
  
  val fileName: js.UndefOr[String] = js.native
  
  val lastModified: js.UndefOr[Double] = js.native
  
  val lastModifiedDate: js.UndefOr[js.Date] = js.native
  
  val linkProps: js.UndefOr[Any] = js.native
  
  val name: String = js.native
  
  val originFileObj: js.UndefOr[RcFile] = js.native
  
  val percent: js.UndefOr[Double] = js.native
  
  val preview: js.UndefOr[String] = js.native
  
  val response: js.UndefOr[Any] = js.native
  
  val size: js.UndefOr[Double] = js.native
  
  val status: js.UndefOr[UploadFileStatus] = js.native
  
  val thumbUrl: js.UndefOr[String] = js.native
  
  val `type`: js.UndefOr[String] = js.native
  
  val uid: String = js.native
  
  val url: js.UndefOr[String] = js.native
  
  val xhr: js.UndefOr[Any] = js.native
}
object ReadonlyUploadFileany {
  
  @scala.inline
  def apply(name: String, uid: String): ReadonlyUploadFileany = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyUploadFileany]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ReadonlyUploadFileany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
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
    def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
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
    def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
