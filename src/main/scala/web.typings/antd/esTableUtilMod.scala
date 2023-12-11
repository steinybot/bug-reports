package web.typings.antd

import web.typings.antd.esTableInterfaceMod.ColumnTitle
import web.typings.antd.esTableInterfaceMod.ColumnTitleProps
import web.typings.antd.esTableInterfaceMod.ColumnType
import web.typings.antd.esTableInterfaceMod.Key
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableUtilMod {
  
  @JSImport("antd/es/table/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getColumnKey[RecordType](column: ColumnType[RecordType], defaultKey: String): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumnKey")(column.asInstanceOf[js.Any], defaultKey.asInstanceOf[js.Any])).asInstanceOf[Key]
  
  @scala.inline
  def getColumnPos(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getColumnPos")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getColumnPos(index: Double, pos: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumnPos")(index.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def renderColumnTitle[RecordType](title: ColumnTitle[RecordType], props: ColumnTitleProps[RecordType]): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("renderColumnTitle")(title.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  @scala.inline
  def safeColumnTitle[RecordType](title: ColumnTitle[RecordType], props: ColumnTitleProps[RecordType]): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("safeColumnTitle")(title.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
}
