package web.typings.std.global

import web.typings.std.TypeErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TypeError")
@js.native
/* standard es5 */
class TypeError ()
  extends StObject
     with web.typings.std.Error {
  def this(message: java.lang.String) = this()
}
object TypeError {
  
  @scala.inline
  def apply: TypeErrorConstructor = js.Dynamic.global.selectDynamic("TypeError").asInstanceOf[TypeErrorConstructor]
}
