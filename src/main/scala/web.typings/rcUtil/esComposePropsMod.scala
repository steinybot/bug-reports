package web.typings.rcUtil

import web.typings.std.Partial
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComposePropsMod {
  
  @JSImport("rc-util/es/composeProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T /* <: Record[String, Any] */](originProps: T, patchProps: Partial[T]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(originProps.asInstanceOf[js.Any], patchProps.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  @scala.inline
  def default[T /* <: Record[String, Any] */](originProps: T, patchProps: Partial[T], isAll: Boolean): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(originProps.asInstanceOf[js.Any], patchProps.asInstanceOf[js.Any], isAll.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
}
