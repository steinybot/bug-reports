package web.typings.rcImage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMod {
  
  @JSImport("rc-image/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isImageValid(src: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isImageValid")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
