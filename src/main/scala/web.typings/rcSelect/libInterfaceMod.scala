package web.typings.rcSelect

import web.typings.rcSelect.libSelectMod._DraftValueType
import web.typings.react.mod.Key
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcSelect.rcSelectStrings.add
    - `web.typings`.rcSelect.rcSelectStrings.remove
    - `web.typings`.rcSelect.rcSelectStrings.clear
  */
  trait DisplayInfoType extends StObject
  object DisplayInfoType {
    
    @scala.inline
    def add: web.typings.rcSelect.rcSelectStrings.add = "add".asInstanceOf[web.typings.rcSelect.rcSelectStrings.add]
    
    @scala.inline
    def clear: web.typings.rcSelect.rcSelectStrings.clear = "clear".asInstanceOf[web.typings.rcSelect.rcSelectStrings.clear]
    
    @scala.inline
    def remove: web.typings.rcSelect.rcSelectStrings.remove = "remove".asInstanceOf[web.typings.rcSelect.rcSelectStrings.remove]
  }
  
  @js.native
  trait DisplayValueType
    extends StObject
       with _DraftValueType {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[String | Double] = js.native
    
    var value: js.UndefOr[RawValueType] = js.native
  }
  object DisplayValueType {
    
    @scala.inline
    def apply(): DisplayValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayValueType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DisplayValueType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setTitle(value: String | Double): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait FlattenOptionData[OptionType] extends StObject {
    
    var data: OptionType = js.native
    
    var group: js.UndefOr[Boolean] = js.native
    
    var groupOption: js.UndefOr[Boolean] = js.native
    
    var key: Key = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var value: js.UndefOr[RawValueType] = js.native
  }
  object FlattenOptionData {
    
    @scala.inline
    def apply[OptionType](data: OptionType, key: Key): FlattenOptionData[OptionType] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenOptionData[OptionType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FlattenOptionData[_], OptionType] (val x: Self with FlattenOptionData[OptionType]) extends AnyVal {
      
      @scala.inline
      def setData(value: OptionType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupOption(value: Boolean): Self = StObject.set(x, "groupOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupOptionUndefined: Self = StObject.set(x, "groupOption", js.undefined)
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcSelect.rcSelectStrings.multiple
    - `web.typings`.rcSelect.rcSelectStrings.tags
    - `web.typings`.rcSelect.rcSelectStrings.combobox
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def combobox: web.typings.rcSelect.rcSelectStrings.combobox = "combobox".asInstanceOf[web.typings.rcSelect.rcSelectStrings.combobox]
    
    @scala.inline
    def multiple: web.typings.rcSelect.rcSelectStrings.multiple = "multiple".asInstanceOf[web.typings.rcSelect.rcSelectStrings.multiple]
    
    @scala.inline
    def tags: web.typings.rcSelect.rcSelectStrings.tags = "tags".asInstanceOf[web.typings.rcSelect.rcSelectStrings.tags]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcSelect.rcSelectStrings.bottomLeft
    - `web.typings`.rcSelect.rcSelectStrings.bottomRight
    - `web.typings`.rcSelect.rcSelectStrings.topLeft
    - `web.typings`.rcSelect.rcSelectStrings.topRight
  */
  trait Placement extends StObject
  object Placement {
    
    @scala.inline
    def bottomLeft: web.typings.rcSelect.rcSelectStrings.bottomLeft = "bottomLeft".asInstanceOf[web.typings.rcSelect.rcSelectStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: web.typings.rcSelect.rcSelectStrings.bottomRight = "bottomRight".asInstanceOf[web.typings.rcSelect.rcSelectStrings.bottomRight]
    
    @scala.inline
    def topLeft: web.typings.rcSelect.rcSelectStrings.topLeft = "topLeft".asInstanceOf[web.typings.rcSelect.rcSelectStrings.topLeft]
    
    @scala.inline
    def topRight: web.typings.rcSelect.rcSelectStrings.topRight = "topRight".asInstanceOf[web.typings.rcSelect.rcSelectStrings.topRight]
  }
  
  type RawValueType = String | Double
  
  type RenderDOMFunc = js.Function1[/* props */ Any, HTMLElement]
  
  type RenderNode = ReactElement | (js.Function1[/* props */ Any, ReactElement])
}
