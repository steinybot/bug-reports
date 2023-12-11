package web.typings.antd

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSwitchMod extends Shortcut {
  
  @JSImport("antd/es/switch", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SwitchProps with RefAttributes[HTMLElement]] = js.native
  
  type CompoundedComponent = ReactComponentClass[SwitchProps with RefAttributes[HTMLElement]]
  
  type SwitchChangeEventHandler = js.Function2[/* checked */ Boolean, /* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]
  
  type SwitchClickEventHandler = SwitchChangeEventHandler
  
  @js.native
  trait SwitchProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var checkedChildren: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    /**
      * Alias for `defaultChecked`.
      * @since 5.12.0
      */
    var defaultValue: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[SwitchChangeEventHandler] = js.native
    
    var onClick: js.UndefOr[SwitchClickEventHandler] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[SwitchSize] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var unCheckedChildren: js.UndefOr[ReactElement] = js.native
    
    /**
      * Alias for `checked`.
      * @since 5.12.0
      */
    var value: js.UndefOr[Boolean] = js.native
  }
  object SwitchProps {
    
    @scala.inline
    def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedChildren(value: ReactElement): Self = StObject.set(x, "checkedChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedChildrenUndefined: Self = StObject.set(x, "checkedChildren", js.undefined)
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* checked */ Boolean, /* event */ SyntheticMouseEvent[HTMLButtonElement]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* checked */ Boolean, /* event */ SyntheticMouseEvent[HTMLButtonElement]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setSize(value: SwitchSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUnCheckedChildren(value: ReactElement): Self = StObject.set(x, "unCheckedChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnCheckedChildrenUndefined: Self = StObject.set(x, "unCheckedChildren", js.undefined)
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.small
    - `web.typings`.antd.antdStrings.default
  */
  trait SwitchSize extends StObject
  object SwitchSize {
    
    @scala.inline
    def default: web.typings.antd.antdStrings.default = "default".asInstanceOf[web.typings.antd.antdStrings.default]
    
    @scala.inline
    def small: web.typings.antd.antdStrings.small = "small".asInstanceOf[web.typings.antd.antdStrings.small]
  }
  
  type _To = ReactComponentClass[SwitchProps with RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esSwitchMod.foo` */
  override def _to: ReactComponentClass[SwitchProps with RefAttributes[HTMLElement]] = default
}
