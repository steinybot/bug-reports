package web.typings.std.global

import web.typings.std.ArrayLike
import web.typings.std.Uint32ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Uint32Array")
@js.native
class Uint32Array protected ()
  extends StObject
     with web.typings.std.Uint32Array {
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
object Uint32Array {
  
  @scala.inline
  def apply: Uint32ArrayConstructor = js.Dynamic.global.selectDynamic("Uint32Array").asInstanceOf[Uint32ArrayConstructor]
}
