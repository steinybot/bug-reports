package web.typings.antd

import web.typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilTransKeysMod {
  
  @JSImport("antd/es/_util/transKeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def groupDisabledKeysMap[RecordType /* <: js.Array[Any] */](dataSource: RecordType): Map[String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupDisabledKeysMap")(dataSource.asInstanceOf[js.Any]).asInstanceOf[Map[String, Double]]
  
  @scala.inline
  def groupKeysMap(keys: js.Array[String]): Map[String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupKeysMap")(keys.asInstanceOf[js.Any]).asInstanceOf[Map[String, Double]]
}
