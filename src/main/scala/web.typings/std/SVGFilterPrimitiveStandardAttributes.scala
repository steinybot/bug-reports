package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGFilterPrimitiveStandardAttributes extends StObject {
  
  /* standard dom */
  val height: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val result: org.scalajs.dom.SVGAnimatedString = js.native
  
  /* standard dom */
  val width: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val x: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val y: org.scalajs.dom.SVGAnimatedLength = js.native
}
object SVGFilterPrimitiveStandardAttributes {
  
  @scala.inline
  def apply(
    height: org.scalajs.dom.SVGAnimatedLength,
    result: org.scalajs.dom.SVGAnimatedString,
    width: org.scalajs.dom.SVGAnimatedLength,
    x: org.scalajs.dom.SVGAnimatedLength,
    y: org.scalajs.dom.SVGAnimatedLength
  ): SVGFilterPrimitiveStandardAttributes = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFilterPrimitiveStandardAttributes]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SVGFilterPrimitiveStandardAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: org.scalajs.dom.SVGAnimatedLength): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: org.scalajs.dom.SVGAnimatedString): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: org.scalajs.dom.SVGAnimatedLength): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: org.scalajs.dom.SVGAnimatedLength): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: org.scalajs.dom.SVGAnimatedLength): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
