package web.typings.std.global

import web.typings.std.ObjectConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Object")
@js.native
/* standard es5 */
class Object ()
  extends StObject
     with web.typings.std.Object {
  def this(value: Any) = this()
}
object Object {
  
  /**
    * Provides functionality common to all JavaScript objects.
    */
  @scala.inline
  def apply: ObjectConstructor = js.Dynamic.global.selectDynamic("Object").asInstanceOf[ObjectConstructor]
}
