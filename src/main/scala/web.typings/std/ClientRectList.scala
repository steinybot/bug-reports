package web.typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRectList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[ClientRect] {
  
  /* standard dom */
  def item(index: Double): ClientRect = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[ClientRect]] = js.native
  
  /* standard dom */
  val length: Double = js.native
}
