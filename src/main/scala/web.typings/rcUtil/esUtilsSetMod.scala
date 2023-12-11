package web.typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsSetMod {
  
  @JSImport("rc-util/es/utils/set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Entity, Output, Value](entity: Entity, paths: Path, value: Value): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(entity.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Output]
  @scala.inline
  def default[Entity, Output, Value](entity: Entity, paths: Path, value: Value, removeIfUndefined: Boolean): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(entity.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], value.asInstanceOf[js.Any], removeIfUndefined.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  @scala.inline
  def merge[T /* <: js.Object */](sources: T*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(sources.asInstanceOf[Seq[js.Any]] :_*)).asInstanceOf[T]
  
  type Path = js.Array[String | Double | js.Symbol]
}
