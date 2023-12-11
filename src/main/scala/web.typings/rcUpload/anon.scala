package web.typings.rcUpload

import web.typings.rcUpload.esInterfaceMod.BeforeUploadFileType
import web.typings.rcUpload.esInterfaceMod.RcFile
import web.typings.std.Exclude
import org.scalajs.dom.Blob
import org.scalajs.dom.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Abort extends StObject {
    
    def abort(): Unit = js.native
  }
  object Abort {
    
    @scala.inline
    def apply(abort: () => Unit): Abort = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
      __obj.asInstanceOf[Abort]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Abort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait File extends StObject {
    
    var file: RcFile = js.native
    
    var parsedFile: Exclude[BeforeUploadFileType, Boolean] = js.native
  }
  object File {
    
    @scala.inline
    def apply(file: RcFile, parsedFile: Exclude[BeforeUploadFileType, Boolean]): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], parsedFile = parsedFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: RcFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedFile(value: Exclude[BeforeUploadFileType, Boolean]): Self = StObject.set(x, "parsedFile", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined rc-upload.rc-upload/es/interface.RcFile & {  webkitRelativePath :string | undefined} */
  @js.native
  trait RcFilewebkitRelativePaths extends StObject {
    
    /* standard dom */
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* standard dom */
    val lastModified: Double = js.native
    
    /* standard dom */
    val name: String = js.native
    
    /* standard dom */
    val size: Double = js.native
    
    /* standard dom */
    def slice(): Blob = js.native
    def slice(start: Double): Blob = js.native
    def slice(start: Double, end: Double): Blob = js.native
    def slice(start: Double, end: Double, contentType: String): Blob = js.native
    def slice(start: Double, end: Unit, contentType: String): Blob = js.native
    def slice(start: Unit, end: Double): Blob = js.native
    def slice(start: Unit, end: Double, contentType: String): Blob = js.native
    def slice(start: Unit, end: Unit, contentType: String): Blob = js.native
    
    /* standard dom */
    def stream(): ReadableStream[Any] = js.native
    
    /* standard dom */
    def text(): js.Promise[String] = js.native
    
    /* standard dom */
    val `type`: String = js.native
    
    var uid: String = js.native
    
    var webkitRelativePath: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait Uid extends StObject {
    
    var uid: String = js.native
  }
  object Uid {
    
    @scala.inline
    def apply(uid: String): Uid = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uid]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Uid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
