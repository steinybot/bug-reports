package web.typings.rcTreeSelect

import web.typings.rcTree.esTreeMod.ExpandAction
import web.typings.rcTreeSelect.anon.Selected
import web.typings.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import web.typings.rcTreeSelect.esTreeSelectMod.InternalFieldName
import web.typings.rcTreeSelect.esTreeSelectMod.OnInternalSelect
import web.typings.rcTreeSelect.esTreeSelectMod.RawValueType
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeSelectContextMod extends Shortcut {
  
  @JSImport("rc-tree-select/es/TreeSelectContext", JSImport.Default)
  @js.native
  val default: Context[TreeSelectContextProps] = js.native
  
  @js.native
  trait TreeSelectContextProps extends StObject {
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean | Double] = js.native
    
    var fieldNames: InternalFieldName = js.native
    
    var listHeight: Double = js.native
    
    var listItemHeight: Double = js.native
    
    var listItemScrollOffset: js.UndefOr[Double] = js.native
    
    var onSelect: OnInternalSelect = js.native
    
    var treeData: js.Array[DefaultOptionType] = js.native
    
    var treeExpandAction: js.UndefOr[ExpandAction] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object TreeSelectContextProps {
    
    @scala.inline
    def apply(
      fieldNames: InternalFieldName,
      listHeight: Double,
      listItemHeight: Double,
      onSelect: (/* value */ RawValueType, /* info */ Selected) => Unit,
      treeData: js.Array[DefaultOptionType]
    ): TreeSelectContextProps = {
      val __obj = js.Dynamic.literal(fieldNames = fieldNames.asInstanceOf[js.Any], listHeight = listHeight.asInstanceOf[js.Any], listItemHeight = listItemHeight.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2(onSelect), treeData = treeData.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeSelectContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TreeSelectContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropdownMatchSelectWidth(value: Boolean | Double): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
      
      @scala.inline
      def setFieldNames(value: InternalFieldName): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemHeight(value: Double): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemScrollOffset(value: Double): Self = StObject.set(x, "listItemScrollOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemScrollOffsetUndefined: Self = StObject.set(x, "listItemScrollOffset", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* value */ RawValueType, /* info */ Selected) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTreeData(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataVarargs(value: DefaultOptionType*): Self = StObject.set(x, "treeData", js.Array(value :_*))
      
      @scala.inline
      def setTreeExpandAction(value: ExpandAction): Self = StObject.set(x, "treeExpandAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeExpandActionUndefined: Self = StObject.set(x, "treeExpandAction", js.undefined)
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  type _To = Context[TreeSelectContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTreeSelectContextMod.foo` */
  override def _to: Context[TreeSelectContextProps] = default
}
