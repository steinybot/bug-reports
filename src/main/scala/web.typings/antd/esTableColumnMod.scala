package web.typings.antd

import web.typings.antd.esTableInterfaceMod.ColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableColumnMod {
  
  @JSImport("antd/es/table/Column", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** This is a syntactic sugar for `columns` prop. So HOC will not work on this. */
  @scala.inline
  def default[RecordType](_underscore: ColumnProps[RecordType]): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @js.native
  trait ColumnProps[RecordType]
    extends StObject
       with ColumnType[RecordType] {
    
    var children: js.UndefOr[Null] = js.native
  }
  object ColumnProps {
    
    @scala.inline
    def apply[RecordType](): ColumnProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnProps[RecordType]]
    }
  }
}
