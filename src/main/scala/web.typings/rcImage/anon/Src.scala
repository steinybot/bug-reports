package web.typings.rcImage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Src extends StObject {
  
  def onLoad(): Unit = js.native
  
  var src: String = js.native
}
object Src {
  
  @scala.inline
  def apply(onLoad: () => Unit, src: String): Src = {
    val __obj = js.Dynamic.literal(onLoad = js.Any.fromFunction0(onLoad), src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Src]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Src] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
