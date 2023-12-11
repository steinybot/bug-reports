package web.typings.antd

import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilExtendsObjectMod {
  
  @JSImport("antd/es/_util/extendsObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T /* <: RecordType */](list: T*): RecordType = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[Seq[js.Any]] :_*)).asInstanceOf[RecordType]
  
  type RecordType = Record[String, Any]
}
