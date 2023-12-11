package web.typings.rcSlider

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMarksMod {
  
  @JSImport("rc-slider/lib/Marks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: MarksProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait InternalMarkObj
    extends StObject
       with MarkObj {
    
    var value: Double = js.native
  }
  object InternalMarkObj {
    
    @scala.inline
    def apply(value: Double): InternalMarkObj = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalMarkObj]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InternalMarkObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MarkObj extends StObject {
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object MarkObj {
    
    @scala.inline
    def apply(): MarkObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkObj]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MarkObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait MarksProps extends StObject {
    
    var marks: js.UndefOr[js.Array[InternalMarkObj]] = js.native
    
    def onClick(value: Double): Unit = js.native
    
    var prefixCls: String = js.native
  }
  object MarksProps {
    
    @scala.inline
    def apply(onClick: Double => Unit, prefixCls: String): MarksProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarksProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MarksProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarks(value: js.Array[InternalMarkObj]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setMarksVarargs(value: InternalMarkObj*): Self = StObject.set(x, "marks", js.Array(value :_*))
      
      @scala.inline
      def setOnClick(value: Double => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
