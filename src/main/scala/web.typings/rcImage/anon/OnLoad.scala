package web.typings.rcImage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnLoad extends StObject {
  
  var onLoad: Unit = js.native
  
  var src: String = js.native
}
object OnLoad {
  
  @scala.inline
  def apply(onLoad: Unit, src: String): OnLoad = {
    val __obj = js.Dynamic.literal(onLoad = onLoad.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLoad]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OnLoad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnLoad(value: Unit): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
