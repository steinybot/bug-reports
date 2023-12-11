package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method. */
@js.native
trait TextMetrics extends StObject {
  
  /**
    * Returns the measurement described below.
    */
  /* standard dom */
  val actualBoundingBoxAscent: Double = js.native
  
  /**
    * Returns the measurement described below.
    */
  /* standard dom */
  val actualBoundingBoxDescent: Double = js.native
  
  /**
    * Returns the measurement described below.
    */
  /* standard dom */
  val actualBoundingBoxLeft: Double = js.native
  
  /**
    * Returns the measurement described below.
    */
  /* standard dom */
  val actualBoundingBoxRight: Double = js.native
  
  /**
    * Returns the measurement described below.
    */
  /* standard dom */
  val width: Double = js.native
}
object TextMetrics {
  
  @scala.inline
  def apply(
    actualBoundingBoxAscent: Double,
    actualBoundingBoxDescent: Double,
    actualBoundingBoxLeft: Double,
    actualBoundingBoxRight: Double,
    width: Double
  ): TextMetrics = {
    val __obj = js.Dynamic.literal(actualBoundingBoxAscent = actualBoundingBoxAscent.asInstanceOf[js.Any], actualBoundingBoxDescent = actualBoundingBoxDescent.asInstanceOf[js.Any], actualBoundingBoxLeft = actualBoundingBoxLeft.asInstanceOf[js.Any], actualBoundingBoxRight = actualBoundingBoxRight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetrics]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: TextMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualBoundingBoxAscent(value: Double): Self = StObject.set(x, "actualBoundingBoxAscent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualBoundingBoxDescent(value: Double): Self = StObject.set(x, "actualBoundingBoxDescent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualBoundingBoxLeft(value: Double): Self = StObject.set(x, "actualBoundingBoxLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualBoundingBoxRight(value: Double): Self = StObject.set(x, "actualBoundingBoxRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
