package web.typings.std.global

import web.typings.std.QueuingStrategy
import web.typings.std.UnderlyingSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ReadableStream")
@js.native
/* standard dom */
class ReadableStream[R] ()
  extends StObject
     with web.typings.std.ReadableStream[R] {
  def this(underlyingSource: UnderlyingSource[R]) = this()
  def this(underlyingSource: UnderlyingSource[R], strategy: QueuingStrategy[R]) = this()
  def this(underlyingSource: Unit, strategy: QueuingStrategy[R]) = this()
}
