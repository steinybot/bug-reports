package web.typings.rcImage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fallback extends StObject {
  
  var fallback: js.UndefOr[String] = js.native
  
  var isCustomPlaceholder: js.UndefOr[Boolean] = js.native
  
  var src: String = js.native
}
object Fallback {
  
  @scala.inline
  def apply(src: String): Fallback = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fallback]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Fallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    @scala.inline
    def setIsCustomPlaceholder(value: Boolean): Self = StObject.set(x, "isCustomPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomPlaceholderUndefined: Self = StObject.set(x, "isCustomPlaceholder", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
