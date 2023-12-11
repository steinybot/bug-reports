package web.typings.std.global

import web.typings.std.ArrayLike
import web.typings.std.Float64ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Float64Array")
@js.native
class Float64Array protected ()
  extends StObject
     with web.typings.std.Float64Array {
  /* standard es5 */
  def this(array: ArrayLike[Double]) = this()
  /* standard es5 */
  def this(array: js.typedarray.ArrayBuffer) = this()
  /* standard es2015.iterable */
  def this(elements: js.Iterable[Double]) = this()
  /* standard es5 */
  def this(length: Double) = this()
  def this(buffer: js.typedarray.ArrayBuffer, byteOffset: Double) = this()
  def this(buffer: js.typedarray.ArrayBuffer, byteOffset: Double, length: Double) = this()
  def this(buffer: js.typedarray.ArrayBuffer, byteOffset: Unit, length: Double) = this()
}
object Float64Array {
  
  @scala.inline
  def apply: Float64ArrayConstructor = js.Dynamic.global.selectDynamic("Float64Array").asInstanceOf[Float64ArrayConstructor]
}
