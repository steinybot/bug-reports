package web.typings.antd

import web.typings.antd.esTransferMod.KeyWiseTransferItem
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLLIElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTransferListItemMod extends Shortcut {
  
  @JSImport("antd/es/transfer/ListItem", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Function1[/* props */ ListItemProps[KeyWiseTransferItem], Element]] = js.native
  
  @js.native
  trait ListItemProps[RecordType] extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var item: RecordType = js.native
    
    def onClick(item: RecordType, e: SyntheticMouseEvent[HTMLLIElement]): Unit = js.native
    
    var onRemove: js.UndefOr[js.Function1[/* item */ RecordType, Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var renderedEl: ReactElement = js.native
    
    var renderedText: js.UndefOr[String | Double] = js.native
    
    var showRemove: js.UndefOr[Boolean] = js.native
  }
  object ListItemProps {
    
    @scala.inline
    def apply[RecordType](
      item: RecordType,
      onClick: (RecordType, SyntheticMouseEvent[HTMLLIElement]) => Unit,
      prefixCls: String,
      renderedEl: ReactElement
    ): ListItemProps[RecordType] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), prefixCls = prefixCls.asInstanceOf[js.Any], renderedEl = renderedEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ListItemProps[_], RecordType] (val x: Self with ListItemProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setItem(value: RecordType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: (RecordType, SyntheticMouseEvent[HTMLLIElement]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRemove(value: /* item */ RecordType => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedEl(value: ReactElement): Self = StObject.set(x, "renderedEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedText(value: String | Double): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedTextUndefined: Self = StObject.set(x, "renderedText", js.undefined)
      
      @scala.inline
      def setShowRemove(value: Boolean): Self = StObject.set(x, "showRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRemoveUndefined: Self = StObject.set(x, "showRemove", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[js.Function1[/* props */ ListItemProps[KeyWiseTransferItem], Element]]
  
  /* This means you don't have to write `default`, but can instead just say `esTransferListItemMod.foo` */
  override def _to: ReactComponentClass[js.Function1[/* props */ ListItemProps[KeyWiseTransferItem], Element]] = default
}
