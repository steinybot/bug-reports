package web.typings.rcFieldForm

import web.typings.rcFieldForm.esInterfaceMod.Meta
import web.typings.rcFieldForm.esInterfaceMod.NamePath
import web.typings.rcFieldForm.esInterfaceMod.StoreValue
import web.typings.rcFieldForm.esInterfaceMod.ValidatorRule
import web.typings.rcFieldForm.rcFieldFormBooleans.`false`
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esListMod {
  
  @JSImport("rc-field-form/es/List", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Values](param0: ListProps[Values]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait ListField extends StObject {
    
    var isListField: Boolean = js.native
    
    var key: Double = js.native
    
    var name: Double = js.native
  }
  object ListField {
    
    @scala.inline
    def apply(isListField: Boolean, key: Double, name: Double): ListField = {
      val __obj = js.Dynamic.literal(isListField = isListField.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListField]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ListField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsListField(value: Boolean): Self = StObject.set(x, "isListField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListOperations extends StObject {
    
    def add(): Unit = js.native
    def add(defaultValue: StoreValue): Unit = js.native
    def add(defaultValue: StoreValue, index: Double): Unit = js.native
    def add(defaultValue: Unit, index: Double): Unit = js.native
    
    def move(from: Double, to: Double): Unit = js.native
    
    def remove(index: js.Array[Double]): Unit = js.native
    def remove(index: Double): Unit = js.native
  }
  
  @js.native
  trait ListProps[Values] extends StObject {
    
    var children: js.UndefOr[
        js.Function3[
          /* fields */ js.Array[ListField], 
          /* operations */ ListOperations, 
          /* meta */ Meta, 
          web.typings.react.mod.global.JSX.Element | ReactElement
        ]
      ] = js.native
    
    var initialValue: js.UndefOr[js.Array[Any]] = js.native
    
    /** @private Passed by Form.List props. Do not use since it will break by path check. */
    var isListField: js.UndefOr[Boolean] = js.native
    
    var name: NamePath[Values] = js.native
    
    var rules: js.UndefOr[js.Array[ValidatorRule]] = js.native
    
    var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.native
  }
  object ListProps {
    
    @scala.inline
    def apply[Values](name: NamePath[Values]): ListProps[Values] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListProps[Values]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ListProps[_], Values] (val x: Self with ListProps[Values]) extends AnyVal {
      
      @scala.inline
      def setChildren(
        value: (/* fields */ js.Array[ListField], /* operations */ ListOperations, /* meta */ Meta) => web.typings.react.mod.global.JSX.Element | ReactElement
      ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialValue(value: js.Array[Any]): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setInitialValueVarargs(value: Any*): Self = StObject.set(x, "initialValue", js.Array(value :_*))
      
      @scala.inline
      def setIsListField(value: Boolean): Self = StObject.set(x, "isListField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsListFieldUndefined: Self = StObject.set(x, "isListField", js.undefined)
      
      @scala.inline
      def setName(value: NamePath[Values]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setRules(value: js.Array[ValidatorRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: ValidatorRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setValidateTrigger(value: String | js.Array[String] | `false`): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
      
      @scala.inline
      def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value :_*))
    }
  }
}
