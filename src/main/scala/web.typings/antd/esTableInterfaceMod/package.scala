package web.typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esTableInterfaceMod {
  
  type ColumnTitle[RecordType] = slinky.core.facade.ReactElement | (js.Function1[
    /* props */ web.typings.antd.esTableInterfaceMod.ColumnTitleProps[RecordType], 
    slinky.core.facade.ReactElement
  ])
  
  type ColumnsType[RecordType] = js.Array[
    web.typings.antd.esTableInterfaceMod.ColumnGroupType[RecordType] | web.typings.antd.esTableInterfaceMod.ColumnType[RecordType]
  ]
  
  type CompareFn[T] = js.Function3[
    /* a */ T, 
    /* b */ T, 
    /* sortOrder */ js.UndefOr[web.typings.antd.esTableInterfaceMod.SortOrder], 
    scala.Double
  ]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - `web.typings`.antd.antdStrings.row
    - `web.typings`.antd.antdStrings.nest
  */
  type ExpandType = web.typings.antd.esTableInterfaceMod._ExpandType | scala.Null
  
  type FilterKey = (js.Array[java.lang.String | scala.Double]) | scala.Null
  
  type FilterSearchType[RecordType] = scala.Boolean | (js.Function2[/* input */ java.lang.String, /* record */ RecordType, scala.Boolean])
  
  type FilterValue = js.Array[web.typings.antd.esTableInterfaceMod.Key | scala.Boolean]
  
  type GetPopupContainer = js.Function1[/* triggerNode */ org.scalajs.dom.HTMLElement, org.scalajs.dom.HTMLElement]
  
  type Key = web.typings.react.mod.Key
  
  type RefInternalTable = js.Function1[
    /* props */ (web.typings.react.mod.PropsWithChildren[
      web.typings.antd.esTableInternalTableMod.InternalTableProps[web.typings.antd.esUtilTypeMod.AnyObject]
    ]) with web.typings.antd.anon.`7`, 
    slinky.core.facade.ReactElement
  ]
  
  type RefTable = js.Function1[
    /* props */ (web.typings.react.mod.PropsWithChildren[
      web.typings.antd.esTableInternalTableMod.TableProps[web.typings.antd.esUtilTypeMod.AnyObject]
    ]) with web.typings.antd.anon.`7`, 
    slinky.core.facade.ReactElement
  ]
  
  type SafeKey = web.typings.std.Exclude[web.typings.antd.esTableInterfaceMod.Key, js.BigInt]
  
  type SelectionItemSelectFn = js.Function1[
    /* currentRowKeys */ js.Array[web.typings.antd.esTableInterfaceMod.Key], 
    scala.Unit
  ]
  
  type SelectionSelectFn[T] = js.Function4[
    /* record */ T, 
    /* selected */ scala.Boolean, 
    /* selectedRows */ js.Array[T], 
    /* nativeEvent */ org.scalajs.dom.Event, 
    scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.descend
    - `web.typings`.antd.antdStrings.ascend
    - scala.Null
  */
  type SortOrder = web.typings.antd.esTableInterfaceMod._SortOrder | scala.Null
  
  type TransformColumns[RecordType] = js.Function1[
    /* columns */ web.typings.antd.esTableInterfaceMod.ColumnsType[RecordType], 
    web.typings.antd.esTableInterfaceMod.ColumnsType[RecordType]
  ]
}
