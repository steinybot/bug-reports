package web.typings.rcCascader

import web.typings.rcCascader.esCascaderMod.DefaultOptionType
import web.typings.rcCascader.esCascaderMod.SingleValueType
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.Key
import web.typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionListColumnMod {
  
  @JSImport("rc-cascader/es/OptionList/Column", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: ColumnProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-cascader/es/OptionList/Column", "FIX_LABEL")
  @js.native
  val FIX_LABEL: /* "__cascader_fix_label__" */ String = js.native
  
  @js.native
  trait ColumnProps extends StObject {
    
    /** Current Column opened item key */
    var activeValue: js.UndefOr[Key] = js.native
    
    var checkedSet: Set[Key] = js.native
    
    var halfCheckedSet: Set[Key] = js.native
    
    def isSelectable(option: DefaultOptionType): Boolean = js.native
    
    var loadingKeys: js.Array[Key] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    def onActive(valuePath: SingleValueType): Unit = js.native
    
    def onSelect(valuePath: SingleValueType, leaf: Boolean): Unit = js.native
    
    def onToggleOpen(open: Boolean): Unit = js.native
    
    var options: js.Array[DefaultOptionType] = js.native
    
    var prefixCls: String = js.native
    
    /** The value path before current column */
    var prevValuePath: js.Array[Key] = js.native
    
    var searchValue: js.UndefOr[String] = js.native
  }
  object ColumnProps {
    
    @scala.inline
    def apply(
      checkedSet: Set[Key],
      halfCheckedSet: Set[Key],
      isSelectable: DefaultOptionType => Boolean,
      loadingKeys: js.Array[Key],
      onActive: SingleValueType => Unit,
      onSelect: (SingleValueType, Boolean) => Unit,
      onToggleOpen: Boolean => Unit,
      options: js.Array[DefaultOptionType],
      prefixCls: String,
      prevValuePath: js.Array[Key]
    ): ColumnProps = {
      val __obj = js.Dynamic.literal(checkedSet = checkedSet.asInstanceOf[js.Any], halfCheckedSet = halfCheckedSet.asInstanceOf[js.Any], isSelectable = js.Any.fromFunction1(isSelectable), loadingKeys = loadingKeys.asInstanceOf[js.Any], onActive = js.Any.fromFunction1(onActive), onSelect = js.Any.fromFunction2(onSelect), onToggleOpen = js.Any.fromFunction1(onToggleOpen), options = options.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], prevValuePath = prevValuePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColumnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveValue(value: Key): Self = StObject.set(x, "activeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveValueUndefined: Self = StObject.set(x, "activeValue", js.undefined)
      
      @scala.inline
      def setCheckedSet(value: Set[Key]): Self = StObject.set(x, "checkedSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedSet(value: Set[Key]): Self = StObject.set(x, "halfCheckedSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectable(value: DefaultOptionType => Boolean): Self = StObject.set(x, "isSelectable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadingKeys(value: js.Array[Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingKeysVarargs(value: Key*): Self = StObject.set(x, "loadingKeys", js.Array(value :_*))
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setOnActive(value: SingleValueType => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelect(value: (SingleValueType, Boolean) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnToggleOpen(value: Boolean => Unit): Self = StObject.set(x, "onToggleOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: DefaultOptionType*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevValuePath(value: js.Array[Key]): Self = StObject.set(x, "prevValuePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevValuePathVarargs(value: Key*): Self = StObject.set(x, "prevValuePath", js.Array(value :_*))
      
      @scala.inline
      def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
    }
  }
}
