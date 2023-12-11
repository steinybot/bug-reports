package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGURIReference extends StObject {
  
  /* standard dom */
  val href: org.scalajs.dom.SVGAnimatedString = js.native
}
object SVGURIReference {
  
  @scala.inline
  def apply(href: org.scalajs.dom.SVGAnimatedString): SVGURIReference = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGURIReference]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SVGURIReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: org.scalajs.dom.SVGAnimatedString): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}
