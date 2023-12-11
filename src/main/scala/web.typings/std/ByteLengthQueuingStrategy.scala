package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
@js.native
trait ByteLengthQueuingStrategy
  extends StObject
     with QueuingStrategy[js.typedarray.ArrayBufferView] {
  
  /* standard dom */
  @JSName("highWaterMark")
  val highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  
  /* standard dom */
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: js.typedarray.ArrayBufferView): Double = js.native
}
object ByteLengthQueuingStrategy {
  
  @scala.inline
  def apply(highWaterMark: Double, size: js.typedarray.ArrayBufferView => Double): ByteLengthQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[ByteLengthQueuingStrategy]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ByteLengthQueuingStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.typedarray.ArrayBufferView => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
  }
}
