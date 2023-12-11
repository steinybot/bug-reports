package web.typings.antd

import web.typings.antd.anon.FnCall
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import web.typings.std.ReturnType
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAffixMod extends Shortcut {
  
  @JSImport("antd/es/affix", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AffixProps with RefAttributes[AffixRef]] = js.native
  
  @js.native
  trait AffixProps extends StObject {
    
    var children: ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /** Triggered when the specified offset is reached from the bottom of the window */
    var offsetBottom: js.UndefOr[Double] = js.native
    
    /** Triggered when the specified offset is reached from the top of the window */
    var offsetTop: js.UndefOr[Double] = js.native
    
    /** Callback function triggered when fixed state changes */
    var onChange: js.UndefOr[js.Function1[/* affixed */ js.UndefOr[Boolean], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    /** Set the element that Affix needs to listen to its scroll event, the value is a function that returns the corresponding DOM element */
    var target: js.UndefOr[js.Function0[Window | HTMLElement | Null]] = js.native
  }
  object AffixProps {
    
    @scala.inline
    def apply(children: ReactElement): AffixProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[AffixProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AffixProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      @scala.inline
      def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* affixed */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
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
      def setTarget(value: () => Window | HTMLElement | Null): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait AffixRef extends StObject {
    
    var updatePosition: ReturnType[FnCall] = js.native
  }
  object AffixRef {
    
    @scala.inline
    def apply(updatePosition: ReturnType[FnCall]): AffixRef = {
      val __obj = js.Dynamic.literal(updatePosition = updatePosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[AffixRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AffixRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdatePosition(value: ReturnType[FnCall]): Self = StObject.set(x, "updatePosition", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[AffixProps with RefAttributes[AffixRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esAffixMod.foo` */
  override def _to: ReactComponentClass[AffixProps with RefAttributes[AffixRef]] = default
}
