package web.typings.antd

import web.typings.antd.anon.Warnings
import web.typings.rcFieldForm.esInterfaceMod.StoreValue
import web.typings.rcFieldForm.esInterfaceMod.ValidatorRule
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFormFormListMod extends Shortcut {
  
  @JSImport("antd/es/form/FormList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormListProps] = js.native
  
  @js.native
  trait FormListFieldData extends StObject {
    
    /** @deprecated No need anymore Use key instead */
    var fieldKey: js.UndefOr[Double] = js.native
    
    var key: Double = js.native
    
    var name: Double = js.native
  }
  object FormListFieldData {
    
    @scala.inline
    def apply(key: Double, name: Double): FormListFieldData = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormListFieldData]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormListFieldData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldKey(value: Double): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldKeyUndefined: Self = StObject.set(x, "fieldKey", js.undefined)
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FormListOperation extends StObject {
    
    def add(): Unit = js.native
    def add(defaultValue: StoreValue): Unit = js.native
    def add(defaultValue: StoreValue, insertIndex: Double): Unit = js.native
    def add(defaultValue: Unit, insertIndex: Double): Unit = js.native
    
    def move(from: Double, to: Double): Unit = js.native
    
    def remove(index: js.Array[Double]): Unit = js.native
    def remove(index: Double): Unit = js.native
  }
  
  @js.native
  trait FormListProps extends StObject {
    
    def children(fields: js.Array[FormListFieldData], operation: FormListOperation, meta: Warnings): ReactElement = js.native
    
    var initialValue: js.UndefOr[js.Array[Any]] = js.native
    
    var name: String | Double | (js.Array[String | Double]) = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rules: js.UndefOr[js.Array[ValidatorRule]] = js.native
  }
  object FormListProps {
    
    @scala.inline
    def apply(
      children: (js.Array[FormListFieldData], FormListOperation, Warnings) => ReactElement,
      name: String | Double | (js.Array[String | Double])
    ): FormListProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormListProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (js.Array[FormListFieldData], FormListOperation, Warnings) => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInitialValue(value: js.Array[Any]): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setInitialValueVarargs(value: Any*): Self = StObject.set(x, "initialValue", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String | Double | (js.Array[String | Double])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRules(value: js.Array[ValidatorRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: ValidatorRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
  
  type _To = ReactComponentClass[FormListProps]
  
  /* This means you don't have to write `default`, but can instead just say `esFormFormListMod.foo` */
  override def _to: ReactComponentClass[FormListProps] = default
}
