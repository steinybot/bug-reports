package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of type SVGPreserveAspectRatio which can be animated. */
@js.native
trait SVGAnimatedPreserveAspectRatio extends StObject {
  
  /* standard dom */
  val animVal: org.scalajs.dom.SVGPreserveAspectRatio = js.native
  
  /* standard dom */
  val baseVal: org.scalajs.dom.SVGPreserveAspectRatio = js.native
}
object SVGAnimatedPreserveAspectRatio {
  
  @scala.inline
  def apply(animVal: org.scalajs.dom.SVGPreserveAspectRatio, baseVal: org.scalajs.dom.SVGPreserveAspectRatio): SVGAnimatedPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPreserveAspectRatio]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SVGAnimatedPreserveAspectRatio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: org.scalajs.dom.SVGPreserveAspectRatio): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.SVGPreserveAspectRatio): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
