package web.typings.rcRate

import web.typings.rcRate.esStarMod.StarProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.RefAttributes
import web.typings.std.VoidFunction
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLUListElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRateMod extends Shortcut {
  
  @JSImport("rc-rate/es/Rate", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RateProps with RefAttributes[RateRef]] = js.native
  
  /* Inlined parent std.Pick<rc-rate.rc-rate/es/Star.StarProps, 'count' | 'character' | 'characterRender' | 'allowHalf' | 'disabled'> */
  @js.native
  trait RateProps extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.native
    
    var allowHalf: js.UndefOr[Boolean] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var character: js.UndefOr[ReactElement | (js.Function1[/* props */ StarProps, ReactElement])] = js.native
    
    var characterRender: js.UndefOr[js.Function2[/* origin */ ReactElement, /* props */ StarProps, ReactElement]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var defaultValue: js.UndefOr[Double] = js.native
    
    var direction: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onHoverChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLUListElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLUListElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object RateProps {
    
    @scala.inline
    def apply(): RateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setAllowHalf(value: Boolean): Self = StObject.set(x, "allowHalf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHalfUndefined: Self = StObject.set(x, "allowHalf", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setCharacter(value: ReactElement | (js.Function1[/* props */ StarProps, ReactElement])): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterFunction1(value: /* props */ StarProps => ReactElement): Self = StObject.set(x, "character", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCharacterReactElement(value: ReactElement): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterRender(value: (/* origin */ ReactElement, /* props */ StarProps) => ReactElement): Self = StObject.set(x, "characterRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCharacterRenderUndefined: Self = StObject.set(x, "characterRender", js.undefined)
      
      @scala.inline
      def setCharacterUndefined: Self = StObject.set(x, "character", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnHoverChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onHoverChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHoverChangeUndefined: Self = StObject.set(x, "onHoverChange", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait RateRef extends StObject {
    
    var blur: VoidFunction = js.native
    
    var focus: VoidFunction = js.native
  }
  object RateRef {
    
    @scala.inline
    def apply(blur: () => Unit, focus: () => Unit): RateRef = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[RateRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RateRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  type _To = ReactComponentClass[RateProps with RefAttributes[RateRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esRateMod.foo` */
  override def _to: ReactComponentClass[RateProps with RefAttributes[RateRef]] = default
}
