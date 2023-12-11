package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of basic type <length> which can be animated. */
@js.native
trait SVGAnimatedLength extends StObject {
  
  /* standard dom */
  val animVal: org.scalajs.dom.SVGLength = js.native
  
  /* standard dom */
  val baseVal: org.scalajs.dom.SVGLength = js.native
}
object SVGAnimatedLength {
  
  @scala.inline
  def apply(animVal: org.scalajs.dom.SVGLength, baseVal: org.scalajs.dom.SVGLength): SVGAnimatedLength = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLength]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SVGAnimatedLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: org.scalajs.dom.SVGLength): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.SVGLength): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
