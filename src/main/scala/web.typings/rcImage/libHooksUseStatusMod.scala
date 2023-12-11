package web.typings.rcImage

import web.typings.rcImage.anon.Fallback
import web.typings.rcImage.anon.OnLoad
import web.typings.rcImage.anon.Src
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseStatusMod {
  
  @JSImport("rc-image/lib/hooks/useStatus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: Fallback): js.Tuple3[
    js.Function1[/* img */ js.UndefOr[HTMLImageElement], Unit], 
    OnLoad | Src, 
    ImageStatus
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    js.Function1[/* img */ js.UndefOr[HTMLImageElement], Unit], 
    OnLoad | Src, 
    ImageStatus
  ]]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcImage.rcImageStrings.normal
    - `web.typings`.rcImage.rcImageStrings.error
    - `web.typings`.rcImage.rcImageStrings.loading
  */
  trait ImageStatus extends StObject
  object ImageStatus {
    
    @scala.inline
    def error: web.typings.rcImage.rcImageStrings.error = "error".asInstanceOf[web.typings.rcImage.rcImageStrings.error]
    
    @scala.inline
    def loading: web.typings.rcImage.rcImageStrings.loading = "loading".asInstanceOf[web.typings.rcImage.rcImageStrings.loading]
    
    @scala.inline
    def normal: web.typings.rcImage.rcImageStrings.normal = "normal".asInstanceOf[web.typings.rcImage.rcImageStrings.normal]
  }
}
