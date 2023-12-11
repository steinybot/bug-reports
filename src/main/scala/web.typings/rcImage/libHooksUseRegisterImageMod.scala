package web.typings.rcImage

import web.typings.rcImage.libInterfaceMod.ImageElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseRegisterImageMod {
  
  @JSImport("rc-image/lib/hooks/useRegisterImage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(canPreview: Boolean, data: ImageElementProps): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(canPreview.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
}
