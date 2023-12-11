package web.typings.rcUtil

import web.typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOmitMod {
  
  @JSImport("rc-util/es/omit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, fields: js.Array[K]): Omit[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Omit[T, K]]
}
