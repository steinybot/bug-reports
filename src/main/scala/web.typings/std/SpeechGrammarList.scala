package web.typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechGrammarList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[SpeechGrammar] {
  
  /* standard dom */
  def addFromString(string: java.lang.String): Unit = js.native
  def addFromString(string: java.lang.String, weight: Double): Unit = js.native
  
  /* standard dom */
  def addFromURI(src: java.lang.String): Unit = js.native
  def addFromURI(src: java.lang.String, weight: Double): Unit = js.native
  
  /* standard dom */
  def item(index: Double): SpeechGrammar = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechGrammar]] = js.native
  
  /* standard dom */
  val length: Double = js.native
}
