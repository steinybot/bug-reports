package web.typings.rcSelect

import web.typings.rcSelect.anon.Index
import web.typings.rcSelect.anon.Selected
import web.typings.rcSelect.anon.`0`
import web.typings.rcSelect.libInterfaceMod.FlattenOptionData
import web.typings.rcSelect.libInterfaceMod.RawValueType
import web.typings.rcSelect.libInterfaceMod.RenderNode
import web.typings.rcSelect.libSelectMod.BaseOptionType
import web.typings.rcSelect.libSelectMod.FieldNames
import web.typings.rcSelect.libSelectMod.OnActiveValue
import web.typings.rcSelect.libSelectMod.OnInternalSelect
import web.typings.rcSelect.rcSelectStrings.ltr
import web.typings.rcSelect.rcSelectStrings.rtl
import web.typings.react.mod.Context
import web.typings.std.Set
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectContextMod extends Shortcut {
  
  @JSImport("rc-select/lib/SelectContext", JSImport.Default)
  @js.native
  val default: Context[SelectContextProps] = js.native
  
  @js.native
  trait SelectContextProps extends StObject {
    
    var childrenAsData: js.UndefOr[Boolean] = js.native
    
    var defaultActiveFirstOption: js.UndefOr[Boolean] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var fieldNames: js.UndefOr[FieldNames] = js.native
    
    var flattenOptions: js.Array[FlattenOptionData[BaseOptionType]] = js.native
    
    var listHeight: js.UndefOr[Double] = js.native
    
    var listItemHeight: js.UndefOr[Double] = js.native
    
    var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.native
    
    var onActiveValue: OnActiveValue = js.native
    
    var onSelect: OnInternalSelect = js.native
    
    var optionRender: js.UndefOr[
        js.Function2[/* oriOption */ FlattenOptionData[BaseOptionType], /* info */ Index, ReactElement]
      ] = js.native
    
    var options: js.Array[BaseOptionType] = js.native
    
    var rawValues: Set[RawValueType] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object SelectContextProps {
    
    @scala.inline
    def apply(
      flattenOptions: js.Array[FlattenOptionData[BaseOptionType]],
      onActiveValue: (/* active */ web.typings.rcSelect.libSelectMod.RawValueType, /* index */ Double, /* info */ js.UndefOr[`0`]) => Unit,
      onSelect: (/* value */ web.typings.rcSelect.libSelectMod.RawValueType, /* info */ Selected) => Unit,
      options: js.Array[BaseOptionType],
      rawValues: Set[RawValueType]
    ): SelectContextProps = {
      val __obj = js.Dynamic.literal(flattenOptions = flattenOptions.asInstanceOf[js.Any], onActiveValue = js.Any.fromFunction3(onActiveValue), onSelect = js.Any.fromFunction2(onSelect), options = options.asInstanceOf[js.Any], rawValues = rawValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SelectContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildrenAsData(value: Boolean): Self = StObject.set(x, "childrenAsData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenAsDataUndefined: Self = StObject.set(x, "childrenAsData", js.undefined)
      
      @scala.inline
      def setDefaultActiveFirstOption(value: Boolean): Self = StObject.set(x, "defaultActiveFirstOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveFirstOptionUndefined: Self = StObject.set(x, "defaultActiveFirstOption", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      @scala.inline
      def setFlattenOptions(value: js.Array[FlattenOptionData[BaseOptionType]]): Self = StObject.set(x, "flattenOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenOptionsVarargs(value: FlattenOptionData[BaseOptionType]*): Self = StObject.set(x, "flattenOptions", js.Array(value :_*))
      
      @scala.inline
      def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListHeightUndefined: Self = StObject.set(x, "listHeight", js.undefined)
      
      @scala.inline
      def setListItemHeight(value: Double): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemHeightUndefined: Self = StObject.set(x, "listItemHeight", js.undefined)
      
      @scala.inline
      def setMenuItemSelectedIcon(value: RenderNode): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemSelectedIconFunction1(value: /* props */ Any => ReactElement): Self = StObject.set(x, "menuItemSelectedIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMenuItemSelectedIconReactElement(value: ReactElement): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemSelectedIconUndefined: Self = StObject.set(x, "menuItemSelectedIcon", js.undefined)
      
      @scala.inline
      def setOnActiveValue(
        value: (/* active */ web.typings.rcSelect.libSelectMod.RawValueType, /* index */ Double, /* info */ js.UndefOr[`0`]) => Unit
      ): Self = StObject.set(x, "onActiveValue", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSelect(value: (/* value */ web.typings.rcSelect.libSelectMod.RawValueType, /* info */ Selected) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptionRender(value: (/* oriOption */ FlattenOptionData[BaseOptionType], /* info */ Index) => ReactElement): Self = StObject.set(x, "optionRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptionRenderUndefined: Self = StObject.set(x, "optionRender", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[BaseOptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: BaseOptionType*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setRawValues(value: Set[RawValueType]): Self = StObject.set(x, "rawValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  type _To = Context[SelectContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectContextMod.foo` */
  override def _to: Context[SelectContextProps] = default
}
