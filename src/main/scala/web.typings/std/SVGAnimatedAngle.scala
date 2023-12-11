package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of basic type <angle> which can be animated. */
@js.native
trait SVGAnimatedAngle extends StObject {
  
  /* standard dom */
  val animVal: org.scalajs.dom.SVGAngle = js.native
  
  /* standard dom */
  val baseVal: org.scalajs.dom.SVGAngle = js.native
}
object SVGAnimatedAngle {
  
  @scala.inline
  def apply(animVal: org.scalajs.dom.SVGAngle, baseVal: org.scalajs.dom.SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SVGAnimatedAngle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: org.scalajs.dom.SVGAngle): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.SVGAngle): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
