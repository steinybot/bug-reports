package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGElementInstanceList extends StObject {
  
  /** @deprecated */
  /* standard dom */
  def item(index: Double): org.scalajs.dom.SVGElementInstance = js.native
  
  /** @deprecated */
  /* standard dom */
  val length: Double = js.native
}
object SVGElementInstanceList {
  
  @scala.inline
  def apply(item: Double => org.scalajs.dom.SVGElementInstance, length: Double): SVGElementInstanceList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGElementInstanceList]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SVGElementInstanceList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: Double => org.scalajs.dom.SVGElementInstance): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
