package web.typings.antd

import web.typings.antd.anon.Flush
import web.typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeUtilStatisticMod {
  
  @JSImport("antd/es/theme/util/statistic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T /* <: js.Object */](token: T): Flush[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(token.asInstanceOf[js.Any]).asInstanceOf[Flush[T]]
  
  @scala.inline
  def merge[T /* <: js.Object */](objs: Partial[T]*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(objs.asInstanceOf[Seq[js.Any]] :_*)).asInstanceOf[T]
}
