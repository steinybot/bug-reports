package web.typings.rcUpload

import web.typings.rcUpload.anon.RcFilewebkitRelativePaths
import web.typings.std.DataTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTraverseFileTreeMod {
  
  @JSImport("rc-upload/es/traverseFileTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(files: js.Array[InternalDataTransferItem], callback: Any, isAccepted: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], isAccepted.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait InternalDataTransferItem
    extends StObject
       with DataTransferItem {
    
    def createReader(): Any = js.native
    
    def file(cd: js.Function1[/* file */ RcFilewebkitRelativePaths, Unit]): Unit = js.native
    
    var fullPath: String = js.native
    
    var isDirectory: Boolean = js.native
    
    var isFile: Boolean = js.native
    
    var name: String = js.native
    
    var path: String = js.native
  }
}
