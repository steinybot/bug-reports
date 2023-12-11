package web.typings.antd

import web.typings.antd.esTableInterfaceMod.ColumnTitleProps
import web.typings.antd.esTableInterfaceMod.TransformColumns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableHooksUseTitleColumnsMod {
  
  @JSImport("antd/es/table/hooks/useTitleColumns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](columnTitleProps: ColumnTitleProps[RecordType]): js.Array[TransformColumns[RecordType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(columnTitleProps.asInstanceOf[js.Any]).asInstanceOf[js.Array[TransformColumns[RecordType]]]
}
