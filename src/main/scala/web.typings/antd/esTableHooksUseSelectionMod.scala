package web.typings.antd

import web.typings.antd.antdStrings.SELECT_ALL
import web.typings.antd.antdStrings.SELECT_INVERT
import web.typings.antd.antdStrings.SELECT_NONE
import web.typings.antd.esTableInterfaceMod.ExpandType
import web.typings.antd.esTableInterfaceMod.GetPopupContainer
import web.typings.antd.esTableInterfaceMod.TableLocale
import web.typings.antd.esTableInterfaceMod.TableRowSelection
import web.typings.antd.esTableInterfaceMod.TransformColumns
import web.typings.antd.esUtilTypeMod.AnyObject
import web.typings.rcTable.libInterfaceMod.GetRowKey
import web.typings.react.mod.Key
import web.typings.std.Set
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableHooksUseSelectionMod {
  
  @JSImport("antd/es/table/hooks/useSelection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType /* <: AnyObject */](config: UseSelectionConfig[RecordType]): js.Tuple2[TransformColumns[RecordType], Set[Key]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TransformColumns[RecordType], Set[Key]]]
  @scala.inline
  def default[RecordType /* <: AnyObject */](config: UseSelectionConfig[RecordType], rowSelection: TableRowSelection[RecordType]): js.Tuple2[TransformColumns[RecordType], Set[Key]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any], rowSelection.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TransformColumns[RecordType], Set[Key]]]
  
  @JSImport("antd/es/table/hooks/useSelection", "SELECTION_ALL")
  @js.native
  val SELECTION_ALL: SELECT_ALL = js.native
  
  @JSImport("antd/es/table/hooks/useSelection", "SELECTION_INVERT")
  @js.native
  val SELECTION_INVERT: SELECT_INVERT = js.native
  
  @JSImport("antd/es/table/hooks/useSelection", "SELECTION_NONE")
  @js.native
  val SELECTION_NONE: SELECT_NONE = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.esTableInterfaceMod.SelectionItem
    - `web.typings`.antd.antdStrings.SELECT_ALL
    - `web.typings`.antd.antdStrings.SELECT_INVERT
    - `web.typings`.antd.antdStrings.SELECT_NONE
  */
  trait INTERNAL_SELECTION_ITEM extends StObject
  
  @js.native
  trait UseSelectionConfig[RecordType /* <: AnyObject */] extends StObject {
    
    var childrenColumnName: String = js.native
    
    var data: js.Array[RecordType] = js.native
    
    var expandType: ExpandType = js.native
    
    var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
    
    def getRecordByKey(key: web.typings.antd.esTableInterfaceMod.Key): RecordType = js.native
    
    var getRowKey: GetRowKey[RecordType] = js.native
    
    var locale: TableLocale = js.native
    
    var pageData: js.Array[RecordType] = js.native
    
    var prefixCls: String = js.native
  }
  object UseSelectionConfig {
    
    @scala.inline
    def apply[RecordType /* <: AnyObject */](
      childrenColumnName: String,
      data: js.Array[RecordType],
      getRecordByKey: web.typings.antd.esTableInterfaceMod.Key => RecordType,
      getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => web.typings.rcTable.libInterfaceMod.Key,
      locale: TableLocale,
      pageData: js.Array[RecordType],
      prefixCls: String
    ): UseSelectionConfig[RecordType] = {
      val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getRecordByKey = js.Any.fromFunction1(getRecordByKey), getRowKey = js.Any.fromFunction2(getRowKey), locale = locale.asInstanceOf[js.Any], pageData = pageData.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], expandType = null)
      __obj.asInstanceOf[UseSelectionConfig[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: UseSelectionConfig[_], RecordType /* <: AnyObject */] (val x: Self with UseSelectionConfig[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Array[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: RecordType*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setExpandType(value: ExpandType): Self = StObject.set(x, "expandType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandTypeNull: Self = StObject.set(x, "expandType", null)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setGetRecordByKey(value: web.typings.antd.esTableInterfaceMod.Key => RecordType): Self = StObject.set(x, "getRecordByKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => web.typings.rcTable.libInterfaceMod.Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageData(value: js.Array[RecordType]): Self = StObject.set(x, "pageData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageDataVarargs(value: RecordType*): Self = StObject.set(x, "pageData", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
