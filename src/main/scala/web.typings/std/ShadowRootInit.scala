package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowRootInit extends StObject {
  
  /* standard dom */
  var delegatesFocus: js.UndefOr[scala.Boolean] = js.native
  
  /* standard dom */
  var mode: ShadowRootMode = js.native
}
object ShadowRootInit {
  
  @scala.inline
  def apply(mode: ShadowRootMode): ShadowRootInit = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ShadowRootInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegatesFocus(value: scala.Boolean): Self = StObject.set(x, "delegatesFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatesFocusUndefined: Self = StObject.set(x, "delegatesFocus", js.undefined)
    
    @scala.inline
    def setMode(value: ShadowRootMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
