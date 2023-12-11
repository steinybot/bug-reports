package web.typings.antd

import web.typings.antd.anon.ReadonlyUploadFileany
import web.typings.antd.esUploadInterfaceMod.InternalUploadFile
import web.typings.antd.esUploadInterfaceMod.RcFile
import web.typings.antd.esUploadInterfaceMod.UploadFile
import org.scalajs.dom.Blob
import org.scalajs.dom.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUploadUtilsMod {
  
  @JSImport("antd/es/upload/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def file2Obj(file: RcFile): InternalUploadFile[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("file2Obj")(file.asInstanceOf[js.Any]).asInstanceOf[InternalUploadFile[Any]]
  
  @scala.inline
  def getFileItem(file: RcFile, fileList: js.Array[UploadFile[Any] | ReadonlyUploadFileany]): UploadFile[Any] | ReadonlyUploadFileany = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileItem")(file.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[UploadFile[Any] | ReadonlyUploadFileany]
  
  @scala.inline
  def isImageUrl(file: UploadFile[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImageUrl")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def previewImage(file: Blob): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def previewImage(file: File): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def removeFileItem(file: UploadFile[Any], fileList: js.Array[UploadFile[Any] | ReadonlyUploadFileany]): (js.Array[UploadFile[Any] | ReadonlyUploadFileany]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFileItem")(file.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[(js.Array[UploadFile[Any] | ReadonlyUploadFileany]) | Null]
  
  @scala.inline
  def updateFileList(file: UploadFile[Any], fileList: js.Array[UploadFile[Any] | ReadonlyUploadFileany]): js.Array[UploadFile[Any] | ReadonlyUploadFileany] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFileList")(file.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Array[UploadFile[Any] | ReadonlyUploadFileany]]
}
