package web.typings.rcSlider

import web.typings.rcSlider.libInterfaceMod.OnStartMove
import web.typings.rcSlider.rcSliderStrings.max
import web.typings.rcSlider.rcSliderStrings.min
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandlesHandleMod extends Shortcut {
  
  @JSImport("rc-slider/lib/Handles/Handle", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HandleProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait HandleProps extends StObject {
    
    var dragging: Boolean = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
    
    var onChangeComplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
    
    def onOffsetChange(value: min | max, valueIndex: Double): Unit = js.native
    def onOffsetChange(value: Double, valueIndex: Double): Unit = js.native
    
    var onStartMove: OnStartMove = js.native
    
    var prefixCls: String = js.native
    
    var render: js.UndefOr[js.Function2[/* origin */ ReactElement, /* props */ RenderProps, ReactElement]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var value: Double = js.native
    
    var valueIndex: Double = js.native
  }
  
  @js.native
  trait RenderProps extends StObject {
    
    var dragging: Boolean = js.native
    
    var index: Double = js.native
    
    var prefixCls: String = js.native
    
    var value: Double = js.native
  }
  object RenderProps {
    
    @scala.inline
    def apply(dragging: Boolean, index: Double, prefixCls: String, value: Double): RenderProps = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[HandleProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libHandlesHandleMod.foo` */
  override def _to: ReactComponentClass[HandleProps with RefAttributes[HTMLDivElement]] = default
}
