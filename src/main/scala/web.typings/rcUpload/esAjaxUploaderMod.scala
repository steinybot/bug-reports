package web.typings.rcUpload

import web.typings.rcUpload.anon.Uid
import web.typings.rcUpload.esInterfaceMod.RcFile
import web.typings.rcUpload.esInterfaceMod.UploadProps
import web.typings.react.mod.ChangeEvent
import web.typings.react.mod.Component
import web.typings.react.mod.DragEvent
import web.typings.std.Record
import org.scalajs.dom.File
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAjaxUploaderMod {
  
  @JSImport("rc-upload/es/AjaxUploader", JSImport.Default)
  @js.native
  class default () extends AjaxUploader
  
  @js.native
  trait AjaxUploader
    extends Component[UploadProps, js.Object, Any] {
    
    /* private */ var _isMounted: Any = js.native
    
    def abort(): Unit = js.native
    def abort(file: Any): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAjaxUploader(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAjaxUploader(): Unit = js.native
    
    /* private */ var fileInput: Any = js.native
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onClick(e: SyntheticKeyboardEvent[HTMLDivElement]): Unit = js.native
    def onClick(e: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
    
    def onFileDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onKeyDown(e: SyntheticKeyboardEvent[HTMLDivElement]): Unit = js.native
    
    def post(param0: ParsedFileInfo): Unit = js.native
    
    /**
      * Process file before upload. When all the file is ready, we start upload.
      */
    def processFile(file: RcFile, fileList: js.Array[RcFile]): js.Promise[ParsedFileInfo] = js.native
    
    var reqs: Any = js.native
    
    def reset(): Unit = js.native
    
    def saveFileInput(node: HTMLInputElement): Unit = js.native
    
    @JSName("state")
    var state_AjaxUploader: Uid = js.native
    
    def uploadFiles(files: js.Array[File]): Unit = js.native
  }
  
  @js.native
  trait ParsedFileInfo extends StObject {
    
    var action: String = js.native
    
    var data: Record[String, Any] = js.native
    
    var origin: RcFile = js.native
    
    var parsedFile: RcFile = js.native
  }
  object ParsedFileInfo {
    
    @scala.inline
    def apply(action: String, data: Record[String, Any], origin: RcFile, parsedFile: RcFile): ParsedFileInfo = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], parsedFile = parsedFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedFileInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ParsedFileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: RcFile): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedFile(value: RcFile): Self = StObject.set(x, "parsedFile", value.asInstanceOf[js.Any])
    }
  }
}
