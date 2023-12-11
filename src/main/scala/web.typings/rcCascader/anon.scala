package web.typings.rcCascader

import web.typings.rcCascader.esCascaderMod.BaseOptionType
import web.typings.rcCascader.esCascaderMod.DefaultOptionType
import web.typings.rcCascader.esCascaderMod.SingleValueType
import web.typings.rcCascader.esPanelMod.PanelProps
import web.typings.rcCascader.rcCascaderStrings.ltr
import web.typings.rcCascader.rcCascaderStrings.rtl
import web.typings.rcSelect.libBaseSelectMod.BaseSelectRef
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Direction extends StObject {
    
    var direction: ltr | rtl = js.native
    
    var open: Boolean = js.native
    
    var searchValue: String = js.native
    
    def toggleOpen(): Unit = js.native
    def toggleOpen(open: Boolean): Unit = js.native
  }
  
  @js.native
  trait Disabled extends StObject {
    
    var disabled: Boolean = js.native
    
    var key: String = js.native
    
    var label: ReactElement = js.native
    
    var value: String = js.native
    
    var valueCells: SingleValueType = js.native
  }
  object Disabled {
    
    @scala.inline
    def apply(disabled: Boolean, key: String, label: ReactElement, value: String, valueCells: SingleValueType): Disabled = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueCells = valueCells.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disabled]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueCells(value: SingleValueType): Self = StObject.set(x, "valueCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueCellsVarargs(value: (String | Double)*): Self = StObject.set(x, "valueCells", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DisplayName extends StObject {
    
    var Panel: js.Function1[/* props */ PanelProps, Element] = js.native
    
    var SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
    
    var SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  object DisplayName {
    
    @scala.inline
    def apply(
      Panel: /* props */ PanelProps => Element,
      SHOW_CHILD: /* "SHOW_CHILD" */ String,
      SHOW_PARENT: /* "SHOW_PARENT" */ String
    ): DisplayName = {
      val __obj = js.Dynamic.literal(Panel = js.Any.fromFunction1(Panel), SHOW_CHILD = SHOW_CHILD.asInstanceOf[js.Any], SHOW_PARENT = SHOW_PARENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayName]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setPanel(value: /* props */ PanelProps => Element): Self = StObject.set(x, "Panel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSHOW_CHILD(value: /* "SHOW_CHILD" */ String): Self = StObject.set(x, "SHOW_CHILD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHOW_PARENT(value: /* "SHOW_PARENT" */ String): Self = StObject.set(x, "SHOW_PARENT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Index extends StObject {
    
    var index: Double = js.native
    
    var option: DefaultOptionType = js.native
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: rc-cascader.rc-cascader/es/Cascader.SingleValueType[number] */ js.Any = js.native
  }
  object Index {
    
    @scala.inline
    def apply(
      index: Double,
      option: DefaultOptionType,
      value: /* import warning: importer.ImportType#apply Failed type conversion: rc-cascader.rc-cascader/es/Cascader.SingleValueType[number] */ js.Any
    ): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOption(value: DefaultOptionType): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: rc-cascader.rc-cascader/es/Cascader.SingleValueType[number] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnChange[OptionType /* <: BaseOptionType */] extends StObject {
    
    var onChange: js.UndefOr[
        js.Function2[
          /* value */ SingleValueType | js.Array[SingleValueType], 
          /* selectOptions */ js.Array[js.Array[OptionType] | OptionType], 
          Unit
        ]
      ] = js.native
  }
  object OnChange {
    
    @scala.inline
    def apply[OptionType /* <: BaseOptionType */](): OnChange[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnChange[OptionType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: OnChange[_], OptionType /* <: BaseOptionType */] (val x: Self with OnChange[OptionType]) extends AnyVal {
      
      @scala.inline
      def setOnChange(
        value: (/* value */ SingleValueType | js.Array[SingleValueType], /* selectOptions */ js.Array[js.Array[OptionType] | OptionType]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  @js.native
  trait Ref extends StObject {
    
    var ref: js.UndefOr[web.typings.react.mod.Ref[BaseSelectRef]] = js.native
  }
  object Ref {
    
    @scala.inline
    def apply(): Ref = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: web.typings.react.mod.Ref[BaseSelectRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ BaseSelectRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefReactRef(value: ReactRef[BaseSelectRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
