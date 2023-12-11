package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to represent a value that can be an <angle> or <number> value. An SVGAngle reflected through the animVal attribute is always read only. */
@js.native
trait SVGAngle extends StObject {
  
  /* standard dom */
  val SVG_ANGLETYPE_DEG: Double = js.native
  
  /* standard dom */
  val SVG_ANGLETYPE_GRAD: Double = js.native
  
  /* standard dom */
  val SVG_ANGLETYPE_RAD: Double = js.native
  
  /* standard dom */
  val SVG_ANGLETYPE_UNKNOWN: Double = js.native
  
  /* standard dom */
  val SVG_ANGLETYPE_UNSPECIFIED: Double = js.native
  
  /* standard dom */
  def convertToSpecifiedUnits(unitType: Double): Unit = js.native
  
  /* standard dom */
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit = js.native
  
  /* standard dom */
  val unitType: Double = js.native
  
  /* standard dom */
  var value: Double = js.native
  
  /* standard dom */
  var valueAsString: java.lang.String = js.native
  
  /* standard dom */
  var valueInSpecifiedUnits: Double = js.native
}
object SVGAngle {
  
  @scala.inline
  def apply(
    SVG_ANGLETYPE_DEG: Double,
    SVG_ANGLETYPE_GRAD: Double,
    SVG_ANGLETYPE_RAD: Double,
    SVG_ANGLETYPE_UNKNOWN: Double,
    SVG_ANGLETYPE_UNSPECIFIED: Double,
    convertToSpecifiedUnits: Double => Unit,
    newValueSpecifiedUnits: (Double, Double) => Unit,
    unitType: Double,
    value: Double,
    valueAsString: java.lang.String,
    valueInSpecifiedUnits: Double
  ): SVGAngle = {
    val __obj = js.Dynamic.literal(SVG_ANGLETYPE_DEG = SVG_ANGLETYPE_DEG.asInstanceOf[js.Any], SVG_ANGLETYPE_GRAD = SVG_ANGLETYPE_GRAD.asInstanceOf[js.Any], SVG_ANGLETYPE_RAD = SVG_ANGLETYPE_RAD.asInstanceOf[js.Any], SVG_ANGLETYPE_UNKNOWN = SVG_ANGLETYPE_UNKNOWN.asInstanceOf[js.Any], SVG_ANGLETYPE_UNSPECIFIED = SVG_ANGLETYPE_UNSPECIFIED.asInstanceOf[js.Any], convertToSpecifiedUnits = js.Any.fromFunction1(convertToSpecifiedUnits), newValueSpecifiedUnits = js.Any.fromFunction2(newValueSpecifiedUnits), unitType = unitType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any], valueInSpecifiedUnits = valueInSpecifiedUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAngle]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SVGAngle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvertToSpecifiedUnits(value: Double => Unit): Self = StObject.set(x, "convertToSpecifiedUnits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewValueSpecifiedUnits(value: (Double, Double) => Unit): Self = StObject.set(x, "newValueSpecifiedUnits", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSVG_ANGLETYPE_DEG(value: Double): Self = StObject.set(x, "SVG_ANGLETYPE_DEG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_ANGLETYPE_GRAD(value: Double): Self = StObject.set(x, "SVG_ANGLETYPE_GRAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_ANGLETYPE_RAD(value: Double): Self = StObject.set(x, "SVG_ANGLETYPE_RAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_ANGLETYPE_UNKNOWN(value: Double): Self = StObject.set(x, "SVG_ANGLETYPE_UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVG_ANGLETYPE_UNSPECIFIED(value: Double): Self = StObject.set(x, "SVG_ANGLETYPE_UNSPECIFIED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitType(value: Double): Self = StObject.set(x, "unitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAsString(value: java.lang.String): Self = StObject.set(x, "valueAsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueInSpecifiedUnits(value: Double): Self = StObject.set(x, "valueInSpecifiedUnits", value.asInstanceOf[js.Any])
  }
}
