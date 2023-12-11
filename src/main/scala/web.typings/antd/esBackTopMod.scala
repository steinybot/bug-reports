package web.typings.antd

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.MouseEventHandler
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBackTopMod extends Shortcut {
  
  @JSImport("antd/es/back-top", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BackTopProps] = js.native
  
  @js.native
  trait BackTopProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var target: js.UndefOr[js.Function0[HTMLElement | Window | Document]] = js.native
    
    var visibilityHeight: js.UndefOr[Double] = js.native
  }
  object BackTopProps {
    
    @scala.inline
    def apply(): BackTopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackTopProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BackTopProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
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
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTarget(value: () => HTMLElement | Window | Document): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setVisibilityHeight(value: Double): Self = StObject.set(x, "visibilityHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityHeightUndefined: Self = StObject.set(x, "visibilityHeight", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BackTopProps]
  
  /* This means you don't have to write `default`, but can instead just say `esBackTopMod.foo` */
  override def _to: ReactComponentClass[BackTopProps] = default
}
