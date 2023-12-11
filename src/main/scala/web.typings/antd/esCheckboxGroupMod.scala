package web.typings.antd

import web.typings.antd.esCheckboxCheckboxMod.CheckboxChangeEvent
import web.typings.antd.esCheckboxGroupContextMod.CheckboxGroupContext
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Context
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCheckboxGroupMod extends Shortcut {
  
  @JSImport("antd/es/checkbox/Group", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ReactComponentClass[CheckboxGroupProps with RefAttributes[HTMLDivElement]]] = js.native
  
  @JSImport("antd/es/checkbox/Group", "GroupContext")
  @js.native
  val GroupContext: Context[CheckboxGroupContext | Null] = js.native
  
  @js.native
  trait AbstractCheckboxGroupProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var options: js.UndefOr[js.Array[CheckboxOptionType | String | Double]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object AbstractCheckboxGroupProps {
    
    @scala.inline
    def apply(): AbstractCheckboxGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractCheckboxGroupProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AbstractCheckboxGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[CheckboxOptionType | String | Double]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: (CheckboxOptionType | String | Double)*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait CheckboxGroupProps
    extends StObject
       with AbstractCheckboxGroupProps {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var defaultValue: js.UndefOr[js.Array[CheckboxValueType]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* checkedValue */ js.Array[CheckboxValueType], Unit]] = js.native
    
    var value: js.UndefOr[js.Array[CheckboxValueType]] = js.native
  }
  object CheckboxGroupProps {
    
    @scala.inline
    def apply(): CheckboxGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxGroupProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CheckboxGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Array[CheckboxValueType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: CheckboxValueType*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* checkedValue */ js.Array[CheckboxValueType] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[CheckboxValueType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: CheckboxValueType*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CheckboxOptionType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var label: ReactElement = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ CheckboxChangeEvent, Unit]] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var value: CheckboxValueType = js.native
  }
  object CheckboxOptionType {
    
    @scala.inline
    def apply(label: ReactElement, value: CheckboxValueType): CheckboxOptionType = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxOptionType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CheckboxOptionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: /* e */ CheckboxChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValue(value: CheckboxValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type CheckboxValueType = String | Double | Boolean
  
  type _To = ReactComponentClass[ReactComponentClass[CheckboxGroupProps with RefAttributes[HTMLDivElement]]]
  
  /* This means you don't have to write `default`, but can instead just say `esCheckboxGroupMod.foo` */
  override def _to: ReactComponentClass[ReactComponentClass[CheckboxGroupProps with RefAttributes[HTMLDivElement]]] = default
}
