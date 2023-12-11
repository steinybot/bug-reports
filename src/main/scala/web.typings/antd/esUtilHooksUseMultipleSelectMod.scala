package web.typings.antd

import web.typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilHooksUseMultipleSelectMod {
  
  @JSImport("antd/es/_util/hooks/useMultipleSelect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T, K](getKey: js.Function1[/* item */ T, K]): js.Tuple2[
    js.Function3[
      /* currentSelectedIndex */ Double, 
      /* data */ js.Array[T], 
      /* selectedKeys */ Set[K], 
      js.Array[K]
    ], 
    js.Function1[/* val */ PrevSelectedIndex, Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(getKey.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.Function3[
      /* currentSelectedIndex */ Double, 
      /* data */ js.Array[T], 
      /* selectedKeys */ Set[K], 
      js.Array[K]
    ], 
    js.Function1[/* val */ PrevSelectedIndex, Unit]
  ]]
  
  type PrevSelectedIndex = Null | Double
}
