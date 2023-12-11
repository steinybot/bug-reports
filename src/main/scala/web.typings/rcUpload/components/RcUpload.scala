package web.typings.rcUpload.components

import web.typings.rcUpload.esInterfaceMod.UploadProps
import web.typings.rcUpload.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcUpload {
  
  @JSImport("rc-upload", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = UploadProps
  
  implicit def make(companion: RcUpload.type): SharedBuilder_UploadProps_119302209[default] = new SharedBuilder_UploadProps_119302209[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: UploadProps): SharedBuilder_UploadProps_119302209[default] = new SharedBuilder_UploadProps_119302209[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
