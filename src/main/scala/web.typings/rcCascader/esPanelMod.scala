package web.typings.rcCascader

import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelMod {
  
  @JSImport("rc-cascader/es/Panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: PanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Pick<rc-cascader.rc-cascader/es/Cascader.CascaderProps<rc-cascader.rc-cascader/es/Cascader.DefaultOptionType>, rc-cascader.rc-cascader/es/Panel.PickType> */
  @js.native
  trait PanelProps extends StObject {
    
    var changeOnSelect: js.UndefOr[Any] = js.native
    
    var checkable: js.UndefOr[Any] = js.native
    
    var className: js.UndefOr[Any] = js.native
    
    var defaultValue: js.UndefOr[Any] = js.native
    
    var direction: js.UndefOr[Any] = js.native
    
    var expandIcon: js.UndefOr[Any] = js.native
    
    var expandTrigger: js.UndefOr[Any] = js.native
    
    var fieldNames: js.UndefOr[Any] = js.native
    
    var loadData: js.UndefOr[Any] = js.native
    
    var loadingIcon: js.UndefOr[Any] = js.native
    
    var notFoundContent: js.UndefOr[Any] = js.native
    
    var onChange: js.UndefOr[Any] = js.native
    
    var options: js.UndefOr[Any] = js.native
    
    var prefixCls: js.UndefOr[Any] = js.native
    
    var showCheckedStrategy: js.UndefOr[Any] = js.native
    
    var style: js.UndefOr[Any] = js.native
    
    var value: js.UndefOr[Any] = js.native
  }
  object PanelProps {
    
    @scala.inline
    def apply(): PanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeOnSelect(value: Any): Self = StObject.set(x, "changeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOnSelectUndefined: Self = StObject.set(x, "changeOnSelect", js.undefined)
      
      @scala.inline
      def setCheckable(value: Any): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: Any): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: Any): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setExpandTrigger(value: Any): Self = StObject.set(x, "expandTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandTriggerUndefined: Self = StObject.set(x, "expandTrigger", js.undefined)
      
      @scala.inline
      def setFieldNames(value: Any): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      @scala.inline
      def setLoadData(value: Any): Self = StObject.set(x, "loadData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      @scala.inline
      def setLoadingIcon(value: Any): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      @scala.inline
      def setNotFoundContent(value: Any): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setOnChange(value: Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: Any): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShowCheckedStrategy(value: Any): Self = StObject.set(x, "showCheckedStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCheckedStrategyUndefined: Self = StObject.set(x, "showCheckedStrategy", js.undefined)
      
      @scala.inline
      def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcCascader.rcCascaderStrings.value
    - `web.typings`.rcCascader.rcCascaderStrings.defaultValue
    - `web.typings`.rcCascader.rcCascaderStrings.changeOnSelect
    - `web.typings`.rcCascader.rcCascaderStrings.onChange
    - `web.typings`.rcCascader.rcCascaderStrings.options
    - `web.typings`.rcCascader.rcCascaderStrings.prefixCls
    - `web.typings`.rcCascader.rcCascaderStrings.checkable
    - `web.typings`.rcCascader.rcCascaderStrings.fieldNames
    - `web.typings`.rcCascader.rcCascaderStrings.showCheckedStrategy
    - `web.typings`.rcCascader.rcCascaderStrings.loadData
    - `web.typings`.rcCascader.rcCascaderStrings.expandTrigger
    - `web.typings`.rcCascader.rcCascaderStrings.expandIcon
    - `web.typings`.rcCascader.rcCascaderStrings.loadingIcon
    - `web.typings`.rcCascader.rcCascaderStrings.className
    - `web.typings`.rcCascader.rcCascaderStrings.style
    - `web.typings`.rcCascader.rcCascaderStrings.direction
    - `web.typings`.rcCascader.rcCascaderStrings.notFoundContent
  */
  trait PickType extends StObject
  object PickType {
    
    @scala.inline
    def changeOnSelect: web.typings.rcCascader.rcCascaderStrings.changeOnSelect = "changeOnSelect".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.changeOnSelect]
    
    @scala.inline
    def checkable: web.typings.rcCascader.rcCascaderStrings.checkable = "checkable".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.checkable]
    
    @scala.inline
    def className: web.typings.rcCascader.rcCascaderStrings.className = "className".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.className]
    
    @scala.inline
    def defaultValue: web.typings.rcCascader.rcCascaderStrings.defaultValue = "defaultValue".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.defaultValue]
    
    @scala.inline
    def direction: web.typings.rcCascader.rcCascaderStrings.direction = "direction".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.direction]
    
    @scala.inline
    def expandIcon: web.typings.rcCascader.rcCascaderStrings.expandIcon = "expandIcon".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.expandIcon]
    
    @scala.inline
    def expandTrigger: web.typings.rcCascader.rcCascaderStrings.expandTrigger = "expandTrigger".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.expandTrigger]
    
    @scala.inline
    def fieldNames: web.typings.rcCascader.rcCascaderStrings.fieldNames = "fieldNames".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.fieldNames]
    
    @scala.inline
    def loadData: web.typings.rcCascader.rcCascaderStrings.loadData = "loadData".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.loadData]
    
    @scala.inline
    def loadingIcon: web.typings.rcCascader.rcCascaderStrings.loadingIcon = "loadingIcon".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.loadingIcon]
    
    @scala.inline
    def notFoundContent: web.typings.rcCascader.rcCascaderStrings.notFoundContent = "notFoundContent".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.notFoundContent]
    
    @scala.inline
    def onChange: web.typings.rcCascader.rcCascaderStrings.onChange = "onChange".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.onChange]
    
    @scala.inline
    def options: web.typings.rcCascader.rcCascaderStrings.options = "options".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.options]
    
    @scala.inline
    def prefixCls: web.typings.rcCascader.rcCascaderStrings.prefixCls = "prefixCls".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.prefixCls]
    
    @scala.inline
    def showCheckedStrategy: web.typings.rcCascader.rcCascaderStrings.showCheckedStrategy = "showCheckedStrategy".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.showCheckedStrategy]
    
    @scala.inline
    def style: web.typings.rcCascader.rcCascaderStrings.style = "style".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.style]
    
    @scala.inline
    def value: web.typings.rcCascader.rcCascaderStrings.value = "value".asInstanceOf[web.typings.rcCascader.rcCascaderStrings.value]
  }
}
