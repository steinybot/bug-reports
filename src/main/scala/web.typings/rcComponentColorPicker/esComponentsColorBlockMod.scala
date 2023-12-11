package web.typings.rcComponentColorPicker

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.MouseEventHandler
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsColorBlockMod extends Shortcut {
  
  @JSImport("@rc-component/color-picker/es/components/ColorBlock", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ColorBlockProps] = js.native
  
  @js.native
  trait ColorBlockProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var color: String = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ColorBlockProps {
    
    @scala.inline
    def apply(color: String): ColorBlockProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorBlockProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColorBlockProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
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
  
  type _To = ReactComponentClass[ColorBlockProps]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsColorBlockMod.foo` */
  override def _to: ReactComponentClass[ColorBlockProps] = default
}
