package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of type SVGLengthList which can be animated. */
@js.native
trait SVGAnimatedLengthList extends StObject {
  
  /* standard dom */
  val animVal: org.scalajs.dom.SVGLengthList = js.native
  
  /* standard dom */
  val baseVal: org.scalajs.dom.SVGLengthList = js.native
}
object SVGAnimatedLengthList {
  
  @scala.inline
  def apply(animVal: org.scalajs.dom.SVGLengthList, baseVal: org.scalajs.dom.SVGLengthList): SVGAnimatedLengthList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLengthList]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SVGAnimatedLengthList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: org.scalajs.dom.SVGLengthList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.SVGLengthList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
