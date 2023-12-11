package web.typings.std.global

import web.typings.std.EnumeratorConstructor
import web.typings.std.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Enumerator")
@js.native
class Enumerator[T] protected ()
  extends StObject
     with web.typings.std.Enumerator[T] {
  /* standard scripthost */
  def this(collection: Item[T]) = this()
  /* standard scripthost */
  def this(collection: Any) = this()
  /* standard scripthost */
  def this(safearray: web.typings.std.SafeArray[T]) = this()
}
object Enumerator {
  
  @scala.inline
  def apply: EnumeratorConstructor = js.Dynamic.global.selectDynamic("Enumerator").asInstanceOf[EnumeratorConstructor]
}
