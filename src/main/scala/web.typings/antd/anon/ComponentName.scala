package web.typings.antd.anon

import web.typings.antd.esSelectUseIconsMod.RenderNode
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentName extends StObject {
  
  var clearIcon: js.UndefOr[RenderNode] = js.native
  
  var componentName: String = js.native
  
  var feedbackIcon: js.UndefOr[ReactElement] = js.native
  
  var hasFeedback: js.UndefOr[Boolean] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var prefixCls: String = js.native
  
  var removeIcon: js.UndefOr[RenderNode] = js.native
  
  var showArrow: js.UndefOr[Boolean] = js.native
  
  var showSuffixIcon: js.UndefOr[Boolean] = js.native
  
  var suffixIcon: js.UndefOr[ReactElement] = js.native
}
object ComponentName {
  
  @scala.inline
  def apply(componentName: String, prefixCls: String): ComponentName = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentName]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ComponentName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearIcon(value: RenderNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIconFunction1(value: /* props */ Any => ReactElement): Self = StObject.set(x, "clearIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearIconReactElement(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    @scala.inline
    def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackIcon(value: ReactElement): Self = StObject.set(x, "feedbackIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackIconUndefined: Self = StObject.set(x, "feedbackIcon", js.undefined)
    
    @scala.inline
    def setHasFeedback(value: Boolean): Self = StObject.set(x, "hasFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFeedbackUndefined: Self = StObject.set(x, "hasFeedback", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setMenuItemSelectedIcon(value: RenderNode): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemSelectedIconFunction1(value: /* props */ Any => ReactElement): Self = StObject.set(x, "menuItemSelectedIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMenuItemSelectedIconReactElement(value: ReactElement): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemSelectedIconUndefined: Self = StObject.set(x, "menuItemSelectedIcon", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIcon(value: RenderNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIconFunction1(value: /* props */ Any => ReactElement): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveIconReactElement(value: ReactElement): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
    
    @scala.inline
    def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    @scala.inline
    def setShowSuffixIcon(value: Boolean): Self = StObject.set(x, "showSuffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSuffixIconUndefined: Self = StObject.set(x, "showSuffixIcon", js.undefined)
    
    @scala.inline
    def setSuffixIcon(value: ReactElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
  }
}
