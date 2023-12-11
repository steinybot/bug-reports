package web.typings.antd

import web.typings.antd.anon.Percent
import web.typings.antd.esUploadInterfaceMod.RcFile
import web.typings.antd.esUploadInterfaceMod.UploadFile
import web.typings.antd.esUploadInterfaceMod.UploadProps
import web.typings.rcUpload.anon.File
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUploadUploadMod extends Shortcut {
  
  @JSImport("antd/es/upload/Upload", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UploadProps[Any] with RefAttributes[UploadRef[Any]]] = js.native
  
  @JSImport("antd/es/upload/Upload", "LIST_IGNORE")
  @js.native
  val LIST_IGNORE: String = js.native
  
  @js.native
  trait UploadRef[T] extends StObject {
    
    var fileList: js.Array[UploadFile[T]] = js.native
    
    var onBatchStart: js.UndefOr[js.Function1[/* fileList */ js.Array[File], Unit]] = js.native
    
    def onError(error: js.Error, response: Any, file: RcFile): Unit = js.native
    
    def onProgress(e: Percent, file: RcFile): Unit = js.native
    
    def onSuccess(response: Any, file: RcFile, xhr: Any): Unit = js.native
    
    var upload: web.typings.rcUpload.mod.default | Null = js.native
  }
  object UploadRef {
    
    @scala.inline
    def apply[T](
      fileList: js.Array[UploadFile[T]],
      onError: (js.Error, Any, RcFile) => Unit,
      onProgress: (Percent, RcFile) => Unit,
      onSuccess: (Any, RcFile, Any) => Unit
    ): UploadRef[T] = {
      val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any], onError = js.Any.fromFunction3(onError), onProgress = js.Any.fromFunction2(onProgress), onSuccess = js.Any.fromFunction3(onSuccess), upload = null)
      __obj.asInstanceOf[UploadRef[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: UploadRef[_], T] (val x: Self with UploadRef[T]) extends AnyVal {
      
      @scala.inline
      def setFileList(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListVarargs(value: UploadFile[T]*): Self = StObject.set(x, "fileList", js.Array(value :_*))
      
      @scala.inline
      def setOnBatchStart(value: /* fileList */ js.Array[File] => Unit): Self = StObject.set(x, "onBatchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBatchStartUndefined: Self = StObject.set(x, "onBatchStart", js.undefined)
      
      @scala.inline
      def setOnError(value: (js.Error, Any, RcFile) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnProgress(value: (Percent, RcFile) => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSuccess(value: (Any, RcFile, Any) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpload(value: web.typings.rcUpload.mod.default): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadNull: Self = StObject.set(x, "upload", null)
    }
  }
  
  type _To = ReactComponentClass[UploadProps[Any] with RefAttributes[UploadRef[Any]]]
  
  /* This means you don't have to write `default`, but can instead just say `esUploadUploadMod.foo` */
  override def _to: ReactComponentClass[UploadProps[Any] with RefAttributes[UploadRef[Any]]] = default
}
