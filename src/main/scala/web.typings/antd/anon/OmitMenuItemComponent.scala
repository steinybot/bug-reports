package web.typings.antd.anon

import web.typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<antd.antd/es/menu/MenuItem.MenuItemComponent, ''> */
@js.native
trait OmitMenuItemComponent extends StObject {
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialMenuItemProps] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapMenuItem] = js.native
}
object OmitMenuItemComponent {
  
  @scala.inline
  def apply(): OmitMenuItemComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitMenuItemComponent]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OmitMenuItemComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextTypes(value: ValidationMap[Any]): Self = StObject.set(x, "contextTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextTypesUndefined: Self = StObject.set(x, "contextTypes", js.undefined)
    
    @scala.inline
    def setDefaultProps(value: PartialMenuItemProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setPropTypes(value: WeakValidationMapMenuItem): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropTypesUndefined: Self = StObject.set(x, "propTypes", js.undefined)
  }
}
