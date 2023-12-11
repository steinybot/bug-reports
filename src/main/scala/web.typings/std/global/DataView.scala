package web.typings.std.global

import web.typings.std.DataViewConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DataView")
@js.native
class DataView protected ()
  extends StObject
     with web.typings.std.DataView {
  /* standard es5 */
  def this(buffer: js.typedarray.ArrayBuffer) = this()
  def this(buffer: js.typedarray.ArrayBuffer, byteOffset: Double) = this()
  def this(buffer: js.typedarray.ArrayBuffer, byteOffset: Double, byteLength: Double) = this()
  def this(buffer: js.typedarray.ArrayBuffer, byteOffset: Unit, byteLength: Double) = this()
}
object DataView {
  
  @scala.inline
  def apply: DataViewConstructor = js.Dynamic.global.selectDynamic("DataView").asInstanceOf[DataViewConstructor]
}
