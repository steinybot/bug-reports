package web.typings.rcTable

import web.typings.rcTable.libInterfaceMod.ExpandableConfig
import web.typings.rcTable.libInterfaceMod.ExpandableType
import web.typings.rcTable.libInterfaceMod.GetRowKey
import web.typings.rcTable.libInterfaceMod.Key
import web.typings.rcTable.libInterfaceMod.RenderExpandIcon
import web.typings.rcTable.libInterfaceMod.TriggerEventHandler
import web.typings.rcTable.libTableMod.TableProps
import web.typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseExpandMod {
  
  @JSImport("rc-table/lib/hooks/useExpand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](props: TableProps[RecordType], mergedData: js.Array[RecordType], getRowKey: GetRowKey[RecordType]): js.Tuple6[
    /* expandableConfig */ ExpandableConfig[RecordType], 
    /* expandableType */ ExpandableType, 
    /* expandedKeys */ Set[Key], 
    /* expandIcon */ RenderExpandIcon[Any], 
    /* childrenColumnName */ String, 
    /* onTriggerExpand */ TriggerEventHandler[RecordType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], mergedData.asInstanceOf[js.Any], getRowKey.asInstanceOf[js.Any])).asInstanceOf[js.Tuple6[
    /* expandableConfig */ ExpandableConfig[RecordType], 
    /* expandableType */ ExpandableType, 
    /* expandedKeys */ Set[Key], 
    /* expandIcon */ RenderExpandIcon[Any], 
    /* childrenColumnName */ String, 
    /* onTriggerExpand */ TriggerEventHandler[RecordType]
  ]]
}
