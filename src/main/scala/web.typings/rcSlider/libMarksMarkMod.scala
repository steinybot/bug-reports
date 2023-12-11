package web.typings.rcSlider

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMarksMarkMod {
  
  @JSImport("rc-slider/lib/Marks/Mark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: MarkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait MarkProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    def onClick(value: Double): Unit = js.native
    
    var prefixCls: String = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var value: Double = js.native
  }
  object MarkProps {
    
    @scala.inline
    def apply(onClick: Double => Unit, prefixCls: String, value: Double): MarkProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MarkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnClick(value: Double => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
