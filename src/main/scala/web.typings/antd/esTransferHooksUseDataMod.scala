package web.typings.antd

import web.typings.antd.esTransferMod.KeyWise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTransferHooksUseDataMod {
  
  @JSImport("antd/es/transfer/hooks/useData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType /* <: js.Object */](): js.Array[js.Array[KeyWise[RecordType]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[js.Array[KeyWise[RecordType]]]]
  @scala.inline
  def default[RecordType /* <: js.Object */](dataSource: js.Array[RecordType]): js.Array[js.Array[KeyWise[RecordType]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dataSource.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[KeyWise[RecordType]]]]
  @scala.inline
  def default[RecordType /* <: js.Object */](
    dataSource: js.Array[RecordType],
    rowKey: js.UndefOr[js.Function1[/* record */ RecordType, String]]
  ): js.Array[js.Array[KeyWise[RecordType]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dataSource.asInstanceOf[js.Any], rowKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[KeyWise[RecordType]]]]
  @scala.inline
  def default[RecordType /* <: js.Object */](
    dataSource: js.Array[RecordType],
    rowKey: js.UndefOr[js.Function1[/* record */ RecordType, String]],
    targetKeys: js.Array[String]
  ): js.Array[js.Array[KeyWise[RecordType]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dataSource.asInstanceOf[js.Any], rowKey.asInstanceOf[js.Any], targetKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[KeyWise[RecordType]]]]
  @scala.inline
  def default[RecordType /* <: js.Object */](dataSource: js.Array[RecordType], rowKey: Unit, targetKeys: js.Array[String]): js.Array[js.Array[KeyWise[RecordType]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dataSource.asInstanceOf[js.Any], rowKey.asInstanceOf[js.Any], targetKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[KeyWise[RecordType]]]]
  @scala.inline
  def default[RecordType /* <: js.Object */](dataSource: Unit, rowKey: js.UndefOr[js.Function1[/* record */ RecordType, String]]): js.Array[js.Array[KeyWise[RecordType]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dataSource.asInstanceOf[js.Any], rowKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[KeyWise[RecordType]]]]
  @scala.inline
  def default[RecordType /* <: js.Object */](
    dataSource: Unit,
    rowKey: js.UndefOr[js.Function1[/* record */ RecordType, String]],
    targetKeys: js.Array[String]
  ): js.Array[js.Array[KeyWise[RecordType]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dataSource.asInstanceOf[js.Any], rowKey.asInstanceOf[js.Any], targetKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[KeyWise[RecordType]]]]
  @scala.inline
  def default[RecordType /* <: js.Object */](dataSource: Unit, rowKey: Unit, targetKeys: js.Array[String]): js.Array[js.Array[KeyWise[RecordType]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dataSource.asInstanceOf[js.Any], rowKey.asInstanceOf[js.Any], targetKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[KeyWise[RecordType]]]]
}
