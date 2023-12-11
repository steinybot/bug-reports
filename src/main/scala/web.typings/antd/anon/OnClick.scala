package web.typings.antd.anon

import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnClick extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object OnClick {
  
  @scala.inline
  def apply(): OnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnClick]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OnClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setOnClick(value: () => scala.Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
