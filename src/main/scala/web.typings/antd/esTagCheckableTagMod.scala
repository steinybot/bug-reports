package web.typings.antd

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSpanElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTagCheckableTagMod extends Shortcut {
  
  @JSImport("antd/es/tag/CheckableTag", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CheckableTagProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @js.native
  trait CheckableTagProps extends StObject {
    
    /**
      * It is an absolute controlled component and has no uncontrolled mode.
      *
      * .zh-cn 该组件为完全受控组件，不支持非受控用法。
      */
    var checked: Boolean = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLSpanElement], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CheckableTagProps {
    
    @scala.inline
    def apply(checked: Boolean): CheckableTagProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckableTagProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CheckableTagProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* checked */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ SyntheticMouseEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CheckableTagProps with RefAttributes[HTMLSpanElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esTagCheckableTagMod.foo` */
  override def _to: ReactComponentClass[CheckableTagProps with RefAttributes[HTMLSpanElement]] = default
}
