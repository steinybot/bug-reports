package web.typings.antd

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCascaderPanelMod {
  
  @JSImport("antd/es/cascader/Panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: CascaderPanelProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  /* Inlined std.Pick<antd.antd/es/cascader.CascaderProps<any>, antd.antd/es/cascader/Panel.PanelPickType> */
  @js.native
  trait CascaderPanelProps extends StObject {
    
    var changeOnSelect: js.UndefOr[Any] = js.native
    
    var className: js.UndefOr[Any] = js.native
    
    var defaultValue: js.UndefOr[Any] = js.native
    
    var direction: js.UndefOr[Any] = js.native
    
    var expandIcon: js.UndefOr[Any] = js.native
    
    var expandTrigger: js.UndefOr[Any] = js.native
    
    var fieldNames: js.UndefOr[Any] = js.native
    
    var loadData: js.UndefOr[Any] = js.native
    
    var loadingIcon: js.UndefOr[Any] = js.native
    
    var multiple: js.UndefOr[Any] = js.native
    
    var notFoundContent: js.UndefOr[Any] = js.native
    
    var onChange: js.UndefOr[Any] = js.native
    
    var options: js.UndefOr[Any] = js.native
    
    var prefixCls: js.UndefOr[Any] = js.native
    
    var rootClassName: js.UndefOr[Any] = js.native
    
    var showCheckedStrategy: js.UndefOr[Any] = js.native
    
    var style: js.UndefOr[Any] = js.native
    
    var value: js.UndefOr[Any] = js.native
  }
  object CascaderPanelProps {
    
    @scala.inline
    def apply(): CascaderPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascaderPanelProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CascaderPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeOnSelect(value: Any): Self = StObject.set(x, "changeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOnSelectUndefined: Self = StObject.set(x, "changeOnSelect", js.undefined)
      
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
      def setMultiple(value: Any): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
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
      def setRootClassName(value: Any): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
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
  
  /* Inlined std.Exclude<rc-cascader.rc-cascader/es/Panel.PickType, 'checkable'> | 'multiple' | 'rootClassName' */
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.fieldNames
    - `web.typings`.antd.antdStrings.className
    - `web.typings`.antd.antdStrings.loadData
    - `web.typings`.antd.antdStrings.prefixCls
    - `web.typings`.antd.antdStrings.expandIcon
    - `web.typings`.antd.antdStrings.loadingIcon
    - `web.typings`.antd.antdStrings.value
    - `web.typings`.antd.antdStrings.expandTrigger
    - `web.typings`.antd.antdStrings.style
    - `web.typings`.antd.antdStrings.onChange
    - `web.typings`.antd.antdStrings.multiple
    - `web.typings`.antd.antdStrings.direction
    - `web.typings`.antd.antdStrings.showCheckedStrategy
    - `web.typings`.antd.antdStrings.notFoundContent
    - `web.typings`.antd.antdStrings.defaultValue
    - `web.typings`.antd.antdStrings.rootClassName
    - `web.typings`.antd.antdStrings.options
    - `web.typings`.antd.antdStrings.changeOnSelect
  */
  trait PanelPickType extends StObject
  object PanelPickType {
    
    @scala.inline
    def changeOnSelect: web.typings.antd.antdStrings.changeOnSelect = "changeOnSelect".asInstanceOf[web.typings.antd.antdStrings.changeOnSelect]
    
    @scala.inline
    def className: web.typings.antd.antdStrings.className = "className".asInstanceOf[web.typings.antd.antdStrings.className]
    
    @scala.inline
    def defaultValue: web.typings.antd.antdStrings.defaultValue = "defaultValue".asInstanceOf[web.typings.antd.antdStrings.defaultValue]
    
    @scala.inline
    def direction: web.typings.antd.antdStrings.direction = "direction".asInstanceOf[web.typings.antd.antdStrings.direction]
    
    @scala.inline
    def expandIcon: web.typings.antd.antdStrings.expandIcon = "expandIcon".asInstanceOf[web.typings.antd.antdStrings.expandIcon]
    
    @scala.inline
    def expandTrigger: web.typings.antd.antdStrings.expandTrigger = "expandTrigger".asInstanceOf[web.typings.antd.antdStrings.expandTrigger]
    
    @scala.inline
    def fieldNames: web.typings.antd.antdStrings.fieldNames = "fieldNames".asInstanceOf[web.typings.antd.antdStrings.fieldNames]
    
    @scala.inline
    def loadData: web.typings.antd.antdStrings.loadData = "loadData".asInstanceOf[web.typings.antd.antdStrings.loadData]
    
    @scala.inline
    def loadingIcon: web.typings.antd.antdStrings.loadingIcon = "loadingIcon".asInstanceOf[web.typings.antd.antdStrings.loadingIcon]
    
    @scala.inline
    def multiple: web.typings.antd.antdStrings.multiple = "multiple".asInstanceOf[web.typings.antd.antdStrings.multiple]
    
    @scala.inline
    def notFoundContent: web.typings.antd.antdStrings.notFoundContent = "notFoundContent".asInstanceOf[web.typings.antd.antdStrings.notFoundContent]
    
    @scala.inline
    def onChange: web.typings.antd.antdStrings.onChange = "onChange".asInstanceOf[web.typings.antd.antdStrings.onChange]
    
    @scala.inline
    def options: web.typings.antd.antdStrings.options = "options".asInstanceOf[web.typings.antd.antdStrings.options]
    
    @scala.inline
    def prefixCls: web.typings.antd.antdStrings.prefixCls = "prefixCls".asInstanceOf[web.typings.antd.antdStrings.prefixCls]
    
    @scala.inline
    def rootClassName: web.typings.antd.antdStrings.rootClassName = "rootClassName".asInstanceOf[web.typings.antd.antdStrings.rootClassName]
    
    @scala.inline
    def showCheckedStrategy: web.typings.antd.antdStrings.showCheckedStrategy = "showCheckedStrategy".asInstanceOf[web.typings.antd.antdStrings.showCheckedStrategy]
    
    @scala.inline
    def style: web.typings.antd.antdStrings.style = "style".asInstanceOf[web.typings.antd.antdStrings.style]
    
    @scala.inline
    def value: web.typings.antd.antdStrings.value = "value".asInstanceOf[web.typings.antd.antdStrings.value]
  }
}
