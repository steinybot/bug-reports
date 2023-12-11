package web.typings.antd.anon

import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemIcon extends StObject {
  
  var clearIcon: String | Double | Boolean | js.Iterable[ReactElement] | Element | (js.Function1[/* props */ Any, ReactElement]) = js.native
  
  var itemIcon: String | Double | Boolean | js.Iterable[ReactElement] | Element | (js.Function1[/* props */ Any, ReactElement]) | Null = js.native
  
  var removeIcon: String | Double | Boolean | js.Iterable[ReactElement] | Element | (js.Function1[/* props */ Any, ReactElement]) | Null = js.native
  
  var suffixIcon: Element | (js.Function1[/* param0 */ Open, Element | Null]) | Null = js.native
}
object ItemIcon {
  
  @scala.inline
  def apply(
    clearIcon: String | Double | Boolean | js.Iterable[ReactElement] | Element | (js.Function1[/* props */ Any, ReactElement])
  ): ItemIcon = {
    val __obj = js.Dynamic.literal(clearIcon = clearIcon.asInstanceOf[js.Any], itemIcon = null, removeIcon = null, suffixIcon = null)
    __obj.asInstanceOf[ItemIcon]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ItemIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearIcon(
      value: String | Double | Boolean | js.Iterable[ReactElement] | Element | (js.Function1[/* props */ Any, ReactElement])
    ): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIconFunction1(value: /* props */ Any => ReactElement): Self = StObject.set(x, "clearIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearIconReactElement(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIcon(
      value: String | Double | Boolean | js.Iterable[ReactElement] | Element | (js.Function1[/* props */ Any, ReactElement])
    ): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIconFunction1(value: /* props */ Any => ReactElement): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemIconNull: Self = StObject.set(x, "itemIcon", null)
    
    @scala.inline
    def setItemIconReactElement(value: ReactElement): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIcon(
      value: String | Double | Boolean | js.Iterable[ReactElement] | Element | (js.Function1[/* props */ Any, ReactElement])
    ): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIconFunction1(value: /* props */ Any => ReactElement): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveIconNull: Self = StObject.set(x, "removeIcon", null)
    
    @scala.inline
    def setRemoveIconReactElement(value: ReactElement): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixIcon(value: Element | (js.Function1[/* param0 */ Open, Element | Null])): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixIconFunction1(value: /* param0 */ Open => Element | Null): Self = StObject.set(x, "suffixIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuffixIconNull: Self = StObject.set(x, "suffixIcon", null)
    
    @scala.inline
    def setSuffixIconReactElement(value: ReactElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
  }
}
