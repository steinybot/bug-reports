package web.typings.rcUtil

import web.typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRafMod {
  
  object default {
    
    @scala.inline
    def apply(callback: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def apply(callback: js.Function0[Unit], times: Double): Double = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("rc-util/es/raf", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def cancel(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def ids(): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("ids")().asInstanceOf[Map[Double, Double]]
  }
}
